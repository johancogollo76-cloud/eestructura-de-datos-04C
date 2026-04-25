public class Comando {
    String texto;
    boolean exitoso;
    String direcctorio;
    Comando siguiente;
    Comando anterior;

    public Comando(String texto, boolean exitoso, String directorio){
        this.texto=texto;
        this.exitoso=exitoso;
        this.direcctorio=directorio;
        this.siguiente=null;
        this.anterior=null;
    }
}
