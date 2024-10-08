/*Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String condicion = "";

        System.out.print("Ingrese su nive del condición física (principiante/intermedio/avanzado): ");
        condicion = s.nextLine();

        if (condicion.equalsIgnoreCase("principiante")) {
            System.out.println("----------------------------------------------");
            System.out.println("Rutina para: " + condicion.toLowerCase());
            System.out.println(
                    "Día 1: 10 minutos de cardio (caminar), 10 sentadillas, 5 flexiones, 20 abdominales. " +
                            "\nDía 2: Descanso activo (estiramientos)." +
                            "\nDía 3: 15 minutos de cardio (caminar), 15 sentadillas, 7 flexiones, 25 abdominales." +
                            "\nDía 4: Descanso." +
                            "\nDía 5: 10 minutos de cardio (trotar), 12 sentadillas, 10 flexiones, 30 abdominales." +
                            "\nDía 6: Estiramientos." +
                            "\nDía 7: Descanso total.");
            System.out.println("----------------------------------------------");
        } else if (condicion.equalsIgnoreCase("intermedio")) {
            System.out.println("----------------------------------------------");
            System.out.println("Rutina para: " + condicion.toLowerCase());
            System.out.println(
                    "Día 1: 20 minutos de cardio (correr), 20 sentadillas, 15 flexiones, 30 abdominales." +
                            "\nDía 2: 10 minutos de cardio, estiramientos y 10 burpees." +
                            "\nDía 3: 25 minutos de cardio, 25 sentadillas, 20 flexiones, 40 abdominales." +
                            "\nDía 4: 15 minutos de yoga o estiramientos activos." +
                            "\nDía 5: 30 minutos de cardio (correr), 30 sentadillas, 25 flexiones, 50 abdominales." +
                            "\nDía 6: Descanso." +
                            "\nDía 7: 15 minutos de yoga o estiramientos.");
            System.out.println("----------------------------------------------");
        } else if (condicion.equalsIgnoreCase("avanzado")) {
            System.out.println("----------------------------------------------");
            System.out.println("Rutina para: " + condicion.toLowerCase());
            System.out.println(
                    "Día 1: 30 minutos de cardio (correr a alta intensidad), 40 sentadillas, 30 flexiones, 50 abdominales." +
                            "\nDía 2: 20 minutos de HIIT (circuito), 50 burpees, 20 flexiones diamante." +
                            "\nDía 3: 35 minutos de cardio, 50 sentadillas, 40 flexiones, 60 abdominales." +
                            "\nDía 4: Estiramientos avanzados o yoga de fuerza." +
                            "\nDía 5: 45 minutos de cardio (correr a alta intensidad), 60 sentadillas, 50 flexiones, 70 abdominales." +
                            "\nDía 6: Entrenamiento de fuerza con pesas." +
                            "\nDía 7: Estiramientos y recuperación activa.");
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("La condición física ingresada no es válida");
        }

    }
}

