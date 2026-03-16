//En teoría de números, los enteros positivos pueden clasificarse según la relación entre el número
//  y la suma de sus divisores propios.
//
//Los divisores propios de un número son todos los números positivos que lo dividen exactamente sin
//  incluir el mismo número.
//
//Por ejemplo, los divisores propios de 12 son:
//
//1, 2, 3, 4 y 6
//
//La suma de estos divisores es:
//
//1 + 2 + 3 + 4 + 6 = 16
//
//Dependiendo de la relación entre el número y la suma de sus divisores propios, se obtienen tres
//  clasificaciones.
//
//Número perfecto
//Un número es perfecto cuando la suma de sus divisores propios es exactamente igual al número.
//
//Ejemplo:
//
//Divisores propios de 6:
//
//1, 2 y 3
//
//Suma:
//
//1 + 2 + 3 = 6
//
//Por lo tanto, 6 es un número perfecto.
//
//Otros ejemplos conocidos de números perfectos son:
//
//28, 496 y 8128.
//
//Número deficiente
//Un número es deficiente cuando la suma de sus divisores propios es menor que el número.
//
//Ejemplo:
//
//Divisores propios de 8:
//
//1, 2 y 4
//
//Suma:
//
//1 + 2 + 4 = 7
//
//Como 7 es menor que 8, el número 8 es deficiente.
//
//Número abundante
//Un número es abundante cuando la suma de sus divisores propios es mayor que el número.
//
//Ejemplo:
//
//Divisores propios de 12:
//
//1, 2, 3, 4 y 6
//
//Suma:
//
//1 + 2 + 3 + 4 + 6 = 16
//
//Como 16 es mayor que 12, el número 12 es abundante.
//
//Enunciado del Problema
//Se tiene un conjunto de números enteros positivos almacenados en un arreglo. El objetivo es
//  analizar estos números y clasificarlos según su tipo: perfectos, deficientes o abundantes.
//
//A partir del conjunto dado, se debe determinar para cada categoría:
//
//La cantidad de números que pertenecen a ese tipo.
//La suma total de los números de esa categoría.
//El menor número encontrado en cada categoría.
//El mayor número encontrado en cada categoría.
//Finalmente, se debe presentar un resumen con la información obtenida para cada una de las tres 
// clasificaciones.
//
//Requisito Importante
//La solución del problema debe desarrollarse utilizando métodos o funciones.
//Es decir, el programa debe dividir el problema en varias funciones que permitan:
//
//calcular la suma de divisores de un número,
//determinar si un número es perfecto, deficiente o abundante,
//analizar los números del arreglo,
//calcular cantidades, sumas, mínimos y máximos.
//El método principal debe utilizar estas funciones para realizar el análisis, evitando escribir
//  toda la lógica directamente en el programa principal.
//
//Arreglos de Prueba
//Para verificar el funcionamiento del programa se pueden utilizar los siguientes arreglos de prueba.
//
//Arreglo de prueba 1
//[6, 8, 12, 7, 28, 10, 15, 18, 20, 5]
//
//Perfectos: 6, 28
//Deficientes: 7, 8, 10, 15, 5
//Abundantes: 12, 18, 20
//Arreglo de prueba 2
//[12, 16, 6, 9, 28, 21, 24, 5, 14, 30]
//
//Perfectos: 6, 28
//Deficientes: 16, 9, 21, 5, 14
//Abundantes: 12, 24, 30
//Arreglo de prueba 3
//[496, 10, 8, 12, 18, 7, 15, 28, 20, 9]
//
//Perfectos: 496, 28
//Deficientes: 10, 8, 7, 15, 9
//Abundantes: 12, 18, 20
public class reto_3 {
    public static void main(String[] args) {

        int [] lista ={12, 16, 6, 9, 28, 21, 24, 5, 14, 30};
        
        for (int i: long_arrays(lista)){
            System.out.println(i);
        }

        System.out.println(long_arrays(lista)[0]);
    }

    public static int[] long_arrays (int [] lista){
        int perfecto=0;
        int deficiente=0;
        int abundante=0;
        for (int x :lista){
            int suma=0;
            for (int i=1; i<x;i++){
                if (x%i==0) {
                    suma+=i;
                    
                }
            }
            if (suma==x) {
                perfecto+=1;
            }
            else if(suma<x){
                deficiente+=1;
            }
            else {
                abundante+=1;
            }
        }
        int [] longitudes ={perfecto,deficiente,abundante};
        return longitudes;
    }

}
