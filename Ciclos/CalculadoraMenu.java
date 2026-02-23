package Ciclos;

import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;



        while (!salir){
            System.out.print("""
                *** Menu de calculadora ***
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                Elige una opcion:\s""");

            if (consola.hasNextInt()){
                var opcion = consola.nextInt();
                consola.nextLine();
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Opción inválida. Debe elegir entre 1 y 5.");
                    continue;
                }
                var resultado=0.0;
                double num1=0;
                double num2=0;
                boolean  validacion = false;
                boolean  validacion2 = false;


            switch (opcion){
                case 1->{
                    while (!validacion){
                    System.out.print("Escribe el primer numero: ");
                    if (consola.hasNextDouble()){
                        num1 =consola.nextDouble();
                        validacion= true;
                    }
                    else {
                        System.out.println("Debe ingresar un numero valido.");
                        consola.next();
                    }
                    }
                    while (!validacion2){
                    System.out.print("Escribe el segundo numero: ");
                    if (consola.hasNextDouble()){
                        num2 = consola.nextDouble();
                        validacion2 = true;
                    }
                    else {
                        System.out.println("Debe ingresar un numero valido.");
                        consola.next();

                    }
                    }
                    resultado = num1 +num2;
                    System.out.println("La suma de los dos numeros es: "+ resultado);
                    }

                case 2 -> {

                    while (!validacion){
                        System.out.print("Escribe el primer numero: ");
                        if (consola.hasNextDouble()){
                            num1 =consola.nextDouble();
                            validacion= true;
                        }
                        else {
                            System.out.println("Debe ingresar un numero valido.");
                            consola.next();
                        }
                    }
                    while (!validacion2){
                        System.out.print("Escribe el segundo numero: ");
                        if (consola.hasNextDouble()){
                            num2 = consola.nextDouble();
                            validacion2 = true;
                        }
                        else {
                            System.out.println("Debe ingresar un numero valido.");
                            consola.next();

                        }
                    }
                    resultado = num1 - num2;
                    System.out.println("La resta de los dos numeros es: "+ resultado);
                }

                case 3 -> {
                    while (!validacion){
                    System.out.print("Escribe el primer numero: ");
                    if (consola.hasNextDouble()){
                        num1 =consola.nextDouble();
                        validacion= true;
                    }
                    else {
                        System.out.println("Debe ingresar un numero valido.");
                        consola.next();
                    }
                }
                while (!validacion2){
                    System.out.print("Escribe el segundo numero: ");
                    if (consola.hasNextDouble()){
                        num2 = consola.nextDouble();
                        validacion2 = true;
                    }
                    else {
                        System.out.println("Debe ingresar un numero valido.");
                        consola.next();

                    }
                }
                resultado = num1 * num2;
                System.out.println("La multiplicación de los dos numeros es: "+ resultado);
            }
            case 4 -> {
                    while (!validacion){
                    System.out.print("Escribe el primer numero: ");
                    if (consola.hasNextDouble()){
                        num1 =consola.nextDouble();
                        validacion= true;
                    }
                    else {
                        System.out.println("Debe ingresar un numero valido.");
                        consola.next();
                    }
                }
                while (!validacion2){
                    System.out.print("Escribe el segundo numero: ");
                    if (consola.hasNextDouble() ){
                        num2 = consola.nextDouble();
                        if (num2 !=0){
                        validacion2 = true;
                        }
                        else {
                            System.out.println("No se puede dividir por 0.");
                        }
                    }
                    else {
                        System.out.println("Debe ingresar un numero valido.");
                        consola.next();
                        }
                    }
                resultado = num1 / num2;
                System.out.println("La division de los dos numeros es: "+ resultado);
            }
            case 5 -> {
                    salir = true;
                    System.out.println("Saliendo de la calculadora");
            }

            }

            }
            else {
                System.out.println("Debe ingresar un número válido.");
                consola.next();

                    }




                }

            }



    }



