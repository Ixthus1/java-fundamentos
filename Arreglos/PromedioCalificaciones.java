package Arreglos;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio Calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("Cuantas calificaciones quieres promediar?: ");
        var numCalificaciones = Integer.parseInt(consola.next());

        var notas = new double[numCalificaciones];
        double suma = 0;


        for (var i =0; i <numCalificaciones;i++){

            boolean esValida = false;
            double notaValida=0;
            while (!esValida){
                System.out.print("Ingrese la calificación de la nota "+i+" :");
            if (consola.hasNextDouble()){
                double nota= consola.nextDouble();

             if (nota >= 1 && nota <= 10) {
                    notaValida = nota;
                    esValida = true;

            }
            else {
                System.out.println("Nota invalida, vuelva a intentar.");
            }
            } else {
                System.out.println("Debe ingresar un número.");
                consola.next();
        }
        }
            notas[i] =notaValida;
            suma += notas[i];




    }

        double promedio = suma /numCalificaciones;
        System.out.println("El promedio de las clasificaciones es: "+promedio);

        double notaMax = notas[0];
        for (int i =1 ; i< notas.length ; i++){
            if (notas[i] > notaMax){
                notaMax = notas[i];
            }
        }
        System.out.println("La nota mas alta fue: "+notaMax);

        double notaMin = notas[0];

        for ( int i =1;i< notas.length;i++){
             if (notas[i]<notaMin)
                 notaMin =notas[i];
        }

        System.out.println("La nota mas baja fue: "+notaMin);

        int notaProm = 0;

        for (int i =0; i<notas.length;i++){
            if (notas[i]>promedio)
                notaProm++;
        }

        System.out.println("Las notas que  superaron al promedio fueron: "+notaProm);

        int desaprobado = 0;

        for (int i = 0; i<notas.length; i++){
            if (notas[i] <6)
                desaprobado++;

        }
        System.out.println("La cantidad de notas que no superaron el 6 fueron: "+desaprobado);






        



}
}