public class e7 {
    public static void main(String[] args) {
        int[] stokAlmacen= {3,4,6,5,7};
        int[] stokReportes = stokAlmacen;

        stokReportes[0] = -1;

        System.out.println("stopk Almacen  : " + stokAlmacen[0]);
        System.out.println("stok Reportes  : " +stokReportes[0]);
        System.out.println("esto ocurre porque son tipos de arreglos, aqui no se crea copia si no que ambas variables apuntan al mismo espacio de memoria, caso contraio a los tipos primitivos, por lo que en cada modificacion afectará a las dos variables  ");
    }
}