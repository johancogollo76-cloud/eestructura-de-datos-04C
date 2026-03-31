public class Stante{
    Producto cabeza;
    public Stante(){
        this.cabeza = null;
    }

    public void orden_productos(Producto nuevProducto){
        if (cabeza == null) {
            cabeza = nuevProducto;
        }
        else{
            if (nuevProducto.diasParaVencer<=3) {
                nuevProducto.siguiente = cabeza;
                cabeza=nuevProducto;
            }
            else{
                Producto iterando = cabeza;
                while (iterando.siguiente != null) {
                    iterando=iterando.siguiente;
                }
                iterando.siguiente = nuevProducto;
            }
        }
    }
    public void Imprimir(){
        Producto iterando = cabeza;
        System.out.println("Productos por vencer");
        while (iterando.siguiente != null) {
            if (iterando.diasParaVencer<5) {
                System.out.println(iterando.nombre + "vence: " + iterando.diasParaVencer);
            }
            iterando=iterando.siguiente;
        }
        if (iterando.diasParaVencer < 5) {
            System.out.println(iterando.nombre + "vence: " + iterando.diasParaVencer);
        }
    }
}