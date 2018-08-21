/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;

public class Guardar {
    private String guardar;

public Guardar(){
    guardar = "";}
public Guardar(String guardar){
    this.guardar = guardar;}

    public String getGuardar() {
        return guardar;
    }

    public void setGuardar(String guardar) {
        Publicaciones p = new Publicaciones();
        guardar = "publicacion; "+p.getPublicacion() +" porsentaje; "+ p.getPorcentaje();
    }
    @Override
    public String toString() {
        return "Guardardo: " +  guardar ;
    }

}
