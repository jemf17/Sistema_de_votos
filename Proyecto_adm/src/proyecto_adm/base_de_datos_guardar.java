package proyecto_adm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class base_de_datos_guardar {
    
        ArrayList nuevaLista= new ArrayList<>();
    public static void crearArchivo(ArrayList lista) throws IOException{
                        Guardar guardar = new Guardar();
                        FileWriter write = null;
                    
			write = new FileWriter("bace de datos/guardar.txt");
			BufferedWriter bfwriter = new BufferedWriter(write);
			
                        for (int i = 0;i<5;++i) {
                        bfwriter.write(guardar.getGuardar()+" , "+ guardar.getPublicacion()+" , "+ guardar.getPorcentaje()+" , "+guardar.getNegativo()
                        +" , "+guardar.getPositivo());
			}
			//cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Archivo creado satisfactoriamente..");
		
			}
    public static ArrayList leerArchivo(){
        File file = new File("bace de datos/guardar.txt");
            ArrayList listaP = new ArrayList<>();
            Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                // el objeto scanner lee linea a linea desde el archivo
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                //se usa una expresión regular
                //que valida que antes o despues de una coma (,) exista cualquier cosa
                //parte la cadena recibida cada vez que encuentre una coma
                delimitar.useDelimiter("\\s*,\\s*");
                Guardar g = new Guardar();
                g.setGuardar(delimitar.next());
                g.setNegativo(delimitar.nextByte());
                g.setPorcentaje(delimitar.nextByte());
                g.setPositivo(delimitar.nextByte());
                g.setPublicacion(delimitar.next());
                listaP.add(g);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(base_de_datos_guardar.class.getName()).log(Level.SEVERE, null, ex);
        }return listaP;
}
public static void añadirArchivos(ArrayList lista){
    		FileWriter flwriter = null;
                Guardar guardar = new Guardar();
		try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
			flwriter = new FileWriter("C:\\archivos\\estudiantes.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (int i = 0;i<5;++i) {
				//escribe los datos en el archivo
				bfwriter.write(guardar.getGuardar()+" , "+ guardar.getPublicacion()+" , "+ guardar.getPorcentaje()+" , "+guardar.getNegativo()
                        +" , "+guardar.getPositivo());
			}
			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
}
		
	
    

