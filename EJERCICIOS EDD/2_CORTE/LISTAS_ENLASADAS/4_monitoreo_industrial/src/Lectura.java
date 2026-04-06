public class Lectura {
    int id_sensor;
    double temperatura;
    double presion;
    String hora;
    Lectura siguiente;

    public Lectura(int id_sensor, double temperatura, double presion, String hora){
        this.id_sensor=id_sensor;
        this.temperatura=temperatura;
        this.presion=presion;
        this.hora=hora;
        this.siguiente=null;
    }
}
