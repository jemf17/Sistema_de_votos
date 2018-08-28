/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;

/**
 *
 * @author jemf
 */
public class Publicaciones {
    private String publicacion;
    private float porcentaje;
    private Votos votos;
    private String table_name;
   
public Publicaciones(){
    publicacion = "";
    porcentaje = 0;}

public Publicaciones(String publicacion, float porcentaje, Votos votos, String table_name ){
    this.votos = votos;
    this.table_name = table_name;
    this.publicacion = publicacion;
    this.porcentaje = porcentaje;
    
}

    public String getTable_name() {
        return "votos";
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }
    public float getPorcentaje() {
        return porcentaje;
    }

    public String setPorcentaje(float porsentaje) {
        int suma = votos.negativo + votos.positivo ;
        float porsentP = votos.positivo*100/suma;
        float porsentN = votos.negativo*100/suma;
        if (porsentN < porsentP){
            return ""+ porsentP+ "";}
        else{
            return ""+ porsentN +"";}
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }
}

