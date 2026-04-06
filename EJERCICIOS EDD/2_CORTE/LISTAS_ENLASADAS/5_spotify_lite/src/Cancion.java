public class Cancion {
    String titulo;
    String artista;
    int duracion_segundos;
    String genero;
    Cancion siguiente;

    public Cancion(String titulo,String artista,int duracion_segundos,String genero){
        this.titulo=titulo;
        this.artista=artista;
        this.duracion_segundos=duracion_segundos;
        this.genero=genero;
        this.siguiente=null;
    }

}
