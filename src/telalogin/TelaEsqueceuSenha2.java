
package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaEsqueceuSenha2 extends javax.swing.JFrame {
    
    private TelaLogin telalogin;
    private String email3;
    private String senha3;

    public TelaEsqueceuSenha2() {
      
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        txtSenha1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU ESQUECEU SENHA");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 200, 30));

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
        getContentPane().add(txtSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 200, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("CONFIRMAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 160, -1));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 1, 740, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{5,32}$";
    
     Pattern s = Pattern.compile(regex);
      
    private boolean verificaCampos() {
        
        if(txtSenha1.getText().isEmpty()) 
        {
            txtSenha1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return false;
        }
        else if(txtSenha.getText().isEmpty()) 
        {
            txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1));  
            return false;
        }
        else 
        {
            return true;
        }
    }     
      
    private boolean verificaSenha() {
       
            if (txtSenha.getText().equals(txtSenha1.getText())) 
            {
                if(txtSenha.getText().equals(this.getSenha3())){
                    JOptionPane.showMessageDialog(null, "A senha deve ser diferente da sua antiga!");
                    return false;
                }  
                else 
                {
                    if (s.matcher(txtSenha.getText()).matches()) 
                    {
                        return true;
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "A senha deve possuir: \n . No mínimo cinco caracteres. \n . No mínimo um número. \n . No mínimo uma letra minúscula \n . No mínimo uma letra maiúscula \n . No mínimo um caractere especial.");  
                        return false;
                    }
                }
            }
            else 
            {
                txtSenha.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                JOptionPane.showMessageDialog(null, "As senhas não conferem!");  
                return false;
            }     
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(verificaCampos() == true && verificaSenha() == true) 
        {       
            JOptionPane.showMessageDialog(null, "Senha alterada com Sucesso!");       
            telalogin = new TelaLogin();
            telalogin.setVisible(true);
            telalogin.setEmail1(this.getEmail3());
            telalogin.setPassword1(this.txtSenha.getText());
            dispose();                      
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha1ActionPerformed

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked
       
        txtSenha.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
           
    }//GEN-LAST:event_txtSenhaMouseClicked

    private void txtSenha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenha1MouseClicked
        
        txtSenha1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        
    }//GEN-LAST:event_txtSenha1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       TelaEsqueceuSenha1 tes = new TelaEsqueceuSenha1();
       tes.setVisible(true);
       tes.setEmail2(this.getEmail3());
       tes.setSenha2(this.getSenha3());
       dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
                new TelaEsqueceuSenha2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the email3
     */
    public String getEmail3() {
        return email3;
    }

    /**
     * @param email3 the email3 to set
     */
    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    /**
     * @return the senha3
     */
    public String getSenha3() {
        return senha3;
    }

    /**
     * @param senha3 the senha3 to set
     */
    public void setSenha3(String senha3) {
        this.senha3 = senha3;
    }
}
