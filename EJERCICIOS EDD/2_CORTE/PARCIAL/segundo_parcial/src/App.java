import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        Terminal terminal = new Terminal();
        int opcion;
        do {
            System.out.println("\n==============================================");
            System.out.println("   comando terminal — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar comando");
            System.out.println("2. anterior");
            System.out.println("3. siguiente");
            System.out.println("4. eliminar cursor actual");
            System.out.println("5.  mostrar actual");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = tc.nextInt();
            tc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Texto: ");
                    String texto=tc.next();
                    System.out.println("hora: ");
                    String hora =tc.next();
                    terminal.agregar_comando(texto, hora);
                    System.out.println("COMANDO"+ texto+" AGREGADO ");
                    break;
                case 2:
                    terminal.anterior();
                    System.out.println("retrosediendo...");
                    
                    break;
                case 3:
                    terminal.siguiente();
                    System.out.println("avansando...");
                    break;
                case 4:
                    terminal.eliminarActual();
                    System.out.println("    COMANDO ELIMINADO");
                    break;
                case 5:
                    terminal.mostrarcomando();
                    break;
                
                default:
                    break;
            }
        }while (opcion!=0);






        tc.close();

    }
}
