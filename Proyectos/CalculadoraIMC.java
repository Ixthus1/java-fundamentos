package Proyectos;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Calculadora IMC ***");

        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingrese su altura: ");
        var altura = Double.parseDouble(consola.nextLine());
        System.out.print("Ingrese su peso: ");
        var peso = Double.parseDouble(consola.nextLine());

        if (nombre.isEmpty()){
            System.out.println("Nombre invalido");
            return;
        }
        else if (peso <=0 || peso > 500){
            System.out.println("Peso invalido");
            return;
        }
        else if (altura>3 || altura <=0){
            System.out.println("Altura invalida");
            return;
        }

        var imc = peso / (altura*altura);
        String categoria;

        if (imc < 18.5)
            categoria = "Bajo peso";
        else if (imc < 25)
            categoria = "Peso normal";
        else if (imc < 30)
            categoria = "Sobrepeso";
        else
            categoria = "Obesidad";


        System.out.printf("""
                %nHola %s
                Tu Imc es: %.2f
                Categoria: %s
                """,nombre,imc,categoria);

    }
}
