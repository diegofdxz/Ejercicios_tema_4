/*
Dibujar una de las siguientes formas, según la elección del usuario:

Images/04RI04.png
Ejemplo de ejecución:

¿tamaño?

5

¿Carácter?

#

¿forma?

1 - rectángulo con relleno

2 - rectángulo sin relleno

3 - cruz de San Andrés

4 - triángulo rectángulo

5 - rombo

6 - ajedrezado

2

Images/04RI05.png
Observe que el número de líneas es igual al número de columnas.
 */
import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿tamaño?");
        int tamaño = sc.nextInt();
        System.out.println("¿Carácter?");
        String caracter = sc.next();
        System.out.println("¿forma?");
        System.out.println("1 - rectángulo con relleno");
        System.out.println("2 - rectángulo sin relleno");
        System.out.println("3 - cruz de San Andrés");
        System.out.println("4 - triángulo rectángulo");
        System.out.println("5 - rombo");
        System.out.println("6 - ajedrezado");
        int forma = sc.nextInt();
        switch (forma) {
            case 1: //rectángulo con relleno
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 2: //rectángulo sin relleno
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3: //cruz de San Andrés
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if (i == j || i + j == tamaño - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4: //triángulo rectángulo con la hipotenusa de la izquierda a la derecha
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if (i == tamaño - 1 || j == tamaño - 1 || i + j == tamaño - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

                break;
            case 5: //rombo
                int tam = tamaño / 2 + 1;
                for (int i = 1; i <= tam; i++) {
                    for (int j = 1; j <= tam - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = tam - 1; i >= 1; i--) {
                    for (int j = 1; j <= tam - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                break;
            case 6: //ajedrezado
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opción no válida");



}}}
