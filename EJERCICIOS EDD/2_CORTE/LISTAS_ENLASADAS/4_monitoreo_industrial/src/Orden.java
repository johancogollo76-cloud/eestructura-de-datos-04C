public class Orden {
    Lectura cabeza;
    
    public Orden(){
        this.cabeza=null;
    }
    
    public void orden_lecturas(Lectura nuevLectura){
        if (cabeza == null){
            cabeza=nuevLectura;
        }else{
            nuevLectura.siguiente=cabeza;
            cabeza=nuevLectura;
        }
    }
    public void mayor_temperatura(){
        if (cabeza==null){
            System.out.println("no se encuentran lecturas");
        }else{
            Lectura actual =cabeza;
            double maximo=0.0;
            while (actual!=null){
                if(actual.temperatura>=maximo){
                    maximo=actual.temperatura;
                }
                actual=actual.siguiente;
            }
            actual=cabeza; 
            while (actual !=null){
                if(actual.temperatura==maximo){
                    System.out.println("lectura con la temperatura mas alta ");
                    System.out.println("id sensor: "+actual.id_sensor+"\ntemperatura: "+actual.temperatura+"\npresion: "+actual.presion+"\nhora: "+ actual.hora);
                    return;
                }
                actual=actual.siguiente;
            }
        }
        
    }
}
