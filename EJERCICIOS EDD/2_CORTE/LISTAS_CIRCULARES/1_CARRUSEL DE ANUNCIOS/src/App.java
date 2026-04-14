// 2. Carrusel de Anuncios (Pantalla Digital)
// Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el último anuncio, vuelve automáticamente al primero.

// La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), vecesRepetido (int) y categoria (String - ej: "Oferta", "Marca", "Evento").
// El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el anuncio que más veces se ha repetido.
// Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas completas por todos los anuncios, incrementando vecesRepetido en cada paso e imprimiendo qué anuncio está en pantalla. Al finalizar, muestra el anuncio más repetido y el tiempo total acumulado en pantalla.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);

        Pantalla pantalla= new Pantalla();
        int opc;

        do {
            System.out.println("\n==============================================");
            System.out.println("         Reproductor de anuncios");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar anuncio.");
            System.out.println("  [2] reproducir .");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opc =tc.nextInt();
            System.out.println();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese titulo:");
                    String titulo = tc.next();

                    System.out.println("Ingrese duracion segundos:");
                    int duracion = tc.nextInt();

                    System.out.println("Ingrese las veces repetidas:");
                    int veces_repetidas = tc.nextInt();
                    System.out.println("ingrese la categoria: ");
                    String categoria=tc.next();

                    Anuncio nueva = new Anuncio(titulo, duracion, veces_repetidas,categoria);
                    pantalla.agregar_anuncio(nueva);
                    break;

                case 2:
                    System.out.println("reproducir");
                    System.out.println("Ingrese numero de ciclos:");
                    int ciclos = tc.nextInt();
                    pantalla.reproducir(ciclos);
                    break;

                case 0:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opc != 0);
        


        tc.close();

        

    }
}
