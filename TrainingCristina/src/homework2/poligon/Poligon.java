package homework2.poligon;

/**
 * Created by Ciprian on 9/24/2016.
 */
public class Poligon {
    private  Punct [] puncte;

    public Poligon(int n) {
        puncte = new Punct[n];
    }

    public Poligon(float [] vector){
        this(vector.length/2);
        for(int i = 0 ; i<=vector.length-1 ; i+=2){
            Punct punct = new Punct(vector[i],vector[i+1]);
            puncte[i/2] = punct;
        }
    }

    public void afisarePunctePoligon(){
        for(int i=0; i<= puncte.length -1; i++){
            puncte[i].afisarePunct();
        }
    }
}
