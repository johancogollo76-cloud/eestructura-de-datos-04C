// package EJERCICIOS EDD.2_CORTE.LISTAS_DOBLES_ENLASADAS.2_carrusel de imagenes.src;

public class Galeria {
    Fotografia cabeza;
    Fotografia cola;
    public Galeria(){
        this.cabeza=null;
        this.cola=null;
    }
    
    public void agregar_al_final(Fotografia nuevaFotografia){
        if (cabeza ==null){
            cabeza =nuevaFotografia;
            cola=nuevaFotografia;
        }else{
            cola.siguiente=nuevaFotografia;
            nuevaFotografia.anterior=cola;
            cola=nuevaFotografia;
        }
    }

    public Fotografia recorrer_adelante(Fotografia foto_actual){
        if (foto_actual.siguiente ==null){
            System.out.println("no hay fotos hacia adelante");
            return foto_actual;
        }
        return foto_actual.siguiente;
    }

    public Fotografia recorrer_atras(Fotografia foto_actual){
        if (foto_actual.anterior==null) {
            System.out.println("no hay fotos hacia atras");
            return foto_actual;
        }
        return foto_actual.anterior;
    }

    public void reproducirGaleria(){
        if(cabeza == null){
            System.out.println("No hay fotos en la galeria");
            return;
        }

        System.out.println("RECORRIDO HACIA ADELANTE:");
        Fotografia actual = cabeza;
        while(actual != null){
            System.out.println(actual.nombre_archivo);
            actual = actual.siguiente;
        }

        System.out.println("RECORRIDO HACIA ATRAS:");
        actual = cola.anterior;

        while(actual != null){
            System.out.println(actual.nombre_archivo);
            actual = actual.anterior;
        }
    }

}
