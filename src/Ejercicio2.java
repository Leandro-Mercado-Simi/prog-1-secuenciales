/*Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double kcalEnReposo = 0.0175;
        double pesoEnKG = 0;
        double duracionEjercicio = 0;
        double kcalXMinuto = 0;
        String tipoEjercicio = "";
        double totalCalorias = 0;

        System.out.print("Ingrese su peso en kilogramos: ");
        pesoEnKG = s.nextDouble();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        duracionEjercicio = s.nextDouble();


        System.out.print("Ingrese el tipo de ejercicio realizado: ");
        s.next();
        tipoEjercicio = s.nextLine().toLowerCase();


        if (tipoEjercicio.contains("camina")) {
            kcalXMinuto = 4.5 * kcalEnReposo * pesoEnKG;
        } else if (tipoEjercicio.contains("corre")) {
            kcalXMinuto = 16 * kcalEnReposo * pesoEnKG;
        } else if (tipoEjercicio.contains("nada") || tipoEjercicio.contains("nata")) {
            kcalXMinuto = 13.0 * kcalEnReposo * pesoEnKG;
        } else if (tipoEjercicio.contains("bici")) {
            kcalXMinuto = 5.5 * kcalEnReposo * pesoEnKG;
        }

        totalCalorias = kcalXMinuto * duracionEjercicio;
        System.out.print("Cantidad total de calorías quemadas: " + totalCalorias);

    }
}
