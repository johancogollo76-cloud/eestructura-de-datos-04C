// Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.

// El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día". Si no está, se le niega la entrada.
// Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada.
import java.util.Scanner;
public class ejer_4 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        boolean pasar = false;
        double [] pagos_al_dia = new double[9999];
        for (int i=0;i<pagos_al_dia.length;i++){
            pagos_al_dia[i]=1000+i;
        }
        System.out.println("ingrese el codigo  (1000-9999): ");
        int objetivo= tc.nextInt();
        int inicio=0;
        int fin = pagos_al_dia.length -1;
        while (inicio<=fin) {
            int meedio =(inicio+fin)/2;
            if(pagos_al_dia[meedio]==objetivo) {
                System.out.println("el pago del codigo, "+ objetivo+" ha sido realizado");
                pasar=true;
                break;
            }
            else if (objetivo < pagos_al_dia[meedio]) {
                fin = meedio-1;
            }
            else {
                inicio = meedio +1;
            }
        }
        if (!pasar) {
            System.out.println("el codigo, "+ objetivo+ " del cliente no esta pago, por lo que se le niega la entrada");
        }

        tc.close();
    }
    
}
