import java.util.Scanner;
public class reto {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        double[] precios = new double[5];

        for (int i =0; i<5; i++) {
            System.out.println("ingrese el precio "+ i);
            precios[i] = tc.nextDouble();
        }



        tc.close();
        
    }
}
