import java.util.Scanner;
public class reto_1 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        double[] precios = new double[5];

        for (int i =0; i<precios.length; i++) {
            System.out.println("ingrese el precio "+ (i+1));
            precios[i] = tc.nextDouble();
        }
        double mayor =0;
        double suma=0;
        for (int i=0;i<precios.length;i++) {
            if (precios[i]> mayor) {
                mayor =precios[i];
            }
            suma+=precios[i];
        }
        System.out.println("la suma de los precios es de: "+suma);
        System.out.println("el valor mas alto es: "+ mayor);
        if ( suma >=2000) {
            double new_valor=suma-2000;
            System.out.println( "ha obtenido un descuento de 2000 pesos");
            System.out.println(new_valor);
        }

        tc.close();
    }
    
}
