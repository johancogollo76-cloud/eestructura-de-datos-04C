public class Tren {
    Vagon cabeza;

    public Tren(){
        this.cabeza=null;
    }

    public void agragarVagon(Vagon nueVagon){
        if(cabeza==null){
            cabeza=nueVagon;
        }
        else
        {
            Vagon actual = cabeza;
            while (actual.referencia!=null){
                actual = actual.referencia;
            }
            actual.referencia=nueVagon;
        }
    }

    public double calcular_peso(){
        double suma_total=0;
        Vagon actual=cabeza;
        while(actual !=null){
            suma_total+=actual.peso_tonelada;
            actual=actual.referencia;
        }
        
        return suma_total;

    }
}
