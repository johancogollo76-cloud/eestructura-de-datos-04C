// Un sensor industrial registra temperaturas. El sistema recibe:

// Temperatura actual en Celsius (double)
// Nombre del sensor (String)
// Número de lectura (int)
// Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
// Imprime el estado del sensor con todos sus datos.

public class e3 {
    public static void main(String[] args) {
        
        double celsius= 25;
        double f = (celsius * 9/5) +32;
        double k = celsius + 273.15;

        System.err.println(celsius+"°C " +"= "+f+"°F "+ "= "+k+"°K");
    }
    
}
