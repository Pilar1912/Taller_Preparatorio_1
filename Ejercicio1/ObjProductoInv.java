package Ejercicio1;

public class ObjProductoInv {
    //private int IdProducto;
    private String NombreProducto;
    private int Cantidad;
    private double Precio;

    public ObjProductoInv(String nombreproducto, int cantidad, double precio) {
        //IdProducto = idproducto;
        NombreProducto = nombreproducto;
        Cantidad = cantidad;
        Precio = precio;
    }

    public ObjProductoInv() {
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    
}
