// 3. Navegación de Pestañas de Navegador
// Imagina un navegador donde puedes moverte entre pestañas abiertas.

// La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y horaApertura (String).
// El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual y el foco debe pasar a la pestaña anterior.
// Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por URL, la elimine de la lista y reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con la Cabeza y la Cola!).
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);
        Navegador Navegador=new Navegador();
        Pestaña pestaña_actual=null;

        int opc;
        do{
            System.out.println("********************************");
            System.out.println("             MENUUU          ");
            System.out.println("[1]     agregar pestaña");
            System.out.println("[2]     pestaña siguinete");
            System.out.println("[3]     mostar pestaña anterior");
            System.out.println("[4]     eliminar pestaña");
            System.out.println("[0]     SALIR");
            System.out.println("*********************************");
            opc=tc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("****************");
                    System.out.println("  agregar pestaña  ");
                    System.out.println("****************");
                    System.out.println("titulo de la pestaña:");
                    String nombre=tc.next();
                    System.out.println("url: ");
                    String url=tc.next();
                    System.out.println("hora de apertura: ");
                    String hora= tc.next();

                    Pestaña nueva_Pestaña=new Pestaña(nombre, url, hora);
                    Navegador.agregar_al_final(nueva_Pestaña);
                    pestaña_actual=nueva_Pestaña;
                    break;
                case 2:
                    System.out.println("*****************************");
                    System.out.println("  pestaña siguiente  ");
                    System.out.println("*****************************");
                    if(pestaña_actual!=null){
                        System.out.println("PESTAÑA ACTUAL: "+ pestaña_actual.titulo_pestaña);
                        pestaña_actual=Navegador.recorrer_adelante(pestaña_actual);
                        System.out.println("PESTAÑA SIGUIENTE: "+ pestaña_actual.titulo_pestaña);
                    }else{
                        System.out.println("NO HAY PESTAÑAS HACIA ADELANTE");
                    }
                    break;
                case 3:
                    System.out.println("*****************************");
                    System.out.println("     mostrar pestaña anterior    ");
                    System.out.println("*****************************");
                    if(pestaña_actual!=null){
                        System.out.println("PESTAÑA ACTUAL: "+ pestaña_actual.titulo_pestaña);
                        pestaña_actual=Navegador.recorrer_atras(pestaña_actual);
                        System.out.println("PESTAÑA ANTERIOR: "+ pestaña_actual.titulo_pestaña);
                    }else{
                        System.out.println("NO HAY PESTAÑAS ANTERIOR");
                    }
                    break;
                case 4:
                    System.out.println("*************************");
                    System.out.println("   eliminar pestaña    ");
                    System.out.println("*************************");
                    if(pestaña_actual != null){
                        System.out.println("Cerrando: " + pestaña_actual.titulo_pestaña);

                        pestaña_actual = Navegador.cerrar_pestana_actual(pestaña_actual.url);

                        if(pestaña_actual != null){
                            System.out.println("Nueva pestaña actual: " + pestaña_actual.titulo_pestaña);
                        } else {
                            System.out.println("No quedan pestañas abiertas");
                        }
                    } else {
                        System.out.println("No hay pestañas para cerrar");
                    }
                    break;
                

                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        }while(opc!=0);
        tc.close();
    }
}
