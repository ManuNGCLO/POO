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
import org.usta.DAOS.CancionDAO;
import org.usta.DAOS.GeneroDao;
import org.usta.modelos.Cancion;
import org.usta.modelos.Genero;

public class FrmCancionesRegistrar extends javax.swing.JInternalFrame {

    private Map<Integer, Integer> codigosGeneros = new HashMap<>();
    private DefaultComboBoxModel modeloComboGC = new DefaultComboBoxModel();

    public FrmCancionesRegistrar() {
        initComponents();

        comboGenero.setModel(modeloComboGC);

        cargarTipoC();//llama al combo los datos
    }
    
    private void cargarTipoC() {

        Integer indice = 0;

        codigosGeneros.put(indice, indice);

        List<Genero> arregloGC;

        GeneroDao objDaoGC = new GeneroDao();
        arregloGC = objDaoGC.consultar("");

        modeloComboGC.addElement("Seleccione una Opción"); //Esto es para que no muestre el primer dato

        for (Genero objTC : arregloGC) {

            indice++;

            modeloComboGC.addElement(objTC.getNombre_genero()); //addElement añade cosas al combo y solamente le pone el nombre 

            codigosGeneros.put(indice, objTC.getCod_genero());

        }

    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        panelCuerpoRC = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fCreacion = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cajaNombreC = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnRegistar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Canciones");

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addComponent(btnSalir)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(jLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelCuerpoRC.setBackground(new java.awt.Color(51, 51, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de la canción ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Creación");

        cajaNombreC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Género");

        btnRegistar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnRegistar.setText("Registrar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCuerpoRCLayout = new javax.swing.GroupLayout(panelCuerpoRC);
        panelCuerpoRC.setLayout(panelCuerpoRCLayout);
        panelCuerpoRCLayout.setHorizontalGroup(
            panelCuerpoRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoRCLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(panelCuerpoRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoRCLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCuerpoRCLayout.createSequentialGroup()
                        .addGroup(panelCuerpoRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cajaNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(fCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCuerpoRCLayout.createSequentialGroup()
                                .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(btnRegistar)))
                        .addGap(70, 70, 70))))
        );
        panelCuerpoRCLayout.setVerticalGroup(
            panelCuerpoRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoRCLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGroup(panelCuerpoRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoRCLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoRCLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistar)
                        .addGap(73, 73, 73))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCuerpoRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCuerpoRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
       
        
        try {
            Integer indiceCodGeneroSeleccionado, codGeneroFinal;
            String cadenaNombre, cadenaFecha;
            String formatoCalendario = "EEE MMM dd HH:mm:ss zzz yyyy";
 
            Date fechaCalendario;

            indiceCodGeneroSeleccionado = comboGenero.getSelectedIndex();

            codGeneroFinal = codigosGeneros.get(indiceCodGeneroSeleccionado);

            cadenaNombre = cajaNombreC.getText();
            cadenaFecha = fCreacion.getDate().toString();

            SimpleDateFormat formatoAntiguo = new SimpleDateFormat(formatoCalendario, Locale.ENGLISH);
            fechaCalendario = formatoAntiguo.parse(cadenaFecha);

           
            Genero miGenero = new Genero(codGeneroFinal, "");
            
            Cancion objCancion = new Cancion(0, cadenaNombre, fechaCalendario, miGenero);
            CancionDAO objCancionDao  =  new CancionDAO();
            
            if (objCancionDao.agregar(objCancion)) {
                
                JOptionPane.showMessageDialog(panelCuerpoRC, "Registro Exitoso", "Annuncio", JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                
                JOptionPane.showMessageDialog(panelCuerpoRC, "Resgistro Fallido", "Nos petaqueamos", JOptionPane.ERROR_MESSAGE);
            
            
            }
            
            

        } catch (ParseException ex) {
            Logger.getLogger(FrmCancionesRegistrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cajaNombreC;
    private javax.swing.JComboBox<String> comboGenero;
    private com.toedter.calendar.JDateChooser fCreacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCuerpoRC;
    // End of variables declaration//GEN-END:variables
}
