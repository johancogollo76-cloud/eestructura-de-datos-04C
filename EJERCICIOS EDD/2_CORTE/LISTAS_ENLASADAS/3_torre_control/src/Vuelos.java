class Vuelos {
    String numeroVuelo;
    String aerolinea;
    int combustibleRestante;
    int pasajeros;
    Vuelos siguiente;

    public Vuelos(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.combustibleRestante = combustibleRestante;
        this.pasajeros = pasajeros;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return String.format("Vuelo: %s | Aerolínea: %s | Combustible: %d%% | Pasajeros: %d",
                numeroVuelo, aerolinea, combustibleRestante, pasajeros);
    }
}