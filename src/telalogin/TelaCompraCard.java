package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaCompraCard extends javax.swing.JFrame {
    
    private TelaFinanciamento tf;
    private TelaVista tv;
    private TelaParcelado tp;
    private double preco;
    private int ano;
    private String nome;
    private String Marca;
    private String Modelo;
    private double Combustivel;
    Locale ptBr = new Locale("pt", "BR");
  
    public TelaCompraCard() {
        initComponents();
        this.tf = new TelaFinanciamento();
        this.tv = new TelaVista();
        this.tp = new TelaParcelado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU COMPRA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 207, 3));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOME DO VEÍCULO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PREÇO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 212, 42));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel3.setText("MARCA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 270, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel4.setText("ANO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 300, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel5.setText("CONSUMO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 290, 27));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel6.setText("MODELO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 280, 27));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("*SELECIONE O MÉTODO DE PAGAMENTO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 390, 37));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_a-vista.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_cartao-credito.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_financiamento.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tcross.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 290, 120));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backTelaCompraCard.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_a-vista.png")));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_a-vista2.png")));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        tv = new TelaVista();
        tv.setDefaultCloseOperation(tv.DISPOSE_ON_CLOSE);
        tv.setVisible(true);
        tv.jLabel3.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco())));
        tv.jLabel6.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco() - (this.getPreco()*0.10))));
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        tp = new TelaParcelado();
        tp.setDefaultCloseOperation(tp.DISPOSE_ON_CLOSE);
        tp.setVisible(true);
        tp.jLabel3.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco())));
        tp.jLabel8.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco())));
        tp.setPreco(this.getPreco());
        tp.jSlider1.setValue(12);
       
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_cartao-credito2.png")));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_cartao-credito.png")));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        tf = new TelaFinanciamento();
        tf.setDefaultCloseOperation(tf.DISPOSE_ON_CLOSE);
        tf.setVisible(true);
        tf.setPreco(this.getPreco());
        tf.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco())));
        tf.jLabel6.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco())));
        tf.jLabel18.setText(String.valueOf(1.8) + "% a.m");
        tf.jLabel13.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(0)));
        tf.jLabel14.setText(String.valueOf(12) + "x");
        tf.jLabel16.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format((this.getPreco() + (this.getPreco() * (1.8 / 100))) / 12)) + " c/J");
        
        tf.jSlider2.setValue(10);
        tf.jSlider1.setValue(1);
        
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_financiamento2.png")));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_financiamento.png")));
    }//GEN-LAST:event_jLabel11MouseExited

    
           

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
        
        
                new TelaCompraCard().setVisible(true);
            }
        });
        
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    protected javax.swing.JLabel jLabel12;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

   public  void setNome(String _nome){
    this.nome = _nome;
}
    public String getNome() {
        return nome;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Combustivel
     */
    public double getCombustivel() {
        return Combustivel;
    }

    /**
     * @param Combustivel the Combustivel to set
     */
    public void setCombustivel(double Combustivel) {
        this.Combustivel = Combustivel;
    }
            

}
