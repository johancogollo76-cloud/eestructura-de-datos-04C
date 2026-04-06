// 4. Monitoreo Industrial (Sensores en Tiempo Real)
// Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

// La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) y hora (String).
// El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
// Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta registrada en el historial.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        Orden ordenar=new Orden();
        int opc;
        do{
            System.out.println("=====================");
            System.out.println("MENUU");
            System.out.println("1.  agregar listado");
            System.out.println("2.  mostrar temperatura");
            System.out.println();
            System.out.println("0.  salir");
            System.out.println("=====================");
            opc=tc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("agregar listado");
                    System.out.println("ingrese el id sensor: ");
                    int id_sensor=tc.nextInt();
                    System.out.println("ingrese la temperatura: ");
                    double temperatura=tc.nextDouble();
                    System.out.println("ingrese el presion: ");
                    double presion=tc.nextDouble();
                    System.out.println("ingrese la hora: ");
                    String hora=tc.next();
                    Lectura lecturas=new Lectura(id_sensor, temperatura, presion, hora);
                    ordenar.orden_lecturas(lecturas);
                    break;
                case 2:
                    ordenar.mayor_temperatura();

            
                default:
                    break;
            }
        }while(opc!=0);


        tc.close();
        
    }
}
