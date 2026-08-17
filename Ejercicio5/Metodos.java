package Ejercicio5;
import java.util.Scanner;
import java.util.Random;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    public ObjProductos[][] IngresarProductos1(int n){
        
        ObjProductos[][] Productos1 = new ObjProductos[2][10];

        for(int i = 0; i < Productos1.length; i++){
            for(int j = 0; j < Productos1[i].length; j++){
                Productos1[i][j] = new ObjProductos();
                Productos1[i][j].setNombre("Producto" + (i * 10 + j + 1));
                Productos1[i][j].setPrecio(Math.round(rand.nextDouble(1000,100001)*1000.0)/1000.0);
                Productos1[i][j].setStock(rand.nextInt(10)+1);
            }
        }
        return Productos1;
    }

    public ObjProductos[][] IngresarProductos2(ObjProductos[][] productos1){

    ObjProductos[][] productos2 = new ObjProductos[3][10];

    for(int i = 0; i < productos2.length; i++){
        for(int j = 0; j < productos2[i].length; j++){

            productos2[i][j] = new ObjProductos();

            if(i < productos1.length && rand.nextInt(100) < 40){ 

                productos2[i][j].setNombre(productos1[i][j].getNombre());
                productos2[i][j].setPrecio(productos1[i][j].getPrecio());

            }else{

                productos2[i][j].setNombre("Producto" + (i * 10 + j + 1));
                productos2[i][j].setPrecio(Math.round(rand.nextDouble(1000,100001) * 1000.0) / 1000.0);

            }

            productos2[i][j].setStock(rand.nextInt(10) + 1);
        }
    }

    return productos2;
}


   /*  public ObjProductos[][] CombinarMatrices(ObjProductos[][] productos1, ObjProductos[][] productos2){
        int filas1 = productos1.length;
        int filas2 = productos2.length;
        int columnas = productos1[0].length;

        ObjProductos[][] matrizR = new ObjProductos[filas1 + filas2][columnas];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizR[i][j] = productos1[i][j];
            }
        }

        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizR[filas1 + i][j] = productos2[i][j];
            }
        }

        return matrizR;
    }*/
    public ObjProductos[][] CombinarMatrices(ObjProductos[][] productos1, ObjProductos[][] productos2) {

    int filas = productos1.length + productos2.length;
    int columnas = 10;

    ObjProductos[][] matrizR = new ObjProductos[filas][columnas];

    int fila = 0;
    int columna = 0;

    for (int i = 0; i < productos1.length; i++) {
        for (int j = 0; j < productos1[i].length; j++) {

            matrizR[fila][columna] = new ObjProductos();
            matrizR[fila][columna].setNombre(productos1[i][j].getNombre());
            matrizR[fila][columna].setPrecio(productos1[i][j].getPrecio());
            matrizR[fila][columna].setStock(productos1[i][j].getStock());

            columna++;
            if (columna == columnas) {
                columna = 0;
                fila++;
            }
        }
    }

    for (int i = 0; i < productos2.length; i++) {
        for (int j = 0; j < productos2[i].length; j++) {

            boolean encontrado = false;

            for (int f = 0; f <= fila && !encontrado; f++) {

                int limite;

                if (f == fila) {
                    limite = columna;
                } else {
                    limite = columnas;
                }

                for (int c = 0; c < limite; c++) {

                    if (matrizR[f][c].getNombre().equals(productos2[i][j].getNombre())
                            && matrizR[f][c].getPrecio() == productos2[i][j].getPrecio()) {

                        matrizR[f][c].setStock(
                                matrizR[f][c].getStock()
                                + productos2[i][j].getStock());

                        encontrado = true;
                        break;
                    }
                }
            }

            if (!encontrado) {

                matrizR[fila][columna] = new ObjProductos();
                matrizR[fila][columna].setNombre(productos2[i][j].getNombre());
                matrizR[fila][columna].setPrecio(productos2[i][j].getPrecio());
                matrizR[fila][columna].setStock(productos2[i][j].getStock());

                columna++;
                if (columna == columnas) {
                    columna = 0;
                    fila++;
                }
            }
        }
    }

    return matrizR;
}

    public void MostrarProductos1(ObjProductos[][] productos1) {
        
        System.out.println("--- PRODUCTOS ---");
        for (int i = 0; i < productos1.length; i++) {
            for (int j = 0; j < productos1[i].length; j++) {
                System.out.println(productos1[i][j].getNombre() + ' ' + productos1[i][j].getPrecio() + ' '+ productos1[i][j].getStock());
            }
            System.out.println(); 
        }
    }

    public void MostrarProductos2(ObjProductos[][] productos2) {
        
        System.out.println("--- PRODUCTOS ---");
        for (int i = 0; i < productos2.length; i++) {
            for (int j = 0; j < productos2[i].length; j++) {
                System.out.println(productos2[i][j].getNombre() + ' ' + productos2[i][j].getPrecio() + ' '+ productos2[i][j].getStock());
            }
            System.out.println(); 
        }
    }

    /* 
    public void MostrarMatrizCombinada(ObjProductos[][] matrizR){
        System.out.println("----- MATRICES COMBINADA ------");
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR[i].length; j++) {
                System.out.println(
                    matrizR[i][j].getNombre() + " " +
                    matrizR[i][j].getPrecio() + " " +
                    matrizR[i][j].getStock()
                );
            }
            System.out.println();
        }

    }*/

    public void MostrarMatrizCombinada(ObjProductos[][] matrizR) {

    System.out.println("----- MATRIZ COMBINADA -----");

    for (int i = 0; i < matrizR.length; i++) {
        for (int j = 0; j < matrizR[i].length; j++) {

            if (matrizR[i][j] != null) {
                System.out.println(
                        matrizR[i][j].getNombre() + "  "
                        + matrizR[i][j].getPrecio() + "  "
                        + matrizR[i][j].getStock());
            }
        }
    }
}

    public int OpcionesMenuPrincipal(){
        System.out.println("1. Mostrar productos matriz 1");
        System.out.println("2. Mostrar productos matriz 2");
        System.out.println("3. Mostrar suma de stock de los productos idénticos de ambas matrices");
        System.out.println("4. Salir");

        return sc.nextInt();
    }

    

}
