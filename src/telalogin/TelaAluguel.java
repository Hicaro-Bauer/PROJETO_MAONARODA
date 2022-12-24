package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaAluguel extends javax.swing.JFrame {

    private TelaAluguelCard tac;
    Locale ptBr = new Locale("pt", "BR");
      
    
    public TelaAluguel() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.tac = new TelaAluguelCard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
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
        btnAluguelCar1 = new javax.swing.JLabel();
        btnAlueguelCar2 = new javax.swing.JLabel();
        btnAluguelCar3 = new javax.swing.JLabel();
        btnAluguelCar4 = new javax.swing.JLabel();
        btnAluguelCar5 = new javax.swing.JLabel();
        btnAluguelCar6 = new javax.swing.JLabel();
        btnAluguelCar7 = new javax.swing.JLabel();
        btnAluguelCar8 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU ALUGUEL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Volks. T-CROSS - 2020");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Chevrollet Cruze - 2019");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 180, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(11, 83, 148));
        jLabel13.setText("R$ 58,00/dia");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 140, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Chevrollet Onix - 2019");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 180, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(11, 83, 148));
        jLabel15.setText("R$ 49,90/dia");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 140, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(11, 83, 148));
        jLabel16.setText("R$ 49,90/dia");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 150, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Volks. Polo - 2021");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 306, 150, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(11, 83, 148));
        jLabel18.setText("R$ 49,90/dia");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 140, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Hyundai HB20 Plus  - 2021");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(11, 83, 148));
        jLabel20.setText("R$ 100,00/dia");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 150, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Range R. Evoque - 2018");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 200, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(11, 83, 148));
        jLabel22.setText("R$ 111,90/dia");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 150, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Ford Mustang - 2018");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 180, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(11, 83, 148));
        jLabel24.setText("R$ 55,00/dia");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 140, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Chevrollet Cruze - 2021");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, -1, -1));

        btnAluguelCar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAluguelCar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguelCar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelCar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelCar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelCar1MouseExited(evt);
            }
        });
        getContentPane().add(btnAluguelCar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 650, -1, -1));

        btnAlueguelCar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAlueguelCar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlueguelCar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlueguelCar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlueguelCar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlueguelCar2MouseExited(evt);
            }
        });
        getContentPane().add(btnAlueguelCar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        btnAluguelCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAluguelCar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguelCar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelCar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelCar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelCar3MouseExited(evt);
            }
        });
        getContentPane().add(btnAluguelCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        btnAluguelCar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAluguelCar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguelCar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelCar4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelCar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelCar4MouseExited(evt);
            }
        });
        getContentPane().add(btnAluguelCar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        btnAluguelCar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAluguelCar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguelCar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelCar5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelCar5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelCar5MouseExited(evt);
            }
        });
        getContentPane().add(btnAluguelCar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, -1, -1));

        btnAluguelCar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAluguelCar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguelCar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelCar6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelCar6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelCar6MouseExited(evt);
            }
        });
        getContentPane().add(btnAluguelCar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, -1, -1));

        btnAluguelCar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAluguelCar7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguelCar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelCar7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelCar7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelCar7MouseExited(evt);
            }
        });
        getContentPane().add(btnAluguelCar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        btnAluguelCar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png"))); // NOI18N
        btnAluguelCar8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAluguelCar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAluguelCar8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAluguelCar8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAluguelCar8MouseExited(evt);
            }
        });
        getContentPane().add(btnAluguelCar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, -1, -1));

        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 60, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ALUGUE AGORA MESMO SEU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 490, 60));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(250, 207, 6));
        jLabel8.setText("VEÍCULO NOVO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 280, 60));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(11, 83, 148));
        jLabel27.setText("R$ 69,90/dia");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backAluguel.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private void btnAlueguelCar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlueguelCar2MouseEntered
        btnAlueguelCar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAlueguelCar2MouseEntered
    private void btnAlueguelCar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlueguelCar2MouseExited
        btnAlueguelCar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAlueguelCar2MouseExited
    
    //HOVER btnCar3
    private void btnAluguelCar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar3MouseEntered
        btnAluguelCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAluguelCar3MouseEntered
    private void btnAluguelCar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar3MouseExited
        btnAluguelCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAluguelCar3MouseExited

    //HOVER btnCar4
    private void btnAluguelCar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar4MouseEntered
        btnAluguelCar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAluguelCar4MouseEntered
    private void btnAluguelCar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar4MouseExited
        btnAluguelCar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAluguelCar4MouseExited

    //HOVER btnCar5
    private void btnAluguelCar5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar5MouseEntered
        btnAluguelCar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAluguelCar5MouseEntered
    private void btnAluguelCar5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar5MouseExited
        btnAluguelCar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAluguelCar5MouseExited

    //HOVER btnCar6
    private void btnAluguelCar6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar6MouseEntered
        btnAluguelCar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAluguelCar6MouseEntered
    private void btnAluguelCar6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar6MouseExited
        btnAluguelCar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAluguelCar6MouseExited

    //HOVER btnCar7
    private void btnAluguelCar7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar7MouseEntered
        btnAluguelCar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAluguelCar7MouseEntered
    private void btnAluguelCar7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar7MouseExited
        btnAluguelCar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAluguelCar7MouseExited

    //HOVER btnCar8
    private void btnAluguelCar8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar8MouseEntered
        btnAluguelCar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAluguelCar8MouseEntered
    private void btnAluguelCar8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar8MouseExited
        btnAluguelCar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAluguelCar8MouseExited

    //HOVER btnCar1
    private void btnAluguelCar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar1MouseEntered
        btnAluguelCar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro2.png")));
    }//GEN-LAST:event_btnAluguelCar1MouseEntered
    private void btnAluguelCar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar1MouseExited
        btnAluguelCar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alugarCarro.png")));
    }//GEN-LAST:event_btnAluguelCar1MouseExited

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseClicked

    private void btnAlueguelCar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlueguelCar2MouseClicked
        
         tac = new TelaAluguelCard();
         tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
         tac.setVisible(true);
         tac.setNome("Volkswagen T-Cross");
         tac.setAno(2020);
         tac.setMarca("VOLKSWAGEN");
         tac.setModelo("T-Cross 200 TSI");
         tac.setCombustivel(11.00);
         tac.setPreco(69.90);
         
         tac.jLabel1.setText(tac.getNome());
         tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
         tac.jLabel3.setText("Marca: " + tac.getMarca());
         tac.jLabel8.setText("Modelo: " + tac.getModelo());
         tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L");  
         tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia" ));
         tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tcross.png")));
      
    }//GEN-LAST:event_btnAlueguelCar2MouseClicked

    private void btnAluguelCar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar3MouseClicked
                
         tac = new TelaAluguelCard();
          tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
         tac.setVisible(true);
         tac.setNome("Chevrollet Cruze");
         tac.setAno(2019);
         tac.setMarca("Chevrollet");
         tac.setModelo("Cruze");
         tac.setCombustivel(11.00);
         tac.setPreco(58.00);
         
         tac.jLabel1.setText(tac.getNome());
         tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
         tac.jLabel3.setText("Marca: " + tac.getMarca());
         tac.jLabel8.setText("Modelo: " + tac.getModelo());
         tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L"); 
         tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia" ));
         tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cruzeMarrom.png")));
    }//GEN-LAST:event_btnAluguelCar3MouseClicked

    private void btnAluguelCar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar4MouseClicked
        tac = new TelaAluguelCard();
         tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
        tac.setVisible(true);
        tac.setNome("Chevrollet Onix");
        tac.setAno(2019);
        tac.setMarca("Chevrollet");
        tac.setModelo("Onix");
        tac.setCombustivel(9.00);
        tac.setPreco(49.90);

        tac.jLabel1.setText(tac.getNome());
        tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
        tac.jLabel3.setText("Marca: " + tac.getMarca());
        tac.jLabel8.setText("Modelo: " + tac.getModelo());
        tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L"); 
        tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia" ));
        tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/onixVermelho.png")));
    }//GEN-LAST:event_btnAluguelCar4MouseClicked

    private void btnAluguelCar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar5MouseClicked
        tac = new TelaAluguelCard();
         tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
        tac.setVisible(true);
        tac.setNome("Volkswagen Polo");
        tac.setAno(2021);
        tac.setMarca("Volkswagen");
        tac.setModelo("Polo");
        tac.setCombustivel(10.00);
        tac.setPreco(49.90);

        tac.jLabel1.setText(tac.getNome());
        tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
        tac.jLabel3.setText("Marca: " + tac.getMarca());
        tac.jLabel8.setText("Modelo: " + tac.getModelo());
        tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L"); 
        tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia" ));
        tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/poloPrata.png")));
    }//GEN-LAST:event_btnAluguelCar5MouseClicked

    private void btnAluguelCar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar1MouseClicked
        tac = new TelaAluguelCard();
         tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
        tac.setVisible(true);
        tac.setNome("Hyundi HB20 Plus");
        tac.setAno(2021);
        tac.setMarca("Hyundai");
        tac.setModelo("HB20 Plus");
        tac.setCombustivel(9.00);
        tac.setPreco(49.90);

        tac.jLabel1.setText(tac.getNome());
        tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
        tac.jLabel3.setText("Marca: " + tac.getMarca());
        tac.jLabel8.setText("Modelo: " + tac.getModelo());
        tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L"); 
        tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia" ));
        tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hb20.png")));
    }//GEN-LAST:event_btnAluguelCar1MouseClicked

    private void btnAluguelCar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar8MouseClicked
        tac = new TelaAluguelCard();
         tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
        tac.setVisible(true);
        tac.setNome("Chevrollet Cruze");
        tac.setAno(2021);
        tac.setMarca("Chevrollet");
        tac.setModelo("Cruze");
        tac.setCombustivel(12.00);
        tac.setPreco(55.00);

        tac.jLabel1.setText(tac.getNome());
        tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
        tac.jLabel3.setText("Marca: " + tac.getMarca());
        tac.jLabel8.setText("Modelo: " + tac.getModelo());
        tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L"); 
        tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia" ));
        tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cruzeVermelho.png")));
    }//GEN-LAST:event_btnAluguelCar8MouseClicked

    private void btnAluguelCar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar7MouseClicked
        tac = new TelaAluguelCard();
         tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
        tac.setVisible(true);
        tac.setNome("Ford Mustang");
        tac.setAno(2018);
        tac.setMarca("Ford");
        tac.setModelo("Mustang");
        tac.setCombustivel(13.00);
        tac.setPreco(111.90);

        tac.jLabel1.setText(tac.getNome());
        tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
        tac.jLabel3.setText("Marca: " + tac.getMarca());
        tac.jLabel8.setText("Modelo: " + tac.getModelo());
        tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L");
        tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia"));
        tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mustangLaranja.png")));
    }//GEN-LAST:event_btnAluguelCar7MouseClicked

    private void btnAluguelCar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAluguelCar6MouseClicked
        tac = new TelaAluguelCard();
         tac.setDefaultCloseOperation(tac.DISPOSE_ON_CLOSE);
        tac.setVisible(true);
        tac.setNome("Range Rover Evoque");
        tac.setAno(2018);
        tac.setMarca("Range Rover");
        tac.setModelo("Evoque");
        tac.setCombustivel(10.00);
        tac.setPreco(100.00);

        tac.jLabel1.setText(tac.getNome());
        tac.jLabel2.setText("Ano: " + String.valueOf(tac.getAno()));
        tac.jLabel3.setText("Marca: " + tac.getMarca());
        tac.jLabel8.setText("Modelo: " + tac.getModelo());
        tac.jLabel4.setText("Consumo: " + tac.getCombustivel() + " km/L"); 
        tac.jLabel5.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(tac.getPreco()) + " /dia"));
        tac.jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/evoqueBranca.png")));
    }//GEN-LAST:event_btnAluguelCar6MouseClicked

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
                new TelaAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlueguelCar2;
    private javax.swing.JLabel btnAluguelCar1;
    private javax.swing.JLabel btnAluguelCar3;
    private javax.swing.JLabel btnAluguelCar4;
    private javax.swing.JLabel btnAluguelCar5;
    private javax.swing.JLabel btnAluguelCar6;
    private javax.swing.JLabel btnAluguelCar7;
    private javax.swing.JLabel btnAluguelCar8;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
