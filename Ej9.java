/*
9. Escribir un múltiplo de tres
Escriba un programa que haga que el usuario escriba un múltiplo de tres y no se detenga hasta que el número sea correcto.
Ejemplo de ejecución del algoritmo:
Escriba un múltiplo de 3
7579
Error 7579 no es un múltiplo de 3
16427
Error 16427 no es un múltiplo de 3
51321
Ok: 51321 es un múltiplo de 3
 */
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un múltiplo de 3");
        int n = sc.nextInt();
        while (n % 3 != 0) {
            System.out.println("Error " + n + " no es un múltiplo de 3");
            System.out.println("Escriba un múltiplo de 3");
            n = sc.nextInt();
        }
        System.out.println("Ok: " + n + " es un múltiplo de 3");
    }
}
