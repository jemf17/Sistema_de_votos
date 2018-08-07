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
    private int positivo;
    private int negativo;
    private int nulo;
public Votos(){
    positivo = 0;
    negativo = 0;
    nulo = 0;}
public Votos(int positivo, int negativo, int nulo){
    this.negativo = negativo;
    this.nulo = nulo;
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

    public int getNulo() {
        return nulo;
    }

    public void setNulo(int nulo) {
        this.nulo = nulo;
    }

}
