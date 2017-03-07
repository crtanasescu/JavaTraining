package temaLaborator7Colectii;

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




        Set<Student> listaStudentiPentruMapa = new MyHashSet<Student>();
        listaStudentiPentruMapa.add(new Student("Cristi Ionescu", 0.1f));
        listaStudentiPentruMapa.add(new Student("Dragan Marian", 1.4f));
        listaStudentiPentruMapa.add(new Student("Ioana Enache", 2.3f));
        listaStudentiPentruMapa.add(new Student("Cosmin Petrache", 3.0f));
        listaStudentiPentruMapa.add(new Student("Iulian Istrate", 4.0f));
        listaStudentiPentruMapa.add(new Student("Calin Ion", 4.4f));
        listaStudentiPentruMapa.add(new Student("Ioana Iordache", 4.5f));
        listaStudentiPentruMapa.add(new Student("Ana Popescu", 5.1f));
        listaStudentiPentruMapa.add(new Student("Alina Tanase", 5.4f));
        listaStudentiPentruMapa.add(new Student("Ionel Negrea", 6.0f));
        listaStudentiPentruMapa.add(new Student("Cristina Mircea", 7.3f));
        listaStudentiPentruMapa.add(new Student("Cristian Iordachescu", 8.4f));
        listaStudentiPentruMapa.add(new Student("Calin Ene", 9.1f));
        listaStudentiPentruMapa.add(new Student("Cristina Marinescu", 9.9f));

        for(Student s : listaStudentiPentruMapa){
            Float medieRotunjita =  s.getMedie();

        }
        Gradebook gr = new Gradebook();






    }
}
