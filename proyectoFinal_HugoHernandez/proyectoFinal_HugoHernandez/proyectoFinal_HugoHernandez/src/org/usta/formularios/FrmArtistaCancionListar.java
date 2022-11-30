
package org.usta.formularios;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.usta.DAOS.ArtistaCancionDAO;
import org.usta.modelos.ArtistaCancion;


public class FrmArtistaCancionListar extends javax.swing.JInternalFrame {

    
    private String titulos[] = {"Codigo Artista","Nombre Artista", " Condicion Artista", "Nombre Cancion"};
    private DefaultTableModel miModelo = new DefaultTableModel(titulos, 0);
    
    public FrmArtistaCancionListar() {
        initComponents();
        cargarArtistaCancion("");
        tablaDatosAC.setModel(miModelo);
        
    }

     private void cargarArtistaCancion(String ordencito) {
         List<ArtistaCancion> arreglo;

        miModelo.setNumRows(0);
         ArtistaCancionDAO miDAO = new ArtistaCancionDAO();
        arreglo = miDAO.consultar(ordencito);
        arreglo.forEach((tipito) -> {
            Object columna[] = new Object[3];
            
            columna[0] = tipito.getArtista().getCodArtista();
            columna[1] = tipito.getArtista().getNombreCompletoArtista();
            columna[2] = tipito.getArtista().getCondicionesArtista();
            columna[3] = tipito.getCancion().getNombre_cancion();
            miModelo.addRow(columna);

        });
    
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCuerpoAC = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosAC = new javax.swing.JTable();
        btnCodA = new javax.swing.JButton();
        btnNomA = new javax.swing.JButton();
        btnNomC = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Artistas y canciones");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelCuerpoAC.setBackground(new java.awt.Color(102, 0, 102));

        tablaDatosAC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaDatosAC);

        btnCodA.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnCodA.setText("Ordenar por código");
        btnCodA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodAActionPerformed(evt);
            }
        });

        btnNomA.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnNomA.setText("Ordenar por Artista");
        btnNomA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomAActionPerformed(evt);
            }
        });

        btnNomC.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnNomC.setText("Ordenar por canción");
        btnNomC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNomCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoACLayout = new javax.swing.GroupLayout(panelCuerpoAC);
        panelCuerpoAC.setLayout(panelCuerpoACLayout);
        panelCuerpoACLayout.setHorizontalGroup(
            panelCuerpoACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoACLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoACLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnCodA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnNomA)
                .addGap(44, 44, 44)
                .addComponent(btnNomC)
                .addGap(78, 78, 78))
        );
        panelCuerpoACLayout.setVerticalGroup(
            panelCuerpoACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoACLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelCuerpoACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCodA)
                    .addComponent(btnNomA)
                    .addComponent(btnNomC))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelCuerpoAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCodAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodAActionPerformed
        cargarArtistaCancion("a.cod_artista");
    }//GEN-LAST:event_btnCodAActionPerformed

    private void btnNomAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomAActionPerformed
        cargarArtistaCancion("a.nombre_completo_artista");
    }//GEN-LAST:event_btnNomAActionPerformed

    private void btnNomCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNomCActionPerformed
        cargarArtistaCancion("c.nombre_cancion");
    }//GEN-LAST:event_btnNomCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodA;
    private javax.swing.JButton btnNomA;
    private javax.swing.JButton btnNomC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCuerpoAC;
    private javax.swing.JTable tablaDatosAC;
    // End of variables declaration//GEN-END:variables
}
