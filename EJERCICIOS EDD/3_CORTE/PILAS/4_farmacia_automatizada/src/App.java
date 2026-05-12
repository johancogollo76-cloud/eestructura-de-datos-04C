// En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales. El personal introduce las cajas por la parte superior y las retira de la misma forma (el último lote en llegar es el primero en ser despachado).

// La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
// El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
// Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de vencer, debe ser retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope sea un medicamento seguro o la pila quede vacía.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Farmacia farmacia = new Farmacia();

        int opcion;
        do {
            System.out.println("\n--- SISTEMA CONTROL DE MEDICAMENTOS    (PILAS) ---");
            System.out.println("1. Ver los medicamentos");
            System.out.println("2. Registrar nuevo medicamento (Push)");
            System.out.println("3. Retirar medicamento del tope (Pop)");
            System.out.println("4. validar estado de medicamentos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la pila:");
                    farmacia.imprimir();
                    break;
                case 2:
                    System.out.print("nombre: "); String nombre = sc.nextLine();
                    System.out.print("lote: "); String lote = sc.nextLine();
                    System.out.print("dias para vencer"); int diasParaVencer = sc.nextInt();
                    sc.nextLine();
                    
                    farmacia.push(new Medicamento(nombre, lote, diasParaVencer));
                    System.out.println("Medicamento apilado correctamente.");
                    break;
                case 3:
                    Medicamento retirado = farmacia.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("está vacío.");
                    }
                    break;
                case 4:
                    farmacia.validarDespacho();
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
