package Ejercicio4;
import java.util.Scanner;


public class Menu {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = sc.nextInt();
        Metodos m = new Metodos();
        ObjAsientos[][] asientos = m.IngresarFilas(n);
        System.out.println("Filas ordenadas según precio de forma ascendente: ");
        m.MostrarAsientos(asientos);
        sc.close();

    }
    
}
