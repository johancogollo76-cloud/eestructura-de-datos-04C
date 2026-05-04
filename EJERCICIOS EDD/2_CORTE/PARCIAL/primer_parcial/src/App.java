
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc =new Scanner(System.in);
        Almacen almacen =new Almacen();

        int opcion;
        do{
            System.out.println("===========================");
            System.out.println("********MENUU**************");
            System.out.println("1.  AGREGAR");
            System.out.println("2.  EDITAR");
            System.out.println("3.  LISTAR");
            System.out.println("");

            System.out.println("elija: ");
            System.out.println("===========================");
            opcion=tc.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    System.out.println("***********");
                    System.out.println("AGREGAR");
                    System.out.println("***********");
                    System.out.println("codigo: ");
                    String codigo = tc.next();
                    System.out.println("nombre: ");
                    String nombre = tc.next();
                    System.out.println("cantidad: ");
                    int cantidad= tc.nextInt();
                    System.out.println("precio: ");
                    double precio=tc.nextDouble();
                    Producto producto= new Producto(codigo, nombre, cantidad, precio);
                    almacen.agragar(producto);
                    break;
                case 2:
                    System.out.println("***********");
                    System.out.println("BUSCAR");
                    System.out.println("***********");
                    System.out.println("ingrese el codigo a buscar: ");
                    String nuevocodigo = tc.next();
                    System.out.println("ingrese la cantidad");
                    int cantidadnueva= tc.nextInt();
                    almacen.buscar_editar(nuevocodigo, cantidadnueva);
                    break;
                case 3:
                    System.out.println("***********");
                    System.out.println("LISTAR");
                    System.out.println("***********");
                    almacen.listar();
                    break;


                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(opcion!=0);

        tc.close();
    }
}
