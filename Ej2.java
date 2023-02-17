/*
2. La nota media (versión 2)
El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.

Ejemplo de ejecución del algoritmo:

¿Nota (-1 para terminar)?

9

¿Nota (-1 para terminar)?

18

¿Nota (-1 para terminar)?

-1

La nota media es 13,5
 */
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int n = 0;
        System.out.println("¿Nota (-1 para terminar)?");
        double nota = sc.nextDouble();
        while (nota != -1) {
            suma = suma + nota;
            n = n + 1;
            System.out.println("¿Nota (-1 para terminar)?");
            nota = sc.nextDouble();
        }
        double media = suma / n;
        System.out.println("La nota media es " + media);
    }
}
