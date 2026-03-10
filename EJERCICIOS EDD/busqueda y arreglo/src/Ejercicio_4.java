// Registro Alfabético de Estudiantes
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
// Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar sus nombres (cadenas de texto).
// Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
// Requisito técnico: El estudiante debe investigar y aplicar el método nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
// Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner tc =new Scanner(System.in);
        System.out.println("cuantos estudiantes hay en la lista: ");
        int cantidad = tc.nextInt();
        String [] nombres = new String [cantidad];
        for (int i=0;i<nombres.length;i++) {
            System.out.println("ingrese el nombre del estudiante "+ ( i+ 1 ) );
            nombres[i]=tc.nextLine();
            tc.nextLine();
        }
        System.out.println("ORIGINAL");
        imprimirArreglo(nombres);
        int n =nombres.length;
        for (int i =1;i<n;i++){
            String clave=nombres[i];
            int j =i-1;
            while (j>=0 && nombres[j].compareToIgnoreCase(clave)>0) {
                nombres[j+1]=nombres[j];
                j=j-1;
            }
            nombres[j+1]=clave;
        }
        System.out.println("ORDENADA ");
        imprimirArreglo(nombres);
        tc.close();
        
    }
    public static void imprimirArreglo(String[] arr) {
        for (String d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
