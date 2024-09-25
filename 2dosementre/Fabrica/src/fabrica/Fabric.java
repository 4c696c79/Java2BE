/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fabrica;

import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author patot
 */
public class Fabric extends javax.swing.JFrame {
     //aca es para crear el arraylist llamado fabrica, que esta vinculado 
    //con la clase Productos
ArrayList<Productos> fabrica=new ArrayList(); 

    












    public Fabric() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmoni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmanuel = new javax.swing.JTextField();
        bdate = new javax.swing.JButton();
        cmostrar = new javax.swing.JButton();
        cborrar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fabrica Arcoiris\\(￣︶￣*\\))");

        jLabel2.setText("Nombre del producto(name):");

        jLabel3.setText("Precio del producto(mony):");

        cmoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmoniActionPerformed(evt);
            }
        });

        jLabel4.setText("Código del producto(manuel):");

        cmanuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmanuelActionPerformed(evt);
            }
        });

        bdate.setText("Guardar Gatos(Date):");
        bdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdateActionPerformed(evt);
            }
        });

        cmostrar.setText("Mostrar");
        cmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmostrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Borrar");

        bborrar.setText("Borrar");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bdate)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(cmanuel)
                            .addComponent(cmoni)
                            .addComponent(cname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmostrar))
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bborrar)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmanuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cborrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bborrar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmanuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmanuelActionPerformed
     
    }//GEN-LAST:event_cmanuelActionPerformed

    private void bdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdateActionPerformed
        //este es el boton para guardar los datos
        //pones los datos en los cuadros y luego das al boton
        
        //en el boton creas el objeto llamado datos
        Productos datos= new Productos();
        
       /*datos es para seleccionar el objeto, setNome es el dato que esta
       en la clase Productos. y entre parentesis pones el cuadro que 
       queres poner (cname)
        
       */
           datos.setNome(cname.getText());
           /*
           en los cuadros de texto no podes poner numeros, solo Strings.
           entonces para poner numeros en un cuadro pones "Integer.parseInt"
           luego pones el dato en el cuadro como siempre
           */
          datos.setPrecio(Integer.parseInt(cmoni.getText()));
           datos.setCodigo(Integer.parseInt(cmanuel.getText()));
           //luego de poner los datos lo guardas en el arraylis fabrica
            fabrica.add(datos);
        
       
        
        
        
        
    }//GEN-LAST:event_bdateActionPerformed

    private void cmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmostrarActionPerformed
        //este es el boton para mostrar los datos ingresasdos
        /*
            ya q es un arraylist se tiene q poner un for, el fabrica.size()
        es para poner exactamente el numero de datos (o espacios) que tine 
        el arraylist.
            ej: en uno pones 4 datos y en otro pones 100
        cada vez que los guardes lo pone en el array list no importa la cantidad
        de datos q pongas, el .size es par a mostrar cuantos espacios tiene el
        array
        */
        for (int i = 0; i < fabrica.size(); i++) {
            JOptionPane.showMessageDialog(null,"Nombre "+ fabrica.get(i).getNome()+" Código "+ fabrica.get(i).getCodigo()+" Precio "+fabrica.get(i).getPrecio());
             /*
            el JOptionPane.showMessageDialog es para que aparezca un cuadro en 
            la pantalla.
            pones 'null' en el primero y luego pones los datos como un 
            System.out.println("");
            */
        }
    }//GEN-LAST:event_cmostrarActionPerformed

    private void cmoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmoniActionPerformed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bborrarActionPerformed
        /*
            en este for lo q hace es con un if, ver si en el cuadro q pusiste
        (con el cuadro cname)coincide con los datos guardados.
            si son iguales, lo q hace es borrar el espacio que querias borrar
        EJ: tenes 4 espacios y quieres borrar el cuadro 1, con este for lo
        pones y se borra todo lo que pusiste en el cuadro 1 (nombre, precio y 
        modelo).
        */
        for (int i = 0; i < fabrica.size(); i++) {
            if (cborrar.getText().equals(fabrica.get(i).getNome())) {
                fabrica.remove(i);
            }
        }
    }//GEN-LAST:event_bborrarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fabric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fabric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fabric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fabric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fabric().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bdate;
    private javax.swing.JTextField cborrar;
    private javax.swing.JTextField cmanuel;
    private javax.swing.JTextField cmoni;
    private javax.swing.JButton cmostrar;
    private javax.swing.JTextField cname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
