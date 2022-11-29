
package org.usta.formularios;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.usta.DAOS.ArtistaDAO;
import org.usta.modelos.Artista;

public class FrmArtistaListar extends javax.swing.JInternalFrame {

    private String titulos[] = {"Codigo", " Nombre", "Condiciones"};
    private DefaultTableModel miModelo = new DefaultTableModel(titulos, 0);
    
    
    public FrmArtistaListar() {
        initComponents();
        cargarArtistas("");
        tablaDatosA.setModel(miModelo);
        
    }

     
    private void cargarArtistas(String ordencito){
        List<Artista> arreglito;
        
        miModelo.setNumRows(0);
        ArtistaDAO miDAO = new ArtistaDAO();
        arreglito = miDAO.consultar(ordencito);
        arreglito.forEach((tipito)->{
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

        panelCabezaA = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCuerpoA = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosA = new javax.swing.JTable();
        btnCodA = new javax.swing.JButton();
        btnNombreA = new javax.swing.JButton();

        panelCabezaA.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Lista de Artistas");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabezaALayout = new javax.swing.GroupLayout(panelCabezaA);
        panelCabezaA.setLayout(panelCabezaALayout);
        panelCabezaALayout.setHorizontalGroup(
            panelCabezaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabezaALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(137, 137, 137)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        panelCabezaALayout.setVerticalGroup(
            panelCabezaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaALayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelCabezaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panelCuerpoA.setBackground(new java.awt.Color(0, 102, 102));

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
        jScrollPane1.setViewportView(tablaDatosA);

        btnCodA.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnCodA.setText("Ordenar por codigo");
        btnCodA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodAActionPerformed(evt);
            }
        });

        btnNombreA.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnNombreA.setText("Ordenar por nombre");
        btnNombreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoALayout = new javax.swing.GroupLayout(panelCuerpoA);
        panelCuerpoA.setLayout(panelCuerpoALayout);
        panelCuerpoALayout.setHorizontalGroup(
            panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(panelCuerpoALayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnCodA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnNombreA)
                .addGap(143, 143, 143))
        );
        panelCuerpoALayout.setVerticalGroup(
            panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoALayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panelCuerpoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCodA)
                    .addComponent(btnNombreA))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabezaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabezaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCodAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodAActionPerformed
        cargarArtistas("cod_artista");
    }//GEN-LAST:event_btnCodAActionPerformed

    private void btnNombreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreAActionPerformed
        cargarArtistas("nombre_completo_artista");
    }//GEN-LAST:event_btnNombreAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodA;
    private javax.swing.JButton btnNombreA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCabezaA;
    private javax.swing.JPanel panelCuerpoA;
    private javax.swing.JTable tablaDatosA;
    // End of variables declaration//GEN-END:variables
}
