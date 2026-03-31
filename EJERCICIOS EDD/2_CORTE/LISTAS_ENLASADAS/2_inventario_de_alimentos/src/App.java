
// 2. Inventario de Alimentos (Control de Caducidad)
// Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.

// La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
// El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
// Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);

        Stante stan =new Stante();

        int opc;
        do{
            System.out.println("MENUU");
            System.out.println("1.  agregar productos");
            System.out.println("2.  imprimir");
            System.out.println();
            System.out.println("0.  salir");
            opc=tc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("AGREGAR")   ;
                    System.out.println("ingrese el nombre del producto: ");
                    String nombre= tc.nextLine();
                    System.out.println("ingrese la cantiad: ");
                    int cantidad=tc.nextInt();
                    System.out.println("ingrese la can");
                    int diasParaVencer =tc.nextInt();

                    Producto producto= new Producto(nombre, cantidad, diasParaVencer);
                    stan.orden_productos(producto);
                    break;
                case 2:
                    System.out.println("IMPRIMIR");
                    stan.Imprimir();
            
                default:
                    break;
            }
        }while(opc!=0);


        tc.close();
    }
}
