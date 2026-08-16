package Ejercicio1;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = sc.nextInt();
        ObjProductoInv[][] productos = new ObjProductoInv[n][n];
        Metodos m = new Metodos();
        boolean continuar = true;
        while(continuar){
            int opcion = m.OpcionesMenuPrincipal();
            switch(opcion){

            case 1:
                productos = m.RegistrarProductos(n);
                break;

            case 2:
                m.MostrarProductos(productos);
                break;
            
            case 3:
                System.out.println("Total de unidades ingresadas al inventario: " + m.TotalCantidades(productos));
                break;
            
            case 4:
                System.out.println("Hasta luego");
                continuar = false;
                break;

            default:
                System.out.println("Opción inválida. Seleccione una de las opciones del menú.");

            }
        }
       sc.close();
    }
}
