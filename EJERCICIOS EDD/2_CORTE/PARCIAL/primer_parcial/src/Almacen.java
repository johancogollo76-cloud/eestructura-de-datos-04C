

public class Almacen {
    Producto cabeza;


    public Almacen(){
        this.cabeza=null;
    }

    public void agragar(Producto nuevoProducto){
        if(cabeza==null){
            cabeza=nuevoProducto;
        }
        else
        {
            Producto actual = cabeza;
            while (actual.referenProducto!=null){
                actual = actual.referenProducto;
            }
            actual.referenProducto=nuevoProducto;
        }
    }

    public void buscar_editar ( String codigobus, int cantidadNueva){
        
        Producto actual=cabeza;
        while(actual!=null){
            if (actual.codigo.equalsIgnoreCase(codigobus)){
                actual.cantidad +=cantidadNueva;
                actual=actual.referenProducto;
                System.out.println("cantidad actualizada");
                System.out.println("cantidad nueva "+ actual.cantidad);
                break;
            }
            
        }
        
        
        

    }

    public void listar(){
        Producto actual= cabeza;
        while(actual!=null){
                double cantidad_total= actual.cantidad*actual.precio;
                System.out.println("PRODUCTOS: " +" nombre : " + actual.nombre+ " valor total: "+cantidad_total);
                actual=actual.referenProducto;
            }
    }
}
