import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Control control = new Control();

        int opcion;
        do {
            System.out.println("\n--- SISTEMA CONTROL DE CALIDAD (PILAS) ---");
            System.out.println("1. Ver las piezas");
            System.out.println("2. Registrar nueva pieza (Push)");
            System.out.println("3. Retirar pieza del tope (Pop)");
            System.out.println("4. Contar piezas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la pila:");
                    control.imprimir();
                    break;
                case 2:
                    System.out.print("nombre pieza: "); String nombre = sc.nextLine();
                    System.out.print("numero serie: "); String numero = sc.nextLine();
                    System.out.print("es defectuosa"); boolean es_defectuoso = sc.nextBoolean();
                    sc.nextLine();
                    
                    control.push(new Pieza(nombre, numero, es_defectuoso));
                    System.out.println("Contenedor apilado correctamente.");
                    break;
                case 3:
                    Pieza retirado = control.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("El Control está vacío.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de la empresa a consultar: ");
                    String empresaBusqueda = sc.nextLine();
                    int total = control.contarPor_pieza(empresaBusqueda);
                    System.out.println("Resultado: Se encontraron " + total + " contenedores de la empresa " + empresaBusqueda);
                    break;
                case 5:
                    control.limpiarHastaDefecto();
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);


        sc.close();
    }
}
