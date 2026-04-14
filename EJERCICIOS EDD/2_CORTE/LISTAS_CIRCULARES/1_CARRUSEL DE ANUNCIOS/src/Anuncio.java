public class Anuncio {
    String titulo;
    int duracion_segundos;
    int veces_repetidos;
    String categoria;
    Anuncio siguiente;

    public Anuncio(String titulo, int duracion_segundos,int veces_repetidos, String categoria){
        this.titulo=titulo;
        this.duracion_segundos=duracion_segundos;
        this.veces_repetidos=veces_repetidos;
        this.categoria=categoria;
    }

}
