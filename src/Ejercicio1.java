/*Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String fechaNacimiento = "";
        String signo = "";
        String mensaje = "";
        int dia = 0;
        int mes = 0;

        System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        fechaNacimiento = s.nextLine();

        dia = Integer.parseInt(fechaNacimiento.split("/")[0]);
        mes = Integer.parseInt(fechaNacimiento.split("/")[1]);


        if ((mes == 12 && dia >= 23) || (mes == 1 && dia <= 20)) {
            signo = "Capricornio";
            mensaje = "Aunque la mañana pueda empezar complicada, todo se resolverá a medida que avance el día. Relájese, ya que encontrará soluciones para cada problema que surja.";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            signo = "Acuario";
            mensaje = "Es probable que no esté atravesando su mejor momento, pero tenga paciencia. Pronto llegará una satisfacción que compensará las dificultades.";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            mensaje = "Es un momento propicio para reordenar sus fuerzas internas. Comprenda que no es conveniente malgastar energías en asuntos que aún no domina completamente.";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            signo = "Aries";
            mensaje = "Por fin encontrará el camino para cambiar su estilo de vida, lo que le hará sentir maravillosamente en todo lo que emprenda. No tenga miedo y hágalo.";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            signo = "Tauro";
            mensaje = "Prepárese, ya que su vida social tomará un giro positivo con la llegada de nuevos compromisos. Su entusiasmo se potenciará al máximo, así que aprovéchelo al máximo.";
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            signo = "Géminis";
            mensaje = "Transitará un día un tanto complicado, ya que podrían surgir cambios que no estaban contemplados en sus responsabilidades. No se desespere, actúe con cautela y calma.";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 23)) {
            signo = "Cáncer";
            mensaje = "Evite hacer las cosas con apuro. La prisa y la desesperación no garantizan resultados. Relájese y proceda con cuidado en todo lo que emprenda.";
        } else if ((mes == 7 && dia >= 24) || (mes == 8 && dia <= 23)) {
            signo = "Leo";
            mensaje = "Es probable que necesite reflexionar sobre los inconvenientes recientes. Podrá identificar dudas que le impiden encontrar soluciones claras y avanzar.";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
            signo = "Virgo";
            mensaje = "Recuerde que el éxito no dependerá solo de lo que diga. En este momento, su imagen personal será fundamental para destacarse en todo lo que haga.";
        } else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
            signo = "Libra";
            mensaje = "Prepárese para un día lleno de contradicciones en lo que haga, lo que podría generarle desorientación. Si surge algún problema, mantenga la calma y no desespere.";
        } else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
            signo = "Escorpio";
            mensaje = "Aproveche al máximo su vitalidad, ya que tendrá un día lleno de movimientos y sorpresas. Mantenga una actitud positiva y verá cómo logra sobrellevar cada situación de manera exitosa.";
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 22)) {
            signo = "Sagitario";
            mensaje = "Esta semana, contará con toda la energía para hacer lo que desee, pero antes de avanzar, es importante que defina qué es lo que realmente quiere para su vida en este momento.";
        } else {
            System.out.println("La fecha ingresada no es válida, por favor inténtelo nuevamente");
        }


        System.out.println("Signo: " + signo);
        System.out.println("Horóscopo: " + mensaje);

    }
}
