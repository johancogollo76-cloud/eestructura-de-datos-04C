public class Pestaña {
    String titulo_pestaña;
    String url;
    String hora_apertura;
    Pestaña siguiente;
    Pestaña anterior;

    public Pestaña(String titulo_pestaña,String url, String hora_apertura){
        this.titulo_pestaña=titulo_pestaña;
        this.url=url;
        this.hora_apertura=hora_apertura;
        this.siguiente=null;
        this.anterior=null;
    }

}
