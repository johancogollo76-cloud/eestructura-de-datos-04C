import java.util.Scanner;
public class parcial_1 {

    public static class Libro {
        
        public int codigo;
        public String titulo;
        public int paginas;


    public Libro( int codigo, String titulo, int paginas){
        this.codigo=codigo;
        this.titulo=titulo;
        this.paginas=paginas;
    }

    public void imprimir(){
        System.out.println("codigo: "+ this.codigo+" titulo: "+ this.titulo+" paginas: "+ this.paginas);
    }





    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de libros: ");
        int cantidad = tc.nextInt();

        Libro[] libros = new Libro[cantidad];

        for (int i =0; i<libros.length;i++) {
            System.out.println("ingrese el codigo del libro "+ (i+1));
            int codigo= tc.nextInt();
            tc.nextLine();
            System.out.println("ingrese el titulo del libro: ");
            String titulo= tc.nextLine();
            System.out.println("ingrese la cantidad de paginas: ");
            int paginas = tc.nextInt();
            libros[i] = new Libro(codigo, titulo, paginas);
        }

        for (Libro p : libros) {
            p.imprimir();
            
        }
        //ordenar
        
        for (int i=1; i < libros.length; i++) {
        Libro clave=libros[i];
        int j=i-1;
            while (j>=0 && libros[j].codigo > clave.codigo) {
                libros[j+1] = libros[j];
                j=j-1;
            }
            libros[j+1] = clave;
        }

        System.out.println("===================LISTA ORRDENADA================");

        for (Libro p : libros) {
            p.imprimir();
        }

        System.out.println("inghrese un codigo a buscar: ");
        int buscar = tc.nextInt();
        //buscar
        int inicio = 0;
        int fin = libros.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (libros[medio].codigo == buscar) {
                System.out.println("el libro fue encontrado en la posicion: " + (medio+1)+" titulo: "+ libros[medio].titulo);
                

                encontrado = true;
                break;
            } 
            else if (buscar < libros[medio].codigo) {
                fin = medio - 1;
            } 
            else {
                inicio = medio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("libro no encontrado.");
        }


        int min = libros[0].paginas;
        for (int i =0;i<libros.length;i++){
            if (libros[i].paginas < min) {
                min=libros[i].paginas;
            }
        }
        System.out.println("el libro que menos tiene paginas tiene "+min);






        tc.close();
    }
}
    }

