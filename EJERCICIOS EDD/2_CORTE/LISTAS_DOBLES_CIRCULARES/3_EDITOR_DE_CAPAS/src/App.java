// 3. Editor de Capas (Diseño Gráfico)
// Los editores gráficos organizan el diseño en capas. El usuario navega a la capa superior (siguiente) o inferior (anterior) y puede ocultar o mostrar cada capa. La estructura es circular: después de la capa más alta vuelve a la más baja.

// La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
// El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario puede moverse entre capas, alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
// Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). mostrarCapas() imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible. Simula: crea 4 capas, activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc =new Scanner(System.in);
        Editor editor=new Editor();

        int opcion;

        do {
            System.out.println("\n=====================================================");
            System.out.println("   editor de capas — Menú Principal");
            System.out.println("=======================================================");
            System.out.println("1. Agregar capa");
            System.out.println("2. bajar capa ");
            System.out.println("3. subir capa ");
            System.out.println("4. eliminar capa actual");
            System.out.println("5. mostrar capas visibles");
            System.out.println("6. mostar capas");
            System.out.println("7. cargar ejemplos de capas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            System.out.println("=======================================================");
            opcion = tc.nextInt();
            tc.nextLine();
            System.out.println();


            switch (opcion) {
                case 1:
                    System.out.println("AGREGAR CAPA");
                    System.out.println("NOMBRE: ");
                    String nombre=tc.next();
                    System.out.println("VISIBLE: ");
                    boolean visible=tc.nextBoolean();
                    System.out.println("TIPO: ");
                    String tipo =tc.next();
                    editor.agregar(nombre, visible, tipo);
                    System.out.println("CAPA "+ nombre+" AGREGADO ");
                    break;

                case 2:
                    editor.anterior();
                    break;
                case 3:
                    editor.siguiente();
                    break;
                case 4:
                    editor.eliminarCapaActual();
                    break;
                case 5:
                    editor.toggleVisibilidad();
                    break;
                case 6:
                    editor.mostrarCapas();
                    break;
                case 7:
                    editor=new Editor();
                    editor.agregar("Fondo blanco", false, "fondo");
                    editor.agregar("Personaje", false, "objeto");
                    editor.agregar("Título", true, "texto");
                    editor.agregar("Sombra", false, "objeto");
                    break;
                case 8:
                    System.out.println("saliendo");
                    break;

            
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(opcion!=0);



        tc.close();
    }
}
