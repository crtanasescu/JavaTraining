package htemaLaborator7Colectii;

import java.util.HashSet;

/**
 * Created by Ciprian on 2/22/2017.
 */
public class MyHashSet<T> extends HashSet<T> {

    @Override
    public boolean add(T t) {
        if(this.contains(t)){
            System.out.println("Elementul " + t + " a fost deja adaugat");
        }
        return super.add(t);
    }

}
