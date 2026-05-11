public class Control {
    private Pieza tope;
    private int tamaño;

    public Control(){
        this.tope=null;
        this.tamaño=0;
    }

    public boolean esta_vacia(){
        return tope==null;
    }

    public int get_tamaño(){
        return tamaño;
    }

    public void push(Pieza nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamaño++;
    }

    public Pieza pop() {
        if (esta_vacia()) {
            return null;
        }
        Pieza aux = tope;
        tope = tope.siguiente;
        tamaño--;
        aux.siguiente = null; 
        return aux;
    }

    public Pieza peek(){
        return tope;
    }

    public void imprimir() {
        if (esta_vacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Pieza actual = tope;
        System.out.println("=== ESTADO DE LAS PIEZAS (De Tope a Base) ===");
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

    public int contarPor_pieza(String nombre_pieza) {
        int contador = 0;
        Pieza actual = tope;
        while (actual != null) {
            if (actual.nombre_pieza.equalsIgnoreCase(nombre_pieza)) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }
    public void limpiarHastaDefecto() {

        if (tope == null) {
            System.out.println("La pila está vacía");
            return;
        }

        while (tope != null) {

            Pieza piezaActual = pop();

            // Si encontramos la defectuosa
            if (piezaActual.es_defectuoso) {

                System.out.println("PIEZA DEFECTUOSA ENCONTRADA:");
                System.out.println("-> " + piezaActual.nombre_pieza);

                // Se detiene inmediatamente
                break;
            }

            // Si era buena
            System.out.println("Pieza buena retirada y descartada:");
            System.out.println("-> " + piezaActual.nombre_pieza);
        }
    }

}
