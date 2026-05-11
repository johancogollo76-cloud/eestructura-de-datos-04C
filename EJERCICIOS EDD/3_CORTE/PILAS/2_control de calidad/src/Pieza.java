public class Pieza {
    String nombre_pieza;
    String numero_Serie;
    boolean es_defectuoso;
    Pieza siguiente;
    public Pieza(String nombre_pieza, String numero_serie, boolean es_defectuoso){
        this.nombre_pieza=nombre_pieza;
        this.numero_Serie=numero_serie;
        this.es_defectuoso=es_defectuoso;
        this.siguiente = null;
    }

    @Override
    public String toString(){
        return "[" + nombre_pieza + " | " + numero_Serie + " | " + es_defectuoso+ "]";
    }
}
