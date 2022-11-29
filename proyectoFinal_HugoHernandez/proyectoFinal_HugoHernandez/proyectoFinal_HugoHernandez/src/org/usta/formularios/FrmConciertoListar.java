package org.usta.formularios;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.usta.modelos.Concierto;

import org.usta.DAOS.ConciertoDAO;

public class FrmConciertoListar extends javax.swing.JInternalFrame {

    private String titulos[] = {"Codigo", " Nombre", "Fecha"};
    private DefaultTableModel miModelo = new DefaultTableModel(titulos, 0);
    
    
    public FrmConciertoListar() {
        initComponents();
        cargarConciertos("");
        tablaDatosC.setModel(miModelo);
        
    }

    private void cargarConciertos(String ordencito){
        List<Concierto> arreglo;
        
        miModelo.setNumRows(0);
        ConciertoDAO miDAO = new ConciertoDAO();
        arreglo = miDAO.consultar(ordencito);
        arreglo.forEach((tipito)->{
            Object columna[] = new Object[3];
            columna[0] = tipito.getCodConcierto();
            columna[1] = tipito.getNombreConcierto();
            columna[2] = tipito.getFechaConcierto();
            miModelo.addRow(columna);
            
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabezaConcierto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCuerpoConcierto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosC = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Conciertos");

        tablaDatosC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaDatosC);

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton1.setText("Codigo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton2.setText("Nombre ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton3.setText("Fecha");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoConciertoLayout = new javax.swing.GroupLayout(panelCuerpoConcierto);
        panelCuerpoConcierto.setLayout(panelCuerpoConciertoLayout);
        panelCuerpoConciertoLayout.setHorizontalGroup(
            panelCuerpoConciertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoConciertoLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(panelCuerpoConciertoLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton1)
                .addGap(86, 86, 86)
                .addComponent(jButton2)
                .addGap(71, 71, 71)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCuerpoConciertoLayout.setVerticalGroup(
            panelCuerpoConciertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoConciertoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panelCuerpoConciertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCabezaConciertoLayout = new javax.swing.GroupLayout(panelCabezaConcierto);
        panelCabezaConcierto.setLayout(panelCabezaConciertoLayout);
        panelCabezaConciertoLayout.setHorizontalGroup(
            panelCabezaConciertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpoConcierto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCabezaConciertoLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelCabezaConciertoLayout.setVerticalGroup(
            panelCabezaConciertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaConciertoLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(panelCabezaConciertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(panelCuerpoConcierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabezaConcierto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabezaConcierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        cargarConciertos("c.cod_concierto");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        cargarConciertos("c.nombre_concierto");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        cargarConciertos("tc.nombre_tipo_concierto");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCabezaConcierto;
    private javax.swing.JPanel panelCuerpoConcierto;
    private javax.swing.JTable tablaDatosC;
    // End of variables declaration//GEN-END:variables
}
