package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaCompra extends javax.swing.JFrame {
    
    Locale ptBr = new Locale("pt", "BR");
    private TelaCompraCard tc;
    public TelaCompra() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.tc = new TelaCompraCard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnCar1 = new javax.swing.JLabel();
        btnCar2 = new javax.swing.JLabel();
        btnCar3 = new javax.swing.JLabel();
        btnCar4 = new javax.swing.JLabel();
        btnCar5 = new javax.swing.JLabel();
        btnCar6 = new javax.swing.JLabel();
        btnCar7 = new javax.swing.JLabel();
        btnCar8 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU COMPRA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(250, 207, 6));
        jLabel7.setText("VEÍCULO NOVO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 280, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("BMW X5 - 2020");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 120, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(11, 83, 148));
        jLabel11.setText("R$ 645.000,00");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ford Ka - 2019");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 120, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(11, 83, 148));
        jLabel13.setText("R$ 49.600,00");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 140, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Mustang Mach1 - 2021");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 180, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(11, 83, 148));
        jLabel15.setText("R$ 566.000,00");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 150, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(11, 83, 148));
        jLabel16.setText("R$ 133.200,00");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 150, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Honda Civic - 2022");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 306, 150, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 83, 148));
        jLabel18.setText("R$ 520.000,00");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 150, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Land R. DEF.  - 2020");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(11, 83, 148));
        jLabel20.setText("R$ 86.200,00");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 140, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("BMW R1200 - 2020");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 150, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(11, 83, 148));
        jLabel22.setText("R$ 70.120,00");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 140, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Hyundai Tucson - 2018");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 180, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(11, 83, 148));
        jLabel24.setText("R$ 38.120,00");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 140, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Yamaha XJ6 - 2016");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, -1, -1));

        btnCar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar1MouseExited(evt);
            }
        });
        getContentPane().add(btnCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 650, -1, -1));

        btnCar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar2MouseExited(evt);
            }
        });
        getContentPane().add(btnCar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        btnCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar3MouseExited(evt);
            }
        });
        getContentPane().add(btnCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        btnCar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar4MouseExited(evt);
            }
        });
        getContentPane().add(btnCar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        btnCar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar5MouseExited(evt);
            }
        });
        getContentPane().add(btnCar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, -1, -1));

        btnCar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar6MouseExited(evt);
            }
        });
        getContentPane().add(btnCar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, -1, -1));

        btnCar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar7MouseExited(evt);
            }
        });
        getContentPane().add(btnCar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        btnCar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png"))); // NOI18N
        btnCar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCar8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCar8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCar8MouseExited(evt);
            }
        });
        getContentPane().add(btnCar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, -1, -1));

        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 60, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COMPRE AGORA MESMO SEU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 490, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backCompra.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseClicked

    //HOVER btnCar2
    private void btnCar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar2MouseEntered
        btnCar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar2MouseEntered
    private void btnCar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar2MouseExited
        btnCar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar2MouseExited
    
    //HOVER btnCar3
    private void btnCar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar3MouseEntered
        btnCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar3MouseEntered
    private void btnCar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar3MouseExited
        btnCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar3MouseExited

    //HOVER btnCar4
    private void btnCar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar4MouseEntered
        btnCar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar4MouseEntered
    private void btnCar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar4MouseExited
        btnCar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar4MouseExited

    //HOVER btnCar5
    private void btnCar5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar5MouseEntered
        btnCar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar5MouseEntered
    private void btnCar5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar5MouseExited
        btnCar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar5MouseExited

    //HOVER btnCar6
    private void btnCar6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar6MouseEntered
        btnCar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar6MouseEntered
    private void btnCar6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar6MouseExited
        btnCar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar6MouseExited

    //HOVER btnCar7
    private void btnCar7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar7MouseEntered
        btnCar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar7MouseEntered
    private void btnCar7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar7MouseExited
        btnCar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar7MouseExited

    //HOVER btnCar8
    private void btnCar8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar8MouseEntered
        btnCar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar8MouseEntered
    private void btnCar8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar8MouseExited
        btnCar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar8MouseExited

    //HOVER btnCar1
    private void btnCar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar1MouseEntered
        btnCar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro2.png")));
    }//GEN-LAST:event_btnCar1MouseEntered
    private void btnCar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar1MouseExited
        btnCar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprarCarro.png")));
    }//GEN-LAST:event_btnCar1MouseExited

    private void btnCar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar2MouseClicked
           tc = new TelaCompraCard();
           tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("BMW X5");
          tc.setPreco(645000.00);
          tc.setMarca("BMW");
          tc.setAno(2020);
          tc.setCombustivel(11.00);
          tc.setModelo("X5");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: "  + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bmwx5.png")));
  
    }//GEN-LAST:event_btnCar2MouseClicked

    private void btnCar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar3MouseClicked
                  tc = new TelaCompraCard();
                  tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("Ford Ka");
          tc.setPreco(49600.00);
          tc.setMarca("Ford");
          tc.setAno(2019);
          tc.setCombustivel(9.00);
          tc.setModelo("Ka");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: "  + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fordka.png")));
        
    }//GEN-LAST:event_btnCar3MouseClicked

    private void btnCar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar4MouseClicked
          tc = new TelaCompraCard();
          tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("Mustang Mach1");
          tc.setPreco(566000.00);
          tc.setMarca("Mustang");
          tc.setAno(2021);
          tc.setCombustivel(9.00);
          tc.setModelo("Mach1");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: "  + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mustang.png")));
        
    }//GEN-LAST:event_btnCar4MouseClicked

    private void btnCar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar5MouseClicked
          tc = new TelaCompraCard();
          tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("Honda Civic");
          tc.setPreco(133200.00);
          tc.setMarca("Honda");
          tc.setAno(2022);
          tc.setCombustivel(8.00);
          tc.setModelo("Civic");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: "  + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/civic.png")));
        
    }//GEN-LAST:event_btnCar5MouseClicked

    private void btnCar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar1MouseClicked
            tc = new TelaCompraCard();
            tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("Land Rover Defender");
          tc.setPreco(520000.00);
          tc.setMarca("Land Rover");
          tc.setAno(2022);
          tc.setCombustivel(11.00);
          tc.setModelo("Defender");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: "  + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/land.png")));
   
    }//GEN-LAST:event_btnCar1MouseClicked

    private void btnCar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar8MouseClicked
          tc = new TelaCompraCard();
          tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
          tc.setVisible(true);
          tc.setNome("Yamaha XJ6");
          tc.setPreco(38120.00);
          tc.setMarca("Yamaha");
          tc.setAno(2016);
          tc.setCombustivel(8.00);
          tc.setModelo("R6");
            // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
          tc.jLabel1.setText(tc.getNome());    
          tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
          tc.jLabel3.setText("Marca: "  + tc.getMarca());
          tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
          tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
          tc.jLabel6.setText("Modelo: " + tc.getModelo());
          tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/xj6.png")));
   
    }//GEN-LAST:event_btnCar8MouseClicked

    private void btnCar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar7MouseClicked
        tc = new TelaCompraCard();
        tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
        tc.setVisible(true);
        tc.setNome("Hyundai Tucson");
        tc.setPreco(70120.00);
        tc.setMarca("Hyundai");
        tc.setAno(2018);
        tc.setCombustivel(10.00);
        tc.setModelo("Tucson");
          // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
        tc.jLabel1.setText(tc.getNome());    
        tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
        tc.jLabel3.setText("Marca: "  + tc.getMarca());
        tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
        tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
        tc.jLabel6.setText("Modelo: " + tc.getModelo());
        tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tucson.png")));
        
    }//GEN-LAST:event_btnCar7MouseClicked

    private void btnCar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCar6MouseClicked
        tc = new TelaCompraCard();
        tc.setDefaultCloseOperation(tc.DISPOSE_ON_CLOSE);
        tc.setVisible(true);
        tc.setNome("BMW R1200");
        tc.setPreco(86200.00);
        tc.setMarca("BMW");
        tc.setAno(2020);
        tc.setCombustivel(10.00);
        tc.setModelo("R1200");
        // tc.jLabel1.setText(String.valueOf(tc.getNome() + "\nR$ " + tc.getPreco() + "\n"+tc.getMarca() + "\n"+tc.getAno() +"\n" +tc.getCombustivel() + " p/hora\n" + tc.getModelo()));    
        tc.jLabel1.setText(tc.getNome());    
        tc.jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tc.getPreco())));
        tc.jLabel3.setText("Marca: "  + tc.getMarca());
        tc.jLabel4.setText("Ano: " + String.valueOf(tc.getAno()));
        tc.jLabel5.setText("Consumo: " + String.valueOf(tc.getCombustivel() + " km/L"));
        tc.jLabel6.setText("Modelo: " + tc.getModelo());
        tc.jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/r1200.png")));
        
    }//GEN-LAST:event_btnCar6MouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
       TelaPrincipal tp = new TelaPrincipal();
       tp.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

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
                new TelaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCar1;
    private javax.swing.JLabel btnCar2;
    private javax.swing.JLabel btnCar3;
    private javax.swing.JLabel btnCar4;
    private javax.swing.JLabel btnCar5;
    private javax.swing.JLabel btnCar6;
    private javax.swing.JLabel btnCar7;
    private javax.swing.JLabel btnCar8;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
