package Arreglos;

import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int renglones, columnas;

        System.out.print("Ingrese los renglones de la matriz: ");
        renglones = Integer.parseInt(consola.next());
        System.out.print("Ingrese las columnas de la matriz: ");
        columnas = Integer.parseInt(consola.next());

        var matriz = new int[renglones][columnas];

        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print("Ingrese el valor de[" + ren + "]" + "[" + col + "]: ");
                matriz[ren][col] = Integer.parseInt(consola.next());
            }
        }
        int resultado=0;
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.print(matriz[ren][col] + " ");
            }
            System.out.println();
        }

            for (var ren = 0; ren < renglones; ren++) {
             for (var col = 0; col < columnas; col++) {
            if (ren +col==matriz[0].length-1) {
                System.out.println("Elemento diagonal: Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
                resultado += matriz[ren][col];
            }
        }
        }
        System.out.println("Resultado diagonal secundaria: "+resultado);





    }
}
