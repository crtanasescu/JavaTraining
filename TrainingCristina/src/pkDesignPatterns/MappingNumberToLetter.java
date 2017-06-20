package pkDesignPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crtanasescu on 6/20/2017.
 */
public class MappingNumberToLetter {
    List<Character> lista = new ArrayList<Character>();

    public MappingNumberToLetter() {
        for(char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            lista.add(alphabet);
        }
//        for (int i = 0; i < lista.size() ; i++) {
//            System.out.println((i+1) + " - " + lista.get(i));
//        }
    }
}
