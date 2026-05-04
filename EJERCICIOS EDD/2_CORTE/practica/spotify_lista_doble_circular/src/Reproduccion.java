public class Reproduccion {
    Cancion cabeza;
    Cancion cola;
    Cancion actual;
    public Reproduccion(){
        this.cabeza=null;
        this.cola=null;
        this.actual=null;
    }

    public void agregar_inicio(String titulo, String artista, int duracion, String genero){
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);
        if(cabeza==null){
            nueva.siguiente=nueva;
            nueva.anterior=nueva;
            cabeza=nueva;
            actual=nueva;
            cola=nueva;
            System.out.println("cancion actual agregada "+actual.titulo);

        }else{
            nueva.siguiente=cabeza;
            nueva.anterior=cola;
            cabeza.anterior=nueva;
            cola.siguiente=nueva;
            cabeza=nueva;
            actual=nueva;
            System.out.println("cancion actual agregada "+actual.titulo);

        }

    }

    public void agregar_final(String titulo, String artista, int duracion, String genero){
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza ==null){
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            actual = nueva;
            cola=nueva;
            System.out.println("cancion actual agregada "+actual.titulo);
        }
        else{
            cola = cabeza.anterior;
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            actual=nueva;
            System.out.println("cancion actual agregada "+actual.titulo);
        }
    }


    public void siguiente(){
        if (actual!=null){
            actual=actual.siguiente;
            System.out.println(actual.titulo);
        }
    }

    public void anterior(){
        if (actual!=null){
            actual=actual.anterior;
            System.out.println(actual.titulo);
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
        Cancion anterior = actual.anterior;
        Cancion siguiente = actual.siguiente;

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

    
}
