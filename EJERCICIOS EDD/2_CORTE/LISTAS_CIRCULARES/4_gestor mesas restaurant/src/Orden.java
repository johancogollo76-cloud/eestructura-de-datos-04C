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
            System.out.print(temp.nombre_reserva + " -> ");
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
        System.out.println("Atendiendo grupo: " + actual.nombre_reserva +" | Personas: " + actual.numero_personas +" | VIP: " + actual.es_vip);

        if(cabeza == cola){
            if(actual.es_vip){
                System.out.println("Es VIP, permanece en lista");
            }else{
                cabeza = null;
                cola = null;
            }
            return;
        }

        if(actual.es_vip){
            cabeza = cabeza.siguiente;
            cola.siguiente = actual;  
            actual.siguiente = cabeza;            
            cola=actual;
        }
        else{
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;  
        }
        mostrarLista();
    }
}
