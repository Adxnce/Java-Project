/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pgy.ui;

import javax.swing.JOptionPane;

/**
 *
 * @author adsan
 */
public class Ventana_Consulta_Numero_Cuotas_Faltantes extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Consulta_Numero_Cuotas_Faltantes
     */
    public Ventana_Consulta_Numero_Cuotas_Faltantes() {
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

        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        btnRut = new javax.swing.JButton();
        lblNumeroCuotasPorCancelar = new javax.swing.JLabel();
        txtNumeroCuotasPorCancelar = new javax.swing.JTextField();
        btnNumeroCuotasPorCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRut.setText("Rut");

        btnRut.setText("BUSCAR");
        btnRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutActionPerformed(evt);
            }
        });

        lblNumeroCuotasPorCancelar.setText("Número de Cuotas por Cancelar");

        btnNumeroCuotasPorCancelar.setText("CERRAR");
        btnNumeroCuotasPorCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroCuotasPorCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblRut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNumeroCuotasPorCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNumeroCuotasPorCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNumeroCuotasPorCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblRut)
                .addGap(12, 12, 12)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRut)
                .addGap(34, 34, 34)
                .addComponent(lblNumeroCuotasPorCancelar)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroCuotasPorCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNumeroCuotasPorCancelar)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Funcionalidades en la proxima version :D");        // TODO add your handling code here:
    }//GEN-LAST:event_btnRutActionPerformed

    private void btnNumeroCuotasPorCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroCuotasPorCancelarActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Funcionalidades en la proxima version :D");        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumeroCuotasPorCancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNumeroCuotasPorCancelar;
    private javax.swing.JButton btnRut;
    private javax.swing.JLabel lblNumeroCuotasPorCancelar;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTextField txtNumeroCuotasPorCancelar;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
