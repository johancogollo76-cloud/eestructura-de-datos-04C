// . Historial de Comandos de Terminal
// Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando anterior; flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

// La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio (String — el path desde donde se ejecutó).
// El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
// Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo con el cursor marcado.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);
        Lista_comando lista=new Lista_comando();

        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   comando terminal — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar comando");
            System.out.println("2. anterior");
            System.out.println("3. siguiente");
            System.out.println("4. eliminar cursr actual");
            System.out.println("5. cargar ejemplos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = tc.nextInt();
            tc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("TITULO DEL COMANDO: ");
                    String texto=tc.next();
                    System.out.println("ES EXITOSO?");
                    boolean exitoso=tc.nextBoolean();
                    System.out.println("DIRECTORIO: ");
                    String directorio =tc.next();
                    lista.agregar_comando(texto, exitoso, directorio);
                    System.out.println("COMANDO"+ texto+" AGREGADO ");
                    break;
                case 2:
                    lista.anterior();
                    
                    break;
                case 3:
                    lista.siguiente();
                    break;
                case 4:
                    lista.eliminarActual();
                    System.out.println("    COMANDO ELIMINADO");
                    break;
                case 5:
                    lista=new Lista_comando();
                    lista.agregar_comando("nano_notas.txt", true, "/home/user");
                    lista.agregar_comando("python_app.py", false, "/home/user/proyecto");
                    lista.agregar_comando("clear", true, "/home/user");
                    lista.agregar_comando("cd ..", true, "/home");
                    lista.agregar_comando("pwd", true, "/home/user");
                                
            
                default:
                    break;
            }
        }while (opcion!=0);
        tc.close();
    }
}
