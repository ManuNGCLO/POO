package org.usta.formularios;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.usta.DAOS.ConciertoDao;
import org.usta.DAOS.TipoConciertoDao;
import org.usta.modelos.Concierto;
import org.usta.modelos.TipoConcierto;

public class FrmConciertoAdmin extends javax.swing.JInternalFrame {

    private Integer codigoConcierto = null;

    private String titulos[] = {"Código", " Nombre", "Fecha", "Tipo"};
    private DefaultTableModel miModeloTabla = new DefaultTableModel(titulos, 0){
        @Override
        public boolean isCellEditable(int row, int column) {
            return super.isCellEditable(row, column); 
        }
    
    
    
    };

    private Map<Integer, Integer> codigosTipoConcierto = new HashMap<>();
    private DefaultComboBoxModel modeloComboTC = new DefaultComboBoxModel();

    public FrmConciertoAdmin() {
        initComponents();

        cargarConciertos("");

        TablaDatosAD.setModel(miModeloTabla);

        comboTipoC.setModel(modeloComboTC);
        cargarTipoC();//llama al combo los datos
    }

    private void cargarConciertos(String orden) {
        List<Concierto> arreglo;

        miModeloTabla.setNumRows(0);

        ConciertoDao miDAOC = new ConciertoDao();
        arreglo = miDAOC.consultar(orden);
        arreglo.forEach((conciertoL) -> {
            Object fila[] = new Object[4];

            fila[0] = conciertoL.getCodConcierto();
            fila[1] = conciertoL.getNombreConcierto();
            fila[2] = conciertoL.getFechaConcierto();

            fila[3] = conciertoL.getTipoConcierto().getNombreTipoConcierto();

            miModeloTabla.addRow(fila);

        });
    }

