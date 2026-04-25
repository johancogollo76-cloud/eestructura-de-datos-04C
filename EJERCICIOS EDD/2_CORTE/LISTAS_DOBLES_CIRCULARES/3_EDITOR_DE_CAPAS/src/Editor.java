

public class Editor {
    Capa cabeza;
    Capa cola;
    Capa capaActual;
    public Editor(){
        this.cabeza=null;
        this.cola=null;
        this.capaActual=null;
    }

    public void agregar(String nombre,boolean visible, String tipo){
        Capa nueva=new Capa(nombre, visible, tipo);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
            capaActual= nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void siguiente() {
    if (capaActual != null) {
        capaActual = capaActual.siguiente;
        System.out.println(capaActual.nombre);
    }
    }
    public void anterior() {
        if(capaActual !=null){
            capaActual=capaActual.anterior;
            System.out.println(capaActual.nombre);
        }
    }

    public void eliminarCapaActual() {
    if (capaActual == null) return;

    if (capaActual == capaActual.siguiente) {
        // solo un nodo
        cabeza = null;
        cola = null;
        capaActual = null;
    } else {
        capaActual.anterior.siguiente = capaActual.siguiente;
        capaActual.siguiente.anterior = capaActual.anterior;

        if (capaActual == cabeza) cabeza = capaActual.siguiente;
        if (capaActual == cola) cola = capaActual.anterior;

        capaActual = capaActual.siguiente; 
        System.out.println(capaActual + "ELIMINADA" );
        }
    }


    public void toggleVisibilidad() {
    if (capaActual != null) {
        capaActual.visible = !capaActual.visible;
        }
    }

    public void mostrarCapas() {
        if (cabeza == null) {
            System.out.println("No hay capas");
            return;
        }

        Capa actual = cabeza;

        do {
            if (actual == capaActual) {
                System.out.print("[✓] ");
            } else {
                System.out.print("[ ] ");
            }

            if (actual.visible) {
                System.out.print("visible - ");
            } else {
                System.out.print("oculto - ");
            }

            System.out.println(actual.nombre + " - " + actual.tipo);

            actual = actual.siguiente;

        } while (actual != cabeza); 
    }
}
