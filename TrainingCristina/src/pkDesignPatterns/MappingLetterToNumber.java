package pkDesignPatterns;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by crtanasescu on 6/19/2017.
 */
public class MappingLetterToNumber {
    Map <Character, Integer> mapa = new HashMap<Character, Integer>();


    public MappingLetterToNumber() {
        int i = 1;
        for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            mapa.put(alphabet, i++);
        }
    }

    public int get(char letter){
        Iterator entries = mapa.entrySet().iterator();
        while (entries.hasNext()) {
            HashMap.Entry thisEntry = (HashMap.Entry) entries.next();
            char cheie = (Character) thisEntry.getKey();
            if(cheie == letter){
                return (Integer) thisEntry.getValue();
            }
        }
        return 0;
    }

}
