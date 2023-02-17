/*
7. Visualización de citas de películas (versión 1)
El programa debe mostrar un menú con una lista de películas y una opción para salir.
Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.
Si el usuario elige salir, el programa mostrará un mensaje antes de salir.
Ejemplo de ejecución:
1 - Una cita de la ciudad del miedo
2 - Una cita de James Bond
3 - Una cita de la vida es un largo río tranquilo
4 - Una cita de Star Wars
5 - Salir de esta magnífica aplicación
2
Me llamo Bond, James Bond
1
Cuidado, es una auténtica carnicería
5
Adios
¡Por supuesto, puede elegir las películas y las citas que prefiera!
 */
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
        int opcion = sc.nextInt();
        while (opcion != 5) {
            if (opcion == 1) {
                System.out.println("Cuidado, es una auténtica carnicería");
            } else if (opcion == 2) {
                System.out.println("Me llamo Bond, James Bond");
            } else if (opcion == 3) {
                System.out.println("¿Qué es el amor?");
            } else if (opcion == 4) {
                System.out.println("Yo soy tu padre");
            } else {
                System.out.println("Opción incorrecta");
            }
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = sc.nextInt();
        }
        System.out.println("Adios");
    }
}
