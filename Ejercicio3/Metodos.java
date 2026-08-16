package Ejercicio3;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public ObjLibreria[][] IngresarLibros(int n){

        ObjLibreria[][] libros = new ObjLibreria[n][n];

        for(int i = 0; i < libros.length; i++){
            for(int j=0; j < libros.length; j++){
                
                System.out.println("Título: ");
                String titulo = sc.next();

                System.out.println("Autor: ");
                String autor = sc.next();

                System.out.println("Precio: ");
                String precioTexto = sc.next();
                double precio = Double.parseDouble(precioTexto.replace(",", "."));

                libros[i][j] = new ObjLibreria(titulo, autor, precio);
            }
        }

        return libros;

    }

    public int OpcionesMenuPrincipal(){
        System.out.println("1. Ingresar Libros.");
        System.out.println("2. Mostrar libros ingresados.");
        System.out.println("3. Mostrar el libro con el precio mayor.");
        System.out.println("4. Salir.");

        return sc.nextInt();
    
    }

    public void MostrarLibros(ObjLibreria[][] libros){
        for(int i = 0; i < libros.length; i++){
            for(int j = 0; j < libros.length; j++){
                if(libros[i][j] != null){
                    System.out.println("Título: " + libros[i][j].getTitulo());
                    System.out.println("Autor: " + libros[i][j].getAutor());
                    System.out.println("Precio: " + libros[i][j].getPrecio());
                }
            }
        }
    }

    public double PrecioMayor(ObjLibreria[][] libros){
        if(libros == null || libros.length == 0 || libros[0][0] == null){
            System.out.println("No hay libros registrados.");
            return 0;
        }

        double mayor = libros[0][0].getPrecio();

        for(int i = 0; i < libros.length; i++){
            for(int j=0; j < libros.length; j++){
                if(libros[i][j] != null && libros[i][j].getPrecio() > mayor){
                    mayor = libros[i][j].getPrecio();
                }
            }
        }
        return mayor;

    }
}
