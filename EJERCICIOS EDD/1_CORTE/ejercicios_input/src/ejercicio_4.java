// Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo y si acepta términos y condiciones. Muestra un resumen indicando el tipo de dato que se usó para cada campo.

// Datos de entrada: String, int, String, String, boolean

// Salida esperada:

// ========= Perfil creado =========
// Nombre  (String)  : Ana Pérez
// Edad    (int)     : 22
// Ciudad  (String)  : Bogotá
// Correo  (String)  : ana@mail.com
// T&C     (boolean) : true

import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.err.println(" escriba su nombre: ");
        String nombre = tc.nextLine();

        System.err.println("escriba la edad: ");
        int edad= tc.nextInt();
        tc.nextLine();

        System.err.println("escriba la ciudad: ");
        String ciudad = tc.nextLine();

        System.err.println("escriba el correo: ");
        String correo = tc.nextLine();

        System.err.println("acepta terminos y condiciones?: ");
        boolean acepta = tc.nextBoolean();

        System.err.println("=============PERFIL CREADO===========");
        System.err.println("NOMBRE (STRING)   : "+ nombre);
        System.err.println("EDAD   (INT)      : "+ edad);
        System.err.println("CIUDAD (STRING)   : " + ciudad);
        System.err.println("CORREO (STRING)   : " + correo);
        System.err.println("T&C    (BOOLEAN)  : "+ acepta);

        tc.close();
    }
}
