package Ejercicio4;

import java.util.Scanner;
import java.util.Random;

public class Metodos {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public ObjAsientos[][] IngresarFilas(int n) {

        ObjAsientos[][] asientos = new ObjAsientos[n][n];

        String[] filas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {

                asientos[i][j] = new ObjAsientos();
                asientos[i][j].setNumeroFila((i * n) + j + 1);
                asientos[i][j].setFila(filas[i]);
                asientos[i][j].setPrecio(rand.nextInt(50001) + 50000);
            }
        }

        return asientos;
    }

    public ObjAsientos [][] OrderSeatsRowsByPrice(ObjAsientos [][] s) {
    for (int i = 0; i < s.length; i++) {
        for (int j = 0; j < s[i].length - 1; j++) {
            for (int k = 0; k < s[i].length - j - 1; k++) {
                if (s[i][k].getPrecio() < s[i][k + 1].getPrecio()) {
                    ObjAsientos temp = s[i][k];
                    s[i][k] = s[i][k + 1];
                    s[i][k + 1] = temp;
                }
            }
        }
    }
    return s;
}
public void MostrarAsientos(ObjAsientos[][] asientos) {

    for (int i = 0; i < asientos.length; i++) {
        for (int j = 0; j < asientos[i].length; j++) {

            System.out.print(
                "N°: " + asientos[i][j].getNumeroFila() +
                " | Fila: " + asientos[i][j].getFila() +
                " | Precio: " + asientos[i][j].getPrecio() + "    "
            );
        }
        System.out.println();
    }
}
}