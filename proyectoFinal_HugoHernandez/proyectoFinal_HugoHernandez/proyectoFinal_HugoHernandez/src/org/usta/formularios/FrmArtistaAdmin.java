package org.usta.formularios;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.usta.DAOS.ArtistaDAO;
import org.usta.modelos.Artista;

public class FrmArtistaAdmin extends javax.swing.JInternalFrame {

   
    private String titulos[] = {"Codigo", " Nombre", "Condiciones"};
    private DefaultTableModel miModelo = new DefaultTableModel(titulos, 0){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
            
        }
    
    
    
    };

    public FrmArtistaAdmin() {
        initComponents();
        cargarArtistas("");
        tablaDatosA.setModel(miModelo);
    }

    private void cargarArtistas(String ordencito) {
        List<Artista> arreglito;

        miModelo.setNumRows(0);
        ArtistaDAO miDAO = new ArtistaDAO();
        arreglito = miDAO.consultar(ordencito);
        arreglito.forEach((tipito) -> {
            Object columna[] = new Object[3];
            columna[0] = tipito.getCodArtista();
            columna[1] = tipito.getNombreCompletoArtista();
            columna[2] = tipito.getCondicionesArtista();
            miModelo.addRow(columna);

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabezAD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCuerpoAD = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosA = new javax.swing.JTable();
        brnOrdenarC = new javax.swing.JButton();
        btnOrdenarN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaCondiciones = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        panelCabezAD.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ADMINISTRAR ARTISTAS");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabezADLayout = new javax.swing.GroupLayout(panelCabezAD);
        panelCabezAD.setLayout(panelCabezADLayout);
        panelCabezADLayout.setHorizontalGroup(
            panelCabezADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabezADLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addComponent(jButton1)
                .addContainerGap())
        );
        panelCabezADLayout.setVerticalGroup(
            panelCabezADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabezADLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
            .addGroup(panelCabezADLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCuerpoAD.setBackground(new java.awt.Color(0, 0, 153));

        tablaDatosA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaDatosA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatosA);

        brnOrdenarC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        brnOrdenarC.setText("Ordenar por Código");
        brnOrdenarC.setToolTipText("");
        brnOrdenarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnOrdenarCActionPerformed(evt);
            }
        });

        btnOrdenarN.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnOrdenarN.setText("Ordenar por Nombre");
        btnOrdenarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Condiciones");

        cajaCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCondicionesActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoADLayout = new javax.swing.GroupLayout(panelCuerpoAD);
        panelCuerpoAD.setLayout(panelCuerpoADLayout);
        panelCuerpoADLayout.setHorizontalGroup(
            panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoADLayout.createSequentialGroup()
                .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoADLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCuerpoADLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaCondiciones)
                                    .addGroup(panelCuerpoADLayout.createSequentialGroup()
                                        .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cajaCodigo)
                                            .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                    .addGroup(panelCuerpoADLayout.createSequentialGroup()
                                        .addComponent(btnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnActualizar)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoADLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoADLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoADLayout.createSequentialGroup()
                                        .addComponent(btnCancelar)
                                        .addGap(42, 42, 42))))))
                    .addGroup(panelCuerpoADLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(brnOrdenarC)
                        .addGap(57, 57, 57)
                        .addComponent(btnOrdenarN)))
                .addGap(20, 20, 20))
        );
        panelCuerpoADLayout.setVerticalGroup(
            panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoADLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnOrdenarC)
                    .addComponent(btnOrdenarN))
                .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoADLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCuerpoADLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(cajaCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelCuerpoADLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabezAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpoAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabezAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnOrdenarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnOrdenarCActionPerformed
        cargarArtistas("a.cod_artista");
    }//GEN-LAST:event_brnOrdenarCActionPerformed

    private void cajaCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCondicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCondicionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaDatosAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosAMouseClicked

      
        int filaSeleccionada = tablaDatosA.getSelectedRow();

        String codigoTexto = miModelo.getValueAt(filaSeleccionada, 0).toString(); //va a guardar el calor string del codigo seleccionado

        ArtistaDAO MiDaoAD = new ArtistaDAO();

        Artista objA = MiDaoAD.buscar(Integer.valueOf(codigoTexto));

        if (objA == null) {

            JOptionPane.showMessageDialog(panelCuerpoAD, "No lo encontré", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {

            cajaCodigo.setText(objA.getCodArtista() + "");
            cajaNombre.setText(objA.getNombreCompletoArtista() + "");
            cajaCondiciones.setText(objA.getCondicionesArtista() + "");
        }


    }//GEN-LAST:event_tablaDatosAMouseClicked

    private void btnOrdenarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNActionPerformed
        cargarArtistas("a.nombre_completo_artista");
    }//GEN-LAST:event_btnOrdenarNActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    try {
            int codigo = Integer.valueOf(cajaCodigo.getText());

            ArtistaDAO miDao = new ArtistaDAO();

            Artista objCamisa = new Artista(codigo, "", "");

            if (miDao.eliminar(objCamisa)) {

                cargarArtistas("");
                cajaCodigo.setText("");
                cajaNombre.setText("");
                cajaCondiciones.setText("");

                JOptionPane.showMessageDialog(panelCuerpoAD, "Registro Eliminado", "Annuncio", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(panelCuerpoAD, "No se pudo eliminar el registro", "Nos petaqueamos", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(panelCuerpoAD, "Por favor seleccione una opción a eliminar", "Alerta", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            String codigoMTexto = cajaCodigo.getText();
            String nombreTexto = cajaNombre.getText();
            String condicionesTexto = cajaCondiciones.getText();

            int codigoM = Integer.valueOf(codigoMTexto);

            Artista objAC = new Artista(codigoM, nombreTexto, condicionesTexto);
            ArtistaDAO miDAOTC = new ArtistaDAO();

            if (miDAOTC.actualizar(objAC)) {

                cargarArtistas("");
                cajaCodigo.setText("");
                cajaNombre.setText("");
                cajaCondiciones.setText("");

                JOptionPane.showMessageDialog(panelCuerpoAD, "El registro fue actualizado correctamente", "Alerta", JOptionPane.INFORMATION_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(panelCuerpoAD, "No se pudo Actualizar", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(panelCuerpoAD, "Por favor Seleccione Algo", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        tablaDatosA.clearSelection();
        cajaCodigo.setText("");
        cajaNombre.setText("");
        cajaCondiciones.setText("");


    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnOrdenarC;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOrdenarN;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextField cajaCondiciones;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCabezAD;
    private javax.swing.JPanel panelCuerpoAD;
    private javax.swing.JTable tablaDatosA;
    // End of variables declaration//GEN-END:variables
}
