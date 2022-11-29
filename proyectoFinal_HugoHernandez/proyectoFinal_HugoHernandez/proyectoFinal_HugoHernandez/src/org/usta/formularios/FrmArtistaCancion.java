package org.usta.formularios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import org.usta.DAOS.ArtistaCancionDAO;
import org.usta.DAOS.ArtistaDAO;
import org.usta.DAOS.CancionDAO;
import org.usta.DAOS.ConciertoDAO;
import org.usta.modelos.Artista;
import org.usta.modelos.ArtistaCancion;
import org.usta.modelos.Cancion;
import org.usta.modelos.Concierto;
import org.usta.modelos.TipoConcierto;

public class FrmArtistaCancion extends javax.swing.JInternalFrame {

    private Integer codCancion = null;
    private Integer codArtista = null;
    private DefaultComboBoxModel miModeloArtista = new DefaultComboBoxModel();
    private DefaultComboBoxModel miModeloCancion = new DefaultComboBoxModel();
    private Map<Integer, Integer> codCanciones = new HashMap<>();
    private Map<Integer, Integer> codArtistas = new HashMap<>();

    public FrmArtistaCancion() {
        initComponents();
        comboArtista.setModel(miModeloArtista);
        comboCancion.setModel(miModeloCancion);
        cargarArtista();
        cargarCancion();
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

    public void cargarCancion() {
        Integer indice = 0;
        codCanciones.put(indice, indice);
        List<Cancion> array;
        CancionDAO objDAO = new CancionDAO();
        array = objDAO.consultar("");
        miModeloCancion.addElement("Seleccione una opción");
        for (Cancion objC : array) {
            indice++;
            miModeloCancion.addElement(objC.getNombre_cancion());
            codCanciones.put(indice, objC.getCod_cancion());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCuerpoAC = new javax.swing.JPanel();
        comboArtista = new javax.swing.JComboBox<>();
        comboCancion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ARTISTAS SEGUN LA CANCION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        comboArtista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));

        comboCancion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Artista");

        jLabel3.setText("Cancion");

        javax.swing.GroupLayout panelCuerpoACLayout = new javax.swing.GroupLayout(panelCuerpoAC);
        panelCuerpoAC.setLayout(panelCuerpoACLayout);
        panelCuerpoACLayout.setHorizontalGroup(
            panelCuerpoACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoACLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(comboArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(panelCuerpoACLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCuerpoACLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(226, 226, 226))
        );
        panelCuerpoACLayout.setVerticalGroup(
            panelCuerpoACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoACLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelCuerpoACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(panelCuerpoACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addComponent(jButton1)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpoAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        

            Integer indiceCodArtistaSeleccionado,indiceCodCancionSeleccionado, codCancionFinal,codArtistaFinal;        
             indiceCodArtistaSeleccionado  = comboArtista.getSelectedIndex();
            indiceCodCancionSeleccionado = comboCancion.getSelectedIndex();
            codArtistaFinal = codArtistas.get(indiceCodArtistaSeleccionado);
            codCancionFinal = codCanciones.get(indiceCodCancionSeleccionado);     
            Cancion objCancion = new Cancion(codCancionFinal," ", new Date(), null);
            Artista objArtistas = new Artista(codArtistaFinal, "", "");   
            ArtistaCancion objCancionArtista = new ArtistaCancion(objCancion,objArtistas);
            ArtistaCancionDAO objDAO = new ArtistaCancionDAO();
            if (objDAO.agregar(objCancionArtista)) {
                JOptionPane.showMessageDialog(panelCuerpoAC,"Registro exitoso", " Aviso",JOptionPane.INFORMATION_MESSAGE);

                comboArtista.setSelectedIndex(1);
                comboCancion.setSelectedIndex(1);

            }
       


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboArtista;
    private javax.swing.JComboBox<String> comboCancion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCuerpoAC;
    // End of variables declaration//GEN-END:variables
}
