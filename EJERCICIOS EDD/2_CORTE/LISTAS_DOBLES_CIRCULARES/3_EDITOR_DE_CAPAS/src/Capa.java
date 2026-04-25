public class Capa {
    String nombre;
    boolean visible;
    String tipo;
    Capa siguiente;
    Capa anterior;
    public Capa(String nombre, boolean visible, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        this.visible=visible;
        this.siguiente=null;
        this.anterior=null;
    }
}   