    private void cargarTipoC() {

        Integer indice = 0;

        codigosTipoConcierto.put(indice, indice);

        List<TipoConcierto> arregloTC;

        TipoConciertoDao objDaoTC = new TipoConciertoDao();
        arregloTC = objDaoTC.consultar("");

        modeloComboTC.addElement("Seleccione una Opción"); //Esto es para que no muestre el primer dato

        for (TipoConcierto objTC : arregloTC) {

            indice++;

            modeloComboTC.addElement(objTC.getNombreTipoConcierto()); //addElement añade cosas al combo y solamente le pone el nombre 

            codigosTipoConcierto.put(indice, objTC.getCodTipoConcierto());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCuerpo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatosAD = new javax.swing.JTable();
        btnOrdenarNombre = new javax.swing.JButton();
        btnOrdenarFecha = new javax.swing.JButton();
        btnOrdenarTipo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cajaNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboTipoC = new javax.swing.JComboBox<>();
        fConcierto = new com.toedter.calendar.JDateChooser();
        btnActualizarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        btnCancelarC = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Administrar Concierto");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelCuerpo.setBackground(new java.awt.Color(51, 51, 0));

        TablaDatosAD.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaDatosAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosADMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatosAD);

        btnOrdenarNombre.setText("Ordenar por Nombre");
        btnOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombreActionPerformed(evt);
            }
        });

        btnOrdenarFecha.setText("Ordenar por Fecha");
        btnOrdenarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarFechaActionPerformed(evt);
            }
        });

        btnOrdenarTipo.setText("Ordenar pot tipo");
        btnOrdenarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCuerpoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnOrdenarNombre)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdenarFecha)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdenarTipo)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenarNombre)
                    .addComponent(btnOrdenarFecha)
                    .addComponent(btnOrdenarTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre Concierto");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha Concierto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo Concierto");

        comboTipoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", " " }));
        comboTipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoCActionPerformed(evt);
            }
        });

        btnActualizarC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnActualizarC.setText("Actualizar");
        btnActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCActionPerformed(evt);
            }
        });

        btnEliminarC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnEliminarC.setText("Eliminar");
        btnEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCActionPerformed(evt);
            }
        });

        btnCancelarC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnCancelarC.setText("Cancelar");
        btnCancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboTipoC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaNombre)
                            .addComponent(fConcierto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fConcierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnActualizarC)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombreActionPerformed

        cargarConciertos("c.nombre_concierto");

    }//GEN-LAST:event_btnOrdenarNombreActionPerformed

    private void btnOrdenarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarFechaActionPerformed
        cargarConciertos("c.fecha_concierto");
    }//GEN-LAST:event_btnOrdenarFechaActionPerformed

    private void btnOrdenarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarTipoActionPerformed
        cargarConciertos("tc.nombre_tipo_concierto");
    }//GEN-LAST:event_btnOrdenarTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaDatosADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosADMouseClicked

        int filaSeleccionada = TablaDatosAD.getSelectedRow();

        String codigoTexto = miModeloTabla.getValueAt(filaSeleccionada, 0).toString(); //va a guardar el calor string del codigo seleccionado

        codigoConcierto = Integer.valueOf(codigoTexto);

        ConciertoDao MiDaoC = new ConciertoDao();

        Concierto objConcierto = MiDaoC.buscar(codigoConcierto);

        if (objConcierto == null) {

            JOptionPane.showMessageDialog(panelCuerpo, "No lo encontré", "Alerta", JOptionPane.WARNING_MESSAGE);

        } else {

            comboTipoC.setSelectedIndex(objConcierto.getTipoConcierto().getCodTipoConcierto());
            cajaNombre.setText(objConcierto.getNombreConcierto() + "");
            fConcierto.setDate(objConcierto.getFechaConcierto());

        }


    }//GEN-LAST:event_TablaDatosADMouseClicked

    private void comboTipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoCActionPerformed

    private void btnActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCActionPerformed
        try {
            Integer indiceCodTipoConciertoSeleccionado, codTipoConciertoFinal;
            String cadenaNombre, cadenaFecha;
            String formatoCalendario = "EEE MMM dd HH:mm:ss zzz yyyy";

            Date fechaCalendario;

            indiceCodTipoConciertoSeleccionado = comboTipoC.getSelectedIndex();

            codTipoConciertoFinal = codigosTipoConcierto.get(indiceCodTipoConciertoSeleccionado);

            cadenaNombre = cajaNombre.getText();
            cadenaFecha = fConcierto.getDate().toString();

            SimpleDateFormat formatoAntiguo = new SimpleDateFormat(formatoCalendario, Locale.ENGLISH);

            fechaCalendario = formatoAntiguo.parse(cadenaFecha);

            TipoConcierto miTipo = new TipoConcierto(codTipoConciertoFinal, "");

            Concierto objConcierto = new Concierto(codigoConcierto, cadenaNombre, fechaCalendario, miTipo);
            ConciertoDao objConciertoDao = new ConciertoDao();

            if (objConciertoDao.actualizar(objConcierto)) {

                cargarConciertos("");

                JOptionPane.showMessageDialog(panelCuerpo, "Registro Actualizado", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(panelCuerpo, "Registro no pudo ser Actualizado", "Alerta",
                        JOptionPane.WARNING_MESSAGE);

            }

        } catch (ParseException ex) {
            Logger.getLogger(FrmConciertoCrear.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnActualizarCActionPerformed

    private void btnEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCActionPerformed

        ConciertoDao miConciertoDAO = new ConciertoDao();
        Concierto objConcierto = new Concierto(codigoConcierto, "", new Date(), new TipoConcierto());

        if (miConciertoDAO.eliminar(objConcierto)) {

            cargarConciertos("");
            comboTipoC.setSelectedIndex(0);
            cajaNombre.setText("");
            fConcierto.setDate(null);

            JOptionPane.showMessageDialog(panelCuerpo, "El registro se eliminó correctamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(panelCuerpo, "El registro NO se eliminó", "Se petaquio", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarCActionPerformed

    private void btnCancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCActionPerformed
        TablaDatosAD.clearSelection();

        cargarConciertos("");
        comboTipoC.setSelectedIndex(0);
        cajaNombre.setText("");
        fConcierto.setDate(null);

    }//GEN-LAST:event_btnCancelarCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatosAD;
    private javax.swing.JButton btnActualizarC;
    private javax.swing.JButton btnCancelarC;
    private javax.swing.JButton btnEliminarC;
    private javax.swing.JButton btnOrdenarFecha;
    private javax.swing.JButton btnOrdenarNombre;
    private javax.swing.JButton btnOrdenarTipo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboTipoC;
    private com.toedter.calendar.JDateChooser fConcierto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCuerpo;
    // End of variables declaration//GEN-END:variables

}
