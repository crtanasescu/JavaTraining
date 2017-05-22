package phGenericitate.ex1tabelaDeDispersie;

import homework3.homeworkLab3.exercise6.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Tina on 4/24/2017.
 */
public class MyHashMap<K,V> implements Iterable{
    Map<K,V> hashMap;
   // ArrayList<Entry> entries;

    public MyHashMap() {
        hashMap = new HashMap <K,V>();
    }

    public void put(Entry entry){
        hashMap.put((K)entry.K, (V)entry.V);
    }

    public V get(K key){
        Iterator entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            HashMap.Entry thisEntry = (HashMap.Entry) entries.next();
            K cheie = (K) thisEntry.getKey();
            V value =  (V) thisEntry.getValue();
            if(cheie == key){
                return value;
            }
        }
        return null;
    }



    //    public void put(Entry entry){
//
//
//
//
////        ArrayList <String> listaDeValori = hashMap.get(entry.cheie);
////
////        if(listaDeValori == null){
////            listaDeValori = new ArrayList<String>();
////        }
////
////        listaDeValori.add(entry.valoare);
////        hashMap.put(entry.cheie, listaDeValori);
//
//        //hashMap.put();
//
//    }
//
//    public Object get(int key) {
//        Iterator entries = hashMap.entrySet().iterator();
//        while (entries.hasNext()) {
//            HashMap.Entry thisEntry = (HashMap.Entry) entries.next();
//            Integer cheie = (Integer) thisEntry.getKey();
//            ArrayList value =  (ArrayList) thisEntry.getValue();
//            if(cheie == key){
//                return value;
//            }
//        }
//        return null;
//    }

    @Override
    public String toString() {
        return "hashMap=" + hashMap +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;

        return hashMap != null ? hashMap.equals(myHashMap.hashMap) : myHashMap.hashMap == null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Iterator iterator() {
        return null;
    }



}
