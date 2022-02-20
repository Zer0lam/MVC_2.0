/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Stevia
 */
import pkgModelo.MDB;
import Vista.FrmUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorMDB implements ActionListener{
  private FrmUsuarios _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public ControladorMDB(FrmUsuarios view, MDB model){
       this._model=model;
       this._view=view;
       this._view.cmdAltas.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
       this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAltas){ //Si el botón presionado fue el de alta
            
        leyenda=_model.registrarAlta("TbUsuarios"," null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtApellidopaterno.getText() +" ', "+_view.txtContrasena.getText() );
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
        JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtNombre.setText(null);
_view.txtApellidopaterno.setText(null);
_view.txtContrasena.setText(null);
}
}