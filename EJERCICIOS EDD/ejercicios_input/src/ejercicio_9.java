// Pide al usuario su nombre. Asigna alias = nombre. Pide un nuevo alias. Muestra que nombre no cambió y explica la inmutabilidad de String con un mensaje en consola.

// Datos de entrada: String nombre, String nuevo alias
import java.util.Scanner;
public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("escriba su nombre: ");
        String nombre= tc.nextLine();
        String alias = nombre;
        System.out.println("nuevo alias: ");
        alias= tc.nextLine();
        System.out.println("nombre: "+ nombre);
        System.out.println("nuevo alias: "+ alias);
        System.out.println("los String en java son inmutables por eso al combinar alias no se modifica nombre, sino que alias es un nuevo objeto string");


        tc.close();
    }
    
}
