package phGenericitate.ex1tabelaDeDispersie;

import homework3.homeworkLab3.exercise6.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Tina on 4/24/2017.
 */
public class MyHashMap {
    HashMap<Integer,ArrayList<String> > hashMap;

    public MyHashMap() {
        hashMap = new HashMap<Integer, ArrayList<String>>();
    }

    public void put(Entry entry){
        ArrayList <String> listaDeValori = hashMap.get(entry.cheie);

            if(listaDeValori == null){
                listaDeValori = new ArrayList<String>();
            }

            listaDeValori.add(entry.valoare);
            hashMap.put(entry.cheie, listaDeValori);

        }
    }


//
//    Iterator it = hashMap.entrySet().iterator();
//        while(it.hasNext()){
//                Entry thisEntry = (Entry) it.next();
//                int cheie = thisEntry.cheie;
//                String valoare = thisEntry.valoare;


//    ArrayList<String> listaDeValori = new ArrayList<String>();
//
//    public MyHashMap() {
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
//
//
//    public void put(phGenericitate.ex1tabelaDeDispersie.Entry entry) {
//        ArrayList<Entry> listaDeEntryuri = listaDeValori.get()
//        if(hashMap == null){
//            hashMap = new HashMap();
//        }
//
//        put(entry.cheie, entry.valoare);
//    }

