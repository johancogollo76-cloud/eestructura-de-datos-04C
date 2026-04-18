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
    }

    public void mostrarLista(){
        if(cabeza == null){
            System.out.println("Lista vacía");
            return;
        }

        Grupo temp = cabeza;

        do{
            System.out.print(temp.nombreReserva + " -> ");
            temp = temp.siguiente;
        }while(temp != cabeza);

        System.out.println("(vuelve al inicio)");
    }

    public void atenderSiguiente(){
        if(cabeza == null){
            System.out.println("No hay grupos en espera");
            return;
        }

        Grupo actual = cabeza;

        // Mostrar info
        System.out.println("Atendiendo grupo: " + actual.nombreReserva +" | Personas: " + actual.numeroDePersonas +" | VIP: " + actual.esVip);

        if(cabeza == cola){
            if(actual.esVip){
                System.out.println("Es VIP, permanece en lista");
            }else{
                cabeza = null;
                cola = null;
            }
            return;
        }

        if(actual.esVip){
            cabeza = cabeza.siguiente;
            cola.siguiente = actual;  
            cola = actual;            
            cola.siguiente = cabeza;  
        }
        else{
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;  
        }
        mostrarLista();
    }
}
