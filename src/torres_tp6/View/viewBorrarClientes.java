/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres_tp6.View;

import java.util.TreeMap;
import javax.swing.JOptionPane;
import torres_tp6.Entidades.Cliente;
import torres_tp6.Entidades.Directorio;

/**
 *
 * @author Jannete
 */
public class viewBorrarClientes extends javax.swing.JInternalFrame {
private Directorio directorio;
    /**
     * Creates new form viewBorrarClientes
     */
    public viewBorrarClientes(Directorio directorio) {
        initComponents();
        this.directorio=directorio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jbuttonSalir = new javax.swing.JButton();
        jbuttonBuscar = new javax.swing.JButton();
        jbuttonEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Borrar Clientes");

        jLabel2.setText("DNI");

        jLabel3.setText("Telefono");

        jLabel4.setText("Apellido");

        jLabel5.setText("Nombre");

        jLabel6.setText("Ciudad");

        jtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefonoActionPerformed(evt);
            }
        });

        jtfCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCiudadActionPerformed(evt);
            }
        });

        jbuttonSalir.setText("Salir");
        jbuttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonSalirActionPerformed(evt);
            }
        });

        jbuttonBuscar.setText("Buscar");
        jbuttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonBuscarActionPerformed(evt);
            }
        });

        jbuttonEliminar.setText("Eliminar");
        jbuttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCiudad)
                            .addComponent(jtfNombre)
                            .addComponent(jtfApellido)
                            .addComponent(jtfTelefono)
                            .addComponent(jtfDni))))
                .addGap(47, 47, 47)
                .addComponent(jbuttonBuscar)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbuttonEliminar)
                .addGap(18, 18, 18)
                .addComponent(jbuttonSalir)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonSalir)
                    .addComponent(jbuttonEliminar))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed

    private void jtfCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCiudadActionPerformed

    private void jbuttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonBuscarActionPerformed
        // TODO add your handling code here:
       Long dni=null;
        
        try{
         dni=Long.parseLong(jtfDni.getText());
        }catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this,"Dni erroneo");
            return;

        } 
        
        TreeMap <Long,Cliente> cli = directorio.buscarClienteDni(dni);//Long=key=telefono, value=cliente
                
        Cliente cliente = cli.firstEntry().getValue();//ACA ME QUEDO SOLO CON EL VALOR DEL "VALUE" DE ESE ELEMENTO DEL TREEMAP
        
        jtfDni.setText(cliente.getDni().toString());
        jtfTelefono.setText(cli.firstEntry().getKey().toString());
        jtfNombre.setText(cliente.getNombre());
        jtfApellido.setText(cliente.getApellido());
        jtfCiudad.setText(cliente.getCiudad());
        
        
                                               

    }//GEN-LAST:event_jbuttonBuscarActionPerformed

    private void jbuttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbuttonSalirActionPerformed

    private void jbuttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonEliminarActionPerformed
        // TODO add your handling code here:
        Long dni=null;
        try{
         dni=Long.parseLong(jtfDni.getText());
         
        }catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this,"DNI invalido");
            return;

        } 
        TreeMap<Long,Cliente> eliminado = directorio.borrarCliente(dni);
        
        if(!eliminado.isEmpty()){
            JOptionPane.showMessageDialog(this,"Cliente borrado: "+ 
                    eliminado.firstEntry().getValue().getNombre() + " " + eliminado.firstEntry().getValue().getApellido());
            
        }else{
            JOptionPane.showMessageDialog(this,"Cliente no encontrado");
        }
        
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfCiudad.setText("");
        jtfDni.setText("");
        jtfTelefono.setText("");
    }//GEN-LAST:event_jbuttonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbuttonBuscar;
    private javax.swing.JButton jbuttonEliminar;
    private javax.swing.JButton jbuttonSalir;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
