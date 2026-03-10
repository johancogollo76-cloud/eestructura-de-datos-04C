// El Inspector de Eficiencia (Duelo de Métodos)
// Algoritmos obligatorios: Selección vs Inserción

// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner tc =new Scanner(System.in);
        System.out.println("ingrese la cantidad de datos: ");
        int cantidad = tc.nextInt();

        int [] lista_1=new int[cantidad];
        int [] lista_2=new int [cantidad];
        for (int i=0; i<lista_1.length;i++) {
            System.out.println("ingrese el numero "+(i+1));
            lista_1[i] =tc.nextInt();
            lista_2[i] = lista_1[i];
        }
        System.out.println("ORIGINALES");
        System.out.println("lista 1");
        imprimirArreglo(lista_1);
        System.out.println("lista 2");
        imprimirArreglo(lista_2);
        //sistema de seleccion
        int contador=0;
        int n = lista_1.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (lista_1[j] < lista_1[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            if (minIdx != i) {
            int temp = lista_1[minIdx];
            lista_1[minIdx] = lista_1[i];
            lista_1[i] = temp;
            contador+=1;
            }
        }
        // sistema de insercion
        int cont=0;
        int n_1 =lista_2.length;
        for (int i =1;i<n_1;i++){
            int clave=lista_2[i];
            int j =i-1;
            while (j>=0 && lista_2[j] > clave) {
                lista_2[j+1]=lista_2[j];
                j=j-1;
                cont+=1;
            }
            lista_2[j+1]=clave;
            

        }
        System.out.println("ORGANIZADAS");
        System.out.println("lista 1 por seleccion");
        imprimirArreglo(lista_1);
        System.out.println("contador: "+contador+" pasos");
        System.out.println("lista 2 por insercion");
        System.out.println("contador: "+cont+" pasos");
        imprimirArreglo(lista_2);

        System.out.println("El algoritmo de selección realizó menos operaciones porque solo cuenta los intercambios. El algoritmo de inserción realiza más movimientos ya que desplaza los elementos para encontrar la posición correcta. Sin embargo, inserción puede ser más eficiente cuando los datos ya están parcialmente ordenados.");

        tc.close();
        
    }
    public static void imprimirArreglo(int[] arr) {
        for (int d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
