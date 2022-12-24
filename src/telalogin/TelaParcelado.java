package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaParcelado extends javax.swing.JFrame {

    private double preco;
    Locale ptBr = new Locale("pt", "BR");
    
 
    public TelaParcelado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU CRÉDITO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("R$ 00,00");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 154, 36));

        jSlider1.setMajorTickSpacing(12);
        jSlider1.setMaximum(36);
        jSlider1.setMinimum(12);
        jSlider1.setSnapToTicks(true);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 222, 44));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1x");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 98, 38));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIMULAÇÃO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 140, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Valor do Veículo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 133, 170, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("R$ 23.000,00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 154, 36));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setText("Parcelas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("R$ 14.200,00 s/J");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 200, 55));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("12x");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 70, 55));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 207, 3));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PAGAMENTO CARTÃO DE CRÉDITO");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 480, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel14.setText("Quantidade de Parcelas");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 80, 60));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel16.setText("Valor do Veículo");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/card.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCar.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 80, 70));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalc.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 90, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Obs: Consultar taxa de juros com os atendentes");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backCredito.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
       
        jLabel4.setText(String.valueOf(jSlider1.getValue()) + "x");
        jLabel12.setText(String.valueOf(jSlider1.getValue()) + "x");
        
        int divisao = jSlider1.getValue();
        
        jLabel10.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco() / divisao)) + " s/J ");
    }//GEN-LAST:event_jSlider1StateChanged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        TelaAgend ta = new TelaAgend();
        ta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento2.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    public static void main(String args[]) {
        
        //ADICIONAR UM NOVO TEMA DA LIB EXTERNA
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lib de tema");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaParcelado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    protected javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    protected javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
