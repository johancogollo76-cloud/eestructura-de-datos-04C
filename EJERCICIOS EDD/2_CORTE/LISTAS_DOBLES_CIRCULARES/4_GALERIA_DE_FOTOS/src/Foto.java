public class Foto {
    String titulo;
    String fecha;
    boolean es_favorita;
    Foto siguiente;
    Foto anterior;
    public Foto(String titulo, String fecha, boolean es_favorita){
        this.titulo=titulo;
        this.fecha=fecha;
        this.es_favorita=es_favorita;
        this.siguiente=null;
        this.anterior=null;
    }
}
