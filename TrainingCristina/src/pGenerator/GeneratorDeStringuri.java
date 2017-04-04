package pGenerator;

import java.util.Random;

/**
 * Created by Tina on 4/4/2017.
 */
public class GeneratorDeStringuri {
    private Random rand;
    private char[] letters;

    public GeneratorDeStringuri() {
        rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'd'; c++) {
            sb.append(c);
        }
        letters = sb.toString().toCharArray();  //leters reprezinta un vector de char-uri ce sunt literele cu care se formeaza stringul->abcd
    }

    public String genereazaString() {
        return new String( generateString(7));
    }

    private String generateString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(letters[rand.nextInt(letters.length)]);    //la noul string append uim elementul de pe o pozitie random din vectotul de char abcd
        }
        return sb.toString();
    }
}
