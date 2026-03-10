// Organización de Biblioteca Dinámica
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante en su posición correcta.
// Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el código ISBN (número entero) de cada uno.
// Lógica de Inserción: A medida que el usuario ingresa un número, o una vez llenado el arreglo, el algoritmo debe simular el proceso de "insertar" el elemento comparándolo con los que ya están a su izquierda.
// Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). Esto permite al estudiante ver cómo los elementos se desplazan para abrir espacio al nuevo valor.
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("inhgrese la cantidad de libros: ");
        int cantidad_libros = tc.nextInt();
        int [] codigo= new int [cantidad_libros];  
        for (int i=0;i<codigo.length;i++){
            System.out.println("ingrese el codigo ISBN: ");
            codigo[i]=tc.nextInt();
            
        }
        System.out.println("codigos actuales: ");
        imprimirArreglo(codigo);
        int n =codigo.length;
        for (int i =1;i<n;i++){
            int clave=codigo[i];
            int j =i-1;
            while (j>=0 && codigo[j] > clave) {
                codigo[j+1]=codigo[j];
                j=j-1;
            }
            codigo[j+1]=clave;
            System.out.println();
            System.out.println("paso "+(i));
            imprimirArreglo(codigo);

        }
        tc.close();
    }
    public static void imprimirArreglo(int[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
