import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.err.println("escriba los grados en celsius");
        double c = tc.nextDouble();

        double f = (c * 9/5) +32;
        double k = c + 273.15;

        System.err.println(c+"°C " +"= "+f+"°F "+ "= "+k+"°K");







        tc.close();
    }
}
