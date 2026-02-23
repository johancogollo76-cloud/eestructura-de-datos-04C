import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("hola mundo");
        System.err.println("escrba el nombre: ");
        String nombre = tc.nextLine();

        System.err.println(" escriba el peso en KG: ");
        double peso = tc.nextDouble();

        System.err.println("escriba la altura en M: ");
        double altura = tc.nextDouble();

        double imc = peso/( altura *altura);

        if (imc < 18.5){
            System.err.println(nombre);
            System.err.println(imc);
            System.err.println("BAJO DE PESO");
            
        }
        else if (imc <= 18.5 && imc <25) {
            System.err.println(nombre);
            System.err.println(imc);
            System.err.println("NORMAL");   
        }
        else if (imc <=25 && imc < 30){
            System.err.println(nombre);
            System.err.println(imc);
            System.err.println("SOBREPESO");
        }
        else if (imc >= 30 ){
            System.err.println(nombre);
            System.err.println(imc);
            System.err.println("OBESIDAD");
        }


        tc.close();
    }
    
}
