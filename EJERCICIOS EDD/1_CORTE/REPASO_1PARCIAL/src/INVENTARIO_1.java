// //sell short y busqueda binaria 
// Ejercicio 1: Inventario "TecnoStore" (Shell Sort)
// Objetivo: Registrar productos y ordenarlos por su ID para realizar búsquedas rápidas.
// ¿Qué debes hacer?
// 1. Clase: Crea una clase Producto con: id (int), nombre (String), precio (double) y stock (int).
// 2. Entrada de Datos: Pide al usuario que ingrese los datos de 5 productos por teclado y guárdalos en un arreglo
// Producto[] .
// 3. Ordenamiento: Usa Shell Sort para ordenar los productos de menor a mayor según su id .
// 4. Búsqueda: Pide un id al usuario y búscalo usando Búsqueda Binaria.
// Ejemplo de lo que se debe ver en consola:
// --- REGISTRO DE PRODUCTOS ---
// Producto 1:
// Ingrese ID: 105
// Ingrese Nombre: Mouse
// Ingrese Precio: 25.50
// Ingrese Stock: 10
// ... (se repite hasta completar los 5 productos) ...
// --- INVENTARIO ORDENADO POR ID (Shell Sort) ---
// ID: 101 | Nombre: Laptop | Precio: 850.0 | Stock: 5
// ID: 102 | Nombre: Teclado | Precio: 45.0 | Stock: 12
// ID: 105 | Nombre: Mouse | Precio: 25.5 | Stock: 10
// ...
// --- BÚSQUEDA DE PRODUCTO ---
// Ingrese el ID a buscar: 102
// >> PRODUCTO ENCONTRADO: Teclado - Precio: $45.0 - Stock: 12
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
        //shell short 
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
        //busqueda binaria
        int inicio = 0;
        int fin = productos.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (productos[medio].id == buscar) {
                System.out.println("el producto fue encontrado en la posicion: " + medio);
                productos[medio].imprimir();
                

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





