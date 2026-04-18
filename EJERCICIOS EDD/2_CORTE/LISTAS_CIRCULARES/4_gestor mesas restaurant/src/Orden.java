public class Orden {
    Grupo cabeza;
    Grupo cola;
    public Orden(){
        this.cabeza=null;
        this.cola=null;
    }

    public void agregar(Grupo nuevo){
    if(cabeza == null){
        cabeza = nuevo;
        cola = nuevo;
        cola.siguiente = cabeza;
    }else{
        cola.siguiente = nuevo;
        nuevo.siguiente = cabeza; 
        cola = nuevo;
    }

    public void atenderSiguiente(){
    if(cabeza == null){
        System.out.println("No hay grupos en espera");
        return;
    }

    Grupo actual = cabeza;

    // Mostrar info
    System.out.println("Atendiendo grupo: " + actual.nombreReserva +" | Personas: " + actual.numeroDePersonas +" | VIP: " + actual.esVip);

    // Caso: un solo nodo
    if(cabeza == cola){
        if(actual.esVip){
            System.out.println("Es VIP, permanece en lista");
        }else{
            cabeza = null;
            cola = null;
        }
        return;
    }

    // Si es VIP → mover al final
    if(actual.esVip){
        cabeza = cabeza.siguiente;       // avanzar cabeza
        cola.siguiente = actual;         // cola apunta al actual
        cola = actual;                   // actual se vuelve cola
        cola.siguiente = cabeza;         // mantener circular
    }
    // Si NO es VIP → eliminar
    else{
        cabeza = cabeza.siguiente;
        cola.siguiente = cabeza;         // cerrar el ciclo
    }

    // Mostrar estado
    mostrarLista();
}
}
}
