package phGenericitate.ex1tabelaDeDispersie;

import java.util.HashMap;

/**
 * Created by Tina on 4/24/2017.
 */
public class Main {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        Entry entry1 = new Entry(1, "lalajsnkjf");
        Entry entry2 = new Entry(2, "b");
        Entry entry3 = new Entry(2, "ana");

        System.out.println(entry1);

        myHashMap.put(entry1);
        myHashMap.put(entry2);
        myHashMap.put(entry3);
        System.out.println(myHashMap);

        System.out.println(myHashMap.get(0));    //nu exista cheia 0 deci va afisa null;
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.get(3));    //nu exista cheia 3 deci va afisa null;




    }
}
