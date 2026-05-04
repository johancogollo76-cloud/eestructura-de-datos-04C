// 4. Galería de Fotos
// Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente, volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde la siguiente sin interrupciones.

// La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
// El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve ese puntero. Marcar como favorita simplemente alterna el campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y mueve actual a la siguiente.
// Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). mostrarGaleria() recorre todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces, macra la actual como favorita, retrocede una, elimina esa foto y muestra el estado final de la galería.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);
        Galeria galeria=new Galeria();

        int opcion;

        do {
            System.out.println("\n=====================================================");
            System.out.println("   GALERIA — Menú Principal");
            System.out.println("=======================================================");
            System.out.println("1. Agregar foto");
            System.out.println("2. Siguiente foto");
            System.out.println("3. Foto anterior");
            System.out.println("4. Marcar o Desmarcar favorita");
            System.out.println("5. Eliminar foto actual");
            System.out.println("6. Mostrar galería");
            System.out.println("7. cargar fotos ejemplos");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción: ");
            System.out.println("=======================================================");
            opcion = tc.nextInt();
            tc.nextLine();
            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.print("Título de la foto: ");
                    String titulo = tc.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = tc.nextLine();


                    galeria.agregar(titulo, fecha, false);
                    System.out.println("Foto agregada");
                    break;

                case 2:
                    galeria.siguiente();
                    System.out.println("Avanzando...");
                    break;

                case 3:
                    galeria.anterior();
                    System.out.println("Retrocediendo...");
                    break;

                case 4:
                    galeria.toggleFavorita();
                    System.out.println("Estado de favorita cambiado");
                    break;

                case 5:
                    galeria.eliminarActual();
                    System.out.println("Foto eliminada");
                    break;

                case 6:
                    galeria.mostrarGaleria();
                    break;
                case 7:
                    galeria.agregar("Playa", "2024-01-10",false);
                    galeria.agregar("Montaña", "2024-01-15",false);
                    galeria.agregar("Ciudad", "2024-02-01",false);
                    galeria.agregar("Familia", "2024-02-10",false);
                    galeria.agregar("Amigos", "2024-03-05",false);
                    break;


                case 0:
                    System.out.println("Adiós...");
                    break;

                default:
                    System.out.println("Opción invalida!");
            }

        } while (opcion != 0);





        tc.close();
    }
}
