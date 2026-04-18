// 4. Gestión de Mesas en Restaurante (Lista de Espera Circular)
// Un restaurante popular tiene un sistema de lista de espera. Cuando una mesa se libera, el siguiente grupo en espera ocupa el turno y pasa al final del ciclo por si quiere pedir la carta nuevamente (para clientes VIP).

// La Clase Grupo (Nodo): Debe contener nombreReserva (String), numeroDPersonas (int), esVip (boolean) y minutosEsperando (int).
// El Problema: Los grupos normales se atienden y salen de la lista. Los grupos VIP, al ser atendidos, vuelven al final de la lista circular para una segunda ronda de atención. El sistema debe atender un grupo por turno.
// Reto: Implementa el método atenderSiguiente() que tome el grupo de la cabeza, muestre su información, y si esVip == true, lo reinserté al final; si no, lo elimine. Muestra el estado de la lista después de cada atención. Llama al método 6 veces para simular la dinámica del restaurante.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        Orden orden=new Orden();

        int opc;
        do{
            System.out.println("\n==============================================");
            System.out.println("                gestor de mesas                ");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar reerva.");
            System.out.println("  [2] atender .");
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
                    System.out.println("    NOMRBE RESERVA:");
                    String nombre=tc.next();
                    System.out.println("    NUMERO DE PERSONAS: ");
                    int numeroDePersonas=tc.nextInt();
                    System.out.println("    ES VIP?: ");
                    boolean esVip=tc.nextBoolean();
                    System.out.println("    MINUTOS ESPERANDO: ");
                    int minutosEsperando=tc.nextInt();
                    Grupo grupos=new Grupo(nombre, numeroDePersonas, esVip, minutosEsperando);
                    orden.agregar(grupos);                    
                    break;
                case 2:
                    System.out.println("=========================");
                    System.out.println("        ATENDER          ");
                    System.out.println("=========================");
                    orden.atenderSiguiente();
                    break;

                case 3: 
                    System.out.println("========================="); 
                    System.out.println(" SIMULACIÓN ");
                    System.out.println("=========================");
                    System.out.println("cantidad de turnos");
                    int cantidad=tc.nextInt();
                    for(int i = 0; i < cantidad; i++){ 
                        System.out.println("\n--- Turno " + (i+1) + " ---");
                        orden.atenderSiguiente(); 
                    }
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(opc!=0);


        tc.close();
    }
}
