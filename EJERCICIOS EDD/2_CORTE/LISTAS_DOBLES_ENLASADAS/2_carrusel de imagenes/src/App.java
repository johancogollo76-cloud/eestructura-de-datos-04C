// 2. Carrusel de Imágenes (Galería Interactiva)
// Simula el comportamiento de una galería de fotos en una aplicación móvil.

// La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y resolucion (String).
// El Problema: El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". Si llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
// Reto: Crea un método reproducirGaleria() que recorra toda la lista hacia adelante y luego toda la lista hacia atrás para mostrar todas las fotos.

// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);
        Galeria galeria=new Galeria();
        Fotografia foto_actual=null;

        int opc;
        do{
            System.out.println("********************************");
            System.out.println("             MENUUU          ");
            System.out.println("[1]     agregar foto");
            System.out.println("[2]     mostrar foto de adelante");
            System.out.println("[3]     mostar foto anterior");
            System.out.println("[4]     reproducir galeria");
            System.out.println("[0]     SALIR");
            System.out.println("*********************************");
            opc=tc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("****************");
                    System.out.println("  agregar foto  ");
                    System.out.println("****************");
                    System.out.println("nombre de la imagen:");
                    String nombre=tc.next();
                    System.out.println("tamaño: ");
                    double tamañoMB=tc.nextDouble();
                    System.out.println("resolucion: ");
                    String resolucion= tc.next();

                    Fotografia nueva_foto=new Fotografia(nombre, tamañoMB, resolucion);
                    galeria.agregar_al_final(nueva_foto);
                    foto_actual=nueva_foto;
                    break;
                case 2:
                    System.out.println("*****************************");
                    System.out.println("  mostrar foto de adelante  ");
                    System.out.println("*****************************");
                    if(foto_actual!=null){
                        System.out.println("FOTO ACTUAL: "+ foto_actual.nombre_archivo);
                        foto_actual=galeria.recorrer_adelante(foto_actual);
                        System.out.println("FOTO SIGUIENTE: "+ foto_actual.nombre_archivo);
                    }else{
                        System.out.println("NO HAY FOTOS HACIA ADELANTE");
                    }
                    break;
                case 3:
                    System.out.println("*****************************");
                    System.out.println("     mostrar foto anterior    ");
                    System.out.println("*****************************");
                    if(foto_actual!=null){
                        System.out.println("FOTO ACTUAL: "+ foto_actual.nombre_archivo);
                        foto_actual=galeria.recorrer_atras(foto_actual);
                        System.out.println("FOTO ANTERIOR: "+ foto_actual.nombre_archivo);
                    }else{
                        System.out.println("NO HAY FOTOS ANTERIOR");
                    }
                    break;
                case 4:
                    System.out.println("*************************");
                    System.out.println("   reproducir galeria    ");
                    System.out.println("*************************");
                    galeria.reproducirGaleria();

                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        }while(opc!=0);
        tc.close();
    }
}
