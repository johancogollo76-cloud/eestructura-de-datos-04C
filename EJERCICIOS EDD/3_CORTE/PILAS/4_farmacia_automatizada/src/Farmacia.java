
public class Farmacia {
    private Medicamento tope;
    private int tamaño;
    public Farmacia(){
        this.tope=null;
        this.tamaño=0;
    }

    public boolean esta_vacia(){
        return tope==null;
    }

    public int get_tamaño(){
        return tamaño;
    }

    public void push(Medicamento nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamaño++;
    }

    public Medicamento pop() {
        if (esta_vacia()) {
            return null;
        }
        Medicamento aux = tope;
        tope = tope.siguiente;
        tamaño--;
        aux.siguiente = null; 
        return aux;
    }

    public Medicamento peek(){
        return tope;
    }

    public void imprimir() {
        if (esta_vacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Medicamento actual = tope;
        System.out.println("=== ESTADO DE MEDICAMENTOS (De Tope a Base) ===");
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

    public void validarDespacho() {

        while (tope != null && tope.diasParaVencer < 10) {

            Medicamento vencido = pop();

            System.out.println("el medicamento se ha retirado:");
            System.out.println(vencido);
        }

        if (tope != null) {

            System.out.println("\nMedicamento seguro :");
            System.out.println(tope);

        } else {

            System.out.println("\nNo hay medicamentos seguros.");
        }
    }


}
