public class Pantalla {
    Anuncio cabeza;
    Anuncio cola;
    public Pantalla(){
        this.cabeza=null;
        this.cola=null;

    }

    public void agregar_anuncio(Anuncio nueco_anuncio) {
    
        if (cabeza == null) {
            cabeza = nueco_anuncio;
            cola = nueco_anuncio;
            nueco_anuncio.siguiente = cabeza;
        } else {
            cola.siguiente = nueco_anuncio; 
            nueco_anuncio.siguiente = cabeza; 
            cola = nueco_anuncio; 
        }
    }

    public void reproducir(int ciclos){
        if(cabeza == null){
            System.out.println("No hay anuncios");
            return;
        }

        int tiempoTotal = 0;
        Anuncio masRepetido = cabeza;

        for(int i = 0; i < ciclos; i++){
            Anuncio actual = cabeza;

            do{
                System.out.println("Mostrando: " + actual.titulo);

                actual.veces_repetidos+=1;

                tiempoTotal += actual.duracion_segundos;

                if(actual.veces_repetidos > masRepetido.veces_repetidos){
                    masRepetido = actual;
                }
                actual = actual.siguiente;

            }while(actual != cabeza); 
        }

        System.out.println("Tiempo total en pantalla: " + tiempoTotal + " segundos");
        System.out.println("Anuncio más repetido: " + masRepetido.titulo + " (" + masRepetido.veces_repetidos + " veces)");
    }
    
}
