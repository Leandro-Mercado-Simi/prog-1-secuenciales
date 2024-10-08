/*
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
* */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double distancia = 0;
        double consumoEnLitros = 0;
        double precioLitro = 0;
        double costoTotal = 0;

        System.out.print("Ingrese la distancia del viaje en kilómetros ");
        distancia = s.nextDouble();

        System.out.print("Ingrese el consumo de combustible del vehículo en litros por kilómetro: ");
        consumoEnLitros = s.nextDouble();

        System.out.print("Ingrese el precio del combusitble por litro: ");
        precioLitro = s.nextDouble();

        costoTotal = (precioLitro * consumoEnLitros) * distancia;

        System.out.println("----------------------------------------------");
        System.out.println("El costo total del viaje será de: $" + df.format(costoTotal));
        System.out.println("----------------------------------------------");

    }
}
