// Un equipo de rescatistas entra en una cueva inexplorada. Para no perderse, van dejando "Estaciones de Seguridad" representadas por una baliza que registra los datos del entorno.

// La Clase Estacion (Nodo): Debe contener nombrePunto (String), profundidad (int) y nivelOxigeno (double).
// El Problema: Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso al que fueron colocadas (de la más profunda a la entrada).
// Reto: Implementa el método retrocederASuperficie(). Este debe mostrar el nombre de cada estación a medida que se desapila. Importante: Si en alguna estación el nivelOxigeno es inferior al 18%, el sistema debe imprimir una alerta de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Rescate rescate= new Rescate();

        int opcion;
        do {
            System.out.println("\n--- SISTEMA CONTROL DE CAMIONES (PILAS) ---");
            System.out.println("1. Ver los camiones");
            System.out.println("2. Registrar nuevo camion (Push)");
            System.out.println("3. Retirar camion del tope (Pop)");
            System.out.println("4. retroceder a superficie");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la pila:");
                    rescate.imprimir();
                    break;
                case 2:
                    System.out.print("nombre: "); String nombre = sc.nextLine();
                    System.out.print("profundidad: "); int profundidad = sc.nextInt();
                    System.out.print("nivel oxigeno"); double nivelOxigeno = sc.nextDouble();
                    sc.nextLine();
                    
                    rescate.push(new Estacion(nombre, profundidad, nivelOxigeno));
                    System.out.println("camion apilado correctamente.");
                    break;
                case 3:
                    Estacion retirado = rescate.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("está vacío.");
                    }
                    break;
                case 4:
                    rescate.retrocederASuperficie();
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
