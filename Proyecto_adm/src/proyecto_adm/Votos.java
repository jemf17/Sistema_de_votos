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
public class Votos {
    int positivo;
    int negativo;
public Votos(){
    positivo = 0;
    negativo = 0;}
public Votos(int positivo, int negativo){
    this.negativo = negativo;
    this.positivo = positivo;}

    public int getPositivo() {
        return positivo;
    }

    public void setPositivo(int positivo) {
        this.positivo = positivo;
    }

    public int getNegativo() {
        return negativo;
    }

    public void setNegativo(int negativo) {
        this.negativo = negativo;
    }
}
