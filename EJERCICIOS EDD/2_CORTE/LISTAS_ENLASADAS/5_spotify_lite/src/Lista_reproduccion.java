public class Lista_reproduccion{
    Cansion cabeza;

    public Lista_reproduccion(){
        this.cabeza=null;
    }

    public void agregar_al_inicio(Cansion nuevCansion){
        if(cabeza==null){
            cabeza=nuevCansion;
        }else{
            nuevCansion.siguiente=cabeza;
            cabeza=nuevCansion;
        }
    }
    public void agregar_al_final(Cansion nuevCansion){
        if(cabeza ==null){
            cabeza=nuevCansion;
        }else{
            Cansion actual=cabeza;
            while(actual.siguiente!=null){
                actual=actual.siguiente;
            }
            actual.siguiente=nuevCansion;
        }
    }

    public void sumar_canciones(){
        Cansion actual=cabeza;
        int tiempo=0;
        while(actual!=null){
            tiempo+= actual.duracion_segundos;
            actual=actual.siguiente;
        }
        int minutos = tiempo / 60;
        double segundos = tiempo % 60;
        System.out.println("Tiempo total de reprocuccion(MM:SS):"+ minutos +":"+segundos);
    }

}