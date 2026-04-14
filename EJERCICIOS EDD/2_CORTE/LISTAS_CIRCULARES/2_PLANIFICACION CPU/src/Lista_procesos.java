public class Lista_procesos {
    Proceso cabeza;
    Proceso cola;

    public Lista_procesos() {
        cabeza = null;
        cola = null;
    }

    public void agregar_proceso(Proceso nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        }
    }
    public void mostrar_procesos() {
        System.out.println(" PROCESOS ");
        if (cabeza == null) {
            System.out.println("No hay procesos");
            return;
        }

        Proceso temp = cabeza;

        do {
            System.out.println("Nombre: " + temp.nombre);
            System.out.println("PID: " + temp.pid);
            System.out.println("Tiempo restante: " + temp.tiempoRestante);
            System.out.println("Prioridad: " + temp.prioridad);
            System.out.println("************************************");

            temp = temp.siguiente;

        } while (temp != cabeza);
    }
        public void ejecutar(int quantum) {

        if (cabeza == null) {
            System.out.println("No hay procesos");
            return;
        }

        Proceso actual = cabeza;
        String ordenFinalizacion = "";

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.nombre +" (PID: " + actual.pid + ")" +  " | Tiempo restante: " + actual.tiempoRestante);

            
            actual.tiempoRestante -= quantum;

            
            if (actual.tiempoRestante <= 0) {

                System.out.println("Proceso terminado: " + actual.nombre);

                ordenFinalizacion += actual.nombre + " -> ";
                
                if (cabeza == cola) {
                    cabeza = null;
                    cola = null;
                    actual = null;
                }
                
                else if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cola.siguiente = cabeza;
                    actual = cabeza;
                }
                
                else if (actual == cola) {
                    Proceso temp = cabeza;
                    while (temp.siguiente != cola) {
                        temp = temp.siguiente;
                    }
                    cola = temp;
                    cola.siguiente = cabeza;
                    actual = cabeza;
                }
                else {
                    Proceso temp = cabeza;
                    while (temp.siguiente != actual) {
                        temp = temp.siguiente;
                    }
                    temp.siguiente = actual.siguiente;
                    actual = actual.siguiente;
                }

            } else {
                
                System.out.println("Le queda: " + actual.tiempoRestante);
                actual = actual.siguiente;
            }
        }
        System.out.println("\nORDEN DE FINALIZACIÓN");
        System.out.println(ordenFinalizacion);
    }
}
