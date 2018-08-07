/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class base_de_datos_guardar {
    public static void crearArchivo(ArrayList lista) throws IOException{
        FileWriter write = null;       
        write = new FileWriter("Sistema_de_votos/bace de datos/guardar.txt");
        BufferedWriter bfwriter = new BufferedWriter(write);
        
    }
    
}
