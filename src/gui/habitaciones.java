
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author ALFREDO
 */

public class habitaciones extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(habitaciones.class.getName());

    
    public habitaciones() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HABITACIONES = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        tituloLogo = new javax.swing.JLabel();
        tituloPag = new javax.swing.JLabel();
        precio_sin_desayuno = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        tipo = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        sinDesayunoLabel = new javax.swing.JLabel();
        tipoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        descripcionLabel = new javax.swing.JLabel();
        conDesayunoLabel = new javax.swing.JLabel();
        precio_con_desayuno = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        HABITACIONES.setBackground(new java.awt.Color(255, 255, 255));
        HABITACIONES.setMinimumSize(new java.awt.Dimension(960, 800));
        HABITACIONES.setPreferredSize(new java.awt.Dimension(960, 800));
        HABITACIONES.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setBackground(new java.awt.Color(255, 255, 255));
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hotel 128.png"))); // NOI18N
        HABITACIONES.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        tituloLogo.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        tituloLogo.setText("HOTEL BUENA VISTA");
        HABITACIONES.add(tituloLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        tituloPag.setFont(new java.awt.Font("Yu Gothic", 1, 62)); // NOI18N
        tituloPag.setText("HABITACIONES");
        HABITACIONES.add(tituloPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        precio_sin_desayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_sin_desayunoActionPerformed(evt);
            }
        });
        HABITACIONES.add(precio_sin_desayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 210, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        HABITACIONES.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 210, -1));

        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        HABITACIONES.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 210, -1));
        HABITACIONES.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 210, -1));

        sinDesayunoLabel.setText("Precio sin desayuno");
        HABITACIONES.add(sinDesayunoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        tipoLabel.setText("Tipo de habitacion");
        HABITACIONES.add(tipoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 100, -1));

        idLabel.setText("ID");
        HABITACIONES.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        descripcionLabel.setText("Descripcion");
        HABITACIONES.add(descripcionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 70, -1));

        conDesayunoLabel.setText("Precio con desayuno");
        HABITACIONES.add(conDesayunoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        precio_con_desayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_con_desayunoActionPerformed(evt);
            }
        });
        HABITACIONES.add(precio_con_desayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 210, -1));

        guardar.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        HABITACIONES.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, 300, 65));

        regresar.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        regresar.setText("SALIR");
        regresar.setMaximumSize(new java.awt.Dimension(120, 65));
        regresar.setMinimumSize(new java.awt.Dimension(120, 65));
        regresar.setPreferredSize(new java.awt.Dimension(120, 65));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        HABITACIONES.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, 300, 65));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HABITACIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HABITACIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void precio_sin_desayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_sin_desayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_sin_desayunoActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        inicio ini=new inicio();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void precio_con_desayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_con_desayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio_con_desayunoActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
            int id = 1;
            id++; //aqui se necesita que el campo se inicie con un numero y que vaya aumentando cada vez que se guarda en el archivo txt
            
        
        
    }//GEN-LAST:event_idActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        id.setText("   ");
        
        JOptionPane.showMessageDialog(null,"Habitacion registrada");
    }//GEN-LAST:event_guardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new habitaciones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HABITACIONES;
    private javax.swing.JLabel conDesayunoLabel;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel icono;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField precio_con_desayuno;
    private javax.swing.JTextField precio_sin_desayuno;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel sinDesayunoLabel;
    private javax.swing.JTextField tipo;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel tituloLogo;
    private javax.swing.JLabel tituloPag;
    // End of variables declaration//GEN-END:variables
}
