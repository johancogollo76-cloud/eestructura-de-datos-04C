public class Orden {
    Vuelos cabeza;

    public Orden(){
        this.cabeza = null;
    }

    public void Agregar_Vuelo(Vuelos nuevoVuelos){
        if (cabeza == null) {
            cabeza = nuevoVuelos;
        } else {
            Vuelos actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVuelos;
        }
    }

    public void insertarAlInicio(Vuelos nuevoVuelos){
        nuevoVuelos.siguiente = cabeza;
        cabeza = nuevoVuelos;
    }

    public void reportarEmergencia(String codigo){
        if (cabeza == null || cabeza.numeroVuelo.equals(codigo)) {
            return;
        }

        Vuelos actual = cabeza;
        Vuelos anterior = null;

        while (actual != null && !actual.numeroVuelos.equals(codigo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            return;
        }

        anterior.siguiente = actual.siguiente;
        actual.siguiente = cabeza;
        cabeza = actual;
    }

    public void Imprimir(){
        Vuelos iterando = cabeza;
        System.out.println(" Fila de Vuelos");
        while (iterando != null) {
            System.out.println(iterando.numeroVuelos);
            iterando = iterando.siguiente;
        }
    }
}