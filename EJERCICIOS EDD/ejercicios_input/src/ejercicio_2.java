// Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

// Fórmulas:

// F = (C × 9/5) + 32
// K = C + 273.15
// Dato de entrada: double temperatura en Celsius

// Salida esperada:

// 25.0 °C = 77.0 °F = 298.15 K

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
