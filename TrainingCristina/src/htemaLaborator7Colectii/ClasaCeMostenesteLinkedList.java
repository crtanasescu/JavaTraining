package htemaLaborator7Colectii;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class ClasaCeMostenesteLinkedList extends LinkedList<Integer>{
    int nrTotalDeElementeAdaugate;

    @Override
    public boolean add(Integer integer) {
        nrTotalDeElementeAdaugate++;
        return super.add(integer);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> colectie) {
        return super.addAll(colectie);
    }
}
