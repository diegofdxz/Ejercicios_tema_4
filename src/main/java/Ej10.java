/*
10. Arte ASCII 1
El arte ASCII consiste en hacer un diseño usando solo caracteres. Una de las formas más primitivas de este arte son los emoticonos: los caracteres :-) dibujan una carita sonriente.
Escriba un algoritmo que muestre un rectángulo realizado en arte ASCII según los deseos del usuario.
Ejemplo de ejecución:
¿Anchura?
8
¿Altura?
5
¿Carácter?
#

########

########

########

########

########
 */
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Anchura?");
        int anchura = sc.nextInt();
        System.out.println("¿Altura?");
        int altura = sc.nextInt();
        System.out.println("¿Carácter?");
        String caracter = sc.next();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
