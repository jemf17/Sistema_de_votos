///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package proyecto_adm;
//
///**

import java.util.ArrayList;
import static proyecto_adm.base_de_datos_guardar.leerArchivo;

// *
// * @author jemf
// */
public class Proyecto_adm {
//
//    /**
//     * @param args the command line arguments
//     */
 public static void main(String args[]) {
//        ArrayList listaP = new ArrayList<>();
//        Guardar guardar = new Guardar();
//        for ( int i = 0; i < 5; ++i) {
//            listaP.add(guardar.getGuardar());
//            }
//        ArrayList nuevaLista= new ArrayList<>();
//        		base_de_datos_guardar.añadirArchivos(nuevaLista);
// 
//		// lista para recibir los objetos estudiantes desde el archivo
//		ArrayList listaLeida = new ArrayList<>();
// 
//		// asigne a la lista los objetos
//		listaLeida = base_de_datos_guardar.leerArchivo();
//		for (int i = 0;i<5;++i) {
//                    Guardar g = new Guardar();
//			System.out.println(guardar.getGuardar()+" , "+ guardar.getPublicacion()+" , "+ guardar.getPorcentaje()+" , "+guardar.getNegativo()
//                        +" , "+guardar.getPositivo());
//		}
	
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adm().setVisible(true);
            }
        });
    }
//    

}
