// ### Ejercicio 2 — Calculadora de una tienda
// Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

// - Precio unitario de un producto (`double`)
// - Cantidad comprada (`int`)
// - Descuento aplicado en porcentaje (`double`)
// - Total a pagar después del descuento

// Declara las variables, realiza el cálculo y muestra el resultado por consola.

public class e2{
    public static void main(String[] args) {
        int precio= 2500;
        int cantidad= 3;
        double descuento =10;

        int subtotal = precio * cantidad;
        double porcentaje = 0.10;
        double total = subtotal-porcentaje;
        System.out.println("===RECIVO===");
        System.out.println("PRECIO   : " + precio);
        System.out.println("CANTIDAD : "+  cantidad);
        System.out.println("DESCUENTO: " + descuento+"%");
        System.out.println("SUBTOTAL : " + subtotal);
        System.out.println("TOTAL    : " + total);

    






        


    }
}