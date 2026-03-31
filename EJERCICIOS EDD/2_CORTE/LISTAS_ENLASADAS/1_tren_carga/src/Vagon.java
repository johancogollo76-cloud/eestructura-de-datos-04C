public class Vagon {
    String contenido;
    double peso_tonelada;
    String origen;
    String destino;
    Vagon referencia;

    public Vagon(String contenido,double peso_tonelada,String origen, String destino){
        this.contenido=contenido;
        this.peso_tonelada=peso_tonelada;
        this.origen=origen;
        this.destino=destino;
        this.referencia=null;
    }
}
