package org.usta.formularios;

import javax.swing.JOptionPane;
import org.usta.DAOS.ArtistaDAO;
import org.usta.modelos.Artista;


public class FrmArtistaCrear extends javax.swing.JInternalFrame {

    public FrmArtistaCrear() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabezaA = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelCuerpoA = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaCondicionesArtista = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        panelCabezaA.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registrar Artista");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabezaALayout = new javax.swing.GroupLayout(panelCabezaA);
        panelCabezaA.setLayout(panelCabezaALayout);
        panelCabezaALayout.setHorizontalGroup(
            panelCabezaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaALayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1)
                .addGap(119, 119, 119)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabezaALayout.setVerticalGroup(
            panelCabezaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaALayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCabezaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel1))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelCuerpoA.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Nombre Artista");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("Condiciones Artista");

        cajaCondicionesArtista.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoALayout = new javax.swing.GroupLayout(panelCuerpoA);
        panelCuerpoA.setLayout(panelCuerpoALayout);
        panelCuerpoALayout.setHorizontalGroup(
            panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoALayout.createSequentialGroup()
                .addGroup(panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoALayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jButton1))
                    .addGroup(panelCuerpoALayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaCondicionesArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelCuerpoALayout.setVerticalGroup(
            panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoALayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaCondicionesArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabezaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCuerpoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabezaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre,condiciones;
        nombre = cajaNombre.getText();
        condiciones  = cajaCondicionesArtista.getText();
        if (nombre.equals("" ) || condiciones.equals("")) {
            JOptionPane.showMessageDialog(panelCuerpoA, "Son obligatorios Ctm!!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Artista objArtista = new Artista(0, nombre, condiciones);
            ArtistaDAO objDao = new ArtistaDAO();
            if (objDao.agregar(objArtista)) {
                cajaNombre.setText("");
                cajaCondicionesArtista.setText("");
                cajaNombre.requestFocus();
                cajaCondicionesArtista.requestFocus();
                JOptionPane.showMessageDialog(panelCuerpoA, "Guardado correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panelCuerpoA, "Se petaquio!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaCondicionesArtista;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelCabezaA;
    private javax.swing.JPanel panelCuerpoA;
    // End of variables declaration//GEN-END:variables
}
