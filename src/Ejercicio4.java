/*Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String estado = "";

        System.out.print("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado): ");
        estado = s.nextLine();

        if (estado.equalsIgnoreCase("feliz")) {
            System.out.println("----------------------------------------------");
            System.out.println("Se ha creado esta playlist para cuando te sientas " + estado.toLowerCase());
            System.out.println(
                    "\"Happy\" – Pharrell Williams " +
                            "\n\"Uptown Funk\" – Mark Ronson ft. Bruno Mars" +
                            "\n\"Walking on Sunshine\" – Katrina and the Waves" +
                            "\n\"Can't Stop the Feeling!\" – Justin Timberlake" +
                            "\n\"La Guitarra\" – Los Auténticos Decadentes");
            System.out.println("----------------------------------------------");
        } else if (estado.equalsIgnoreCase("triste")) {
            System.out.println("----------------------------------------------");
            System.out.println("Se ha creado esta playlist para cuando te sientas " + estado.toLowerCase());
            System.out.println(
                    "\"Deja vu\" – Gustavo Cerati" +
                            "\n\"Someone Like You\" – Adele" +
                            "\n\"Fix You\" – Coldplay" +
                            "\n\"Te vi\" – Fito Páez" +
                            "\n\"When I Was Your Man \" – Bruno Mars");
            System.out.println("----------------------------------------------");
        } else if (estado.equalsIgnoreCase("enérgico")) {
            System.out.println("----------------------------------------------");
            System.out.println("Se ha creado esta playlist para cuando te sientas " + estado.toLowerCase());
            System.out.println(
                    "\"Música ligera\" – Soda Stereo" +
                            "\n\"Eye of the Tiger\" – Survivor" +
                            "\n\"We Will Rock You\" – Queen" +
                            "\n\"Lose Yourself\" – Eminem" +
                            "\n\"Thunderstruck\" – AC/DC");
            System.out.println("----------------------------------------------");
        } else if (estado.equalsIgnoreCase("relajado")) {
            System.out.println("----------------------------------------------");
            System.out.println("Se ha creado esta playlist para cuando te sientas " + estado.toLowerCase());
            System.out.println(
                    "\"Ocean Eyes\" – Billie Eilish" +
                            "\n\"El mareo\" – Bajofondo ft. Gustavo Cerati" +
                            "\n\"Death Bed\" – Powfu" +
                            "\n\"Zona de promesas\" – Gustavo Cerati" +
                            "\n\"Chill Out\" – John Lee Hooker");
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("Lo sentimos, no hemos podido reconocer tu estado de ánimo");
        }


    }
}
