// 5. Spotify Lite (Lista de Reproducción)
// Crea un reproductor de música simplificado que gestione una lista de canciones.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int) y genero (String).
// El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la cola".
// Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en formato MM:SS.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc =new Scanner(System.in);
        Lista_reproduccion lista= new Lista_reproduccion();
        int opc;
        do{
            System.out.println("==================");
            System.out.println("MENUUUUUUU");
            System.out.println("1.  agregar al inicio ");
            System.out.println("2.  agregar al final");
            System.out.println("3.  mostrar el tiempo ");
            System.out.println("0.  salir");
            System.out.println("==================\n");
            opc=tc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("agrgar al inicio ");
                    System.out.println("ingrese el titulo: ");
                    String titulo=tc.next();
                    System.out.println("ingrese el artista: ");
                    String artista=tc.nextLine();
                    tc.next();
                    System.out.println("ingrese la duracion: ");
                    int duracion_segundos=tc.nextInt();
                    System.out.println("ingrese el genero: ");
                    String genero=tc.next();

                    Cansion musica= new Cansion(titulo, artista, duracion_segundos, genero);
                    lista.agregar_al_inicio(musica);
                    break;
                case 2:
                    System.out.println("agrgar al inicio ");
                    System.out.println("ingrese el titulo: ");
                    String titulo2=tc.next();
                    System.out.println("ingrese el artista: ");
                    String artista2=tc.nextLine();
                    tc.next();
                    System.out.println("ingrese la duracion: ");
                    int duracion_segundos2=tc.nextInt();
                    System.out.println("ingrese el genero: ");
                    String genero2=tc.next();

                    Cansion musica2= new Cansion(titulo2, artista2, duracion_segundos2, genero2);
                    lista.agregar_al_final(musica2);
            
                default:
                    break;
            }


        }while(opc!=0);


        tc.close();
        
    }
}
