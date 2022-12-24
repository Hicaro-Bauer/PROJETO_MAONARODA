package telalogin;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class TelaSimulacaoAluguel extends javax.swing.JFrame {

   private double preco;
   private long dias;
   Locale ptBr = new Locale("pt", "BR");
    
    
    public TelaSimulacaoAluguel() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU ALUGUEL");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data da devolução do Veículo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 290, 32));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data da retirada do Veículo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 250, 32));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Valor da Diária ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Número de dias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("Valor Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("R$ 100,00");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 157, 50));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("1");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 115, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("R$ 100,00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 150, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("R$ 100,00");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 168, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel11.setText("Valor a Vista");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SIMULAÇÃO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jFormattedTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextField1MouseClicked(evt);
            }
        });
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 153, 30));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jFormattedTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFormattedTextField2MouseClicked(evt);
            }
        });
        getContentPane().add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 153, 31));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(250, 207, 3));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SIMULAÇÃO ALUGUEL");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 440, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendar.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 110, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendar2.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, 110));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_calcular.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCar.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 90, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalendario.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 90, 60));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconCalc.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 90, 50));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconDinheiro.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, 90));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backSimuAluguel.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
                       
    private double calculaTotal() {
        
        double total = this.getDias() * this.getPreco();
        
        return total;
    }
    
    private double calculaTotalVista() {
        
        double vista = calculaTotal() - (calculaTotal() * 0.15);
        return vista;
    }
    
    
    private void jFormattedTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextField1MouseClicked

        jFormattedTextField1.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
    }//GEN-LAST:event_jFormattedTextField1MouseClicked

    private void jFormattedTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFormattedTextField2MouseClicked
        jFormattedTextField2.setBorder(BorderFactory.createLineBorder(Color.GRAY)); 
    }//GEN-LAST:event_jFormattedTextField2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        TelaAgend ta = new TelaAgend();
        ta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        
        try{
            
                              String x,z;
            

            z = jFormattedTextField2.getText();      
            x = jFormattedTextField1.getText();
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
           
            int diasR = Integer.valueOf(dias[0] + dias[1]);
          int mesesR = Integer.valueOf(dias[3]+dias[4]);
          int anosR = Integer.valueOf(dias[6] + dias[7] + dias[8] + dias[9]);
           
           
           for(int i=0; i < 10; i++){
               
               data[i] = z.charAt(i);
               
                  for(int y=0; y<10;y++){
            dias[y] = String.valueOf(data[y]);
           
           }
           }
           
             int diasD = Integer.valueOf(dias[0] + dias[1]);
          int mesesD = Integer.valueOf(dias[3]+dias[4]);
          int anosD = Integer.valueOf(dias[6] + dias[7] + dias[8] + dias[9]);
        
            Date dataHoraAtual = new Date();
            String dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
            
            
             for(int i=0; i < 10; i++){
               
               data[i] = dataAtual.charAt(i);
               
                  for(int y=0; y<10;y++){
            dias[y] = String.valueOf(data[y]);
           
           }
           }
             
          int diasAT = Integer.valueOf(dias[0] + dias[1]);
          int mesesAT = Integer.valueOf(dias[3]+dias[4]);
          int anosAT = Integer.valueOf(dias[6] + dias[7] + dias[8] + dias[9]);
            
             if (anosR > anosAT){
          
             LocalDateTime startDate = LocalDateTime.of(anosR, mesesR, diasR, 0, 0, 0);
           LocalDateTime endDate = LocalDateTime.of(anosD, mesesD,diasD, 0, 0, 0);
                
            this.setDias(ChronoUnit.DAYS.between(startDate, endDate));
         } else if (anosR < anosAT){
              JOptionPane.showMessageDialog(null,"A data de retirada não pode ser menor que a data atual!");
             jFormattedTextField1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
             
         } else if(mesesR < mesesAT){
              JOptionPane.showMessageDialog(null,"A data de retirada não pode ser menor que a data atual!");
              jFormattedTextField1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            
         } else if(diasR <= diasAT){
              JOptionPane.showMessageDialog(null,"A data de retirada não pode ser menor que a data atual!");
             jFormattedTextField1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
          
         } else {

                        LocalDateTime startDate = LocalDateTime.of(anosR, mesesR, diasR, 0, 0, 0);
           LocalDateTime endDate = LocalDateTime.of(anosD, mesesD,diasD, 0, 0, 0);
                
            this.setDias(ChronoUnit.DAYS.between(startDate, endDate));
         }        
            
            
          
         
                
        

              
            if(this.getDias() < 0)
            {
                jFormattedTextField2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else
            {          
                jLabel9.setText(String.valueOf(this.getDias()));  
                jLabel7.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(calculaTotal())));
                jLabel10.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(calculaTotalVista())));   
            }         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular a diferença entre as datas!");
        }
    
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_calcular2.png")));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_calcular.png")));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento2.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/button_agendamento.png")));
    }//GEN-LAST:event_jLabel1MouseExited

    
    public static void main(String args[]) {
        
        //ADICIONAR UM NOVO TEMA DA LIB EXTERNA
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na lib de tema");
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSimulacaoAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JFormattedTextField jFormattedTextField1;
    protected javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    protected javax.swing.JLabel jLabel7;
    protected javax.swing.JLabel jLabel8;
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
     * @return the dias
     */
    public long getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(long dias) {
        this.dias = dias;
    }
}
