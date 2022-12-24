package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaCad extends javax.swing.JFrame {

    private TelaLogin telalogin;
    private String nome;
    private String email;
    private String password1;
    
    
    public TelaCad() {
        initComponents();
        this.telalogin = new TelaLogin();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeCad = new javax.swing.JTextField();
        txtEmailCad = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtSenha1 = new javax.swing.JPasswordField();
        btnCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO MR CAR");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomeCad.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtNomeCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeCadMouseClicked(evt);
            }
        });
        txtNomeCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCadActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 230, 30));

        txtEmailCad.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtEmailCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailCadMouseClicked(evt);
            }
        });
        txtEmailCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCadActionPerformed(evt);
            }
        });
        txtEmailCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailCadKeyPressed(evt);
            }
        });
        getContentPane().add(txtEmailCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 230, 30));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaMouseClicked(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 230, 30));

        txtSenha1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtSenha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenha1MouseClicked(evt);
            }
        });
        txtSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 230, 30));

        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCadastro.setText("CONFIRMAR");
        btnCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 120, 30));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCadActionPerformed

    private void txtEmailCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCadActionPerformed

     String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{5,32}$";
    
     Pattern s = Pattern.compile(regex);
  
     private boolean verificaCampos() {
         
         if(txtNomeCad.getText().isEmpty())
        {       
            txtNomeCad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return false;
        }
        else if (txtEmailCad.getText().isEmpty())
        {        
            txtEmailCad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return false;
        }
        else if (txtSenha.getText().isEmpty())
        {
            txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return false;
        }
        else if (txtSenha1.getText().isEmpty())
        {
            txtSenha1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return false;
        }
        else {
            return true;  
        }          
     }
     
     private boolean verificaSenha() {
         
          if (txtSenha.getText().equals(txtSenha1.getText())) 
          {
               if (s.matcher(txtSenha.getText()).matches()) 
               {
                   JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
                   return true;
               }
               else 
               {
                   JOptionPane.showMessageDialog(null, "A senha deve possuir: \n . No mínimo cinco caracteres. \n . No mínimo um número. \n . No mínimo uma letra minúscula \n . No mínimo uma letra maiúscula \n . No mínimo um caractere especial.");  
                   return false;
               }
           }
           else 
           {
               txtSenha1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
               JOptionPane.showMessageDialog(null, "As senhas não conferem!");  
               return false;
           }
          
              
     }
     
       
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
       
            if(verificaCampos() == true && verificaSenha() == true) 
            {
                telalogin = new TelaLogin();
                telalogin.setVisible(true);
                telalogin.setEmail1(this.txtEmailCad.getText());
                telalogin.setPassword1(this.txtSenha.getText());
                                    
                dispose();    
            } 
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha1ActionPerformed

    }//GEN-LAST:event_txtSenha1ActionPerformed

    private void txtEmailCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailCadKeyPressed
            
    }//GEN-LAST:event_txtEmailCadKeyPressed

    private void txtEmailCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailCadMouseClicked
     
        txtEmailCad.setBorder(BorderFactory.createLineBorder(Color.GRAY));   
    }//GEN-LAST:event_txtEmailCadMouseClicked

    private void txtNomeCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeCadMouseClicked
        txtNomeCad.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }//GEN-LAST:event_txtNomeCadMouseClicked

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked
        txtSenha.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }//GEN-LAST:event_txtSenhaMouseClicked

    private void txtSenha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenha1MouseClicked
        txtSenha1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }//GEN-LAST:event_txtSenha1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
       TelaLogin telalogin = new TelaLogin(); 
       telalogin.show();
       telalogin.setVisible(true);
       dispose();     
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
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
                new TelaCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtEmailCad;
    private javax.swing.JTextField txtNomeCad;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha1;
    // End of variables declaration//GEN-END:variables

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
}
