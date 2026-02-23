package Proyectos;

import java.util.Scanner;

public class BilleteraVirtual {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        double saldo = 500;


        while (!salir){
        System.out.print("""
                \n*** Billetera Virtual ***
                1. Ver saldo
                2. Cargar dinero
                3. Retirar dinero
                4. Salir
                Escoge una opcion:\s""");

        if (consola.hasNextInt()){
            var opcion = consola.nextInt();

        switch (opcion){
            case 1 -> System.out.println("Tu saldo actual es: "+ saldo);
            case 2 -> {
                boolean montoValido = false;

                while (!montoValido) {
                    System.out.print("Ingrese el monto a cargar: ");

                    if (consola.hasNextDouble()) {
                        double carga = consola.nextDouble();

                        if (carga > 0) {
                            saldo += carga;
                            System.out.println("Carga realizada. Nuevo saldo: $" + saldo);
                            montoValido = true;
                        } else {
                            System.out.println("El monto debe ser mayor a 0.");
                        }

                    } else {
                        System.out.println("Debe ingresar un número válido.");
                        consola.next();
                    }
                }

        }
        case 3 ->{
                boolean retiro =false;
                while (!retiro){
            System.out.print("Ingrese el monto a retirar: ");
            if (consola.hasNextDouble()){
                double ret = consola.nextDouble();

                if (ret <=0 || ret > saldo){
                    System.out.println("Monto invalido, su saldo actual es de: "+ saldo);
                }
                else {
                    saldo -= ret;
                    System.out.println("Su nuevo saldo es: $"+ saldo);
                    retiro = true;
                }
            }
            else {
                System.out.println("Debe ingresar un número válido.");
                consola.next();
            }
                }
        }
        case 4 ->{
            salir = true;
            System.out.println("Saliendo de la billetera virtual.");
        }

            default -> System.out.println("Opcion invalida");


    }

        }
        else {
            System.out.println("Opcion no valida.");
        consola.next();
        }
}
}
}