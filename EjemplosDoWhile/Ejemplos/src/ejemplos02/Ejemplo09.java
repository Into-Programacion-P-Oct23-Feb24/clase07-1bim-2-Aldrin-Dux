/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 del estudiante rené
Calificación 7 del estudiante rolando

Promedio de calificaciones: 8,50
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal;
        int nota;
        int salida;
        String nombre; // *
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;
        int x = 1;

        cadenaFinal = "Listado de Notas\n";
        System.out.println("Ingrese numero de estudiantes");
        int numero = entrada.nextInt();

        do {

            System.out.println("Ingrese nombre");
            nombre = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Igrese nota");
            nota = entrada.nextInt();
            suma = suma + nota;

            contador_calificaciones = contador_calificaciones + 1;

            if (x == numero) {
                System.out.println("Ingrese (-111) si desea salir del ciclo; "
                        + "cualquier otro número para continuar");
                salida = entrada.nextInt();

                if (salida == -111) {
                    bandera = false;
                }
            }

            x = x + 1;
            // atención
            entrada.nextLine(); // se limpia el buffer, pues el primer valor
            // que se solicita al inicio del ciclo es una
            // cadena
            promedio = (double) suma / contador_calificaciones;
            cadenaFinal = String.format("%s\nCalificacion %d "
                + "del estudiante %s\nPromedio final: %.2f",
                cadenaFinal,
                nota,
                nombre,
                promedio);

        } while (bandera); // (bandera==true)

        // promedio = suma / contador_calificaciones;
        

        System.out.printf("\n%s\n", cadenaFinal);
    }
}
