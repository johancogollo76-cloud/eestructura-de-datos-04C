import java.util.Scanner;
public class CONTROL_NOTAS {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de notas: ");
        int cantidad = tc.nextInt();
        double[] notas= new double[cantidad];
        for (int i=0;i<notas.length;i++){
            System.out.println("ingrese la nota "+ (i+1));
            notas[i]=tc.nextDouble();
        }

        imprimirArreglo(notas);

        double max=0;
        double min=notas[0];
        for (int i=0;i<notas.length;i++) {
            if(notas[i]>max){
                max=notas[i];
            }
            else if(notas[i]<min){
                min=notas[i];
            }
        }
        System.out.println("    INFORME ACADEMICO   ");
        System.out.println("el puntaje mas alto es: "+max);
        System.out.println("el puntaje mas bajo es: "+min);


        int n =notas.length;
        for (int i=0;i<n-1;i++){
            int indice_minimo = i;
            for (int j=i+1;j<n;j++) {
                if (notas[j]<notas[indice_minimo]) {
                    indice_minimo=j;
                }
            }

            double temp =notas[indice_minimo];
            notas[indice_minimo]=notas[i];
            notas[i]=temp;
        }
        System.out.println("LISTA DE NOTAS ORDENADAS");
        imprimirArreglo(notas);
        tc.close();
    }
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
    
}
