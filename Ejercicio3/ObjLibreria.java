package Ejercicio3;

public class ObjLibreria {
    private String Titulo;
    private String Autor;
    private double Precio;

    public ObjLibreria(){
    }

    public ObjLibreria(String titulo, String autor, double precio) {
        Titulo = titulo;
        Autor = autor;
        Precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    
}