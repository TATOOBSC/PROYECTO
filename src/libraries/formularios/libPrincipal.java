/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.formularios;

import Formularios.Principal.Principal;



/**
 *
 * @author Ellet
 */
public class libPrincipal {
     
    public void ControlDeVisibilidad(){
        if(Principal.lbniveluser.getText().equals("USUARIO")){
            Principal.MenuMantenimiento.setVisible(false);
        }
        else{
            Principal.MenuMantenimiento.setVisible(true);
        }
    }
    
    
}
