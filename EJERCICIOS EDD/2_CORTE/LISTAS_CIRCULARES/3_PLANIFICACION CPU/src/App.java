// 3. Planificador de CPU (Algoritmo Round Robin)
// Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador entre varios procesos de forma justa: cada proceso recibe un pequeño intervalo de tiempo llamado quantum. Si no termina, espera su siguiente turno.

// La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y prioridad (int - del 1 al 3).
// El Problema: El planificador debe recorrer la lista circular en bucle. En cada turno, descuenta el quantum del tiempoRestante del proceso actual. Cuando tiempoRestante <= 0, el proceso termina y se elimina de la lista.
// Reto: Implementa el método ejecutar(int quantum) que simule el planificador. Imprime en cada turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. El ciclo debe terminar cuando la lista quede vacía. Al final, imprime el orden en que terminaron los procesos.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);
        Lista_procesos lista=new Lista_procesos();
        int opc;
        do {
            System.out.println("\n***********MENUU*******");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar procesos");
            System.out.println("3. Mostrar procesos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opc = tc.nextInt();
            tc.nextLine();
            switch (opc) {

                case 1:
                    System.out.print("Nombre del proceso: ");
                    String nombre = tc.nextLine();
                    System.out.print("PID: ");
                    int pid = tc.nextInt();
                    System.out.print("Tiempo restante: ");
                    int tiempo = tc.nextInt();
                    System.out.print("Prioridad (1-3): ");
                    int prioridad = tc.nextInt();
                    tc.nextLine();
                    Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);
                    lista.agregar_proceso(nuevo);
                    System.out.println("Proceso agregado correctamente");
                    break;

                case 2:
                    System.out.print("Ingrese el quantum: ");
                    int quantum = tc.nextInt();
                    tc.nextLine();
                    lista.ejecutar(quantum);
                    break;
                case 3:
                    lista.mostrar_procesos();
                    break;
                case 0:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opc != 0);





        tc.close();
    }
}
