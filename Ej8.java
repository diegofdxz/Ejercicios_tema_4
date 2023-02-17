/*
8. Visualización de citas de películas (versión 2)
Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película, sino que haya dos o tres y presente aleatoriamente una de ellas.
 */
import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Una cita de Fast and Furious");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de Breaking Bad");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
        int opcion = sc.nextInt();
        while (opcion != 5) {
            if (opcion == 1) {
                //3 citas de Fast and Furious
                int cita = (int) (Math.random() * 3);
                if (cita == 0) {
                    System.out.println("Cuando te juegas la vida, es cuando más dependes de ti mismo");
                } else if (cita == 1) {
                    System.out.println("Dicen que un camino abierto despeja la mente");
                } else {
                    System.out.println("Muéstrame cómo conduces y te mostraré quién eres");
                }
            } else if (opcion == 2) {
                //3 citas de James Bond
                int cita = (int) (Math.random() * 3);
                if (cita == 0) {
                    System.out.println("Me llamo Bond, James Bond");
                } else if (cita == 1) {
                    System.out.println("Ponga las dos manos en el volante, soy un pasajero muy nervioso");
                } else {
                    System.out.println("-¿Por qué llevas siempre pistola?\n" +
                            "\n" +
                            "-Tengo un ligero complejo de inferioridad");
                }
            } else if (opcion == 3) {
                //3 citas de Breaking Bad
                int cita = (int) (Math.random() * 3);
                if (cita == 0) {
                    System.out.println("Nunca cometas dos veces el mismo error");
                } else if (cita == 1) {
                    System.out.println("Para cocinar solo necesitas saber la receta, y yo me la sé al pie de la letra");
                } else {
                    System.out.println("Tú conoces el negocio y yo conozco la química");
                }
            } else if (opcion == 4) {
                int cita = (int) (Math.random() * 3);
                if (cita == 0) {
                    System.out.println("Yo soy tu padre");
                } else if (cita == 1) {
                    System.out.println("“La fuerza es poderosa en mi familia, mi padre la tenía, mi hermana la tiene, yo la tengo”");
                } else {
                    System.out.println("Yo nunca me cuestiono algo… Hasta después de hacerlo");
                }

            } else {
                System.out.println("Opción incorrecta");
            }
            System.out.println("1 - Una cita de Fast and Furious");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de Breaking Bad");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = sc.nextInt();
        }

}}