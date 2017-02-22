package temaLaborator7Colectii;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ciprian on 2/22/2017.
 */
public class Main {
    public static void main(String[] args) {
//        Set<String> colectieCuNume = new MyHashSet<String>();
//        colectieCuNume.add("vasile");
//        colectieCuNume.add("Costica");
//        colectieCuNume.add("vasile");
//        System.out.println(colectieCuNume);

        System.out.println(new Student("vasile", 5.4f).equals(new Student("vasile", 5.4f)));
        Set<Student> colectieStudenti = new MyHashSet<Student>();
        colectieStudenti.add(new Student("vasile", 5.4f));
        colectieStudenti.add(new Student("vasile", 5.4f));
        System.out.println(colectieStudenti);




    }
}
