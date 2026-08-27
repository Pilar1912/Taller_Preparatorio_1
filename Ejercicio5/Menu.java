package Ejercicio5;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       Metodos m = new Metodos();
       Boolean continuar = true;
       System.out.println("Ingrese la dimensión del almacen");
       int n = sc.nextInt();
       ObjProductos[][] almacen1 = new ObjProductos[n][n];
       ObjProductos[][] almacen2 = new ObjProductos[n][n];
       ObjProductos[][] almacenUnificado = new ObjProductos[n][n*n];
       while(continuar){
        System.out.println("Bienvenido al almacén");
        System.out.println("1. Llenar almacén N°1.");
        System.out.println("2. Mostrar almacén N°1.");
        System.out.println("3. Llenar almacén N°2.");
        System.out.println("4. Mostrar almacén N°2.");
        System.out.println("5. Buscar productos.");
        System.out.println("6. Unificar almacenes.");
        System.out.println("7. Mostrar almacenes unificados.");
        System.out.println("8. Salir.");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                almacen1 = m.LlenarAlmacen(almacen1, sc);
                break;
            case 2:
                m.MostrarProductos(almacen1);
                break;
            case 3:
                almacen2 = m.LlenarAlmacen(almacen2, sc);
                break;
            case 4:
                m.MostrarProductos(almacen2);
                break;
            case 5:
                m.BuscarProductos(almacenUnificado, sc);
                break;
            case 6:
                almacenUnificado = m.MatrizUnificada(almacen1, almacen2,almacenUnificado);
                break;
            case 7:
                m.MostrarProductos(almacenUnificado);
                break;
            case 8:
                System.err.println("Hasta luego");
                continuar = false;
                break;
            default:
                System.err.println("Opción inválida");
 
        }
       }

    }
   
    
}
