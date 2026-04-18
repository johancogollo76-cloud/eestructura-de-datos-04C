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

        Equipo[] eq = new Equipo[6];
        Equipo temp = cabeza;

        for(int i = 0; i < 6; i++){
            eq[i] = temp;
            temp = temp.siguiente;
        }

        // 5 jornadas
        for(int j = 0; j < 5; j++){
            System.out.println("\nJORNADA " + (j+1));

            // 3 partidos
            for(int i = 0; i < 3; i++){
                Equipo local = eq[i];
                Equipo visitante = eq[5 - i];

                System.out.println(local.nombre + " vs " + visitante.nombre);

                // Simulación simple
                local.puntos += 3;
            }

            
            Equipo ultimo = eq[5];

            for(int i = 5; i > 1; i--){
                eq[i] = eq[i-1];
            }

            eq[1] = ultimo;
        }

        for(int i = 0; i < 6; i++){
            for(int k = 0; k < 5; k++){
                if(eq[k].puntos < eq[k+1].puntos){
                    Equipo aux = eq[k];
                    eq[k] = eq[k+1];
                    eq[k+1] = aux;
                }
            }
        }

        System.out.println("\nTABLA FINAL:");
        for(Equipo e : eq){
            System.out.println(e.nombre + " - " + e.puntos + " pts");
        }
    }   
}

