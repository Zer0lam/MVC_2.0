/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_p2;

import Controlador.ControladorMDB;
import Vista.FrmUsuarios;
import pkgModelo.MDB;

/**
 *
 * @author lpzlu
 */
public class MVC_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        
        FrmUsuarios objVista=new FrmUsuarios();
        ControladorMDB objController;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        
    }
    
}
