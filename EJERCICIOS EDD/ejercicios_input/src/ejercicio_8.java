// Pide al usuario 3 calificaciones para llenar notas[]. Crea una copia real en notasRespaldo[] copiando elemento por elemento. Modifica notas[0] con un valor que el usuario ingrese. Muestra ambos arreglos y verifica que notasRespaldo no cambió.

// Datos de entrada: double × 3 notas, double nuevo valor para notas[0]

// Salida esperada:

// notas[0]         = 4.5  ← cambió
// notasRespaldo[0] = 3.2  ← no cambió, es una copia independiente
import java.util.Scanner;
public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double[] notas = new double[3];
        for (int i=0;i <notas.length;i++) {
            System.out.println("ingresa la nota " +(i+1));
            notas[i] = tc.nextDouble();
        }
        double[] notasRespaldo = new double[3];
        for (int i=0; i <notasRespaldo.length;i++) {
            notasRespaldo[i]=notas[i];
        }

        System.out.println("ingrese valor modificado: ");
        notas[0]= tc.nextDouble();

        System.out.println("notas[0]: " +notas[0]);
        System.out.println("notasRespaldo[0]: "+ notasRespaldo[0]);

        tc.close();
    }
    
}
