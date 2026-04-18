// 5. Torneo de Fútbol (Fixture Round Robin)
// En un torneo de fútbol por todos contra todos, cada equipo debe enfrentarse exactamente una vez contra cada uno de los demás equipos. El algoritmo Round Robin fija los partidos rotando los equipos en un ciclo.

// La Clase Equipo (Nodo): Debe contener nombre (String), ciudad (String), puntos (int) y golesFavor (int).
// El Problema: El fixture se genera rotando la lista: en cada jornada, se enfrentan los equipos opuestos del ciclo (el primero con el último, el segundo con el penúltimo, etc.). Un equipo queda fijo (la cabeza) y el resto rota una posición hacia adelante en cada jornada.
// Reto: Implementa el método generarFixture() que imprima todos los partidos de una jornada completa para 6 equipos (3 partidos por jornada). Luego, rota los equipos una posición y repite hasta que todos se hayan enfrentado. Al final, imprime la tabla de posiciones ordenando los equipos de mayor a menor puntaje (puedes asignar puntos aleatorios o fijos para la simulación).

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        Enfrentamientos enfrentamiento= new Enfrentamientos();

        int opc;
        do{
            System.out.println("\n==============================================");
            System.out.println("                torneo de futbol                ");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar equipo.");
            System.out.println("  [2] fixture .");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");
            opc =tc.nextInt();
            System.out.println();
            switch (opc) {
                case 1:
                    System.out.println("=========================");
                    System.out.println("       AGREGAR           ");
                    System.out.println("=========================");

                    System.out.print("Cantidad de equipos: ");
                    int n = tc.nextInt();
                    for(int i = 0; i < n; i++){
                        System.out.println("\nEquipo #" + (i+1));
                        System.out.println("    NOMRBE equipo:");
                        String nombre=tc.next();
                        System.out.println("    CIUDAD: ");
                        String ciudad=tc.next();
                        Equipo equipo=new Equipo(nombre, ciudad, 0, 0);
                        enfrentamiento.agregar(equipo);
                    }

                    break;
                case 2:
                    System.out.println("=========================");
                    System.out.println("        FIXTURE          ");
                    System.out.println("=========================");
                    enfrentamiento.generarFixture();
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(opc!=0);


        tc.close();
    }
}
