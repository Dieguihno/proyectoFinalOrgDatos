/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacasitademiabuela;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class Loggin extends LaCasitaDeAbuela{

    public static void main(String[] args){
        
        String usuario = "usuario";
        String clave = "1234";

        String usr;
        String clav;

        usr = JOptionPane.showInputDialog("digite el usuario");
        clav = JOptionPane.showInputDialog("digite la clave");

        if (usuario.equals(usr) && clave.equals(clav)) {
            JOptionPane.showMessageDialog(null, "bienvenido " + usr);
            
            

        }
    }

}
