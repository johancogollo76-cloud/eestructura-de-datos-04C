// Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. El último camión en entrar debe ser obligatoriamente el primero en salir para permitir que los demás se retiren.


// La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
// El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones físicamente (solo consultando la estructura).
// Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y calcule la suma total de cargaToneladas de todos los camiones estacionados.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Logistica logistica= new Logistica();

        int opcion;
        do {
            System.out.println("\n--- SISTEMA CONTROL DE CAMIONES (PILAS) ---");
            System.out.println("1. Ver los camiones");
            System.out.println("2. Registrar nuevo camion (Push)");
            System.out.println("3. Retirar camion del tope (Pop)");
            System.out.println("4. Contar carga");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la pila:");
                    logistica.imprimir();
                    break;
                case 2:
                    System.out.print("placa camion: "); String placa = sc.nextLine();
                    System.out.print("conductor: "); String conductor = sc.nextLine();
                    System.out.print("peso de la carga"); double pesoCarga = sc.nextDouble();
                    sc.nextLine();
                    
                    logistica.push(new Camion(placa, conductor, pesoCarga));
                    System.out.println("camion apilado correctamente.");
                    break;
                case 3:
                    Camion retirado = logistica.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("está vacío.");
                    }
                    break;
                case 4:
                    logistica.calcular_peso();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
        sc.close();
    }
}
