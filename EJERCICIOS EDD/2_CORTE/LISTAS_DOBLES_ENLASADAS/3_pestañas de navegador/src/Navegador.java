public class Navegador {
    Pestaña cabeza;
    Pestaña cola;
    public Navegador(){
        this.cabeza=null;
        this.cola=null;
    }
    

    public void agregar_al_final(Pestaña nuevPestaña){
        if(cabeza==null){
            cabeza=nuevPestaña;
            cola=nuevPestaña;
        }
        else{
            cola.siguiente=nuevPestaña;
            nuevPestaña.anterior=cola;
            cola=nuevPestaña;
        }
    }

    public Pestaña recorrer_adelante(Pestaña pestaña_actual){
        if (pestaña_actual.siguiente ==null){
            System.out.println("no hay pestaña sigueinte");
            return pestaña_actual;
        }
        return pestaña_actual.siguiente;
    }

    public Pestaña recorrer_atras(Pestaña pestaña_actual){
        if (pestaña_actual.anterior==null) {
            System.out.println("no hay pestaña anterior");
            return pestaña_actual;
        }
        return pestaña_actual.anterior;
    }


    public Pestaña cerrar_pestana_actual(String url){
    if(cabeza == null){
        System.out.println("No hay pestañas abiertas");
        return null;
    }

    Pestaña actual = cabeza;
    while(actual != null){
        if(actual.url.equals(url)){
            
            if(cabeza == cola){
                cabeza = null;
                cola = null;
                return null;
            }

            if(actual == cabeza){
                cabeza = cabeza.siguiente;
                cabeza.anterior = null;
                return cabeza; 
            }

            if(actual == cola){
                cola = cola.anterior;
                cola.siguiente = null;
                return cola; 
            }

            
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;

            return actual.anterior; 
        }

        actual = actual.siguiente;
    }

    System.out.println("No se encontró la pestaña");
    return null;
}

}
