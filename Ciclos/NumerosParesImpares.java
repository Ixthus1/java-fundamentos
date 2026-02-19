package Ciclos;

import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Pares e Impares ***");
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el numero final: ");
        var numFinal = Integer.parseInt(consola.nextLine());

        var inicio = num1;
        if (numFinal <= num1){
            System.out.println("Numero Invalido");
        return;
        }
        System.out.println("Los numeros pares son: ");
        do {
            if (inicio %2 ==0){
                System.out.println(inicio);
            }
            inicio++;
        }
        while (inicio<=numFinal);
        System.out.println("Los numeros impares son: ");
        inicio=num1;
        do {
            if (inicio %2 !=0){
                System.out.println(inicio);
            }
            inicio++;
        }
        while (inicio<=numFinal);



    }


}
