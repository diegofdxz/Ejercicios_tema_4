/*
6. ¿Qué hace este algoritmo?
Observe atentamente el siguiente algoritmo:

Algo Trampa
Variable numIntento : entero <- 1
Variable valorIntroducido : texto
Constante MAX_INTENTOS : entero <- 5
Inicio
   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0
         escribir("Respuesta incorrecta")
         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &
" intento(s)")
         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
   FMq
   Si MAX_INTENTOS - numIntento ≠ 0 Entonces
         escribir("Bravo")
   Si no
         escribir("Revise sus conocimientos en geografía")
   FSi
Fin
¿Qué hace?

Corrija este algoritmo para que logre lo que se podría esperar.
 */
public class Ej6 {

}
