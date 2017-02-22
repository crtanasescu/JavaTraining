package temaLaborator7Colectii;

import java.util.HashSet;

/**
 * Created by Ciprian on 2/22/2017.
 */
public class MyHashSet<T> extends HashSet<T> {

    @Override
    public boolean add(T s) {
        if(this.contains(s)){
            System.out.println("Elementul " + s + " a fost deja adaugat");
        }
        return super.add(s);
    }

}
