public class Lista_reproduccion{
    Cancion cabeza;

    public Lista_reproduccion(){
        this.cabeza=null;
    }

    public void agregar_al_inicio(Cancion nuevCancion){
        if(cabeza==null){
            cabeza=nuevCancion;
        }else{
            nuevCancion.siguiente=cabeza;
            cabeza=nuevCancion;
        }
    }
    public void agregar_al_final(Cancion nuevCancion){
        if(cabeza ==null){
            cabeza=nuevCancion;
        }else{
            Cancion actual=cabeza;
            while(actual.siguiente!=null){
                actual=actual.siguiente;
            }
            actual.siguiente=nuevCancion;
        }
    }
    public void mostrar_lista(){
        Cancion actual=cabeza;
        while(actual!=null){
            System.out.println("titulo"+actual.titulo+"\nartista"+actual.artista+"\nduracion: "+actual.duracion_segundos+"\ngenero: "+actual.genero);
            actual=actual.siguiente;
        }   
        
    }

    public void sumar_canciones(){
        Cancion actual=cabeza;
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