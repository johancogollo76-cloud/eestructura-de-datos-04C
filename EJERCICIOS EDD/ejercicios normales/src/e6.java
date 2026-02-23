// Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActual y se asigna a turnoEnPantalla.
// Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual (comportamiento por valor).
// Explica en un comentario por qué ocurre esto.
public class e6 {
    public static void main(String[] args) {
        int turnoActual = 2345;
        int turnoEnPantalla = turnoActual;

        turnoEnPantalla = 222;
         System.out.println(turnoActual);
         System.out.println(turnoEnPantalla);
         System.err.println("esto ocurre porque se esta usando tipos primitivos y la variable turnoEnPantalla solo guarda una copia de turnoActual, lo cual al momento de modificar turnoEnPantalla no va cambiar nada en la variable original de trnoActual ya que ambas variables quedan almacenadas en espacios de memoria distintos");
    }
    
}