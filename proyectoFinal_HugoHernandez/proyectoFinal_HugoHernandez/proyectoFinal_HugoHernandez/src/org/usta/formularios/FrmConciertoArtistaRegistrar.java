package org.usta.formularios;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.usta.DAOS.ArtistaCancionDAO;
import org.usta.DAOS.ArtistaDAO;
import org.usta.DAOS.CancionDAO;
import org.usta.DAOS.ConciertoArtistaDAO;
import org.usta.DAOS.ConciertoDAO;
import org.usta.modelos.Artista;
import org.usta.modelos.ArtistaCancion;
import org.usta.modelos.Cancion;
import org.usta.modelos.Concierto;
import org.usta.modelos.ConciertoArtista;

public class FrmConciertoArtistaRegistrar extends javax.swing.JInternalFrame {

    private Integer codConcierto = null;
    private Integer codArtista = null;
    private DefaultComboBoxModel miModeloArtista = new DefaultComboBoxModel();
    private DefaultComboBoxModel miModeloConcierto = new DefaultComboBoxModel();
    private Map<Integer, Integer> codConciertos = new HashMap<>();
    private Map<Integer, Integer> codArtistas = new HashMap<>();

    public FrmConciertoArtistaRegistrar() {
        initComponents();
        comboArtistaCA.setModel(miModeloArtista);
        comboConciertoCA.setModel(miModeloConcierto);
        cargarArtista();
        cargarConcierto();
    }

    public void cargarArtista() {
        Integer indice = 0;
        codArtistas.put(indice, indice);
        List<Artista> array;
        ArtistaDAO objDAO = new ArtistaDAO();
        array = objDAO.consultar("");
        miModeloArtista.addElement("Seleccione el Artista");
        for (Artista objA : array) {
            indice++;
            miModeloArtista.addElement(objA.getNombreCompletoArtista());
            codArtistas.put(indice, objA.getCodArtista());
        }
    }

    public void cargarConcierto() {
        Integer indice = 0;
        codConciertos.put(indice, indice);
        List<Concierto> array;
        ConciertoDAO objDAO = new ConciertoDAO();
        array = objDAO.consultar("");
        miModeloConcierto.addElement("Seleccione una opción");
        for (Concierto objC : array) {
            indice++;
            miModeloConcierto.addElement(objC.getNombreConcierto());
            codConciertos.put(indice, objC.getCodConcierto());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelCuerpoCA = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarCA = new javax.swing.JButton();
        comboConciertoCA = new javax.swing.JComboBox<>();
        comboArtistaCA = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Concierto Artista Registrar");

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
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );

        panelCuerpoCA.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Concierto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Artista");

        btnRegistrarCA.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnRegistrarCA.setText("Registrar");
        btnRegistrarCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCAActionPerformed(evt);
            }
        });

        comboConciertoCA.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        comboConciertoCA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));

        comboArtistaCA.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        comboArtistaCA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));

        javax.swing.GroupLayout panelCuerpoCALayout = new javax.swing.GroupLayout(panelCuerpoCA);
        panelCuerpoCA.setLayout(panelCuerpoCALayout);
        panelCuerpoCALayout.setHorizontalGroup(
            panelCuerpoCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoCALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarCA)
                .addGap(190, 190, 190))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoCALayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoCALayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(comboConciertoCA, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboArtistaCA, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        panelCuerpoCALayout.setVerticalGroup(
            panelCuerpoCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoCALayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelCuerpoCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(panelCuerpoCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboConciertoCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboArtistaCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(btnRegistrarCA)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelCuerpoCA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoCA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCAActionPerformed

        Integer indiceCodArtistaSeleccionado, indiceCodConciertoSeleccionado, codConciertoFinal, codArtistaFinal;
        indiceCodArtistaSeleccionado = comboArtistaCA.getSelectedIndex();
        indiceCodConciertoSeleccionado = comboConciertoCA.getSelectedIndex();
        codArtistaFinal = codArtistas.get(indiceCodArtistaSeleccionado);
        codConciertoFinal = codConciertos.get(indiceCodConciertoSeleccionado);
        Concierto objConcierto = new Concierto(codConciertoFinal, " ", new Date(), null);
        Artista objArtistas = new Artista(codArtistaFinal, "", "");
        ConciertoArtista objConciertoArtista = new ConciertoArtista(objConcierto, objArtistas);
        ConciertoArtistaDAO objDAO = new ConciertoArtistaDAO();
        if (objDAO.agregar(objConciertoArtista)) {
            JOptionPane.showMessageDialog(panelCuerpoCA, "Registro exitoso", " Aviso", JOptionPane.INFORMATION_MESSAGE);

            comboArtistaCA.setSelectedIndex(1);
            comboConciertoCA.setSelectedIndex(1);

        }


    }//GEN-LAST:event_btnRegistrarCAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCA;
    private javax.swing.JComboBox<String> comboArtistaCA;
    private javax.swing.JComboBox<String> comboConciertoCA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCuerpoCA;
    // End of variables declaration//GEN-END:variables
}
