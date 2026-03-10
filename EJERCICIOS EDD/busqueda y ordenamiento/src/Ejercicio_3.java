// El Salto de Shell (Optimización de Datos)
// Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)
// Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
// Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 para notar el efecto).
// Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de 
// N
// /
// 2
// . El estudiante debe explicar en comentarios por qué este método es generalmente más rápido que la inserción simple al trabajar con elementos que están muy lejos de su posición final.
// Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas las fases de reducción de saltos.
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner tc =new Scanner(System.in);
        System.out.println("ingrese la cantidad de paquetes: ");
        int cantidad = tc.nextInt();
        double [] pesos = new double[cantidad];
        for (int i=1;i<pesos.length;i++){
            System.out.println("ingrese el peso del paquete "+ i);
            pesos[i]=tc.nextDouble();
        }
        System.out.println("ORIGINAL");
        imprimirArreglo(pesos);

        int n = pesos.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double temp = pesos[i];
                int j;
                for (j = i; j >= gap && pesos[j - gap] > temp; j -= gap) {
                    pesos[j] = pesos[j - gap];
                }
                pesos[j] = temp;
            }
        }

        System.out.println("============ Resultado ============");
        System.out.print("Pesos ordenados: ");
        imprimirArreglo(pesos);
        System.out.println("hell Sort es más rápido que Insertion Sort simple porque compara elementos que están lejos entre sí usando un salto Esto permite que los elementos se acerquen más rápido a su posición correcta antes de hacer las comparaciones finales");
        tc.close();
    }
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}