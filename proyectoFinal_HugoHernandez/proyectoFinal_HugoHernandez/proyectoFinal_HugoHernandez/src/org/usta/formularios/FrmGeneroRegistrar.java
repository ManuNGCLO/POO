package org.usta.formularios;

import javax.swing.JOptionPane;
import org.usta.DAOS.GeneroDAO;
import org.usta.modelos.Genero;

public class FrmGeneroRegistrar extends javax.swing.JInternalFrame {

    public FrmGeneroRegistrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCaabezaG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panelCuerpoG = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cajaNombreG = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        panelCaabezaG.setBackground(new java.awt.Color(51, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Registrar Genero");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCaabezaGLayout = new javax.swing.GroupLayout(panelCaabezaG);
        panelCaabezaG.setLayout(panelCaabezaGLayout);
        panelCaabezaGLayout.setHorizontalGroup(
            panelCaabezaGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCaabezaGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
        panelCaabezaGLayout.setVerticalGroup(
            panelCaabezaGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCaabezaGLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelCaabezaGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelCuerpoG.setBackground(new java.awt.Color(51, 51, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Genero");

        cajaNombreG.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoGLayout = new javax.swing.GroupLayout(panelCuerpoG);
        panelCuerpoG.setLayout(panelCuerpoGLayout);
        panelCuerpoGLayout.setHorizontalGroup(
            panelCuerpoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoGLayout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addComponent(cajaNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(panelCuerpoGLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(164, 164, 164))
        );
        panelCuerpoGLayout.setVerticalGroup(
            panelCuerpoGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoGLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(cajaNombreG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCaabezaG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpoG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCaabezaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre;
        nombre = cajaNombreG.getText();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(panelCuerpoG, "Son obligatorios Ctm!!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Genero objTipoConcierto = new Genero(0, nombre);
            GeneroDAO objDao = new GeneroDAO();
            if (objDao.agregar(objTipoConcierto)) {
                cajaNombreG.setText("");
                cajaNombreG.requestFocus();
                JOptionPane.showMessageDialog(panelCuerpoG, "Guardado correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(panelCuerpoG, "Se petaquio!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaNombreG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelCaabezaG;
    private javax.swing.JPanel panelCuerpoG;
    // End of variables declaration//GEN-END:variables
}
