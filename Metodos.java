import java.util.Scanner;
import java.util.Random;

public class Metodos 
{
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    public ObjProducto [] Productos()
    {
        
                
                String[] nombres = {
                    "Arroz", "Frijoles", "Aceite", "Azúcar", "Sal", "Leche", "Pan", "Huevos", "Carne", "Pollo",
                    "Pescado", "Verduras", "Frutas", "Cereal", "Galletas", "Jugo", "Café", "Té", "Mantequilla",
                    "Queso", "Yogur", "Harina", "Pasta","Salsa", "Mayonesa", "Mostaza", "Ketchup", "Vinagre", "Sopa", "Caldo"
                };

                ObjProducto [] productos = new ObjProducto[nombres.length];
                
                for (int j = 0; j < nombres.length; j++) {
                    int id = rand.nextInt(1000);
                    int cantidad = rand.nextInt(100);
                    double precio = rand.nextDouble() * 100;

                    productos[j]= new ObjProducto(id, nombres[j], cantidad, precio);
                }
            

        return productos;
    }

    public void BuscarProducto(ObjProducto[] productos)
{
    String buscar = sc.nextLine();

        for (int i = 0; i < productos.length; i++) {

            if (productos[i].getNombreProducto().equalsIgnoreCase(buscar)) {

                System.out.println("Producto encontrado");
                System.out.println("ID: " + productos[i].getIdProducto());
                System.out.println("Nombre: " + productos[i].getNombreProducto());
                System.out.println("Cantidad: " + productos[i].getCantidad());
                System.out.println("Precio: " + productos[i].getPrecio());

                return;
            }
        }

        System.out.println("Producto no encontrado");
    }    
}


