/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;

public class Guardar extends Publicaciones{
    private String guardar;

public Guardar(){
    guardar = "";}
public Guardar(String guardar){
    this.guardar = guardar;}

    public String getGuardar() {
        return super.getPublicacion()+ "" + super.getPorcentaje();
    }

    public void setGuardar(String guardar) {
        this.guardar = guardar;
    }
    @Override
    public String toString() {
        return "Guardardo: " +  guardar ;
    }

}
