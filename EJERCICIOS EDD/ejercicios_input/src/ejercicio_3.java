// Pide al usuario su nombre y 4 notas de un curso. Calcula el promedio y determina si aprobó (promedio >= 3.0).

// Datos de entrada:

// String nombre
// double nota1, nota2, nota3, nota4
// Salida esperada:

// Estudiante: Carlos
// Promedio  : 3.45
// Estado    : APROBADO
// Pista: usa una variable boolean aprobado = promedio >= 3.0; para el estado.

import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.err.println("escriba su nombre: ");
        String nombre = tc.nextLine();

        System.err.println("escriba la nota 1: ");
        double noota_1 = tc.nextDouble();

        System.err.println("escriba la nota 2: ");
        double noota_2 = tc.nextDouble();

        System.err.println("escriba la nota 3: ");
        double noota_3 = tc.nextDouble();

        System.err.println("escriba la nota 4: ");
        double noota_4 = tc.nextDouble();

        double promedio = (noota_1+noota_2+noota_3+noota_4)/4;

        if (promedio >=3) {
            System.err.println("NOMBRE  : " + nombre);
            System.err.println("PROMEDIO: " + promedio);
            System.err.println("ESTADO  : APROVADO");
        }
        else {
            System.err.println("NOMBRE  : " + nombre);
            System.err.println("PROMEDIO: " + promedio);
            System.err.println("ESTADO  : REPROBADO");
        }

        tc.close();
        
    }
    

    
}
