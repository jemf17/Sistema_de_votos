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
        ArrayList listaP = new ArrayList<>();
        Guardar guardar = new Guardar();
        for ( int i = 0; i < 5; ++i) {
            if(listaP.get(i).equals(listaP.get(i +1))){
                break;}
            else if(listaP.get(i).equals("")){
                i++;
            }
            else{
            listaP.add(guardar.getGuardar());
            }}
        ArrayList nuevaLista= new ArrayList<>();
        		aniadirArchivo(nuevaLista);
 
		// lista para recibir los objetos estudiantes desde el archivo
		ArrayList listaLeida = new ArrayList<>();
 
		// asigne a la lista los objetos
		listaLeida = leerArchivo();
		for (int i = 0;i<5;++i) {
                    Guardar g = new Guardar();
			System.out.println(guardar.getGuardar()+" , "+ guardar.getPublicacion()+" , "+ guardar.getPorcentaje()+" , "+guardar.getNegativo()
                        +" , "+guardar.getPositivo());
		}
	
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adm().setVisible(true);
            }
        });
    }
//    

    private static void aniadirArchivo(ArrayList nuevaLista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
