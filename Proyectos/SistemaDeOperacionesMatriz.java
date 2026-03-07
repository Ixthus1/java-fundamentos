package Proyectos;

import java.util.Scanner;

public class SistemaDeOperacionesMatriz {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int renglones=0, columnas = 0;
        boolean salir = false;
        boolean validacion1 = false;
        boolean validacion2 = false;


        System.out.println("*** Sistema de operaciones con matrices ***");

        System.out.print("Ingrese la cantidad de renglones de la matriz: ");

        while (!validacion1) {


            if (consola.hasNextInt()) {
                renglones = consola.nextInt();
                if (renglones > 0) {
                    validacion1 = true;
                } else System.out.print("Debe ser mayor a 0: ");
            } else {
                System.out.print("Debe ingresar un numero: ");
                consola.next();
            }
        }

        System.out.print("Ingrese la cantidad de columnas de la matriz: ");

        while (!validacion2) {

            if (consola.hasNextInt()) {
                columnas = consola.nextInt();
                if (columnas > 0) {
                    validacion2 = true;
                } else System.out.print("Debe ser mayor a 0: ");
            } else {
                System.out.print("Debe ser un numero: ");
                consola.next();
            }

        }
            var matriz = new int [renglones][columnas];
            // Pedir los datos de la matriz al usuario
            for (var ren=0;ren<renglones;ren++){
                for (var col = 0; col<columnas;col++){
                    System.out.print("Ingrese el valor de ["+ren+"]"+"["+col+"]: ");
                    matriz[ren][col]=Integer.parseInt(consola.next());
                }

            }




            // Validacion opcion 1-5
            while (!salir){
                System.out.print("""
                    *** Menu de operaciones ***
                    1. Mostrar matriz
                    2. Suma diagonal principal
                    3. Suma diagonal secundaria
                    4. Numero mayor de la matriz
                    5. Numero menor de la matriz
                    6. Salir
                    Elige una opción:\s""");

                int valorMayor = matriz[0][0];
                int valorMenor = matriz[0][0];

                if (consola.hasNextInt()){
                    var opcion = consola.nextInt();
                    if (opcion <1 || opcion>6){
                        System.out.println("Opcion invalida, debe ser del 1-6");
                        continue;
                    }


                switch (opcion){
                case 1-> {for (var ren = 0; ren < renglones; ren++) {
                    for (var col = 0; col < columnas; col++) {
                        System.out.print(matriz[ren][col] + " ");
                    }
                    System.out.println();
                    }

                        }
                case 2-> {int resultado=0;
                    for (var ren =0; ren<renglones;ren++){
                        for (var col=0; col<columnas;col++){
                            if (ren ==col){
                                System.out.println("Elemento diagonal: Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
                                resultado += matriz[ren][col];

                            }
                        }
                    }
                    System.out.println("El resultado de la suma de la diagonal princial es: "+resultado);
                }
                case 3->{
                    int resultado =0;
                    for (var ren=0; ren< renglones;ren++){
                        for (var col=0; col<columnas;col++){
                            if (ren+col==matriz[0].length-1){
                                System.out.println("Elemento diagonal: Matriz[" + ren + "][" + col + "] = " + matriz[ren][col]);
                                resultado+= matriz[ren][col];

                            }
                        }
                    }
                    System.out.println("El resultado de la suma de la diagonal secundaria es: "+resultado);
                }
                case 4 ->{
                    for (var ren=0; ren< renglones;ren++){
                        for (var col=0; col<columnas;col++){
                            if (matriz[ren][col] > valorMayor){
                                valorMayor =matriz[ren][col];
                            }
                        }
                }
                    System.out.println("El mayor valor de la matriz es: " +valorMayor);
                         }
                case 5->  {for (var ren=0; ren< renglones;ren++){
                        for (var col=0; col<columnas;col++){
                            if (matriz[ren][col] < valorMenor){
                                valorMenor =matriz[ren][col];
                            }
                        }
                    }
                    System.out.println("El menor valor de la matriz es: " +valorMayor);
                }
                case 6-> {
                    System.out.println("Saliendo del sistema...");
                    salir=true;
                }

}
}
    }}}