// Pide al usuario 4 precios para llenar un arreglo precios[]. Crea preciosAuditoria = precios (misma referencia). Pide al usuario el índice y el nuevo precio para hacer una corrección desde preciosAuditoria. Muestra ambos arreglos y verifica que el cambio se refleja en los dos.

// Datos de entrada: double × 4 precios, int índice, double nuevo precio
import java.util.Scanner;
public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        double[] precios = new double[4];
        for (int i=0; i<precios.length ;i++) {
            System.out.println("ingresa el precio "+ (i+1));
            precios[i]=  tc.nextDouble();
        }
        double [] preciosAuditoria= precios;
        System.out.println("escribe el indice : ");
        int indice = tc.nextInt();
        System.out.println("escribe el nuevo precio: ");
        double new_precio = tc.nextDouble();
        preciosAuditoria[indice] = new_precio;
        System.out.println("precios");
        for (int i =0; i<precios.length;i++) { 
            System.out.println(precios[i]);
        }
        System.out.println(" ");
        System.out.println("precios autoria");
        for (int i =0; i<preciosAuditoria.length;i++) { 
            System.out.println(preciosAuditoria[i]);
        }
        
        tc.close();
    }
    
}
