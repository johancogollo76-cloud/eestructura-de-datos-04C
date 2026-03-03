// Un profesor tiene un arreglo con las notas finales de 30 estudiantes (ej: 3.5, 4.0, 2.8, 5.0, ...).

// El Problema: El profesor necesita saber exactamente cuántos estudiantes sacaron una nota de 5.0.
// Algoritmo a usar: Búsqueda Lineal con Contador. Debes recorrer todo el arreglo y, cada vez que encuentres un 5.0, aumentar una variable contador.
public class ejer_5 {
    public static void main(String[] args) {
        double[] notas = {
    3.5, 4.0, 2.8, 5.0, 4.2,
    3.9, 5.0, 4.5, 2.7, 3.3,
    4.8, 5.0, 3.1, 2.9, 4.6,
    3.7, 4.4, 5.0, 3.0, 4.1,
    2.5, 3.8, 4.9, 5.0, 3.6,
    4.3, 2.6, 5.0, 3.4, 4.7
    };
    double contador=0;
    double maximo=5.0;
    for (int i=0; i<notas.length;i++) {
        if (notas[i]==maximo) {
            contador+=1;
        }
    }
    System.out.println("hay "+contador+" estudiantes que tienen la notas maxima de "+maximo);
    }
}
