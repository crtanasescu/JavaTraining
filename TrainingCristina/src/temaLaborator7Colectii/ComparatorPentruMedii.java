package temaLaborator7Colectii;

import java.util.Comparator;

/**
 * Created by Tina on 3/7/2017.
 */
class ComparatorPentruMedii implements Comparator<Gradebook> {


    public int compare(Gradebook o1, Gradebook o2) {

        if(o1.getKey() < o2.getKey()){
            return 1;
        }
        if(o1.getKey() > o2.getKey()){
            return -1;
        }
        if(o1.equals(o2)){
            return 0;
        }
        return 0;
    }

}
