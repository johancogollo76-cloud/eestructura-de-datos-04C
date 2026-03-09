// Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("ingrese cuantos estudiantes participaran ");
        int numero_corredores= tc.nextInt();
        double [] tiempo = new double[numero_corredores];
        for (int i =0;i<tiempo.length;i++) {
            System.out.println("ingrese el corredor "+ (i+1));
            tiempo[i] =tc.nextDouble();
        }

        System.out.println("ORIGINAL: ");
        imprimir_arreglo(tiempo);

        int n =tiempo.length;
        for (int i=0;i<n-1;i++){
            int indice_minimo = i;
            for (int j=i+1;j<n;j++) {
                if (tiempo[j]<tiempo[indice_minimo]) {
                    indice_minimo=j;
                }
            }


            double temp =tiempo[indice_minimo];
            tiempo[indice_minimo]=tiempo[i];
            tiempo[i]=temp;
        }   
        System.out.println("ORDENADOS: ");
        imprimir_arreglo(tiempo);
        System.out.println("medalla oro, 1 puesto con tiempo de: "+tiempo[0]);
        System.out.println("medalla oro, 2 puesto con tiempo de: "+tiempo[1]);
        System.out.println("medalla oro, 3 puesto con tiempo de: "+tiempo[2]);
        tc.close();
    }

    public static void imprimir_arreglo(double [ ] arr) {
        for (double d :arr){
            System.out.print("["+d+"]");
        }
        System.out.println();
    }
    
}
