// Reto 2: Contar los Nodos
// A diferencia de los arreglos, que tienen la propiedad .length, en las listas enlazadas simples por lo general no sabemos la cantidad de elementos a menos que la contemos, o que llevemos una variable contadora.

// Tu misión: Implementa el método public int contarNodos() en tu clase ListaEnlazada. Este método debe recorrer toda la lista, sumando 1 por cada nodo que visite, y retornar el total de elementos. Pruébalo en tu método main insertando diferentes cantidades de elementos y mostrando el resultado por consola.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc=new Scanner(System.in);
        Contar contador=new Contar();
        int opc;
        do{
            System.out.println("MENUUUUUUU");
            System.out.println("1.  agregar numero");
            System.out.println("2.  contar numeros");
            System.out.println("0.  salir");
            opc=tc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("agregar numeros: ");
                    int numeros=tc.nextInt();
                    Numeros num=new Numeros(numeros);
                    contador.agregar_numeros(num);
                    
                    break;
                case 2:
                    System.out.println("contar numeros");
                    contador.contar_numeros();
            
                default:
                    break;
            }
        }while(opc!=0);


        tc.close();
    }
}
