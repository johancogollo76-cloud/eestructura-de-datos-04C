public class Atencion {
    Paciente cabeza;
    Paciente cola;

    public Atencion(){
        this.cabeza=null;
        this.cola=null;
    }

    public void agregar_pacientes(Paciente nuevoPaciente){
        if (cabeza==null){
            cabeza=nuevoPaciente;
            cola=nuevoPaciente;
        }else{
            cola.siguiente = nuevoPaciente;
            nuevoPaciente.anterior = cola;
            cola = nuevoPaciente;
            if(nuevoPaciente.nivel_urgencia==5&&cabeza !=nuevoPaciente){
                if(nuevoPaciente==cola){
                    cola=nuevoPaciente.anterior;
                    cola.siguiente=null;
                }
                Paciente segundo=cabeza.siguiente;
                cabeza.siguiente = nuevoPaciente;
                nuevoPaciente.anterior = cabeza;

                nuevoPaciente.siguiente = segundo;
                if (segundo != null) {
                    segundo.anterior = nuevoPaciente;
                }
            }
        }   
    }

    public void paciente_mayor_edad(){
        if (cola == null) {
            System.out.println("No hay pacientes");
            return;
        }
        Paciente actual = cola;
        Paciente mayor = cola;

        while (actual != null) {
            if (actual.edad > mayor.edad){
                mayor = actual;
            }
            actual = actual.anterior;
        }

        System.out.println("Nombre: " + mayor.nombre + "; Edad: " + mayor.edad + "; Urgencia: " + mayor.nivel_urgencia);
    }
}