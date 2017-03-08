package temaLaborator7Colectii;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ciprian on 2/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> colectieCuNume = new MyHashSet<String>();
        colectieCuNume.add("vasile");
        colectieCuNume.add("Costica");
        colectieCuNume.add("vasile");
        System.out.println(colectieCuNume);
        System.out.println();


        System.out.println(new Student("vasile", 5.4f).equals(new Student("vasile", 5.4f)));
        Set<Student> colectieStudenti = new MyHashSet<Student>();
        colectieStudenti.add(new Student("vasile", 5.4f));
        colectieStudenti.add(new Student("vasile", 5.4f));
        System.out.println(colectieStudenti);
        System.out.println();


        Set<Student> colectiePentruIterare = new MyHashSet<Student>();
        colectiePentruIterare.add(new Student("Vali", 6.7f));
        colectiePentruIterare.add(new Student("Cristina", 9.5f));
        colectiePentruIterare.add(new Student("Alina", 9.7f));
        colectiePentruIterare.add(new Student("Alina", 9.7f));
        System.out.println(colectiePentruIterare);
        for ( Student s : colectiePentruIterare){
            System.out.println(s.equals(s));
            System.out.println((Object)s.equals(s));
        }
        System.out.println();




      

        ComparatorPentruMedii cpm = new ComparatorPentruMedii();
        Gradebook gr = new Gradebook(cpm);
        gr.add(new Student("ana", 5.5f));
        gr.add(new Student("ionel", 5.7f));
        gr.add(new Student("Cristi Ionescu", 0.1f));
        gr.add(new Student("Dragan Marian", 1.4f));
        gr.add(new Student("Ioana Enache", 2.3f));
        gr.add(new Student("Cosmin Petrache", 3.0f));
        gr.add(new Student("Iulian Istrate", 4.0f));
        gr.add(new Student("Calin Ion", 4.4f));
        gr.add(new Student("Ioana Iordache", 4.5f));
        gr.add(new Student("Ana Popescu", 5.1f));
        gr.add(new Student("Alina Tanase", 5.4f));
        gr.add(new Student("Ionel Negrea", 6.0f));
        gr.add(new Student("Cristina Mircea", 7.3f));
        gr.add(new Student("Cristian Iordachescu", 8.4f));
        gr.add(new Student("Calin Ene", 9.1f));
        gr.add(new Student("Cristina Marinescu", 9.9f));
        
        
        gr.returnKey();
        
        
        
        System.out.println(gr);
        System.out.println(cpm);
//        for(Student stud : gr) {
//            int medieRotunjita = Math.round( stud.getMedie());
//            gr.put(medieRotunjita, );
//        }







    }
}
