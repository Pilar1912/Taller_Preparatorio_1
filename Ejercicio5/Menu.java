package Ejercicio5;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----Bienvenido al inventario-----");
        System.out.print("Ingrese un valor numérico (n): ");
        int n = sc.nextInt();
        Metodos m = new Metodos();
        ObjProductos[][] productos1 = m.IngresarProductos1(n);
        ObjProductos[][] productos2 = m.IngresarProductos2(productos1);
        ObjProductos[][] matrizCombinada = m.CombinarMatrices(productos1, productos2);
        boolean continuar = true;
        while(continuar){
           int opcion = m.OpcionesMenuPrincipal();
           switch(opcion){
            case 1:
                m.MostrarProductos1(productos1);
                break;
            case 2:
                m.MostrarProductos2(productos2);
                break;
            case 3:
                m.MostrarMatrizCombinada(matrizCombinada);
                break;
            case 4:
                System.out.println("Hasta luego");
                continuar = false;
                break;
            default:
                System.out.println("Opción inválida");

           }
        }
        sc.close();

    }
   
    
}
