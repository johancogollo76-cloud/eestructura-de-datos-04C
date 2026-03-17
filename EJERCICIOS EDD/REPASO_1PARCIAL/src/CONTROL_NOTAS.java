// jercicio 3: Control de Notas (Selección)
// Objetivo: Gestionar las notas de un grupo, encontrar los valores extremos y ordenar la lista.
// ¿Qué debes hacer?
// 1. Entrada: Pide al usuario 5 notas (números decimales) por teclado.
// 2. Estadísticas: Recorre el arreglo para encontrar cuál es la nota más alta y cuál la más baja del grupo.
// 3. Ordenamiento: Ordena las notas de menor a mayor usando Selección (Selection Sort).
// Ejemplo de lo que se debe ver en consola:
// --- REGISTRO DE NOTAS ---
// Ingrese nota del Estudiante 1: 3.5
// Ingrese nota del Estudiante 2: 4.8
// Ingrese nota del Estudiante 3: 2.0
// ... (hasta completar las 5) ...
// --- INFORME ACADÉMICO ---
// La nota más ALTA del grupo es: 4.8
// La nota más BAJA del grupo es: 2.0
// --- LISTA DE NOTAS ORDENADA (Menor a Mayor) ---
// [2.0, 3.0, 3.5, 4.2, 4.8]



import java.util.Scanner;
public class CONTROL_NOTAS {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de notas: ");
        int cantidad = tc.nextInt();
        double[] notas= new double[cantidad];
        for (int i=0;i<notas.length;i++){
            System.out.println("ingrese la nota "+ (i+1));
            notas[i]=tc.nextDouble();
        }

        imprimirArreglo(notas);

        double max=0;
        double min=notas[0];
        for (int i=0;i<notas.length;i++) {
            if(notas[i]>max){
                max=notas[i];
            }
            else if(notas[i]<min){
                min=notas[i];
            }
        }
        System.out.println("    INFORME ACADEMICO   ");
        System.out.println("el puntaje mas alto es: "+max);
        System.out.println("el puntaje mas bajo es: "+min);


        int n =notas.length;
        for (int i=0;i<n-1;i++){
            int indice_minimo = i;
            for (int j=i+1;j<n;j++) {
                if (notas[j]<notas[indice_minimo]) {
                    indice_minimo=j;
                }
            }

            double temp =notas[indice_minimo];
            notas[indice_minimo]=notas[i];
            notas[i]=temp;
        }
        System.out.println("    LISTA DE NOTAS ORDENADAS    ");
        imprimirArreglo(notas);
        tc.close();
    }
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
    
}
