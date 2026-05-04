import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        Reproduccion reproduccion = new Reproduccion();

        int opcion;

        do{

            System.out.println("============================================");
            System.out.println("*****************MENUUUU********************");
            System.out.println("");
            System.out.println("1.  AGREGAR CANCION al inicio");
            System.out.println("1.  AGREGAR CANCION al final");
            System.out.println("3.  siguiente foto");
            System.out.println("4.  cancion anterior");
            System.out.println("5.  eliminar cancion actual");
            System.out.println("");
            System.out.println("");
            System.out.println("============================================");
            System.out.println("ESCOJA");
            opcion = tc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("AGREGAR");
                    System.out.println("titulo: ");
                    String titulo=tc.next();
                    System.out.println("artista: ");
                    String artista= tc.next();
                    System.out.println("duracion en minutos");
                    int duracion =tc.nextInt();
                    System.out.println("genero: ");
                    String genero= tc.next();
                    reproduccion.agregar_inicio(titulo, artista, duracion, genero);
                    
                    break;
                case 2:
                    System.out.println("AGREGAR");
                    System.out.println("titulo: ");
                    String titulo2=tc.next();
                    System.out.println("artista: ");
                    String artista2= tc.next();
                    System.out.println("duracion en minutos");
                    int duracion2 =tc.nextInt();
                    System.out.println("genero: ");
                    String genero2= tc.next();
                    reproduccion.agregar_final(titulo2, artista2, duracion2, genero2);
                    break;
                case 3:
                    reproduccion.siguiente();
                    System.out.println("avanzando...");
                    break;
                case 4:
                    reproduccion.anterior();
                    System.out.println("retrocediendo...");
                    break;
                case 5:
                    reproduccion.eliminarActual();
                    System.out.println("eliminado");
                    break;

            
                default:
                    break;
            }

        }while(opcion!=0);




        tc.close();

    }
}
