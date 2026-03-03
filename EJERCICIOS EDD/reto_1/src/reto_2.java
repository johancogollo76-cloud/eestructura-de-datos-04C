import java.util.Scanner;
public class reto_2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        int[] cuentasVIP = {10, 25, 40, 80, 150};

        
        int[] cuentas = new int[5];
        double[] montos = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese numero de cuenta de la transaccion " + (i+1) + ": ");
            cuentas[i] = tc.nextInt();

            System.out.println("Ingrese monto de la transaccion " + (i+1) + ": ");
            montos[i] = tc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            if (montos[i] > 5000) {
                System.out.println("Transaccion mayor a 5000 encontrada en cuenta: " + cuentas[i]);

                boolean es_VIP = false;
                int inicio = 0;
                int fin = cuentasVIP.length - 1;
                while (inicio <= fin) {
                    int medio = (inicio + fin) / 2;

                    if (cuentasVIP[medio] == cuentas[i]) {
                        es_VIP = true;
                        break;
                    } else if (cuentas[i] < cuentasVIP[medio]) {
                        fin = medio - 1;
                    } else {
                        inicio = medio + 1;
                    }
                }

                if (!es_VIP) {
                    System.out.println("esta cuenta no esta autorizada para montos altos");
                } else {
                    System.out.println("Cuenta VIP autorizada.");
                }
            }
        }
        tc.close();
    }
    
}
