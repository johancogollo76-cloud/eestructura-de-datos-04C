public class Fotografia {
    String nombre_archivo;
    double tamañoMB;
    String resolucion;
    Fotografia siguiente;
    Fotografia anterior;

    public Fotografia (String nombre_archivo,double tamañoMB,String resolucion){
        this.nombre_archivo=nombre_archivo;
        this.tamañoMB=tamañoMB;
        this.resolucion=resolucion;
        this.siguiente=null;
        this.anterior=null;
    }
}
