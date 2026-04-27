public class Galeria {
    Foto cabeza;
    Foto cola;
    Foto actual;
    public Galeria(){
        this.cabeza=null;
        this.cola=null;
        this.actual=null;
    }

    public void agregar(String titulo,String fecha,boolean es_favorita ){
        Foto nueva =new Foto(titulo, fecha, es_favorita);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
            actual= nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }
    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
        }
    }
    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
        }
    }
    public void toggleFavorita() {
        if (actual != null) {
            actual.es_favorita = !actual.es_favorita;
        }
    }


    public void eliminarActual() {

        if (actual == null) return;

        //único nodo
        if (cabeza == cola) {
            cabeza = null;
            cola = null;
            actual = null;
            return;
        }

        // eliminar cabeza
        if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
            return;
        }

        // eliminar cola
        if (actual == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            actual = cola;
            return;
        }

        // intermedio
        Foto ant = actual.anterior;
        Foto sig = actual.siguiente;

        ant.siguiente = sig;
        sig.anterior = ant;

        actual = sig; // siguiente
    }


    public void mostrarGaleria() {

        Foto temp = cabeza;

        System.out.println("\n ----- GALERIA -----");

        while (temp != null) {

            String marca = "";

            if (temp == actual) {
                marca += "[▶] ";
            }

            if (temp.es_favorita) {
                marca += "[★] ";
            }

            System.out.println(marca + temp.titulo + " - " + temp.fecha);

            temp = temp.siguiente;
        }
    }
}
