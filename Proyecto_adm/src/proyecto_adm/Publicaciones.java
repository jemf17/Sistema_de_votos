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
public class Publicaciones extends Votos{
    private String publicacion;
    private float porcentaje;
   
public Publicaciones(){
    publicacion = "";}

public Publicaciones(String publicacion, float porcentaje, int negativo, int positivo ){
    super(negativo, positivo);
    this.publicacion = publicacion;
    this.porcentaje = porcentaje;
    
}
    public float getPorcentaje() {
        int suma = positivo + negativo;
        float porsentP = positivo*100/suma;
        float porsentN = negativo*100/suma;
        if (porsentN < porsentP){
            return porsentP;}
        else{
            return porsentN;}
    }

    public void setPorcentaje(float porsentaje) {
        this.porcentaje = porsentaje;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }
}

