package htemaLaborator7Colectii;

import homework3.homeworkLab3.exercise6.Array;

import java.util.*;

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


        Set<Student> colectieStudenti = new MyHashSet<Student>();
        System.out.println(new Student("vasile", 5.4f).equals(new Student("vasile", 5.4f)));
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
        for (Student s : colectiePentruIterare){
            System.out.println(s.equals(s));
            System.out.println(s.equals((Object)s));
        }
        System.out.println();





        ComparatorPentruMedii cpm = new ComparatorPentruMedii();
        Gradebook gr = new Gradebook(cpm);
        gr.add(new Student("ana", 5.5f));
        gr.add(new Student("ionel", 5.7f));
        gr.add(new Student("Cristi", 0.1f));
        gr.add(new Student("Dragan ", 1.4f));
        gr.add(new Student("Marian", 1.5f));
        gr.add(new Student("Ioana", 2.3f));
        gr.add(new Student("Enache", 2.4f));
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

        ArrayList<Integer> keys = new ArrayList<Integer>(gr.keySet());
        Collections.sort(keys, new ComparatorPentruMedii());
        System.out.println(keys);
        System.out.println(gr);
        System.out.println();


        Iterator entries = gr.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry thisEntry = (Map.Entry) entries.next();
            Integer key = (Integer)thisEntry.getKey();
            ArrayList value =  (ArrayList) thisEntry.getValue();
            if(value.size() > 0){
                Collections.sort(value);
            }
        }
        System.out.println(gr);



        System.out.println();
        ClasaCeMostenesteHashSet clasaCeMostenesteHashSet = new ClasaCeMostenesteHashSet();
        clasaCeMostenesteHashSet.add(10);
        clasaCeMostenesteHashSet.add(12);
        System.out.println(clasaCeMostenesteHashSet);
        System.out.println(clasaCeMostenesteHashSet.nrTotalDeElementeAdaugate);
        ClasaCeMostenesteHashSet altaColectie = new ClasaCeMostenesteHashSet();
        altaColectie.add(13);
        altaColectie.add(14);
        altaColectie.add(15);
        System.out.println(altaColectie);
        System.out.println(altaColectie.nrTotalDeElementeAdaugate);
        clasaCeMostenesteHashSet.addAll(altaColectie);
        System.out.println(clasaCeMostenesteHashSet);
        System.out.println(clasaCeMostenesteHashSet.nrTotalDeElementeAdaugate);




        ClasaCeMostenesteLinkedList clasaCeMostenesteLinkedList = new ClasaCeMostenesteLinkedList();
        clasaCeMostenesteLinkedList.add(10);
        clasaCeMostenesteLinkedList.add(12);
        System.out.println(clasaCeMostenesteLinkedList);
        System.out.println(clasaCeMostenesteLinkedList.nrTotalDeElementeAdaugate);
        ClasaCeMostenesteLinkedList oAltaColectieDeAgaugat = new ClasaCeMostenesteLinkedList();
        oAltaColectieDeAgaugat.add(13);
        oAltaColectieDeAgaugat.add(14);
        oAltaColectieDeAgaugat.add(15);
        System.out.println(oAltaColectieDeAgaugat);
        System.out.println(oAltaColectieDeAgaugat.nrTotalDeElementeAdaugate);
        clasaCeMostenesteLinkedList.addAll(oAltaColectieDeAgaugat);
        System.out.println(clasaCeMostenesteLinkedList);
        System.out.println(clasaCeMostenesteLinkedList.nrTotalDeElementeAdaugate);





    }
}
