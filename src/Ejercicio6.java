/*
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.
* */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] materias = {"Matemática", "Programación", "Laboratorio", "Arquitectura", "Inglés"};
        double cantidadHoras = 0;
        double horasPorMateria = 0;

        System.out.print("Cuántas horas al día puede estudiar: ");
        cantidadHoras = s.nextDouble();

        horasPorMateria = cantidadHoras / materias.length;

        System.out.println("Plan de estudio: ");
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i] + " : " + horasPorMateria + " horas por día");
        }
    }
}
