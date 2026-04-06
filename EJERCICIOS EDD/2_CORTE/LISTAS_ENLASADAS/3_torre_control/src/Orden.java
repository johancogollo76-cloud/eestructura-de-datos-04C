class Orden {
    Vuelos cabeza;

    public Orden() {
        this.cabeza = null;
    }

    // Método para agregar al final (nombre estándar)
    public void agregarVuelo(Vuelos nuevoVuelo) {
        if (cabeza == null) {
            cabeza = nuevoVuelo;
        } else {
            Vuelos actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVuelo;
        }
    }

    // Método para insertar al inicio
    public void insertarAlInicio(Vuelos nuevoVuelo) {
        nuevoVuelo.siguiente = cabeza;
        cabeza = nuevoVuelo;
    }

    // Método para manejar emergencias (mover al inicio)
    public void reportarEmergencia(String codigo) {
        if (cabeza == null) {
            System.out.println("No hay vuelos en la fila.");
            return;
        }

        if (cabeza.numeroVuelo.equals(codigo)) {
            System.out.println("El vuelo ya está al inicio.");
            return;
        }

        Vuelos actual = cabeza;
        Vuelos anterior = null;

        while (actual != null && !actual.numeroVuelo.equals(codigo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Vuelo no encontrado.");
            return;
        }

        // Mover al inicio
        anterior.siguiente = actual.siguiente;
        actual.siguiente = cabeza;
        cabeza = actual;
        System.out.println("EMERGENCIA: Vuelo " + codigo + " movido al inicio.");
    }

    // Método para imprimir (nombre estándar)
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("📭 No hay vuelos en la fila.");
            return;
        }

        Vuelos iterando = cabeza;
        System.out.println("\n FILA DE VUELOS:");
        System.out.println("----------------");
        int posicion = 1;
        while (iterando != null) {
            System.out.println(posicion + ". " + iterando);
            iterando = iterando.siguiente;
            posicion++;
        }
        System.out.println("----------------\n");
    }
}