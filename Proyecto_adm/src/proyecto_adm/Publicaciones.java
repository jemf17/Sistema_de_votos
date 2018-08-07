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
    private int porsentaje;
   
public Publicaciones(){
    publicacion = "";}

public Publicaciones(String publicacion,int porsentaje,int positivo,int negativo){
    super(positivo, negativo);
    this.publicacion = publicacion;
    this.porsentaje = porsentaje;
    
}
    public int getPorsentaje() {
        return porsentaje;
    }

    public void setPorsentaje(int porsentaje) {
        int suma = positivo + negativo;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }
}

