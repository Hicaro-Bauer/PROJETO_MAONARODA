package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaAgend extends javax.swing.JFrame {

    private int maximoCaracteres;
  
    private boolean validaCampos(){
          if(jTextField2.getText().isEmpty())
        {       
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return false;
        } else if(isCpf() == false){
                jFormattedTextField1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                return false;
              } else if (jTextField4.getText().isEmpty()){
                 jTextField4.setBorder(BorderFactory.createLineBorder(Color.RED, 1)); 
                 return false;
          } else if(jFormattedTextField2.getText().isEmpty()){
              jFormattedTextField2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
              return false;
          } else if (verificaData() == false){ //cara da data
              jFormattedTextField3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
              return false;
          } else if (jComboBox2.getSelectedItem().equals("-- selecione --")){
              jComboBox2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
              return false;
          } else if (jComboBox1.getSelectedItem().equals("-- selecione --")){
              jComboBox1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
              return false;
          } else {
              return true;
    }
    }
    
    public boolean verificaData() {
        try {     
                  String x;
            
             Date dataHoraAtual = new Date();
            String dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
                  
            x = jFormattedTextField3.getText();
           char data[];
           data = new char[10];
           String dias[];
           dias = new String[10];
           
           for(int i=0; i < 10; i++){
               
               data[i] = x.charAt(i);
               
                  for(int y=0; y<10;y++){
            dias[y] = String.valueOf(data[y]);
           
           }
           }
           
            int diasJ = Integer.valueOf(dias[0] + dias[1]);
          int mesesJ = Integer.valueOf(dias[3]+dias[4]);
          int anosJ = Integer.valueOf(dias[6] + dias[7] + dias[8] + dias[9]);
           
           
           for(int i=0; i < 10; i++){
               
               data[i] = dataAtual.charAt(i);
               
                  for(int y=0; y<10;y++){
            dias[y] = String.valueOf(data[y]);
           
           }
           }
           
             int diasAT = Integer.valueOf(dias[0] + dias[1]);
          int mesesAT = Integer.valueOf(dias[3]+dias[4]);
          int anosAT = Integer.valueOf(dias[6] + dias[7] + dias[8] + dias[9]);
        
           
         if (anosJ > anosAT){
             return true;
         } else if (anosJ < anosAT){
              JOptionPane.showMessageDialog(null,"A data do Agendamento não pode ser menor que a data atual!");
             jFormattedTextField3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
             return false;
         } else if(mesesJ < mesesAT){
              JOptionPane.showMessageDialog(null,"A data do Agendamento não pode ser menor que a data atual!");
             jFormattedTextField3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
             return false;
         } else if(diasJ <= diasAT){
              JOptionPane.showMessageDialog(null,"A data do Agendamento não pode ser menor que a data atual!");
             jFormattedTextField3.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
             return false;
         } else {
             return true;
         }        
        }
        catch (Exception e) {
              JOptionPane.showMessageDialog(null,"A data do Agendamento não pode ser menor que a data atual!");
            return false;
        }      
    }
    
    private boolean isCpf(){
        
          String cpf = jFormattedTextField1.getText();
          String vetor[];
          vetor = new String[13];
          vetor[1] = "";
          
          if (jFormattedTextField1.getText().equals("000.000.000-00") ||
            jFormattedTextField1.getText().equals("111.111.111-11") ||
            jFormattedTextField1.getText().equals("222.222.222-22") || jFormattedTextField1.getText().equals("333.333.333-33") ||
            jFormattedTextField1.getText().equals("444.444.444-44") || jFormattedTextField1.getText().equals("555.555.555-55") ||
            jFormattedTextField1.getText().equals("666.666.666-66") || jFormattedTextField1.getText().equals("777.777.777-77") ||
            jFormattedTextField1.getText().equals("888.888.888-88") || jFormattedTextField1.getText().equals("999.999.999-99")){
           return(false);
          } else {
          char n10, n11;
        int sm, r, num, peso;
        
        try{
            sm = 0;
            peso = 10;
            for (int i=0; i<11; i++){
                if(i != 3 || i != 7 || i != 11){
                
            
                num = (int)(cpf.charAt(i) - 48);
                if(num>=0){
                
                sm = sm + (num * peso);
                peso = peso - 1;
                }    
                }
            }    
                 r = 11 - (sm % 11);
                 
            if ((r == 10) || (r == 11)){
                n10 = '0';}
            else {n10 = (char)(r + 48);
            }   
                 
                sm = 0;
                peso = 11;
                for(int i=0; i<13;i++){
                     if(i != 3 || i != 7 || i != 11){
                    num = (int)(cpf.charAt(i)-48);
                    if(num>=0){
                    sm = sm +(num*peso);
                    peso = peso - 1;}
                }}
                r  = 11 - (sm%11);
                  if ((r == 10) || (r == 11)){
                 n11 = '0'; }
            else {n11 = (char)(r+48);
                    } 
             if ((n10 == cpf.charAt(12)) && (n11 == cpf.charAt(13))){
                 return(true);}
            else {return(false);}
             
             
        } catch (InputMismatchException e){
            return(false);
        }
          }
    
    }
    
    public TelaAgend() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU AGENDAMENTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 260, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 260, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- selecione --", "Av. Afonso Pena, 1500"}));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_fazer-agendamento.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("2335-5535 / (31) 98834-5117");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Av. Afonso Pena, 1500 - Belo Horizonte / Minas Gerais");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("contatoMrcar@mrc.com.br");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, -1, 50));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 656, 60, 50));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("");
        jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jFormattedTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextField1MouseClicked(evt);
            }
        });
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 260, 30));

        jFormattedTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextField2MouseClicked(evt);
            }
        });
        jFormattedTextField2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jFormattedTextField2InputMethodTextChanged(evt);
            }
        });
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        jFormattedTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 260, 30));

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jFormattedTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextField3MouseClicked(evt);
            }
        });
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 207, 6));
        jLabel9.setText("FALE CONOSCO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 290, 60));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"-- selecione --", "9:00hrs", "9:30hrs", "10:00hrs", "10:30hrs", "11:00hrs", "11:30hrs", "13:00hrs", "13:30hrs", "14:00hrs", "14:30hrs", "15:00hrs", "15:30hrs", "16:00hrs", "16:30hrs", "17:00hrs"}));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bacAgendamento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_fazer-agendamento2.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_fazer-agendamento.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jFormattedTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyTyped
        
        
        
        setMaximoCaracteres(2);
        
        String caracteres = "abcdeABCDE";
     
        if(!caracteres.contains(evt.getKeyChar()+"")){
            
            evt.consume();
            
        }
 
        if(jFormattedTextField2.getText().length()>=getMaximoCaracteres()){
            evt.consume();
        }
        
        
        
    }//GEN-LAST:event_jFormattedTextField2KeyTyped

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed

    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jFormattedTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyPressed
       
    }//GEN-LAST:event_jFormattedTextField2KeyPressed

    private void jFormattedTextField2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jFormattedTextField2InputMethodTextChanged

    }//GEN-LAST:event_jFormattedTextField2InputMethodTextChanged

    private void jFormattedTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyReleased
           jFormattedTextField2.setText(jFormattedTextField2.getText().toUpperCase());
    }//GEN-LAST:event_jFormattedTextField2KeyReleased

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked


      if(validaCampos() == true){
           JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
     TelaPrincipal tp = new TelaPrincipal();
           tp.setVisible(true);
          dispose();

     }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jFormattedTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextField1MouseClicked
        jFormattedTextField1.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
    }//GEN-LAST:event_jFormattedTextField1MouseClicked

    private void jFormattedTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextField2MouseClicked
        jFormattedTextField2.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
    }//GEN-LAST:event_jFormattedTextField2MouseClicked

    private void jFormattedTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextField3MouseClicked
        jFormattedTextField3.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
    }//GEN-LAST:event_jFormattedTextField3MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        jComboBox1.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        jComboBox2.setBorder(BorderFactory.createLineBorder(Color.GRAY));  
    }//GEN-LAST:event_jComboBox2MouseClicked

    public static void main(String args[]) {
        
        //ADICIONAR UM NOVO TEMA DA LIB EXTERNA
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lib de tema");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the maximoCaracteres
     */
    public int getMaximoCaracteres() {
        return maximoCaracteres;
    }

    /**
     * @param maximoCaracteres the maximoCaracteres to set
     */
    public void setMaximoCaracteres(int maximoCaracteres) {
        this.maximoCaracteres = maximoCaracteres;
    }
}
