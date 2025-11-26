
package gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class reservaciones extends javax.swing.JFrame {
    
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(reservaciones.class.getName());

    /**
     * Creates new form reservaciones
     */
    public reservaciones() {
        initComponents();
    }
    private void llenarCombo(){
        try{
             BufferedReader br=new BufferedReader(new FileReader("habitaciones.txt"));
          String linea;
          JComboBox<String> id_habitacion=new JComboBox<String>();
          while((linea = br.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(linea,",");
            System.out.println(tokens.nextElement());
            id_habitacion.addItem(tokens.nextToken());

          }
          br.close();
        } catch(Exception x) {
          x.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RESERVACIONES = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        nombre_cliente = new javax.swing.JTextField();
        fecha_entrada = new javax.swing.JTextField();
        fecha_salida = new javax.swing.JTextField();
        incluye_desayuno = new javax.swing.JCheckBox();
        tarjeta = new javax.swing.JTextField();
        cvv = new javax.swing.JTextField();
        vencimiento = new javax.swing.JTextField();
        id_habitacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        RESERVACIONES.setBackground(new java.awt.Color(255, 255, 255));
        RESERVACIONES.setMinimumSize(new java.awt.Dimension(960, 800));
        RESERVACIONES.setPreferredSize(new java.awt.Dimension(960, 800));
        RESERVACIONES.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hotel 128.png"))); // NOI18N
        RESERVACIONES.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        jLabel2.setText("HOTEL BUENA VISTA");
        RESERVACIONES.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 62)); // NOI18N
        jLabel3.setText("RESERVACIONES");
        RESERVACIONES.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jButton2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        RESERVACIONES.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, 300, 66));

        guardar.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        RESERVACIONES.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, 300, 66));

        jLabel4.setText("Id cliente");
        RESERVACIONES.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel5.setText("Nombre del cliente");
        RESERVACIONES.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel6.setText("id de la habitacion");
        RESERVACIONES.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        jLabel7.setText("Fecha de entrada");
        RESERVACIONES.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jLabel8.setText("Fecha de salida");
        RESERVACIONES.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel9.setText("Incluye desayuno");
        RESERVACIONES.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jLabel10.setText("Numero de tarjeta");
        RESERVACIONES.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        jLabel11.setText("Fecha de vencimiento tarjeta");
        RESERVACIONES.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, -1));

        jLabel12.setText("CVV");
        RESERVACIONES.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, -1));

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        RESERVACIONES.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 140, -1));

        nombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_clienteActionPerformed(evt);
            }
        });
        RESERVACIONES.add(nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 330, -1));

        fecha_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_entradaActionPerformed(evt);
            }
        });
        RESERVACIONES.add(fecha_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 150, -1));

        fecha_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_salidaActionPerformed(evt);
            }
        });
        RESERVACIONES.add(fecha_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 150, -1));

        incluye_desayuno.setText("Si");
        RESERVACIONES.add(incluye_desayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));

        tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaActionPerformed(evt);
            }
        });
        RESERVACIONES.add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 260, -1));

        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });
        RESERVACIONES.add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 80, -1));

        vencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vencimientoActionPerformed(evt);
            }
        });
        RESERVACIONES.add(vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 220, -1));

        id_habitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        id_habitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_habitacionActionPerformed(evt);
            }
        });
        RESERVACIONES.add(id_habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 60, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RESERVACIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RESERVACIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        inicio ini=new inicio();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        
    }//GEN-LAST:event_cvvActionPerformed

    private void nombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_clienteActionPerformed
        
    }//GEN-LAST:event_nombre_clienteActionPerformed

    private void fecha_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_entradaActionPerformed
        
    }//GEN-LAST:event_fecha_entradaActionPerformed

    private void fecha_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_salidaActionPerformed
        
    }//GEN-LAST:event_fecha_salidaActionPerformed

    private void tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaActionPerformed
        
    }//GEN-LAST:event_tarjetaActionPerformed

    private void vencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vencimientoActionPerformed
        
    }//GEN-LAST:event_vencimientoActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        
    }//GEN-LAST:event_IdActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        cvv.setText("    ");
        nombre_cliente.setText("    ");
        fecha_entrada.setText("    ");
        fecha_salida.setText("    ");
        tarjeta.setText("    ");
        vencimiento.setText("    ");
        //Id.setText(null+Id); algo aqui no va bien, revisar que corresponda a extraer el dato del id de habitacion del archivo habitaciones.txt 
        JOptionPane.showMessageDialog(null,"Reservacion guardada");
        
    }//GEN-LAST:event_guardarActionPerformed

    private void id_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_habitacionActionPerformed
        // el contenido del combo box debe provenir del archivo habitaciones.txt
    }//GEN-LAST:event_id_habitacionActionPerformed

    
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
        java.awt.EventQueue.invokeLater(() -> new reservaciones().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JPanel RESERVACIONES;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField fecha_entrada;
    private javax.swing.JTextField fecha_salida;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> id_habitacion;
    private javax.swing.JCheckBox incluye_desayuno;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_cliente;
    private javax.swing.JTextField tarjeta;
    private javax.swing.JTextField vencimiento;
    // End of variables declaration//GEN-END:variables
}
