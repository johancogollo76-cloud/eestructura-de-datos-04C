import java.util.Scanner;
public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("nombre de un producto");
        String productos = teclado.nextLine();

        System.err.println("cantidad  a comprar del producto: ");
        int cantidad = teclado.nextInt();

        System.err.println("precio unitario del producto: ");
        double precio = teclado.nextDouble();

        double subtotal = cantidad * precio;
        double porcentaje = subtotal * 0.19;
        double total = subtotal + porcentaje;



        System.err.println("PRODUCTO   :" + productos);
        System.err.println("CANTIDAD   :" + cantidad);
        System.err.println("PRECIO C/U :" + precio);
        System.err.println("SUBTOTAL   :" + subtotal);
        System.err.println("IVA (19%)  :" + porcentaje);
        System.err.println("TOTAL      :" + total);

        teclado.close();
    }
}
