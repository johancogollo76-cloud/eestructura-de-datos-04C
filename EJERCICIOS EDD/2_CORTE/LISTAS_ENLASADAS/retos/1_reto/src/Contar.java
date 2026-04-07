public class Contar {
    Numeros cabeza;
    public Contar(){
        this.cabeza=null;
    }

    public void agregar_numeros(Numeros nuevo_Numeros){
        if (cabeza==null){
            cabeza=nuevo_Numeros;
        }else{
            nuevo_Numeros.siguiente=cabeza;
            cabeza=nuevo_Numeros;
        }
    }

    public void contar_numeros(){
        if (cabeza==null){
            System.out.println("no se encuentran numeros para contar");
        }
        else{
            Numeros actual =cabeza;
            int contador=0;
            while(actual !=null){
                contador+=1;
                actual=actual.siguiente;
            }
            System.out.println("la cantidad de numeros es de: "+ contador);
        }
        
    }
}
