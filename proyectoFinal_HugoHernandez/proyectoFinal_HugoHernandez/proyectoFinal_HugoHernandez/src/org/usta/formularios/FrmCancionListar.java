package org.usta.formularios;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.usta.DAOS.CancionDAO;
import org.usta.modelos.Cancion;

public class FrmCancionListar extends javax.swing.JInternalFrame {

    private String titulos[] = {"Nombre", " Genero", "Fecha"};
    private DefaultTableModel miModelo = new DefaultTableModel(titulos, 0);

    public FrmCancionListar() {
        initComponents();

        tablaDatosLC.setModel(miModelo);
        cargarCanciones("");
    }

    private void cargarCanciones(String ordencito) {
        List<Cancion> arreglo;

        miModelo.setNumRows(0);
        CancionDAO miDAO = new CancionDAO();
        arreglo = miDAO.consultar(ordencito);
        arreglo.forEach((tipito) -> {
            Object columna[] = new Object[3];
            columna[0] = tipito.getNombre_cancion();
            columna[1] = tipito.getCod_genero_cancion().getNombre_genero();
            columna[2] = tipito.getFechapublicacion_cancion();
            miModelo.addRow(columna);

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabezaLC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        panelCuerpoLC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosLC = new javax.swing.JTable();
        bntNombre = new javax.swing.JButton();
        btnGenero = new javax.swing.JButton();
        btnFecha = new javax.swing.JButton();

        panelCabezaLC.setBackground(new java.awt.Color(153, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTAR CANCIONES");

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 51));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabezaLCLayout = new javax.swing.GroupLayout(panelCabezaLC);
        panelCabezaLC.setLayout(panelCabezaLCLayout);
        panelCabezaLCLayout.setHorizontalGroup(
            panelCabezaLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabezaLCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112)
                .addComponent(btnSalir)
                .addGap(21, 21, 21))
        );
        panelCabezaLCLayout.setVerticalGroup(
            panelCabezaLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaLCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelCabezaLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSalir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panelCuerpoLC.setBackground(new java.awt.Color(51, 0, 0));

        tablaDatosLC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaDatosLC);

        bntNombre.setText("Ordenar por nombre");
        bntNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNombreActionPerformed(evt);
            }
        });

        btnGenero.setText("Ordenar por Genero");
        btnGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneroActionPerformed(evt);
            }
        });

        btnFecha.setText("Ordenar por fecha");
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoLCLayout = new javax.swing.GroupLayout(panelCuerpoLC);
        panelCuerpoLC.setLayout(panelCuerpoLCLayout);
        panelCuerpoLCLayout.setHorizontalGroup(
            panelCuerpoLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLCLayout.createSequentialGroup()
                .addGroup(panelCuerpoLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCuerpoLCLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCuerpoLCLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(bntNombre)
                        .addGap(31, 31, 31)
                        .addComponent(btnGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecha)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelCuerpoLCLayout.setVerticalGroup(
            panelCuerpoLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoLCLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelCuerpoLCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNombre)
                    .addComponent(btnGenero)
                    .addComponent(btnFecha))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabezaLC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelCuerpoLC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabezaLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNombreActionPerformed

        cargarCanciones("c.nombre_cancion");


    }//GEN-LAST:event_bntNombreActionPerformed

    private void btnGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneroActionPerformed

        cargarCanciones("gc.nombre_genero");


    }//GEN-LAST:event_btnGeneroActionPerformed

    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed
        cargarCanciones("c.fechapublicacion_cancion");
    }//GEN-LAST:event_btnFechaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNombre;
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnGenero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCabezaLC;
    private javax.swing.JPanel panelCuerpoLC;
    private javax.swing.JTable tablaDatosLC;
    // End of variables declaration//GEN-END:variables
}
