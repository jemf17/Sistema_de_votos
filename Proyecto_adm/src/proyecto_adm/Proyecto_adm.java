///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package proyecto_adm;
//
///**

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

// *
// * @author jemf
// */
public class Proyecto_adm {
//
//    /**
//     * @param args the command line arguments
//     */
 public static void main(String args[]) throws Exception {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Adm adm;
                try {
                    adm = new Adm();
                } catch (SQLException ex) {
                    Logger.getLogger(Proyecto_adm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Proyecto_adm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
//    

}
