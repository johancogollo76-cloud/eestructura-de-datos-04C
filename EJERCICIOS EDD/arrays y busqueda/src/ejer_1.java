// Un cajero escanea un producto con el código de barras 770123. El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.

// El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
// Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico.
import java.util.Scanner;
public class ejer_1 {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        boolean encontrado = false;
        double [] codigos = {23240,23424,234636,12313,45645,123123};
        System.out.println("ingresa el codigo del producto que deseas buscar: ");
        int codigo = tc.nextInt();
        for (int i =0;i<codigos.length;i++) {
            if (codigos[i]==codigo) {
                System.out.println("el valor," +codigos[i]+ " se encuentra dentro del array y esta en la posicion: "+i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("el valor no fue encontrado");
        }
            
        
        tc.close();
    }
}
