/*
 El codigo de por si define 3 varibales como enteros:numero,potencia,resultado
 este permite que se presente el resultado de una potencia previamentes 
 ingresadas o ya definidas, en este caso el numero es la base=4 y la potencia 
 es el exponente=3 dando como resultado 64, usando un contador desde 1 hasta que
 tenga el mismo valor que la potencia, primero el resultado es 1 para multiplicar-
 lo con numero dando el mismo resultado que una potencia, cuando el contador pasa
 de la potencia el resultado se escribe solo
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 3;
        // 8. potencia <-- 3
        potencia = 2;
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
