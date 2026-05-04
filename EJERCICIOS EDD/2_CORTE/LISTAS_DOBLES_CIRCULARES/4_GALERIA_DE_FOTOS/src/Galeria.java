public class Galeria {
    Foto cabeza;
    Foto cola;
    Foto actual;

    public Galeria(){
        this.cabeza = null;
        this.actual = null;
        this.cola=null;
    }

    public void agregar(String titulo, String fecha, boolean esFavorita){
        Foto nueva = new Foto(titulo, fecha, esFavorita);

        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            actual = nueva;
            cola=nueva;
        } else {
            cola = cabeza.anterior;

            cola.siguiente = nueva;
            nueva.anterior = cola;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
            System.out.println(actual.titulo);
            System.out.println(actual.es_favorita);
        }
    }

    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
            System.out.println(actual.titulo); 
            System.out.println(actual.es_favorita);
        }
    }

    // ✅ Marcar o desmarcar como favorita
    public void toggleFavorita() {
        if (actual != null) {
            actual.es_favorita = !actual.es_favorita; // invierte el valor
        }
    }

    public void eliminarActual() {

        if (actual == null) return;

        // Caso 1: solo hay una foto
        if (actual.siguiente == actual) {
            cabeza = null;
            actual = null;
            return;
        }

        // Guardar referencias
        Foto anterior = actual.anterior;
        Foto siguiente = actual.siguiente;

        // Reconectar nodos (saltarse el actual)
        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        // Si eliminamos la cabeza, la movemos
        if (actual == cabeza) {
            cabeza = siguiente;
        }

        // El puntero actual pasa a la siguiente foto
        actual = siguiente;
    }

    public void mostrarGaleria() {
        if (cabeza == null) {
            System.out.println("Galería vacía");
            return;
        }

        System.out.println("\n----- GALERÍA -----");

        Foto cursor = cabeza;

        do {
            String marca = "";

            if (cursor == actual) {
                marca += "[>>] ";
            }

            if (cursor.es_favorita) {
                marca += "[FAV] ";
            }

            System.out.println(marca + cursor.titulo + " - " + cursor.fecha);

            cursor = cursor.siguiente;

        } while (cursor != cabeza);
    }
}