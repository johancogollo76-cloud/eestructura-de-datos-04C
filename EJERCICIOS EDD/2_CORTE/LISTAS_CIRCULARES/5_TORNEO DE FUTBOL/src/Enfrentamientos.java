public class Enfrentamientos {
    Equipo cabeza;
    Equipo cola;
    public Enfrentamientos(){
        this.cabeza=null;
        this.cola=null;
    }

    public void agregar(Equipo nuevo){
        if(cabeza == null){
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza;
        }else{
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza; 
            cola = nuevo;
        }
    }

    public void generarFixture(){
        if(cabeza == null){
            System.out.println("No hay equipos");
            return;
        }

        Equipo[] equipos = new Equipo[6];
        Equipo actual = cabeza;

        for(int i = 0; i < 6; i++){
            equipos[i] = actual;
            actual = actual.siguiente;
        }

        int jornadas = 5; 

        for(int j = 0; j < jornadas; j++){
            System.out.println("\nJORNADA " + (j+1));

            for(int i = 0; i < 3; i++){
                Equipo local = equipos[i];
                Equipo visitante = equipos[5 - i];

                System.out.println(local.nombre + " vs " + visitante.nombre);

                local.puntos += 3;
                local.golesFavor += 1;
            }

            Equipo ultimo = equipos[5];

            for(int i = 5; i > 1; i--){
                equipos[i] = equipos[i-1];
            }

            equipos[1] = ultimo;
        }

        for(int i = 0; i < equipos.length; i++){
            for(int k = 0; k < equipos.length - 1; k++){
                if(equipos[k].puntos < equipos[k+1].puntos){
                    Equipo aux = equipos[k];
                    equipos[k] = equipos[k+1];
                    equipos[k+1] = aux;
                }
            }
        }

        System.out.println("\nTABLA DE POSICIONES:");
        for(Equipo e : equipos){
            System.out.println(e.nombre + " - " + e.puntos + " pts");
        }
}
}
