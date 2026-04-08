import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int opc;
        // Orden fila = new Orden();
        Orden fila =new Orden();

        do {
            System.out.println("=======================================");
            System.out.println("           Menu de opciones            ");
            System.out.println("=======================================");
            System.out.println("1- Agregar vuelos.");
            System.out.println("2- Imprimir vuelos.");
            System.out.println("3- Emergencia.");
            System.out.println("0- Salir.");
            System.out.println("=======================================");
            System.out.print("Elija una opcion: ");
            opc = tc.nextInt();
            tc.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese el número de vuelo: ");
                    String numeroVuelo = tc.nextLine();

                    System.out.print("Ingrese la aerolínea: ");
                    String aerolinea = tc.nextLine();

                    System.out.print("Ingrese el combustible restante: ");
                    int combustible = tc.nextInt();

                    System.out.print("Ingrese la cantidad de pasajeros: ");
                    int pasajeros = tc.nextInt();
                    tc.nextLine();

                    Vuelos vuelo = new Vuelos(numeroVuelo, aerolinea, combustible, pasajeros);

                    if (combustible < 10) {
                        fila.insertarAlInicio(vuelo);
                        System.out.println("Vuelo con bajo combustible agregado al inicio.");
                    } else {
                        fila.agregarVuelo(vuelo);  // Cambiado a nombre estándar
                        System.out.println("Vuelo agregado al final.");
                    }
                    break;

                case 2:
                    fila.imprimir();  // Cambiado a minúscula (estándar Java)
                    break;

                case 3:
                    System.out.print("Ingrese el número de vuelo para emergencia: ");
                    String numeroBuscar = tc.nextLine();
                    fila.reportarEmergencia(numeroBuscar);
                    System.out.println("Vuelo movido al inicio por emergencia.");
                    break;

                case 0:
                    System.out.println("=================================================");
                    System.out.println(" Cerrando programa......");
                    System.out.println("=================================================");
                    break;

                default:
                    System.out.println("=================================================");
                    System.out.println(" Opcion Invalida, elija nuevamente.");
                    System.out.println("=================================================");
                    break;
            }

            System.out.println();

        } while (opc != 0);

        tc.close();
    }
}