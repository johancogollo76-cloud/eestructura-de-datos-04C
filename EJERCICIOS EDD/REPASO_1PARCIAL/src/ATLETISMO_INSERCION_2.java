
//insersion
import java.util.Scanner;
public class ATLETISMO_INSERCION_2 {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de puntajes: ");
        int cantidad = tc.nextInt();

        int [] arreglo= new int[cantidad];
        for (int i =0; i<arreglo.length;i++){
            System.out.println("puntaje del intento: "+ (i+1));
            arreglo[i]=tc.nextInt();
        }
        imprimirArreglo(arreglo);
        int n_1 =arreglo.length;
        for (int i =1;i<n_1;i++){
            int clave=arreglo[i];
            int j =i-1;
            while (j>=0 && arreglo[j] < clave) {
                arreglo[j+1]=arreglo[j];
                j=j-1;
                
            }
            arreglo[j+1]=clave;
        }
        int suma=0;
        for (int x=0;x<arreglo.length;x++) {
            System.out.println((x+1)+"° lugar "+arreglo[x]);
            suma+=arreglo[x];
            
        }
        int promedio= suma/cantidad;
        System.out.println("el promedio de los puntajes es de: "+ promedio);

        System.out.println("ingrese el puntaje a buscar: ");
        int buscar= tc.nextInt();

        for (int i=0;i<arreglo.length;i++){
            if(arreglo[i]==buscar){
                System.out.println("el puntaje: " + buscar + " se encuentra en el puesto "+ (i+1));

            }   
        }


        tc.close();
    }
    public static void imprimirArreglo(int[] arr) {
        for (int d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    
    }
}
