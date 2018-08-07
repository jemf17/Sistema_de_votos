package proyecto_usuario;

public class Votos {

    private int positivo;
    private int negativo;

    public Votos() {
        positivo = 0;
        negativo = 0;
    }

    public Votos(int positivo, int negativo) {
        this.negativo = negativo;
        this.positivo = positivo;
    }

    public int getPositivo() {
        return positivo;
    }

    public int getNegativo() {
        return negativo;
    }

    public void setPositivo(int positivo) {
        this.positivo = positivo;
    }

    public void setNegativo(int negativo) {
        this.negativo = negativo;
    }

    

}
