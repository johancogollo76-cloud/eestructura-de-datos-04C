public class reto_4 {
    public static void main(String[] args) {
        int[] lista = {-6, 8, -12, 7, 28, -10, 15, -18, 20, -5};
        int [] absolutos= valor_absoluto(lista);
        System.out.println("VALORES ABSOLUTOS");
        for(int i=0;i<absolutos.length;i++){
            System.out.print(absolutos[i] +"; ");
        }
        
        par(absolutos);
        impar(absolutos);
        



    }
    
    public static int[] valor_absoluto(int[] list){
        int [] new_lista=new int[list.length];
        for(int i=0;i<list.length;i++){
            if (list[i]<0){
                new_lista[i]= (-1*(list[i]));
            }
            else
            {
                new_lista[i]=list[i];
            }
        }
        return new_lista;
    }

    public static void par( int [] lista){
        int [] listapar= new int[lista.length];
        for (int i=0;i<lista.length;i++){
            if(lista[i]%2==0){
                listapar[i]=lista[i];
            }
        }
        System.out.println();
        System.out.println("LISTA PAR");
        for(int i=0;i<listapar.length;i++){
            System.out.print(listapar[i] +"; ");
        }
    }


    public static void impar(int[] lista){
        int[] listaimpar=new int[lista.length];
        for (int i=0;i<lista.length;i++) {
            if(lista[i]%2!=0){
                listaimpar[i]=lista[i];
            }
            
        }
        System.out.println();
        System.out.println("LISTA IMPAR"); 
        for (int i : listaimpar) {
            System.out.print(i+" ;");
        }
        
    }

}