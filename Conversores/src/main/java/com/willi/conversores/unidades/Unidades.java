package com.willi.conversores.unidades;

import com.willi.conversores.monedas.*;
import com.willi.conversores.eleccion.Visual;
import com.willi.conversores.monedas.ConversorMonedas;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Unidades extends javax.swing.JFrame {

    private double valor1, valor2;
    private String datos1, datos2, simbolo;
    private String resultado;
    private Double valor;

    public Unidades() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        dato1.addItem("Bit");
        dato1.addItem("Byte");
        dato1.addItem("Kilobyte");
        dato1.addItem("Megabyte");
        dato1.addItem("Gigabyte");
        dato1.addItem("Terabyte");

        dato2.addItem("Bit");
        dato2.addItem("Byte");
        dato2.addItem("Kilobyte");
        dato2.addItem("Megabyte");
        dato2.addItem("Gigabyte");
        dato2.addItem("Terabyte");
    }
    
    public String strHtml(Double valor1, String datos1, String resultado, String simbolo, String datos2){
        return "<html>" + valor1 + " " + datos1 + "<p>" + "Equivalen a: " + "<p>" + resultado + simbolo + " " + datos2 + "</html>";
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        dato2 = new javax.swing.JComboBox<>();
        BtConvertir = new javax.swing.JButton();
        BtBorrar = new javax.swing.JButton();
        BtAtras = new javax.swing.JButton();
        txtSalida = new javax.swing.JLabel();
        dato1 = new javax.swing.JComboBox<>();
        valores1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        txt1.setText("Conversor de Unidades de Datos");

        txt2.setText("Ingresa el Dato y el tipo");

        txt3.setText("A que unidad lo quieres convertir");

        dato2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dato2ItemStateChanged(evt);
            }
        });
        dato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato2ActionPerformed(evt);
            }
        });

        BtConvertir.setText("Convertir");
        BtConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConvertirActionPerformed(evt);
            }
        });

        BtBorrar.setText("Borrar");
        BtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBorrarActionPerformed(evt);
            }
        });

        BtAtras.setText("Atras");
        BtAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtrasActionPerformed(evt);
            }
        });

        txtSalida.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        txtSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dato1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dato1ItemStateChanged(evt);
            }
        });
        dato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato1ActionPerformed(evt);
            }
        });

        valores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valores1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1)
                            .addComponent(txt2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtConvertir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valores1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(dato1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt3)
                            .addComponent(dato2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtAtras)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt3)
                .addGap(16, 16, 16)
                .addComponent(dato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtConvertir)
                    .addComponent(BtBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BtAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtrasActionPerformed
        Visual abrir = new Visual();
        abrir.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtAtrasActionPerformed

    private void BtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarActionPerformed
        valores1.setText(" ");
        txtSalida.setText(" ");
        valores1.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBorrarActionPerformed

    private void dato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato2ActionPerformed

    private void BtConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConvertirActionPerformed
        ConversorUnidades conversor = new ConversorUnidades();

        String input = valores1.getText();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe escribir un valor");
            valores1.requestFocus();
            valores1.setText(" ");
        } else {
            try {
                valor1 = Double.parseDouble(input);
                // hacer algo con el valor numérico
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido");
                valores1.requestFocus();
                valores1.setText(" ");
                txtSalida.setText(" ");
            }
        }
        //valor2 = Double.parseDouble(valores2.getText());  

        conversor.setvalor1(valor1);
        //conversor.setvalor1(valor2);
        conversor.setDatos1(datos1);
        conversor.setDatos2(datos2);

        //DecimalFormat formato = new DecimalFormat("#.##");
        resultado = String.valueOf(conversor.unidad1());
        simbolo = conversor.enviaSimbolo();

        txtSalida.setText(strHtml(valor1, datos1, resultado, simbolo, datos2));

        // TODO add your handling code here:
    }//GEN-LAST:event_BtConvertirActionPerformed

    private void dato2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dato2ItemStateChanged
        datos1 = (String) dato1.getSelectedItem();
        datos2 = (String) dato2.getSelectedItem();
    }//GEN-LAST:event_dato2ItemStateChanged

    private void dato1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dato1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_dato1ItemStateChanged

    private void dato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato1ActionPerformed

    private void valores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valores1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valores1ActionPerformed

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
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Unidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtras;
    private javax.swing.JButton BtBorrar;
    private javax.swing.JButton BtConvertir;
    private javax.swing.JComboBox<String> dato1;
    private javax.swing.JComboBox<String> dato2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txtSalida;
    private javax.swing.JTextField valores1;
    // End of variables declaration//GEN-END:variables

}
