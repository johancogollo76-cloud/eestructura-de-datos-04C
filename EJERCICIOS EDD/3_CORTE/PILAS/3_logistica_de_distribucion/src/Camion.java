public class Camion {
    String placa;
    String conductor;
    double cargaToneladas;
    Camion siguiente;
    public Camion(String placa, String conductor,Double cargaToneladas){
        this.placa=placa;
        this.conductor=conductor;
        this.cargaToneladas=cargaToneladas;
        this.siguiente=null;
    }
}
