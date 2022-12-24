package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaPrincipal extends javax.swing.JFrame {

    private TelaCompraCard tc;
    protected String emailLogin;
    protected String senhaLogin;
    
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.tc = new TelaCompraCard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgendamento = new javax.swing.JLabel();
        btnCompra = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        btnAluguel = new javax.swing.JLabel();
        btnSobre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnComprar1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnComprar2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnComprar3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRINCIPAL MR CAR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png"))); // NOI18N
        btnAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgendamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgendamentoMouseExited(evt);
            }
        });
        getContentPane().add(btnAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 200, 50));

        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_compra.png"))); // NOI18N
        btnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompraMouseExited(evt);
            }
        });
        getContentPane().add(btnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 50));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_sair.png"))); // NOI18N
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 200, 180, 50));

        btnAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_aluguel.png"))); // NOI18N
        btnAluguel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelMouseExited(evt);
            }
        });
        getContentPane().add(btnAluguel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 50));

        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_sobre.png"))); // NOI18N
        btnSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSobreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSobreMouseExited(evt);
            }
        });
        getContentPane().add(btnSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, -1, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 83, 148));
        jLabel2.setText("R$ 3.200.200,00");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 190, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Possui alguma dúvida?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, 200, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("McLaren 570s Coupé - 2018");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 240, -1));

        btnComprar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar.png"))); // NOI18N
        btnComprar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprar1MouseExited(evt);
            }
        });
        getContentPane().add(btnComprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 150, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mercedes AMG GT 43 - 2020");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 490, 240, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(11, 83, 148));
        jLabel8.setText("R$ 885.000,00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 520, 170, 60));

        btnComprar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar.png"))); // NOI18N
        btnComprar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprar2MouseExited(evt);
            }
        });
        getContentPane().add(btnComprar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, -1, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ferrari 599 GTB - 2010");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 190, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(11, 83, 148));
        jLabel11.setText("R$ 2.099.000,00");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 190, 60));

        btnComprar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar.png"))); // NOI18N
        btnComprar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprar3MouseExited(evt);
            }
        });
        getContentPane().add(btnComprar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 580, -1, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 207, 6));
        jLabel9.setText(" FAQ");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 50, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SEJA BEM-VINDO AO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 340, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 207, 6));
        jLabel12.setText("SISTEMA MR CAR");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 340, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //HOVER btnCompra
    private void btnCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseEntered
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_compra2.png")));
    }//GEN-LAST:event_btnCompraMouseEntered
    private void btnCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseExited
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_compra.png")));
    }//GEN-LAST:event_btnCompraMouseExited

    //HOVER btnAluguel
    private void btnAluguelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelMouseEntered
        btnAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_aluguel2.png")));
    }//GEN-LAST:event_btnAluguelMouseEntered
    private void btnAluguelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelMouseExited
        btnAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_aluguel.png")));
    }//GEN-LAST:event_btnAluguelMouseExited

    //HOVER btnAgendamento
    private void btnAgendamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendamentoMouseEntered
        btnAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento2.png")));
    }//GEN-LAST:event_btnAgendamentoMouseEntered
    private void btnAgendamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendamentoMouseExited
        btnAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png")));
    }//GEN-LAST:event_btnAgendamentoMouseExited

    //HOVER btnSobre
    private void btnSobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseEntered
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_sobre2.png")));
    }//GEN-LAST:event_btnSobreMouseEntered
    private void btnSobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseExited
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_sobre.png")));
    }//GEN-LAST:event_btnSobreMouseExited

    //HOVER btnSair
    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_sair2.png")));
    }//GEN-LAST:event_btnSairMouseEntered
    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_sair.png")));
    }//GEN-LAST:event_btnSairMouseExited

    //HOVER btnComprar1
    private void btnComprar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar1MouseEntered
        btnComprar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar2.png")));
    }//GEN-LAST:event_btnComprar1MouseEntered
    private void btnComprar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar1MouseExited
        btnComprar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar.png")));
    }//GEN-LAST:event_btnComprar1MouseExited
    
    //HOVER btnComprar2
    private void btnComprar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar2MouseEntered
        btnComprar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar2.png")));
    }//GEN-LAST:event_btnComprar2MouseEntered
    private void btnComprar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar2MouseExited
        btnComprar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar.png")));
    }//GEN-LAST:event_btnComprar2MouseExited

    //HOVER btnComprar3
    private void btnComprar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar3MouseEntered
        btnComprar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar2.png")));
    }//GEN-LAST:event_btnComprar3MouseEntered
    private void btnComprar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar3MouseExited
        btnComprar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar.png")));
    }//GEN-LAST:event_btnComprar3MouseExited

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        tl.setEmail1(emailLogin);
        tl.setPassword1(senhaLogin);
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseClicked
       TelaSobre ts = new TelaSobre();
       ts.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnSobreMouseClicked

    private void btnAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendamentoMouseClicked
     TelaAgend ta = new TelaAgend();
     ta.setVisible(true);
     dispose();
    }//GEN-LAST:event_btnAgendamentoMouseClicked

    private void btnAluguelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelMouseClicked
        TelaAluguel tal = new TelaAluguel();
        tal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAluguelMouseClicked

    private void btnCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseClicked
        TelaCompra tc = new TelaCompra();
        tc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCompraMouseClicked
    
    Locale ptBr = new Locale("pt", "BR");
    
    private void btnComprar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar1MouseClicked
                  
         tc = new TelaCompraCard();
         tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("Ferrari 599 GTB");
          tc.setPreco(2099000.00);
          tc.setMarca("Ferrari");
          tc.setAno(2010);
          tc.setCombustivel(12.00);
          tc.setModelo("599 GTB");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: "  + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ferrari599.png")));
     
         
    }//GEN-LAST:event_btnComprar1MouseClicked

    private void btnComprar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar2MouseClicked
     
        tc = new TelaCompraCard();
        tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("McLaren 570s Coupé");
          tc.setPreco(3200200.00);
          tc.setMarca("McLaren");
          tc.setAno(2018);
          tc.setCombustivel(8.00);
          tc.setModelo("570S COUPÉ 3.8 BI-TURBO V8");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: " + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mclaren.png")));

        
    }//GEN-LAST:event_btnComprar2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
     
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnComprar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprar3MouseClicked
        
         tc = new TelaCompraCard();
          tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("Mercedes AMG GT 43");
          tc.setPreco(885000.00);
          tc.setMarca("Mercedes");
          tc.setAno(2020);
          tc.setCombustivel(10.00);
          tc.setModelo("AMG GT 43");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: " + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mercedesAmg.png")));
        
    }//GEN-LAST:event_btnComprar3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        TelaDuvidas td = new TelaDuvidas();
        td.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
   
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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgendamento;
    private javax.swing.JLabel btnAluguel;
    private javax.swing.JLabel btnCompra;
    private javax.swing.JLabel btnComprar1;
    private javax.swing.JLabel btnComprar2;
    private javax.swing.JLabel btnComprar3;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel btnSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the variavel
     */
    

}
