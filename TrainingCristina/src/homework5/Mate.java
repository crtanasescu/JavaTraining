package homework5;


/**
 * Created by ctana on 12.10.2016.
 */
public class Mate {

    public Mate() {}

    public int[] adunare(int[] a , int[] b){
        int[] rezultat = new int[10];
        int aLungime = a.length;
        int bLungime =b.length;
        int diferenta = aLungime - bLungime;
        for (int i= aLungime - 1; i>= 0; i-- ){
            if(a[i] + b[i] < 10) {
                rezultat[i] = a[i] + b[i];
            }else
        }

        return ;
    }

}
