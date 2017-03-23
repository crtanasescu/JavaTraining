package penguin;


import homework3.homeworkLab3.exercise6.Array;

import java.util.ArrayList;

import static java.lang.Math.abs;


/**
 * Created by crtanasescu on 3/23/2017.
 */
public class MapaMutantSubAcoperire  {
    ArrayList<ArrayList<Entry>> listaDeBucheturi = new ArrayList<ArrayList<Entry>>(12);

    public MapaMutantSubAcoperire() {
        for(int i = 0; i< 12; i++){
            listaDeBucheturi.add(null);
        }
    }

    public Penguin add(String nume, Penguin pinguin){
        int hashCode = abs(nume.hashCode()%12);
        ArrayList<Entry> listaDeEntryuri = listaDeBucheturi.get(hashCode);
        if (listaDeEntryuri == null) {
            listaDeEntryuri = new ArrayList<Entry>();
            listaDeBucheturi.add(hashCode, listaDeEntryuri);
        }
        Entry e = new Entry(nume,pinguin);
        listaDeEntryuri.add(e);
        return e.valoare;
    }

    public Penguin get(String numePinguin){
        int hashCode = numePinguin.hashCode();
        ArrayList<Entry> listaDeEntryuri = listaDeBucheturi.get(abs(hashCode)%12);
        for( int i=0; i<listaDeEntryuri.size(); i++){
            if(listaDeEntryuri.get(i).cheie.equals(numePinguin) ){
                return listaDeEntryuri.get(i).valoare;
            }
        }
        return null;
    }

}
