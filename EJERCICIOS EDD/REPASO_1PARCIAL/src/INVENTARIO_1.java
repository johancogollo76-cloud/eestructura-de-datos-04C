
import java.util.Scanner;
public class INVENTARIO_1 {



    public static class Producto {
        
        public int id;
        public String nombre;
        public double precio;
        public int stok;


    public Producto( int id, String nombre, double precio, int stok){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.stok=stok;
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        

        System.out.println("ingrese la cantidad de productos: ");
        int cantidad = tc.nextInt();
        Producto[] productos = new Producto[cantidad];
        for (int i =0; i<productos.length;i++) {
            System.out.println("ingrese el id del producto "+ (i+1));
            int id= tc.nextInt();
            tc.nextLine();
            System.out.println("ingrese el nombre del producto: ");
            String nombre= tc.nextLine();
            System.out.println("ingrese el precio del producto: ");
            double precio = tc.nextDouble();
            System.out.println("ingrese la cantidad de stok: ");
            int stok = tc.nextInt();
            productos[i] = new Producto(id, nombre, precio, stok);

        }
        int n = productos.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Producto temp = productos[i];
                int j;
                for (j = i; j >= gap && productos[j - gap].id > temp.id; j -= gap) {
                    productos[j] = productos[j - gap];
                }
                productos[j] = temp;
            }
        }

        for (Producto p : productos) {
            p.imprimir();
            
        }

        System.out.println("ingrese el id que desea buscar: ");
        int buscar = tc.nextInt();

        int inicio = 0;
        int fin = productos.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (productos[medio].id == buscar) {
                System.out.println("el producto fue encontrado en la posicion: " + medio);
                encontrado = true;
                break;
            } 
            else if (buscar < productos[medio].id) {
                fin = medio - 1;
            } 
            else {
                inicio = medio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("producto no encontrado.");
        }





        tc.close();
    }


    
    

    public void imprimir(){
        System.out.println("id: "+ this.id+" nombre: "+ this.nombre+" precio: "+ this.precio+ " stok: "+this.stok);
    }


    }
}
