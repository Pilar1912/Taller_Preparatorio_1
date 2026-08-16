package Ejercicio2;

import java.util.Scanner;
import java.util.Random;

public class Metodos 
{
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    public ObjProducto [][] Productos()
    {
        
                
                String[] nombres = {
                    "Arroz", "Frijoles", "Aceite", "Azúcar", "Sal", "Leche", "Pan", "Huevos", "Carne", "Pollo","Pescado", "Verduras", "Frutas", "Cereal", "Galletas", "Jugo", "Café", "Té", "Mantequilla","Queso", "Yogur", "Harina", "Pasta","Salsa", "Mayonesa", "Mostaza", "Ketchup", "Vinagre", "Sopa", "Caldo"
                };

                ObjProducto [][] productos = new ObjProducto[5][6];
                
                
                for (int i = 0; i < 5; i++) {
                    for(int j = 0; j < 6; j++){
                    int id = rand.nextInt(1000);
                    int cantidad = rand.nextInt(100);
                    double precio = rand.nextDouble() * 100;
                    
                    int indice = i * 6 + j;
                    productos[i][j]= new ObjProducto(id, nombres[indice], cantidad, precio);
                    
                }
            }
            

        return productos;
    }

    public void BuscarProducto(ObjProducto[][] productos)
{
    String buscar = sc.nextLine();

        for (int i = 0; i < productos.length; i++) {
            for(int j =0; j < productos[i].length; j++){
            if (productos[i][j].getNombreProducto().equalsIgnoreCase(buscar)) {

                System.out.println("Producto encontrado");
                System.out.println("ID: " + productos[i][j].getIdProducto());
                System.out.println("Nombre: " + productos[i][j].getNombreProducto());
                System.out.println("Cantidad: " + productos[i][j].getCantidad());
                System.out.println("Precio: " + productos[i][j].getPrecio());
                System.out.println("Posición en la matriz: Fila: " + i + " Columna: " + j);

                return;
            }
        }
    }

        System.out.println("Producto no encontrado");
    }    
}

