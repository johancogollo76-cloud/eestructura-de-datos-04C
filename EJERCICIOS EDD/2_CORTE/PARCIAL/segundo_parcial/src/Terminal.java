public class Terminal {
    Comando cabeza;
    Comando cola;
    Comando actual;
    public Terminal(){
        this.cabeza=null;
        this.cola=null;
        this.actual=null;
    }
    public void agregar_comando(String titulo, String hora) {
        Comando nueva = new Comando(titulo, hora);
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
    if (actual != null) {
        actual = actual.siguiente;
        System.out.println(actual.texto);
    }
    }
    public void anterior() {
        if(actual !=null){
            actual=actual.anterior;
            System.out.println(actual.texto);
        }
    }

    public void eliminarActual() {
    if (actual == null) return;

    if (actual == actual.siguiente) {
        cabeza = null;
        cola = null;
        actual = null;
    } else {
        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;

        if (actual == cabeza) cabeza = actual.siguiente;
        if (actual == cola) cola = actual.anterior;

        actual = actual.siguiente; 
        }
    }

    public void mostrarcomando() {
        if (cabeza == null) {
            System.out.println("Galería vacía");
            return;
        }

        System.out.println("\n----- GALERÍA -----");

        Comando cursor = cabeza;

        do {
            String marca = "";

            if (cursor == actual) {
                marca += "[>>] ";
            }

            System.out.println(marca + cursor.texto + " - " + cursor.hora);

            cursor = cursor.siguiente;

        } while (cursor != cabeza);
    }





}
