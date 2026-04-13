public class Atencion {
    Atencion cabeza;
    Atencion cola;

    public Atencion(){
        this.cabeza=null;
        this.cola=null;
    }

    public void agregar_pacientes(Paciente nuevoPaciente){
        if (cabeza==null){
            cabeza=nuevoPaciente;
            cola=nuevoPaciente;
        }
        
    }
}
