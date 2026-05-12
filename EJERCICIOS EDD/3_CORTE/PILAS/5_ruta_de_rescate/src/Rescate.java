public class Rescate {
    private Estacion tope;
    private int tamaño;
    public Rescate(){
        this.tope=null;
        this.tamaño=0;
    } 

    public boolean esta_vacia(){
        return tope==null;
    }

    public int get_tamaño(){
        return tamaño;
    }

    public void push(Estacion nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamaño++;
    }

    public Estacion pop() {
        if (esta_vacia()) {
            return null;
        }
        Estacion aux = tope;
        tope = tope.siguiente;
        tamaño--;
        aux.siguiente = null; 
        return aux;
    }

    public Estacion peek(){
        return tope;
    }

    public void imprimir() {
        if (esta_vacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Estacion actual = tope;
        System.out.println("=== ESTADO DE ESTACIONES (De Tope a Base) ===");
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

    public void retrocederASuperficie() {
        if (tope == null) {
            System.out.println("No hay estaciones para retroceder.");
            return;
        }
        System.out.println("DE VUELTA A LA SUPERFICIE...\n");

        Estacion actual = tope;
        while (actual != null) {
            System.out.println("Retrocediendo por:");
            System.out.println(actual.nombrePunto);
            if (actual.nivelOxigeno < 18) {

                System.out.println("ESTA EN PELIGRO");
            }
            actual = actual.siguiente;
        }
        System.out.println("el equipo salio de la cueva.");
    }
}
