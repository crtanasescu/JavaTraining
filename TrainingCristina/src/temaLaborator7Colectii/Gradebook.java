package temaLaborator7Colectii;

import java.util.*;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class Gradebook extends TreeMap <Integer, ArrayList<Student>>{
   // Map <Float,ArrayList<StudentMare>> gradebook = new TreeMap(Collections.reverseOrder());
    ComparatorPentruMedii comparator;
    private Integer key;
    private ArrayList<Student> listaStudenti;


    public Gradebook() {
    }

    public Gradebook(ComparatorPentruMedii comparator) {
        this.comparator = comparator;
    }

    @Override
    public ArrayList<Student> put(Integer key, ArrayList <Student> value) {
        if (key >= 0 && key <= 10) {
            return super.put(key, value);
        } else {
            return null;
        }
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public ArrayList<Student> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(ArrayList<Student> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }
}




