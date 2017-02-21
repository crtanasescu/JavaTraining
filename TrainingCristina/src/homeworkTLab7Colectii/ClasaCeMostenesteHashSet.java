package homeworkTLab7Colectii;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class ClasaCeMostenesteHashSet extends HashSet<Integer> {
    int nrTotalDeElementeAdaugate;

    @Override
    public boolean add(Integer element) {
        nrTotalDeElementeAdaugate++;
        return super.add(element);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> collectionOfElements) {
        boolean modified = false;
        for (Integer element : collectionOfElements) {
            if (add(element)) {
                nrTotalDeElementeAdaugate++;
                modified = true;
            }
        }
        return modified;
    }
}
