// Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una referencia al mismo arreglo para revisarlas.

// El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
// Muestra que el arreglo del profesor también refleja el cambio.
// Añade comentarios explicando el concepto de referencia en memoria.
public class e9 {
    public static void main(String[] args) {
        double[] notasProfesor = {3, 4.5, 2.5,5};
        double [] notasCordinador = notasProfesor;
        notasCordinador[2] =3.5;

        System.out.println("notas profesor: "+ notasProfesor[2]);
        System.out.println("notas cordinador: " + notasCordinador[2]);

    }
    
}
