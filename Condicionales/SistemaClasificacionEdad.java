package Condicionales;

import java.util.Scanner;

public class SistemaClasificacionEdad {
    public static void main(String[] args) {
        System.out.println("*** Sistema de clasificacion por edad ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        var nombre =  consola.nextLine();
        System.out.print("Ingrese la edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        if (nombre.isEmpty()){
            System.out.println("Nombre invalido, error");
            return;
        }
        if (edad <= 0){
            System.out.println("Error, numero negativo o invalido");
        return;
        }
        if (edad >120){
            System.out.println("Edad invalida");
        return;
        }
        String categoria ;
        if (edad <= 12)
            categoria ="eres un niño";
        else if (edad <=17 )
            categoria= "eres un adolescente";
        else if (edad <=59)
            categoria = "eres un adulto";
        else
           categoria = "eres un adulto mayor";

        System.out.println("Hola "+nombre+" tienes "+edad +" y " +categoria);








    }
}
