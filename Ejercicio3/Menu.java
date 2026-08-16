package Ejercicio3;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = sc.nextInt();
        ObjLibreria[][] libros = new ObjLibreria[n][n];
        Metodos m = new Metodos();
        boolean continuar = true;
        while(continuar){
            int opcion = m.OpcionesMenuPrincipal();
            switch(opcion){

                case 1:
                    libros = m.IngresarLibros(n);
                    break;
                case 2:
                    m.MostrarLibros(libros);
                    break;
                case 3:
                    System.out.println("El libro con el precio más alto es: "  + m.PrecioMayor(libros));
                    break;
                case 4:
                    System.err.println("Hasta luego.");
                    continuar = false;
                    break;

                default:
                    System.err.println("Opción inválida.");

            }
        }
        sc.close();

    }
    
}
