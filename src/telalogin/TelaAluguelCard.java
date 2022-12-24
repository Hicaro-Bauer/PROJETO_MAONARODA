package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class TelaAluguelCard extends javax.swing.JFrame {
    
    TelaSimulacaoAluguel tsa;
    private double preco;
    private int ano;
    private String nome;
    private String marca;
    private String modelo;
    private double combustivel;
    Locale ptBr = new Locale("pt", "BR");
    
    /**
     * Creates new form TelaAluguelCard
     */
    public TelaAluguelCard() {
        initComponents();
        this.tsa = new TelaSimulacaoAluguel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU ALUGUEL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 207, 3));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOME DO VEÍCULO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel2.setText("ANO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 300, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel3.setText("MARCA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 270, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel4.setText("CONSUMO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 290, 27));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel8.setText("MODELO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 280, 27));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PREÇO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 212, 42));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_simular-aluguel.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tcross.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 290, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backTelaCompraCard.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        tsa = new TelaSimulacaoAluguel();
        tsa.setDefaultCloseOperation(tsa.DISPOSE_ON_CLOSE);
        tsa.setVisible(true);
        tsa.setPreco(this.getPreco());
        tsa.jLabel8.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco())));
        tsa.jLabel7.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco())));
        tsa.jLabel10.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(this.getPreco() - (this.getPreco() * 0.15))));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_simular-aluguel2.png")));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_simular-aluguel.png")));
    }//GEN-LAST:event_jLabel6MouseExited

    
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
                new TelaAluguelCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
    protected javax.swing.JLabel jLabel9;
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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the combustivel
     */
    public double getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
}
