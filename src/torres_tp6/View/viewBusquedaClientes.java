/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres_tp6.View;

import javax.swing.JOptionPane;
import torres_tp6.Entidades.Cliente;
import torres_tp6.Entidades.Directorio;

/**
 *
 * @author Jannete
 */
public class viewBusquedaClientes extends javax.swing.JInternalFrame {
private Directorio directorio;
    /**
     * Creates new form viewBusquedaClientes
     */
    public viewBusquedaClientes(Directorio directorio) {
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
        jtfTelefono = new javax.swing.JTextField();
        jtfDni = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCiudad = new javax.swing.JTextField();
        jbuttonSalir = new javax.swing.JButton();
        jbuttonBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Busqueda de Clientes");

        jLabel2.setText("Telefono");

        jLabel3.setText("DNI");

        jLabel4.setText("Apellido");

        jLabel5.setText("Nombre");

        jLabel6.setText("Ciudad");

        jtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefonoActionPerformed(evt);
            }
        });

        jbuttonSalir.setText("Salir");
        jbuttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonSalirActionPerformed(evt);
            }
        });

        jbuttonBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jannete\\Downloads\\searchmagnifierinterfacesymbol1_79893.png")); // NOI18N
        jbuttonBuscar.setToolTipText("");
        jbuttonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbuttonBuscar.setMargin(new java.awt.Insets(2, 3, 2, 3));
        jbuttonBuscar.setMaximumSize(new java.awt.Dimension(100, 100));
        jbuttonBuscar.setMinimumSize(new java.awt.Dimension(100, 100));
        jbuttonBuscar.setPreferredSize(new java.awt.Dimension(2, 2));
        jbuttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jtfDni, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfCiudad, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbuttonSalir)
                    .addComponent(jbuttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbuttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jtfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jbuttonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefonoActionPerformed

    private void jbuttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbuttonSalirActionPerformed

    private void jbuttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonBuscarActionPerformed
        // TODO add your handling code here:
        Long tel=null;
        
        try{
         tel=Long.parseLong(jtfTelefono.getText());
        }catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this,"Telefono erroneo");
            return;

        } 
         Cliente cliente = directorio.buscarCliente(tel);
         if(cliente != null){
            jtfDni.setText(cliente.getDni().toString());
            jtfNombre.setText(cliente.getNombre());
            jtfApellido.setText(cliente.getApellido());
            jtfCiudad.setText(cliente.getCiudad());
        }else{
            JOptionPane.showMessageDialog(this,"Cliente no encontrado");
        }
       
        jtfTelefono.setText("");
               
        
       
        
        
        
        
        
        
    }//GEN-LAST:event_jbuttonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbuttonBuscar;
    private javax.swing.JButton jbuttonSalir;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCiudad;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}
