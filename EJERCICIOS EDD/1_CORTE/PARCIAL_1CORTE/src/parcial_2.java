import java.util.Scanner;
public class parcial_2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de temperaturas: ");
        int cantidad = tc.nextInt();
        double[] temperaturas= new double[cantidad];
        for (int i=0;i<temperaturas.length;i++){
            System.out.println("ingrese la temperatura del dia "+ (i+1));
            temperaturas[i]=tc.nextDouble();
        }

        imprimir_arreglo(temperaturas);
        int n =temperaturas.length;
        for (int i=0;i<n-1;i++){
            int indice_minimo = i;
            for (int j=i+1;j<n;j++) {
                if (temperaturas[j]>temperaturas[indice_minimo]) {
                    indice_minimo=j;
                }
            }


            double temp =temperaturas[indice_minimo];
            temperaturas[indice_minimo]=temperaturas[i];
            temperaturas[i]=temp;
        }   

        System.out.println("===========LISTA ORDENADA=========");
        imprimir_arreglo(temperaturas);

        System.out.println("ingrese una temperatura a buscar: ");
        double bus=tc.nextDouble();
        boolean encontrado = false;
        
        for (int i =0;i<temperaturas.length;i++) {
            
            if (temperaturas[i]==bus) {
                System.out.println("la temperatura," +temperaturas[i]+ " se encuentra dentro del array y esta en la posicion: "+(i+1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("el valor no fue encontrado");
        }

        double suma=0;
        for (int x=0;x<temperaturas.length;x++){
            suma+=temperaturas[x];
        }

        double promedio = (suma/cantidad);

        System.out.println("EL PROMEDIO DE LA TEMPERATURA DE LA SEMANA ES: "+promedio);

        




        tc.close();
    }
    public static void imprimir_arreglo(double [ ] arr) {
        for (double d :arr){
            System.out.print("["+d+"]");
        }
        System.out.println();
    }

}
