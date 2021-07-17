/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.clsCarro;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class frmVehiculo extends javax.swing.JFrame {

    
    LinkedList<clsCarro> carros; //Declarar variable
    
    /**
     * Creates new form frmVehiculo
     */
    public frmVehiculo() {
        initComponents();
        carros = new LinkedList<>(); //Asinar valor inicial (Lista vacía)
        carros.add(new clsCarro(false, "001", "Chevrolet", 4, "Azul", 24));
        carros.add(new clsCarro(true, "002", "Mazda", 6, "Verde", 35));
        carros.add(new clsCarro(false, "003", "Hyundai", 8, "Amarillo", 46));
        mostrarListadoVehiculos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVehiculos = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnlListar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstVehiculos = new javax.swing.JList<>();
        pnlCarros = new javax.swing.JPanel();
        lblCodigoCarro = new javax.swing.JLabel();
        txtCodigoCarro = new javax.swing.JTextField();
        lblMarcaCarro = new javax.swing.JLabel();
        txtMarcaCarro = new javax.swing.JTextField();
        lblNumeroLlantasCarro = new javax.swing.JLabel();
        cbNumeroLlantasCarro = new javax.swing.JComboBox<>();
        lblColorCarro = new javax.swing.JLabel();
        txtColorCarro = new javax.swing.JTextField();
        lblCaballosFuerzaCarro = new javax.swing.JLabel();
        txtCaballosFuerzaCarro = new javax.swing.JTextField();
        cboxAutomaticoCarro = new javax.swing.JCheckBox();
        btnCrearCarro = new javax.swing.JButton();
        btnConsultarCarro = new javax.swing.JButton();
        btnActualizarCarro = new javax.swing.JButton();
        btnEliminarCarro = new javax.swing.JButton();
        pnlCamiones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblVehiculos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblVehiculos.setText("Vehiculos");

        lstVehiculos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstVehiculos);

        javax.swing.GroupLayout pnlListarLayout = new javax.swing.GroupLayout(pnlListar);
        pnlListar.setLayout(pnlListarLayout);
        pnlListarLayout.setHorizontalGroup(
            pnlListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListarLayout.setVerticalGroup(
            pnlListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Listar", pnlListar);

        lblCodigoCarro.setText("Codigo: ");

        txtCodigoCarro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoCarroKeyReleased(evt);
            }
        });

        lblMarcaCarro.setText("Marca:");

        lblNumeroLlantasCarro.setText("# Llantas: ");

        cbNumeroLlantasCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8", "10" }));

        lblColorCarro.setText("Color:");

        lblCaballosFuerzaCarro.setText("Caballos de fuerza:");

        cboxAutomaticoCarro.setText("¿Automático?");

        btnCrearCarro.setText("Crear");
        btnCrearCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCarroActionPerformed(evt);
            }
        });

        btnConsultarCarro.setText("Consultar");
        btnConsultarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCarroActionPerformed(evt);
            }
        });

        btnActualizarCarro.setText("Actualizar");
        btnActualizarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCarroActionPerformed(evt);
            }
        });

        btnEliminarCarro.setText("Eliminar");

        javax.swing.GroupLayout pnlCarrosLayout = new javax.swing.GroupLayout(pnlCarros);
        pnlCarros.setLayout(pnlCarrosLayout);
        pnlCarrosLayout.setHorizontalGroup(
            pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlCarrosLayout.createSequentialGroup()
                            .addComponent(lblCodigoCarro)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodigoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCarrosLayout.createSequentialGroup()
                            .addComponent(lblNumeroLlantasCarro)
                            .addGap(18, 18, 18)
                            .addComponent(cbNumeroLlantasCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCarrosLayout.createSequentialGroup()
                        .addComponent(lblCaballosFuerzaCarro)
                        .addGap(18, 18, 18)
                        .addComponent(txtCaballosFuerzaCarro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarrosLayout.createSequentialGroup()
                        .addComponent(btnCrearCarro)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarCarro)))
                .addGap(18, 18, 18)
                .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarrosLayout.createSequentialGroup()
                        .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarcaCarro)
                            .addComponent(lblColorCarro))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColorCarro)
                            .addComponent(txtMarcaCarro)))
                    .addGroup(pnlCarrosLayout.createSequentialGroup()
                        .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxAutomaticoCarro)
                            .addGroup(pnlCarrosLayout.createSequentialGroup()
                                .addComponent(btnActualizarCarro)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarCarro)))
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCarrosLayout.setVerticalGroup(
            pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoCarro)
                    .addComponent(txtCodigoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarcaCarro)
                    .addComponent(txtMarcaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroLlantasCarro)
                    .addComponent(cbNumeroLlantasCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColorCarro)
                    .addComponent(txtColorCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCaballosFuerzaCarro)
                    .addComponent(txtCaballosFuerzaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxAutomaticoCarro))
                .addGap(18, 18, 18)
                .addGroup(pnlCarrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCarro)
                    .addComponent(btnConsultarCarro)
                    .addComponent(btnActualizarCarro)
                    .addComponent(btnEliminarCarro))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Carros", pnlCarros);

        javax.swing.GroupLayout pnlCamionesLayout = new javax.swing.GroupLayout(pnlCamiones);
        pnlCamiones.setLayout(pnlCamionesLayout);
        pnlCamionesLayout.setHorizontalGroup(
            pnlCamionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        pnlCamionesLayout.setVerticalGroup(
            pnlCamionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Camiones", pnlCamiones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(lblVehiculos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVehiculos)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoCarroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoCarroKeyReleased
        
        System.out.println(evt.getKeyCode()); //Obtener código ASCII de la tecla presionada
        
        System.out.println("Código: " + txtCodigoCarro.getText()); //Mostrar texto del contenido del cajón de texto
        
    }//GEN-LAST:event_txtCodigoCarroKeyReleased

    private void btnCrearCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCarroActionPerformed
        try {
            //Intente hacer este código
            String codigo = txtCodigoCarro.getText();
            String marca = txtMarcaCarro.getText();
            int numeroLlantas = Integer.parseInt( cbNumeroLlantasCarro.getSelectedItem().toString() );
            String color = txtColorCarro.getText();
            int caballosFuerza = Integer.parseInt( txtCaballosFuerzaCarro.getText() );
            boolean automatico = cboxAutomaticoCarro.isSelected();

            //.equals se comporta igual que el operador relacional ==. En java es mejor usar .equals
            if( codigo.equals("") || marca.equals("") || color.equals("")  ){
                JOptionPane.showMessageDialog(pnlCarros, "Todos los campos del formulario son obligatorios");
            } else {
                //Si la información está correcta, crear un nuevo objeto
                //Crear un objeto de la clase clsCarro
                clsCarro carro_nuevo = new clsCarro(automatico, codigo, marca, numeroLlantas, color, caballosFuerza);

                System.out.println("------------------");
                System.out.println("Código: " + carro_nuevo.getCodigo());
                System.out.println("Marca: " + carro_nuevo.getMarca());
                System.out.println("# Llantas: " + carro_nuevo.getNumeroLlantas());
                System.out.println("Color: " + carro_nuevo.getColor());
                System.out.println("Caballos de fuerza: " + carro_nuevo.getCaballosDeFuerza());
                System.out.println("Automático: " + carro_nuevo.isAutomatico());
                
                //Añadir el nuevo carro al listado de carros
                carros.add(carro_nuevo);
                mostrarListadoVehiculos();
                limpiarFormularioCarros();
                JOptionPane.showMessageDialog(pnlCarros, "El carro fue creado exitosamente");
            }
            
        } catch (NumberFormatException e) {
            //Si algo sale mal con el código de arriba, ejecute este código
            JOptionPane.showMessageDialog(pnlCarros, "El campo \"Caballos de fuerza\" debe ser numérico");
        }
    }//GEN-LAST:event_btnCrearCarroActionPerformed

    private void btnConsultarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCarroActionPerformed
        //Capturar el código que está escrito
        String codigoBuscado = txtCodigoCarro.getText();
        if(codigoBuscado.equals("")){
            JOptionPane.showMessageDialog(pnlCarros, "Para consultar debe diligenciar el campo código");
        } else {
            //Buscar el código ingresado por la persona en nuestro listado de carros
            boolean encontrado = false;
            
            for (clsCarro carro : carros) {
                if(carro.getCodigo().equals(codigoBuscado) ){
                    //¡LO ENCONTRÉ!
                    txtCodigoCarro.setText(carro.getCodigo());
                    txtMarcaCarro.setText(carro.getMarca());
                    txtColorCarro.setText(carro.getColor());
                    txtCaballosFuerzaCarro.setText(carro.getCaballosDeFuerza() + ""); //De (int) a (String)
                    
                    cbNumeroLlantasCarro.setSelectedItem(carro.getNumeroLlantas() + "");
                    cboxAutomaticoCarro.setSelected( carro.isAutomatico() );
                    encontrado = true;
                    break;
                }
            }
            
            if( !encontrado ){
                JOptionPane.showMessageDialog(pnlCarros, "El código " + codigoBuscado + " no se encuentra registrado");
                limpiarFormularioCarros();
            }
            
        }
    }//GEN-LAST:event_btnConsultarCarroActionPerformed

    private void btnActualizarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCarroActionPerformed
        //Capturar el código que está escrito
        String codigoBuscado = txtCodigoCarro.getText();
        if(codigoBuscado.equals("")){
            JOptionPane.showMessageDialog(pnlCarros, "Para consultar debe diligenciar el campo código");
        } else {
            //Buscar el código ingresado por la persona en nuestro listado de carros
            boolean encontrado = false;
            int index = 0;
            for (clsCarro carro : carros) {
                if(carro.getCodigo().equals(codigoBuscado) ){
                    //¡LO ENCONTRÉ!
                    String codigo = txtCodigoCarro.getText();
                    String marca = txtMarcaCarro.getText();
                    int numeroLlantas = Integer.parseInt( cbNumeroLlantasCarro.getSelectedItem().toString() );
                    String color = txtColorCarro.getText();
                    int caballosFuerza = Integer.parseInt( txtCaballosFuerzaCarro.getText() );
                    boolean automatico = cboxAutomaticoCarro.isSelected();
                    
                    clsCarro carro_nuevo = new clsCarro(automatico, codigo, marca, numeroLlantas, color, caballosFuerza);
                    
                    carros.set(index, carro_nuevo);
                    mostrarListadoVehiculos();
                    limpiarFormularioCarros();
                    JOptionPane.showMessageDialog(pnlCarros, "Carro actualizado con éxito");
                    
                    encontrado = true;
                    break;
                }
                index++;
            }
            
            if( !encontrado ){
                JOptionPane.showMessageDialog(pnlCarros, "El código " + codigoBuscado + " no se encuentra registrado");
                limpiarFormularioCarros();
            }
            
        }
    }//GEN-LAST:event_btnActualizarCarroActionPerformed
    
    public void mostrarListadoVehiculos(){
        DefaultListModel model = new DefaultListModel();
        int index =0;
        for (clsCarro carro : carros) {
            model.add(index, carro);
            index++;
        }
        lstVehiculos.setModel(model);
        //lstVehiculos Agregar Elementos
    }
    
    public void limpiarFormularioCarros(){
        txtCodigoCarro.setText(""); //Limpiar cajones de texto
        txtMarcaCarro.setText("");
        txtColorCarro.setText("");
        txtCaballosFuerzaCarro.setText("");
        
        cbNumeroLlantasCarro.setSelectedIndex(0);
        cboxAutomaticoCarro.setSelected(false);
    }
    
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
            java.util.logging.Logger.getLogger(frmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCarro;
    private javax.swing.JButton btnConsultarCarro;
    private javax.swing.JButton btnCrearCarro;
    private javax.swing.JButton btnEliminarCarro;
    private javax.swing.JComboBox<String> cbNumeroLlantasCarro;
    private javax.swing.JCheckBox cboxAutomaticoCarro;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCaballosFuerzaCarro;
    private javax.swing.JLabel lblCodigoCarro;
    private javax.swing.JLabel lblColorCarro;
    private javax.swing.JLabel lblMarcaCarro;
    private javax.swing.JLabel lblNumeroLlantasCarro;
    private javax.swing.JLabel lblVehiculos;
    private javax.swing.JList<String> lstVehiculos;
    private javax.swing.JPanel pnlCamiones;
    private javax.swing.JPanel pnlCarros;
    private javax.swing.JPanel pnlListar;
    private javax.swing.JTextField txtCaballosFuerzaCarro;
    private javax.swing.JTextField txtCodigoCarro;
    private javax.swing.JTextField txtColorCarro;
    private javax.swing.JTextField txtMarcaCarro;
    // End of variables declaration//GEN-END:variables
}