/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psutempconverterswing;

import java.text.DecimalFormat;

/**
 *
 * @author production
 */
public class TempConverterGUI extends javax.swing.JFrame {

    /**
     * Creates new form TempConverterGUI
     */
    public TempConverterGUI() {
        initComponents();
        
        rdoCelcius.setActionCommand("celcius");
        rdoCelcius.setSelected(true);
        this.txtTempToConvert.setText("0");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTemperatures = new javax.swing.ButtonGroup();
        lblAppTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        rdoCelcius = new javax.swing.JRadioButton();
        rdoFahrenheit = new javax.swing.JRadioButton();
        lblConversionStatement = new javax.swing.JLabel();
        lblConversionStatement1 = new javax.swing.JLabel();
        lblConversionResult = new javax.swing.JLabel();
        txtTempToConvert = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        lblAppTitle.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblAppTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAppTitle.setText("Temperature Converter");

        lblDescription.setText("Select a conversion method and enter a temperature.");

        btnGroupTemperatures.add(rdoCelcius);
        rdoCelcius.setText("Convert to Celcius");
        rdoCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCelciusActionPerformed(evt);
            }
        });

        btnGroupTemperatures.add(rdoFahrenheit);
        rdoFahrenheit.setLabel("Convert To Fahrenheit");
        rdoFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFahrenheitActionPerformed(evt);
            }
        });

        lblConversionStatement.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        lblConversionStatement.setText("Temperature to Convert:");

        lblConversionStatement1.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        lblConversionStatement1.setText("Converted Temperature:");

        btnConvert.setText("Convert");
        btnConvert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(lblConversionStatement1)
                        .add(18, 18, 18)
                        .add(lblConversionResult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(rdoFahrenheit)
                    .add(rdoCelcius)
                    .add(lblDescription)
                    .add(lblAppTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 357, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(lblConversionStatement)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txtTempToConvert, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnConvert, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(15, 15, 15)
                .add(lblAppTitle)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblDescription)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rdoCelcius)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rdoFahrenheit)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblConversionStatement)
                    .add(txtTempToConvert, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnConvert, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblConversionResult, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblConversionStatement1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCelciusActionPerformed
        rdoCelcius.setActionCommand("celcius");
    }//GEN-LAST:event_rdoCelciusActionPerformed

    private void rdoFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFahrenheitActionPerformed
        rdoFahrenheit.setActionCommand("fahrenheit");
    }//GEN-LAST:event_rdoFahrenheitActionPerformed
    
    DecimalFormat fd = new DecimalFormat();

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
//        if ((Double.parseDouble(this.txtTempToConvert.getText()) >= 0.0) || 
//                ((Double.parseDouble(this.txtTempToConvert.getText().trim()) <=0.0))) {
//            double newTemp = 0.0;
//            if (btnGroupTemperatures.getSelection().getActionCommand().equals("celcius")) {
//                newTemp = ((Double.parseDouble(txtTempToConvert.getText().trim()) - 32) / 1.8);
//                this.lblConversionResult.setText(fd.format(newTemp) + "°C.");
//            } else {
//                newTemp = ((Double.parseDouble(txtTempToConvert.getText().trim()) * 1.8) + 32);
//                this.lblConversionResult.setText(fd.format(newTemp) + "°F.");
//            }
//            
//        }
        double newTemp = 0.0;
        if (this.rdoCelcius.isSelected()){       
            newTemp = ((Double.parseDouble(txtTempToConvert.getText().trim()) - 32) / 1.8);
            this.lblConversionResult.setText(fd.format(newTemp) + "°C.");
        } else{
            newTemp = ((Double.parseDouble(txtTempToConvert.getText().trim()) * 1.8) + 32);
            this.lblConversionResult.setText(fd.format(newTemp) + "°F.");
        }
    }//GEN-LAST:event_btnConvertActionPerformed


//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TempConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TempConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TempConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TempConverterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TempConverterGUI().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.ButtonGroup btnGroupTemperatures;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JLabel lblConversionResult;
    private javax.swing.JLabel lblConversionStatement;
    private javax.swing.JLabel lblConversionStatement1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JRadioButton rdoCelcius;
    private javax.swing.JRadioButton rdoFahrenheit;
    private javax.swing.JTextField txtTempToConvert;
    // End of variables declaration//GEN-END:variables
}
