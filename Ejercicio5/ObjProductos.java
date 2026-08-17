package Ejercicio5;

public class ObjProductos {
    private String Nombre;
    private double Precio;
    private int Stock;

    public ObjProductos(){

    }

    public ObjProductos(String nombre, double precio, int stock) {
        Nombre = nombre;
        Precio = precio;
        Stock = stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    

    
}
