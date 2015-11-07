/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas_intergalácticas;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author megarokr
 */
public class StartScreen extends javax.swing.JFrame {

    /**
     * Creates new form StartScreen
     */
    public StartScreen() {
        initComponents();   
        this.setLocationRelativeTo(null);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_menu = new javax.swing.JDialog();
        tp_menu_options = new javax.swing.JTabbedPane();
        pane_lista_ordenes = new javax.swing.JPanel();
        pane_agregar_menu = new javax.swing.JPanel();
        pane_modificar_menu = new javax.swing.JPanel();
        pane_eliminar_menu = new javax.swing.JPanel();
        jd_ingredients = new javax.swing.JDialog();
        lbl_nombre_ingrediente = new javax.swing.JLabel();
        lbl_cantidad_ingredientes = new javax.swing.JLabel();
        lbl_medida_ingredientes = new javax.swing.JLabel();
        lbl_descripcion_ingredientes = new javax.swing.JLabel();
        tf_nombreIngrediente = new javax.swing.JTextField();
        sp_cantidadIngrediente = new javax.swing.JSpinner();
        tf_medida_ingrediente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descripcion_ingredientes = new javax.swing.JTextArea();
        agregar_ingrediente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTemp = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jd_order = new javax.swing.JDialog();
        jd_rrhh = new javax.swing.JDialog();
        jd_cierre = new javax.swing.JDialog();
        panel_buttons = new javax.swing.JPanel();
        cmd_menu = new javax.swing.JButton();
        cmd_ingredients = new javax.swing.JButton();
        cmd_order = new javax.swing.JButton();
        cmd_rrhh = new javax.swing.JButton();
        cmd_cierre = new javax.swing.JButton();
        lbl_meme = new javax.swing.JLabel();

        javax.swing.GroupLayout pane_lista_ordenesLayout = new javax.swing.GroupLayout(pane_lista_ordenes);
        pane_lista_ordenes.setLayout(pane_lista_ordenesLayout);
        pane_lista_ordenesLayout.setHorizontalGroup(
            pane_lista_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        pane_lista_ordenesLayout.setVerticalGroup(
            pane_lista_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        tp_menu_options.addTab("Lista de Órdenes", pane_lista_ordenes);

        javax.swing.GroupLayout pane_agregar_menuLayout = new javax.swing.GroupLayout(pane_agregar_menu);
        pane_agregar_menu.setLayout(pane_agregar_menuLayout);
        pane_agregar_menuLayout.setHorizontalGroup(
            pane_agregar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        pane_agregar_menuLayout.setVerticalGroup(
            pane_agregar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        tp_menu_options.addTab("Agregar", pane_agregar_menu);

        javax.swing.GroupLayout pane_modificar_menuLayout = new javax.swing.GroupLayout(pane_modificar_menu);
        pane_modificar_menu.setLayout(pane_modificar_menuLayout);
        pane_modificar_menuLayout.setHorizontalGroup(
            pane_modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        pane_modificar_menuLayout.setVerticalGroup(
            pane_modificar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        tp_menu_options.addTab("Modificar", pane_modificar_menu);

        javax.swing.GroupLayout pane_eliminar_menuLayout = new javax.swing.GroupLayout(pane_eliminar_menu);
        pane_eliminar_menu.setLayout(pane_eliminar_menuLayout);
        pane_eliminar_menuLayout.setHorizontalGroup(
            pane_eliminar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        pane_eliminar_menuLayout.setVerticalGroup(
            pane_eliminar_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        tp_menu_options.addTab("Eliminar", pane_eliminar_menu);

        javax.swing.GroupLayout jd_menuLayout = new javax.swing.GroupLayout(jd_menu.getContentPane());
        jd_menu.getContentPane().setLayout(jd_menuLayout);
        jd_menuLayout.setHorizontalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_menu_options)
                .addContainerGap())
        );
        jd_menuLayout.setVerticalGroup(
            jd_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_menu_options, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jd_ingredients.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jd_ingredients.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jd_ingredients.setMinimumSize(new java.awt.Dimension(720, 320));
        jd_ingredients.setPreferredSize(new java.awt.Dimension(720, 320));
        jd_ingredients.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jd_ingredientsWindowClosing(evt);
            }
        });

        lbl_nombre_ingrediente.setText("Nombre: ");

        lbl_cantidad_ingredientes.setText("Cantidad: ");

        lbl_medida_ingredientes.setText("Medida:");

        lbl_descripcion_ingredientes.setText("Descripción: ");

        sp_cantidadIngrediente.setModel(new javax.swing.SpinnerNumberModel(Double.valueOf(1.0d), Double.valueOf(0.5d), null, Double.valueOf(0.5d)));

        ta_descripcion_ingredientes.setColumns(20);
        ta_descripcion_ingredientes.setRows(5);
        jScrollPane1.setViewportView(ta_descripcion_ingredientes);

        agregar_ingrediente.setText("Agregar");
        agregar_ingrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregar_ingredienteMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(listaTemp);

        jButton2.setText("refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_ingredientsLayout = new javax.swing.GroupLayout(jd_ingredients.getContentPane());
        jd_ingredients.getContentPane().setLayout(jd_ingredientsLayout);
        jd_ingredientsLayout.setHorizontalGroup(
            jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ingredientsLayout.createSequentialGroup()
                .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ingredientsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombre_ingrediente)
                            .addComponent(lbl_cantidad_ingredientes)
                            .addComponent(lbl_medida_ingredientes)
                            .addComponent(lbl_descripcion_ingredientes))
                        .addGap(23, 23, 23)
                        .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_nombreIngrediente)
                                .addComponent(sp_cantidadIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_medida_ingrediente, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                    .addGroup(jd_ingredientsLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(agregar_ingrediente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );
        jd_ingredientsLayout.setVerticalGroup(
            jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ingredientsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre_ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ingredientsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cantidad_ingredientes)
                            .addComponent(sp_cantidadIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_medida_ingredientes)
                            .addComponent(tf_medida_ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jd_ingredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_descripcion_ingredientes)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(agregar_ingrediente))
                    .addGroup(jd_ingredientsLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_orderLayout = new javax.swing.GroupLayout(jd_order.getContentPane());
        jd_order.getContentPane().setLayout(jd_orderLayout);
        jd_orderLayout.setHorizontalGroup(
            jd_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_orderLayout.setVerticalGroup(
            jd_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_rrhhLayout = new javax.swing.GroupLayout(jd_rrhh.getContentPane());
        jd_rrhh.getContentPane().setLayout(jd_rrhhLayout);
        jd_rrhhLayout.setHorizontalGroup(
            jd_rrhhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_rrhhLayout.setVerticalGroup(
            jd_rrhhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_cierreLayout = new javax.swing.GroupLayout(jd_cierre.getContentPane());
        jd_cierre.getContentPane().setLayout(jd_cierreLayout);
        jd_cierreLayout.setHorizontalGroup(
            jd_cierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_cierreLayout.setVerticalGroup(
            jd_cierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmd_menu.setText("Menú");

        cmd_ingredients.setText("Ingredientes");
        cmd_ingredients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_ingredientsMouseClicked(evt);
            }
        });

        cmd_order.setText("Ordenar");

        cmd_rrhh.setText("RRHH");

        cmd_cierre.setText("Cierre del día");

        javax.swing.GroupLayout panel_buttonsLayout = new javax.swing.GroupLayout(panel_buttons);
        panel_buttons.setLayout(panel_buttonsLayout);
        panel_buttonsLayout.setHorizontalGroup(
            panel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmd_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_rrhh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_cierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmd_ingredients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_buttonsLayout.setVerticalGroup(
            panel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_ingredients, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_order, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_rrhh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lbl_meme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baleadas_intergalácticas/resources/baleadas.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_meme)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_meme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_ingredientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_ingredientsMouseClicked
        this.setVisible(false);
        openDialog(jd_ingredients);
        
    }//GEN-LAST:event_cmd_ingredientsMouseClicked

    private void agregar_ingredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregar_ingredienteMouseClicked
        String nombre, medida, descripcion;
        double cantidad;

        if(tf_nombreIngrediente.getText() != null && tf_medida_ingrediente.getText() != null && (Double)sp_cantidadIngrediente.getValue() >= 0 && ta_descripcion_ingredientes.getText() != null){        
            nombre = tf_nombreIngrediente.getText();
            tf_nombreIngrediente.setText("");
            medida = tf_medida_ingrediente.getText();
            tf_medida_ingrediente.setText("");
            cantidad = (Double)sp_cantidadIngrediente.getValue();
            sp_cantidadIngrediente.setValue(0);
            descripcion = ta_descripcion_ingredientes.getText();
            ta_descripcion_ingredientes.setText("");
            
            if(almacen.size() > 0){
                for (int i = 0; i < almacen.size(); ++i) {
                    if(((Ingrediente)((Stack)almacen.elementAt(i).getValue()).peek()).getNombre().equalsIgnoreCase(nombre)){
                        ((Stack)almacen.elementAt(i).getValue()).push_back(new Ingrediente(nombre, cantidad, medida, descripcion));
                        break;
                    }
                    else if(i == almacen.size()-1){
                        almacen.push_back(new Stack(new Ingrediente(nombre, cantidad, medida, descripcion)));
                        break;
                    }
                }
            } else {
                almacen.push_back(new Stack(new Ingrediente(nombre, cantidad, medida, descripcion)));
            }
            
            
                
        } else {
            JOptionPane.showMessageDialog(jd_ingredients, "Hay un campo en blanco.", "Campo en blanco", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_agregar_ingredienteMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultListModel model = new DefaultListModel();
        Ingrediente ingrediente;
        Stack stack;
        String string;
        for (int i = 0; i < almacen.size(); i++) {
            stack = (Stack)almacen.elementAt(i).getValue();
            ingrediente = (Ingrediente)stack.peek();
            string = ingrediente.toString();
            model.add(i, string);
        }
        this.listaTemp.setModel(model);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jd_ingredientsWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_ingredientsWindowClosing
        jd_ingredients.dispose(); //Que malote
        this.setVisible(true);
    }//GEN-LAST:event_jd_ingredientsWindowClosing

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
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }
    
    private void openDialog(javax.swing.JDialog jd_ventana){
        jd_ventana.setLocationRelativeTo(this);
        jd_ventana.setModal(true);
        jd_ventana.pack();
        jd_ventana.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_ingrediente;
    private javax.swing.JButton cmd_cierre;
    private javax.swing.JButton cmd_ingredients;
    private javax.swing.JButton cmd_menu;
    private javax.swing.JButton cmd_order;
    private javax.swing.JButton cmd_rrhh;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_cierre;
    private javax.swing.JDialog jd_ingredients;
    private javax.swing.JDialog jd_menu;
    private javax.swing.JDialog jd_order;
    private javax.swing.JDialog jd_rrhh;
    private javax.swing.JLabel lbl_cantidad_ingredientes;
    private javax.swing.JLabel lbl_descripcion_ingredientes;
    private javax.swing.JLabel lbl_medida_ingredientes;
    private javax.swing.JLabel lbl_meme;
    private javax.swing.JLabel lbl_nombre_ingrediente;
    private javax.swing.JList listaTemp;
    private javax.swing.JPanel pane_agregar_menu;
    private javax.swing.JPanel pane_eliminar_menu;
    private javax.swing.JPanel pane_lista_ordenes;
    private javax.swing.JPanel pane_modificar_menu;
    private javax.swing.JPanel panel_buttons;
    private javax.swing.JSpinner sp_cantidadIngrediente;
    private javax.swing.JTextArea ta_descripcion_ingredientes;
    private javax.swing.JTextField tf_medida_ingrediente;
    private javax.swing.JTextField tf_nombreIngrediente;
    private javax.swing.JTabbedPane tp_menu_options;
    // End of variables declaration//GEN-END:variables
    private List almacen= new List();

}
