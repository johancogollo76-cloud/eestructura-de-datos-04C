// Pide al usuario dos números enteros a y b. Asigna b = a, luego pide un nuevo valor para b. Imprime a y b después del cambio y explica con un mensaje en consola por qué a no cambió.

// Datos de entrada: int a, int b (dos veces)

// Salida esperada:

// a = 10  ← no cambió, se pasó por VALOR
// b = 99  ← esta sí cambió
import java.util.Scanner;
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("escribe un numero entero (A): ");
        int a = tc.nextInt();

        System.out.println("escribe el numero entero (B): ");
        int b =a; 

        System.out.println("valor de a: " + a);
        System.out.println("valor de b: " + b);

        System.out.println("escribe nuevo valor de b");
        b=tc.nextInt();
        System.out.println("valor de a: "+a);
        System.out.println("nuevo valor de b: "+b);
        System.out.println("esto ocurre porque se esta usando tipos primitivos y la variable b solo guarda un copia de a, lo cual al momento de modificar b no va cambiar nada en la variable original de a ya que ambas variables quedan almacenadas en espacios de memoria distinto ");
        tc.close();
        
    }
    
}
