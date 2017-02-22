package homeworkTLab7Colectii;

import java.util.*;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class Main {

    public static   Set<String> colectieNume = new HashSet<String>();
    //ceva cu equals?
    public static void main(String[] args) {

        colectieNume.add("Tanasescu");
        colectieNume.add("Tanasescu");
        System.out.println(colectieNume);


        TreeSet<Student> t =new TreeSet();
        t.add(new Student("Marius", 9));

//        Set<Student> colectieStudenti = new HashSet<Student>();
//        colectieStudenti.add(new Student("Marius", 9));
//        colectieStudenti.add(new Student("Catalina", 10));
//        System.out.println(colectieStudenti);
//        colectieStudenti.add(new Student("Marius", 9));
//        System.out.println(colectieStudenti);
//
//
//        for(Student s : colectieStudenti){
//            System.out.println(s.equals(s));
//         //   System.out.println(((Object)s).equals(s));
//        }



        ClasaCeMostenesteHashSet clasaCeMostenesteHashSet = new ClasaCeMostenesteHashSet();
        clasaCeMostenesteHashSet.add(10);
        clasaCeMostenesteHashSet.add(12);
        System.out.println(clasaCeMostenesteHashSet);
        System.out.println(clasaCeMostenesteHashSet.nrTotalDeElementeAdaugate);
        Set altaColectie = new HashSet();
        altaColectie.add(13);
        altaColectie.add(14);
        altaColectie.add(15);
        System.out.println(altaColectie);
        clasaCeMostenesteHashSet.addAll(altaColectie);
        System.out.println(clasaCeMostenesteHashSet);
        System.out.println(clasaCeMostenesteHashSet.nrTotalDeElementeAdaugate);




        ClasaCeMostenesteLinkedList clasaCeMostenesteLinkedList = new ClasaCeMostenesteLinkedList();
        clasaCeMostenesteLinkedList.add(10);
        clasaCeMostenesteLinkedList.add(12);
        System.out.println(clasaCeMostenesteLinkedList);
        System.out.println(clasaCeMostenesteLinkedList.nrTotalDeElementeAdaugate);
        Set oAltaColectieDeAgaugat = new HashSet();
        oAltaColectieDeAgaugat.add(13);
        oAltaColectieDeAgaugat.add(14);
        oAltaColectieDeAgaugat.add(15);
        clasaCeMostenesteLinkedList.addAll(oAltaColectieDeAgaugat);
        System.out.println(oAltaColectieDeAgaugat);
        System.out.println(clasaCeMostenesteLinkedList);
        System.out.println(clasaCeMostenesteLinkedList.nrTotalDeElementeAdaugate);
    }
}
