// Un chat guarda el último mensaje enviado. Se usan dos variables String:

// ultimoMensaje = "Hola"
// copiaTexto = ultimoMensaje
// Luego copiaTexto se cambia a "¿Cómo estás?"
// Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió (inmutabilidad de String).

public class e8 {
    public static void main(String[] args) {
        String ultimoMensaje ="hola";
        String copiaTexto=ultimoMensaje;
        copiaTexto = "¿como estas?";
        System.out.println(ultimoMensaje);
        System.out.println(copiaTexto);
        System.out.println("pasa que String en java es inmutable, Cuando se asigna copiaTexto = ultimoMensaje, ambas variables apuntan al mismo objeto en memoria, pero al cambiar copiaTexto, no se modifica el texto original, sino que se crea un nuevo objeto string");
    }
    
}
