// Un cajero escanea un producto con el código de barras 770123. El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.

// El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
// Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico.
public class busqueda_lineal {
    public static void main(String[] args) throws Exception {
        boolean encontrado = false;
        double [] codigos = {23240,23424,234636,12313,45645,123123};
        int codigo = 234636;
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
    }
    public static void imprimirArreglo(int[] arr) {
        for (int d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
