package phGenericitate.ex1tabelaDeDispersie;

import java.util.HashMap;

/**
 * Created by Tina on 4/24/2017.
 */
public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> myHashMap = new MyHashMap();

        Entry entry1 = new Entry(1,"Ana");
        Entry entry2 = new Entry(2, "b");
        Entry entry3 = new Entry(2, "ana");
        Entry entry4 = new Entry(2, "maricela");



        //System.out.println(entry1);

        myHashMap.put(entry1);
        System.out.println(myHashMap);
        myHashMap.put(entry2);
        System.out.println(myHashMap);
        myHashMap.put(entry3);
        System.out.println(myHashMap);
        myHashMap.put(entry4);
        System.out.println(myHashMap);

        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.get(1));


        MyHashMap<Student,String> hashMap2 = new MyHashMap();
        Entry entry5 = new Entry(new Student("ana", 1),"Ana");
        hashMap2.put(entry5);
        System.out.println(hashMap2);




    }
}
