/*
1. La nota media (versión 1)
Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.

A continuación se muestra un ejemplo de posibles visualizaciones y valores introducidos, durante una ejecución del algoritmo (los valores introducidos por el usuario, están escritos en negrita y cursiva):

Introduzca el número de notas:

3

Nota:

12

Nota:

17,5

Nota:

14

La media es 14,5
* */
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de notas:");
        int n = sc.nextInt();
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nota:");
            double nota = sc.nextDouble();
            suma = suma + nota;
        }
        double media = suma / n;
        System.out.println("La media es " + media);
    }

}
