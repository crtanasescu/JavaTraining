package phGenericitate.ex1tabelaDeDispersie;

import homework3.homeworkLab3.exercise6.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Tina on 4/24/2017.
 */
public class MyHashMap implements Iterable{
    Map<Integer,ArrayList<String> > hashMap;  //?

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

    public Object get(int key) {
        Iterator entries = hashMap.entrySet().iterator();
        while (entries.hasNext()) {
            HashMap.Entry thisEntry = (HashMap.Entry) entries.next();
            Integer cheie = (Integer) thisEntry.getKey();
            ArrayList value =  (ArrayList) thisEntry.getValue();
            if(cheie == key){
                return value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "hashMap=" + hashMap +
                '}';
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Iterator iterator() {
        return null;
    }



}
