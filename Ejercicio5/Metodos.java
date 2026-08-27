package Ejercicio5;
import java.util.Scanner;

public class Metodos {
    
    public ObjProductos[][] LlenarAlmacen(ObjProductos[][] a, Scanner sc){
        for(int i =0; i < a.length; i++){
            for(int j =0; j < a.length; j++){
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio del producto:");
                Double precio = sc.nextDouble();
                System.out.println("Ingrese la cantidad del producto:");
                int stock = sc.nextInt();

                ObjProductos p = new ObjProductos(nombre,precio,stock);
                a[i][j] = p;
            }
        }
        return a;
    }

    public void MostrarProductos(ObjProductos[][] a){
        for(int i =0; i < a.length; i++){
            for(int j =0; j < a[0].length; j++){
                if(a[i][j] != null){
                System.out.println("El nombre del producto: " + a[i][j].getNombre());
                System.out.println("Precio del producto: " + a[i][j].getPrecio());
                System.out.println("Cantidad (stock) del producto: " + a[i][j].getStock());
                System.out.println("----------------------------------------------------");
                }
            }
        }
    }

    public ObjProductos[][] MatrizUnificada(ObjProductos[][] a,ObjProductos[][] b,ObjProductos[][] c){
        //UNIFICAR MATRICES

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                for(int i1 = 0; i1 < b.length; i1++){
                    for(int j1 = 0; j1 < b[0].length; j1++){
                        if(a[i][j].getNombre().equalsIgnoreCase(b[i1][j1].getNombre())){
                            a[i][j].setStock(a[i][j].getStock() + b[i1][j1].getStock());
                            b[i1][j1].setNombre(null);

                        }


                    }
                }
            }
        }

        //PASAR LOS DATOS DE LA MATRIZ a A LA MATRIZ c
        //int auxf = 0, auxc = 0;
        int auxc = a.length;

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j];
                //auxc = j;
            }
        }

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b.length; j++) {
                if(b[i][j].getNombre() != null){
                c[i][auxc] = b[i][j];
                auxc++;
                }
                auxc = a.length;

            }      
        }


        return c;
    } 


    
}
