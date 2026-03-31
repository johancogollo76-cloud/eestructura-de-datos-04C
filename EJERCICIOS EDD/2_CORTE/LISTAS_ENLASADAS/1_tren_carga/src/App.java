import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        int opc;
        Tren tren =new Tren();

        do{
            System.out.println("MENUUUUU");
            System.out.println("1.  AGREGAR VAGON");
            System.out.println("2.  CALCULAR PESO");
            System.out.println("3.  SALIR");
            System.out.println("ingrese la opcion");
            opc=tc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("AGREGAR VAGON");
                    System.out.println("ingrese el contenido: ");
                    String contenido=tc.nextLine();
                    tc.next();
                    System.out.println("ingrese el peso del vagon: ");
                    double peso=tc.nextDouble();
                    tc.nextLine();
                    System.out.println("ingrese el origen del vagon: ");
                    String origen=tc.nextLine();
                    System.out.println("ingrese el destino del vagon: ");
                    String destino= tc.nextLine();
                    Vagon nuevo_vagon=new Vagon(contenido, peso, origen, destino);
                    tren.agragarVagon(nuevo_vagon);
                    break;
                case 2:
                    System.out.println("CALCULAR PESO");
                    double peso_total= tren.calcular_peso();
                    System.out.println("el peso del vcagon es: "+peso_total+" toneladas ");
                case 3:
                    System.out.println("saliendo del modulo tren de caraga");
                    break;
            
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(opc!=0);


        tc.close();
    }
}
