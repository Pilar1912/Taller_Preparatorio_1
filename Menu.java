import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        ObjProducto[][] productos = m.Productos();

        System.out.print("Ingrese el nombre del producto a buscar: ");

        m.BuscarProducto(productos);

        sc.close();
    }
}