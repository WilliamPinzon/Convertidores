package com.willi.conversores.monedas;

import com.willi.conversores.eleccion.Visual;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Monedas extends javax.swing.JFrame {

    private String moneda;
    private String resultado;
    private Double valor;
    private String simbolo;

    public Monedas() {
        initComponents();

        this.setLocationRelativeTo(null);
        eleccionMoneda.addItem("Dolar");
        eleccionMoneda.addItem("Euro");
        eleccionMoneda.addItem("Libra Esterlina");
        eleccionMoneda.addItem("Yen Japones");
        eleccionMoneda.addItem("Won Sur-Coreano");
    }

    public String strHtml(Double valor, String simbolo, String resultado, String moneda) {
        return "<html>" + "$ " + valor + " Colombianos" + "<p>" + "Equivalen a: " + "<p>" + simbolo + resultado + " " + moneda + "</html>";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        ingresoValor = new javax.swing.JTextField();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        eleccionMoneda = new javax.swing.JComboBox<>();
        BtConvertir = new javax.swing.JButton();
        BtBorrar = new javax.swing.JButton();
        BtAtras = new javax.swing.JButton();
        txtSalida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        txt1.setText("Conversor de Monedas");

        ingresoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoValorActionPerformed(evt);
            }
        });

        txt2.setText("Agrega el valor en pesos Colombianos");

        txt3.setText("Elige la moneda");

        eleccionMoneda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                eleccionMonedaItemStateChanged(evt);
            }
        });
        eleccionMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleccionMonedaActionPerformed(evt);
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

        jLabel1.setText("<html>La tasa equivale<p> a la moneda de cambio <p>del 09 de marzo del 2023 </html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(eleccionMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2)
                            .addComponent(txt3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(BtConvertir)
                                    .addGap(15, 15, 15)
                                    .addComponent(BtBorrar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtAtras)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
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
                .addComponent(ingresoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt3)
                .addGap(18, 18, 18)
                .addComponent(eleccionMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtConvertir)
                    .addComponent(BtBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(BtAtras))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoValorActionPerformed

    private void BtAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtrasActionPerformed
        Visual abrir = new Visual();
        abrir.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtAtrasActionPerformed

    private void BtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarActionPerformed
        ingresoValor.setText(" ");
        txtSalida.setText(" ");
        ingresoValor.requestFocus();
    }//GEN-LAST:event_BtBorrarActionPerformed

    private void eleccionMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleccionMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eleccionMonedaActionPerformed

    private void BtConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConvertirActionPerformed
        ConversorMonedas conversor = new ConversorMonedas();

        String input = ingresoValor.getText();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe escribir un valor");
            ingresoValor.requestFocus();
            ingresoValor.setText(" ");
            txtSalida.setText(" ");
        } else {
            try {
                valor = Double.parseDouble(input);
                conversor.setValor(valor);
                conversor.setMoneda(moneda);

                DecimalFormat formato = new DecimalFormat("#.##");

                resultado = String.valueOf(formato.format(conversor.conversion()));
                simbolo = conversor.enviaSimbolo();

                txtSalida.setText(strHtml(valor, simbolo, resultado, moneda));
                // hacer algo con el valor numérico
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido");
                ingresoValor.requestFocus();
                ingresoValor.setText(" ");
                txtSalida.setText(" ");
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BtConvertirActionPerformed

    private void eleccionMonedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_eleccionMonedaItemStateChanged
        moneda = (String) eleccionMoneda.getSelectedItem();
    }//GEN-LAST:event_eleccionMonedaItemStateChanged

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
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtras;
    private javax.swing.JButton BtBorrar;
    private javax.swing.JButton BtConvertir;
    private javax.swing.JComboBox<String> eleccionMoneda;
    private javax.swing.JTextField ingresoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txtSalida;
    // End of variables declaration//GEN-END:variables

}
