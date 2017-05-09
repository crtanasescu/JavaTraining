package pGenerator;

import java.util.*;

/**
 * Created by Tina on 4/4/2017.
 */
public class SortareStringuriDupaNumarulDeAparitiiAlUneiCifre {


    public void sorteaza(TreeSet<String> ts, char c) {
        switch (c) {
            case 'a': sorteazaDupaLitera(numaraLitereleSiCreeazaMap(ts, 'a'), 'a'); break;
            case 'b': sorteazaDupaLitera(numaraLitereleSiCreeazaMap(ts, 'b'), 'b'); break;
            case 'c': sorteazaDupaLitera(numaraLitereleSiCreeazaMap(ts, 'c'), 'c'); break;
            case 'd': sorteazaDupaLitera(numaraLitereleSiCreeazaMap(ts, 'd'), 'd'); break;
            case 'x': System.exit(0);

            default:
                System.out.println("Aceasta optiune de sortare nu exista! Pentru iesire apasati x.");
        }
    }

    private HashMap<Integer, ArrayList<String>> numaraLitereleSiCreeazaMap(TreeSet<String> ts, char c) {
        HashMap<Integer, ArrayList<String>> tineEvidenta = new HashMap<Integer, ArrayList<String>>();
        for (String s : ts) {
            char[] charVector = s.toCharArray();
            int contor = 0;
            for (char litera : charVector) {
                if (litera == c) {
                    contor ++;
                }
            }

            ArrayList<String> listaStringuri = tineEvidenta.get(contor);

            if (listaStringuri == null) {
                listaStringuri = new ArrayList<String>();
            }

            listaStringuri.add(s);
            tineEvidenta.put(contor, listaStringuri);
        }
        return tineEvidenta;
    }



    private void sorteazaDupaLitera(HashMap<Integer, ArrayList<String> > hm, char c) {
        for (int i = 7; i >= 0; i--) {
            ArrayList<String> value = hm.get(i);
            if(value != null){
                Collections.sort(value);
                System.out.println();
                System.out.println("String-urile care contin litera " + c + " de " + i + " ori sunt: ");
                afisare(value);
            }
        }
    }

    private void afisare( ArrayList<String> a){
        for(String s : a){
            System.out.print(s + "   ");
        }

    }




}
