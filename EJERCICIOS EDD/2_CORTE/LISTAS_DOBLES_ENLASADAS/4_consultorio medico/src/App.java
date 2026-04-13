// 4. Turnos de Consultorio Médico (Prioridad de Emergencia)
// Gestiona una fila de pacientes donde algunos pueden tener emergencias.

// La Clase Paciente (Nodo): Debe contener nombre (String), edad (int) y nivelUrgencia (1 al 5).
// El Problema: Los pacientes normalmente se agregan al final. Pero si un paciente tiene nivelUrgencia == 5, debe ser movido justo después de la Cabeza.
// Reto: Implementa un método que recorra la lista desde la Cola hacia la Cabeza para encontrar al paciente de mayor edad y mostrar sus datos.

import java.util.Scanner;

public class App {  
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);
        int opcion;
        Atencion consultorio = new Atencion();

        do {
            System.out.println("\n==============================================");
            System.out.println("         Turnos Consultorio Medico");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar paciente.");
            System.out.println("  [2] Mostrar paciente de mayor edad.");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = tc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre:");
                    String nombre = tc.next();

                    System.out.println("Ingrese edad:");
                    int edad = tc.nextInt();

                    System.out.println("Ingrese nivel de urgencia (1-5):");
                    int urgencia = tc.nextInt();

                    Paciente nuevo = new Paciente(nombre, edad, urgencia);
                    consultorio.agregar_pacientes(nuevo);
                    break;

                case 2:
                    consultorio.paciente_mayor_edad();
                    break;

                case 0:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);





        tc.close();
    }
}
