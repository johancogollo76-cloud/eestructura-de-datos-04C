// Pide dos números enteros x e y. Intercambia sus valores usando una variable auxiliar temp. Muestra los valores antes y después del intercambio.

// Datos de entrada: int x, int y

// Salida esperada:

// Antes  → x=5, y=8
// Después→ x=8, y=5
// Pista: Si asignas x = y directamente sin temp, pierdes el valor original de x.
import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        System.out.println("escribe un numero para x: ");
        int x= tc.nextInt();
        System.out.println("escribe un numero para y: ");
        int y = tc.nextInt();
        System.out.println("antes: x="+x+" y="+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("despues: x="+x+" y="+y);

        tc.close();
    }
    
}
