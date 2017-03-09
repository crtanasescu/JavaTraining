package htemaLaborator7Colectii;

import java.util.Comparator;

/**
 * Created by Tina on 3/7/2017.
 */
class ComparatorPentruMedii implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return 1;
        }
        if(o1 > o2){
            return -1;
        }
        if(o1.equals(o2)){
            return 0;
        }
        return 0;
    }

}
