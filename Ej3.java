/* 3. La nota media (versión 3)
        Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.

        Ejemplo de ejecución del algoritmo:

        ¿Nota (-1 para terminar)?

        14

        ¿Nota (-1 para terminar)?

        12

        ¿Nota (-1 para terminar)?

        9

        ¿Nota (-1 para terminar)?

        7

        ¿Nota (-1 para terminar)?

        10

        ¿Nota (-1 para terminar)?

        -1

        Media = 10,4 (60 % ≥10)
*/
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int n = 0;
        int n10 = 0;
        System.out.println("¿Nota (-1 para terminar)?");
        double nota = sc.nextDouble();
        while (nota != -1) {
            suma = suma + nota;
            n = n + 1;
            if (nota >= 10) {
                n10 = n10 + 1;
            }
            System.out.println("¿Nota (-1 para terminar)?");
            nota = sc.nextDouble();
        }
        double media = suma / n;
        double porcentaje = (double) n10 / n * 100;
        System.out.println("Media = " + media + " (" + porcentaje + "% ≥10)");
    }
}
