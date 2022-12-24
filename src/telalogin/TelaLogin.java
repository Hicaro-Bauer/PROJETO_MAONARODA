package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaLogin extends javax.swing.JFrame {

    private String email1;
    private String password1;
    private String login;
    private String password;   
    private TelaEsqueceuSenha1 esqueceusenha;
    
    public TelaLogin() {
        initComponents();
        this.esqueceusenha = new TelaEsqueceuSenha1();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        chkMostrarSenha = new javax.swing.JCheckBox();
        btnEntrar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN MR CAR");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 230, 30));

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
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 230, 30));

        chkMostrarSenha.setForeground(new java.awt.Color(255, 255, 255));
        chkMostrarSenha.setText("Mostrar senha");
        chkMostrarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkMostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkMostrarSenhaMouseClicked(evt);
            }
        });
        chkMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(chkMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        btnEntrar1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEntrar1.setText("ENTRAR");
        btnEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 120, 30));

        jLabel2.setText("Esqueceu sua senha?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Clique aqui");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Não possui uma conta?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed

    private void chkMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarSenhaActionPerformed

    }//GEN-LAST:event_chkMostrarSenhaActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private boolean validaCampos() {
        
        if (txtUser.getText().isEmpty())           
        {
            txtUser.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return false;
        }
        else if (txtSenha.getText().isEmpty()) 
        {
            txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1)); 
            return false;
        }
        else
        {
            return true;
        }
    }
    
    private boolean validaLogin() {
        
        this.setLogin(txtUser.getText());
       
        return this.getLogin().equals(this.getEmail1());
    }
    
    private boolean validaSenha() {
        this.setPassword(txtSenha.getText());
        
        return this.getPassword().equals(this.getPassword1());       
    } 
    
    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
           
        try 
        {     
                     
            if(validaCampos() == true)
            {
                if (validaLogin() == true && validaSenha() == true) 
                {                                                
                    TelaPrincipal tp = new TelaPrincipal();
                    tp.show();
                    tp.setVisible(true);
                    tp.emailLogin = this.getEmail1();
                    tp.senhaLogin = this.getPassword1();
                    dispose();           
                }
                else if (validaLogin() == true && validaSenha() == false) 
                {
                    txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1)); 
                    JOptionPane.showMessageDialog(null, "A senha está incorreta!");
                }
                else if (validaLogin() == false && validaSenha() == true) 
                {
                    txtUser.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    JOptionPane.showMessageDialog(null, "Esse email não está cadastrado.");
                } 
                else 
                {
                    txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1)); 
                    txtUser.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    JOptionPane.showMessageDialog(null, "Esse usuário não foi cadastrado!");
                  
                }
            }
        }
        catch (Exception e) 
        {
           txtUser.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
           txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
           JOptionPane.showMessageDialog(null, "Esse usuário não foi cadastrado!"); 
        }         
    }//GEN-LAST:event_btnEntrar1ActionPerformed

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
       txtUser.setBorder(BorderFactory.createLineBorder(Color.GRAY));         
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked
        txtSenha.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));    
    }//GEN-LAST:event_txtSenhaMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        TelaCad tc = new TelaCad();
        
        tc.show();
        tc.setVisible(true);
        dispose();         
    }//GEN-LAST:event_jLabel4MouseClicked

    private void chkMostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMostrarSenhaMouseClicked
        
        if(chkMostrarSenha.isSelected()) 
        {
            txtSenha.setEchoChar((char)0);
        }
        else 
        {
            txtSenha.setEchoChar('•'); 
        }
            
    }//GEN-LAST:event_chkMostrarSenhaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        esqueceusenha = new TelaEsqueceuSenha1();
        esqueceusenha.setVisible(true);
        esqueceusenha.setEmail2(this.getEmail1());
        esqueceusenha.setSenha2(this.getPassword1());
        dispose();      
    }//GEN-LAST:event_jLabel2MouseClicked

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
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JCheckBox chkMostrarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * @param email the email to set
     */
    public void setEmail1(String email) {
        this.email1 = email;
    }

    /**
     * @return the password1
     */
    public String getPassword1() {
        return password1;
    }

    /**
     * @param password1 the password1 to set
     */
    public void setPassword1(String password1) {
        this.password1 = password1;
    }
}
