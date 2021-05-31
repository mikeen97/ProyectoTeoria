
package Clases;

public class Arista {
    private char destino;

    public Arista(char destino) {
        this.destino = destino;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return destino+"";
    }
    
}
