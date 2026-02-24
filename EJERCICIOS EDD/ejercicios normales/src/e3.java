// Un sensor industrial registra temperaturas. El sistema recibe:

// Temperatura actual en Celsius (double)
// Nombre del sensor (String)
// Número de lectura (int)
// Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
// Imprime el estado del sensor con todos sus datos.

public class e3 {
    public static void main(String[] args) {
        
        boolean enAlarma;
        double celsius= 50;
        double f = (celsius * 9/5) +32;
        double k = celsius + 273.15;
        

        if (celsius>=80) {
            enAlarma = true;
        }
        else {
            enAlarma = false;
        }
        System.out.println(celsius+"°C " +"= "+f+"°F "+ "= "+k+"°K");
        System.out.println("enalarma: " + enAlarma);
    }
    
    
}
