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
   
public Publicaciones(){
    publicacion = "";
    porcentaje = 0;}

public Publicaciones(String publicacion, float porcentaje, Votos votos ){
    this.votos = votos;
    this.publicacion = publicacion;
    this.porcentaje = porcentaje;
    
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

