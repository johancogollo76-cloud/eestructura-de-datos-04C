public class Cancion {
    String titulo;
    String artista;
    int duracion;
    String genero;
    Cancion siguiente;
    Cancion anterior;

    public Cancion(String titulo, String artista, int duracion, String genero){
        this.titulo=titulo;
        this.artista=artista;
        this.duracion=duracion;
        this.siguiente=null;
        this.anterior=null;
    }

}
