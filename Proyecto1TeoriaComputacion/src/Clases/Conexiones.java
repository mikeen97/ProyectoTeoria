package Clases;

public class Conexiones {

    protected char origen;
    protected char destino;
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Conexiones(char origen, char destino, int x1, int y1, int x2, int y2) {
        this.origen = origen;
        this.destino = destino;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public char getOrigen() {
        return origen;
    }

    public void setOrigen(char origen) {
        this.origen = origen;
    }

    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "+  " + origen +" --> "+ destino + "";
    }

}
