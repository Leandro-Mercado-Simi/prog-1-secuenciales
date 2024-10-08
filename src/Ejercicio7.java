/*
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.
* */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double satisfaccion, estres, salud, realizacion, total;
        System.out.println("Responda las siguientes preguntas en una escala del 1 al 10:");
        System.out.print("Nivel de satisfacción con la vida: ");
        satisfaccion = s.nextDouble();
        System.out.print("Nivel de estrés: ");
        estres = s.nextDouble();
        System.out.print("Nivel de salud: ");
        salud = s.nextDouble();
        System.out.print("Nivel de realización personal: ");
        realizacion = s.nextDouble();
        System.out.println("----------------------------------------------");


        total = (((satisfaccion + salud + realizacion) - (0.25 * estres)) / 3);

        if (total <= 3) {
            System.out.println("Índice de felicidad: No muy feliz");
        } else if (total > 3 && total <= 5) {
            System.out.println("Índice de felicidad: Algo feliz");
        } else if (total > 5 && total <= 7) {
            System.out.println("Índice de felicidad: Feliz");
        } else {
            System.out.println("Índice de felicidad: Super feliz");
        }

        System.out.println("----------------------------------------------");

    }
}
