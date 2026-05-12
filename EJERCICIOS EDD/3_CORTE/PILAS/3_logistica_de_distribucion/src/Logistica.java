public class Logistica {
    private Camion tope;
    private int tamaño;
    public Logistica(){
        this.tope=null;
        this.tamaño=0;
    }

    public boolean esta_vacia(){
        return tope==null;
    }

    public int get_tamaño(){
        return tamaño;
    }

    public void push(Camion nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamaño++;
    }

    public Camion pop() {
        if (esta_vacia()) {
            return null;
        }
        Camion aux = tope;
        tope = tope.siguiente;
        tamaño--;
        aux.siguiente = null; 
        return aux;
    }

    public Camion peek(){
        return tope;
    }

    public void imprimir() {
        if (esta_vacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Camion actual = tope;
        System.out.println("=== ESTADO DE CAMIONES (De Tope a Base) ===");
        while (actual != null) {
            if (actual == tope) {
                System.out.print("  TOPE -> ");
            } else {
                System.out.print("          ");
            }
            System.out.println(actual.toString());
            actual = actual.siguiente;
        }
        System.out.println("===========================================");
    }

    public void calcular_peso(){
        if ( esta_vacia()){
            System.out.println("pila vacía");
        }
        Camion actual=tope;
        double sumaTotal=0;
        while(actual!=null){
            sumaTotal += actual.cargaToneladas;
            actual=actual.siguiente;
            System.out.println("el peso total de los camiones es: "+ sumaTotal);
            break;
        }
    }

}
