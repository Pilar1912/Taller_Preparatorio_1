package Ejercicio1;
import java.util.Scanner;

public class Metodos 
{
    Scanner sc = new Scanner(System.in);
    public ObjProductoInv[][] RegistrarProductos(int n)
    {
        ObjProductoInv[][] productos = new ObjProductoInv[n][n];

        for(int i = 0; i < productos.length; i++){
            for(int j = 0; j < productos.length; j++){
                

                System.out.println("Producto " + (i += 1));
                System.out.println("Nombre: ");
                String nombre = sc.next();

                System.out.println("Cantidad: ");
                int cantidad = sc.nextInt();

                System.out.println("Precio: ");
                double precio = sc.nextDouble();

                productos[i][j] = new ObjProductoInv(nombre,cantidad,precio);

            }
        }
        
        return productos;

    }

    public int OpcionesMenuPrincipal()
    {
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Ingresar productos al inventario");
        System.out.println("2. Mostrar inventario");
        System.out.println("3. Calcular valor total del inventario");
        System.out.println("4. Salir");
        
        return sc.nextInt();
    }
    
    public void MostrarProductos(ObjProductoInv[][] productos){
        for(int i = 0; i < productos.length; i++){
            for(int j =0; j < productos.length; j++){
                if(productos[i][j] != null){
                System.out.println("Producto" + i + 1);
                System.out.println("Nombre: " + productos[i][j].getNombreProducto());
                System.out.println("Cantidad: " + productos[i][j].getCantidad());
                System.out.println("Precio: " + productos[i][j].getPrecio());
            }
        }
        }

    }

    public int TotalCantidades(ObjProductoInv[][] productos){
        int total = 0;

        for(int i = 0; i < productos.length; i++){
            for(int j =0; j < productos.length; j++){
                if(productos[i][j] != null){
                    total += productos[i][j].getCantidad();
                }
            }
        }
        return total;
    }

    
}


