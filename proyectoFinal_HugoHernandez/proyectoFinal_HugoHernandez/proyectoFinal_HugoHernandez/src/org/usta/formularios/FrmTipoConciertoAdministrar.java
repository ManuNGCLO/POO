package org.usta.formularios;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.usta.DAOS.TipoConciertoDAO;
import org.usta.modelos.TipoConcierto;

public class FrmTipoConciertoAdministrar extends javax.swing.JInternalFrame {

    private String titulos[] = {"Codigo", " Nombre"};
    private DefaultTableModel miModelo = new DefaultTableModel(titulos, 0);
    
    public FrmTipoConciertoAdministrar() {
        initComponents();
        cargarTiposConciertos("");
        tablaDatosTipoC.setModel(miModelo);
        
    }

    private void cargarTiposConciertos(String ordencito){
        List<TipoConcierto> arreglito;
        
        miModelo.setNumRows(0);
        TipoConciertoDAO miDAO = new TipoConciertoDAO();
        arreglito = miDAO.consultar("");
        arreglito.forEach((tipito)->{
            Object columna[] = new Object[2];
            columna[0] = tipito.getCodTipoConcierto();
            columna[1] = tipito.getNombreTipoConcierto();
            miModelo.addRow(columna);
            
    });
    
    
    
}
   
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneladministrarC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosTipoC = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        cajaCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de tipo de conciertos");

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton1.setText("Listar por codigo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton2.setText("Listar por nombre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablaDatosTipoC.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDatosTipoC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosTipoCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatosTipoC);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("Código");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Nombre");
        jLabel3.setToolTipText("");

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneladministrarCLayout = new javax.swing.GroupLayout(paneladministrarC);
        paneladministrarC.setLayout(paneladministrarCLayout);
        paneladministrarCLayout.setHorizontalGroup(
            paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneladministrarCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneladministrarCLayout.createSequentialGroup()
                        .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paneladministrarCLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(125, 125, 125)
                                .addComponent(jButton2))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(paneladministrarCLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneladministrarCLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneladministrarCLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnActualizar)
                                    .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancelar)))
                                .addGap(30, 30, 30))))))
        );
        paneladministrarCLayout.setVerticalGroup(
            paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneladministrarCLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneladministrarCLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneladministrarCLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)))
                .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneladministrarCLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paneladministrarCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneladministrarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneladministrarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        cargarTiposConciertos("cod_tipo_concierto");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        cargarTiposConciertos("nombre_tipo_concierto");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tablaDatosTipoCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosTipoCMouseClicked
       
            
        int filaSeleccionada = tablaDatosTipoC.getSelectedRow();

        String codigoTexto = miModelo.getValueAt(filaSeleccionada, 0).toString(); //va a guardar el calor string del codigo seleccionado

         TipoConciertoDAO MiDaoTC = new TipoConciertoDAO();

        TipoConcierto objTipoC = MiDaoTC.buscar(Integer.valueOf(codigoTexto));

        if (objTipoC== null) {

            JOptionPane.showMessageDialog(paneladministrarC, "No lo encontré", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {

            cajaCodigo.setText(objTipoC.getCodTipoConcierto() + "");
            cajaNombre.setText(objTipoC.getNombreTipoConcierto() + "");
          
        }
        
        
        
        
        
    }//GEN-LAST:event_tablaDatosTipoCMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int codigo = Integer.valueOf(cajaCodigo.getText());
        
        TipoConciertoDAO miDaoTC = new TipoConciertoDAO();
        TipoConcierto objTC = new TipoConcierto(codigo, "");
        
        if (miDaoTC.eliminar(objTC)) {
            
            cargarTiposConciertos("");
            cajaCodigo.setText("");
            cajaNombre.setText("");
            
            JOptionPane.showMessageDialog(paneladministrarC, "Registro Eliminado", "Annuncio", JOptionPane.INFORMATION_MESSAGE);

            
        } else {
            JOptionPane.showMessageDialog(paneladministrarC, "No se pudo eliminar el registro", "Nos petaqueamos", JOptionPane.ERROR_MESSAGE);
           
        }
        
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            String codigoMTexto = cajaCodigo.getText();
            String nombreTexto = cajaNombre.getText();
        
        
        int codigoM = Integer.valueOf(codigoMTexto);
        
        TipoConcierto objTC = new TipoConcierto(codigoM, nombreTexto);
        TipoConciertoDAO miDAOTC = new TipoConciertoDAO();
        
        if (miDAOTC.actualizar(objTC)) {
            
            cargarTiposConciertos("");
            cajaCodigo.setText("");
            cajaNombre.setText("");
                        
            JOptionPane.showMessageDialog(paneladministrarC, "El registro fue actualizado correctamente", "Alerta", JOptionPane.INFORMATION_MESSAGE);
            
            
        } else {
            
            JOptionPane.showMessageDialog(paneladministrarC, "No se pudo Actualizar", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(paneladministrarC, "Por favor Seleccione Algo", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        tablaDatosTipoC.clearSelection();
        cajaCodigo.setText("");
        cajaNombre.setText("");
        
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paneladministrarC;
    private javax.swing.JTable tablaDatosTipoC;
    // End of variables declaration//GEN-END:variables
}
