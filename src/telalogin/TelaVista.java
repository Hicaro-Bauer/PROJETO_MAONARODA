package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaVista extends javax.swing.JFrame {
    public TelaVista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU A VISTA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("R$ 00,00");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 170, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Valor Final do Veículo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 260, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Desconto de 10%");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, 41));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Valor inicial do Veículo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("R$ 00,00");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 150, 35));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 207, 3));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PAGAMENTO A VISTA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 730, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 80, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money2.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 80, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gradient.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        TelaAgend ta = new TelaAgend();
        ta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento2.png")));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png")));
    }//GEN-LAST:event_jLabel8MouseExited

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
                new TelaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
