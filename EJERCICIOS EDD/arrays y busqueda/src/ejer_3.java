// Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

// El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
// Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos.
public class ejer_3 {
    public static void main(String[] args) {
        double [] temperatura = {34,32,35,37,39,32,31,};
        double max=0;
        for ( int i =0;i<temperatura.length;i++) {
            if (temperatura[i]>max) {max = temperatura[i]; }
        }
        System.out.println("la temperatura maxima es: "+max);
    }
    
}
