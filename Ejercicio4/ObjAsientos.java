package Ejercicio4;

public class ObjAsientos {
    private int NumeroFila;
    private String Fila;
    private double Precio;

    public ObjAsientos(){
    }

    public ObjAsientos(int numeroFila, String fila, double precio) {
        NumeroFila = numeroFila;
        Fila = fila;
        Precio = precio;
    }

    public int getNumeroFila() {
        return NumeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        NumeroFila = numeroFila;
    }

    public String getFila() {
        return Fila;
    }

    public void setFila(String fila) {
        Fila = fila;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    
}
