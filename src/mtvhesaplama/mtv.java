/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtvhesaplama;

import javax.swing.JComboBox;

/**
 *
 * @author Lenovo
 */
public class mtv extends javax.swing.JFrame {

    /**
     * Creates new form mtv
     */
    public mtv() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aracbox = new javax.swing.JComboBox<>();
        modelbox = new javax.swing.JComboBox<>();
        silindirbox = new javax.swing.JComboBox<>();
        hesapbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yillik = new javax.swing.JLabel();
        firstlabel = new javax.swing.JLabel();
        secondlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Araç Tipi");

        jLabel2.setText("Araç Modeli");

        jLabel3.setText("Motor Silindir Hacmi");

        aracbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Araç Tipiniz Seçiniz", "Otomobil, kaptıkaçtı", "Motosikletler", "Minibüs", "Kamyonet, kamyon, çekici" }));
        aracbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracboxActionPerformed(evt);
            }
        });

        modelbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Araç Yaşını Seçiniz", "1 – 3 yaş", "4 – 6 yaş", "7 – 11 yaş", "12 – 15 yaş", "16 ve üzere yaş" }));
        modelbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelboxActionPerformed(evt);
            }
        });

        hesapbutton.setText("Hesapla");
        hesapbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapbuttonActionPerformed(evt);
            }
        });

        jLabel4.setText("Yıllık tutar\t");

        jLabel5.setText("İlk 6 aylık tutar");

        jLabel6.setText("İkinci 6 aylık tutar");

        yillik.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        firstlabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        secondlabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yillik)
                            .addComponent(firstlabel)
                            .addComponent(secondlabel)
                            .addComponent(modelbox, 0, 155, Short.MAX_VALUE)
                            .addComponent(silindirbox, 0, 155, Short.MAX_VALUE)
                            .addComponent(hesapbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aracbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aracbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(modelbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(silindirbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hesapbutton)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(yillik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(firstlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(secondlabel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aracboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracboxActionPerformed
                           

        if (aracbox.getSelectedItem().toString().equals("Otomobil, kaptıkaçtı")) 
        {
            silindirbox.removeAllItems();
            silindirbox.addItem("1300 cm³ ve aşağısı");
            silindirbox.addItem("1301-1600 cm³ arası");
            silindirbox.addItem("1601-1800 cm³ arası");
            silindirbox.addItem("1801-2000 cm³ arası");
            silindirbox.addItem("2001-2500 cm³ arası");
            silindirbox.addItem("2501-3000 cm³ arası");
            silindirbox.addItem("3001-3500 cm³ arası");
            silindirbox.addItem("3501-4000 cm³ arası");
            silindirbox.addItem("4001 cm³ ve yukarısı");
            modelbox.removeAllItems();
            silindirbox.setEnabled(true);

            modelbox.addItem("Araç Yaşını Seçiniz");
            modelbox.addItem("1 – 3 yaş");
            modelbox.addItem("4 – 6 yaş");
            modelbox.addItem("7 – 11 yaş");
            modelbox.addItem("12 – 15 yaş");
            modelbox.addItem("16 ve üzere yaş");



        }
        else if (aracbox.getSelectedItem().toString().equals("Motosikletler")) 
        {
          silindirbox.removeAllItems();
          silindirbox.addItem("100 –   250 cm³ arası");
          silindirbox.addItem("251 –   650 cm³ arası");
          silindirbox.addItem("651 –  1200 cm³ arası");
          silindirbox.addItem("1201 cm³ ve yukarısı");
          modelbox.removeAllItems();
          silindirbox.setEnabled(true);
            modelbox.addItem("Araç Yaşını Seçiniz");
            modelbox.addItem("1 – 3 yaş");
            modelbox.addItem("4 – 6 yaş");
            modelbox.addItem("7 – 11 yaş");
            modelbox.addItem("12 – 15 yaş");
            modelbox.addItem("16 ve üzere yaş");
            
            
            
        }
        else if (aracbox.getSelectedItem().toString().equals("Minibüs")) {
          
            silindirbox.removeAllItems();
            modelbox.removeAllItems();
            silindirbox.setEnabled(false);
            modelbox.addItem("1-6 Yaş");
            modelbox.addItem("7-15 Yaş");
            modelbox.addItem("15 ve üzeri Yaş");
        }
        else if (aracbox.getSelectedItem().toString().equals("Kamyonet, kamyon, çekici")) {
        
            silindirbox.removeAllItems();
            modelbox.removeAllItems();
                      silindirbox.setEnabled(true);

            modelbox.addItem("1-6 Yaş");
            modelbox.addItem("7-15 Yaş");
            modelbox.addItem("16 ve üzeri Yaş");
            silindirbox.addItem("1.500 kg.'a kadar");
            silindirbox.addItem("1.501 - 3.500 kg'a kadar");
            silindirbox.addItem("3.501 - 5.000 kg'a kadar");
            silindirbox.addItem("5.001 - 10.000 kg'a kadar");
            silindirbox.addItem("10.001 - 20.000 kg'a kadar");
            silindirbox.addItem("20.001 kg ve yukarısı");
           
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_aracboxActionPerformed

    private void modelboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelboxActionPerformed

    private void hesapbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesapbuttonActionPerformed
        
       
           
       if (aracbox.getSelectedItem().toString().equals("Otomobil, kaptıkaçtı")) 
        {
        otomobil oto=new otomobil();
        int yasindex=modelbox.getSelectedIndex()-1;
        int hacimindex=silindirbox.getSelectedIndex();
        String sonuc=String.valueOf(oto.otohesap(hacimindex, yasindex));
        yillik.setText(sonuc+" TL");

         firstlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");
        secondlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");
        }
         else if (aracbox.getSelectedItem().toString().equals("Motosikletler")) 
        {
            motosiklet moto=new motosiklet();
            
            int yasindex=modelbox.getSelectedIndex()-1;
        int hacimindex=silindirbox.getSelectedIndex();
        String sonuc=String.valueOf(moto.motohesap(hacimindex, yasindex));
        yillik.setText(sonuc+" TL");
        firstlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");
        secondlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");

        }
        else if (aracbox.getSelectedItem().toString().equals("Minibüs")) 
        {
            minibus mini=new minibus();
            int yasindex=modelbox.getSelectedIndex();
            String sonuc=String.valueOf(mini.minihesap(yasindex));
            yillik.setText(sonuc+" TL");
            firstlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");
            secondlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");
        
        }
       else if (aracbox.getSelectedItem().toString().equals("Kamyonet, kamyon, çekici")) 
        {
        kamyon kam=new kamyon();
        int yasindex=modelbox.getSelectedIndex();
        int hacimindex=silindirbox.getSelectedIndex();
        String sonuc=String.valueOf(kam.kamyonhesap(hacimindex, yasindex));
        yillik.setText(sonuc+" TL");
        firstlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");
        secondlabel.setText(String.valueOf(Float.valueOf(sonuc)/2)+" TL");

        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_hesapbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mtv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mtv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mtv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mtv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mtv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> aracbox;
    public javax.swing.JLabel firstlabel;
    private javax.swing.JButton hesapbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JComboBox<String> modelbox;
    public javax.swing.JLabel secondlabel;
    public javax.swing.JComboBox<String> silindirbox;
    public javax.swing.JLabel yillik;
    // End of variables declaration//GEN-END:variables
}
