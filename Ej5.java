/*
5. Ahora tengo que encontrarlo yo
Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).

Ejemplo de ejecución del algoritmo:

Elija un número del 1 al 100, luego presione cualquier tecla.

a

Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?

-

Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?

=

Fenomenal, lo he encontrado después de 4 intentos.
 */
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        sc.nextLine();
        int min = 1;
        int max = 100;
        int n = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Pruebo con " + n + ", ¿es mayor, menor o es el número (+/-/=)?");
        String respuesta = sc.nextLine();
        int intentos = 1;
        while (!respuesta.equals("=")) {
            if (respuesta.equals("+")) {
                min = n + 1;
            } else {
                max = n - 1;
            }
            n = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("Pruebo con " + n + ", ¿es mayor, menor o es el número (+/-/=)?");
            respuesta = sc.nextLine();
            intentos = intentos + 1;
        }
        System.out.println("Fenomenal, lo he encontrado después de " + intentos + " intentos.");
    }
}
