package homework2.generator;

import java.util.Random;

/**
 * Created by Ciprian on 9/24/2016.
 */
public class RandomStringGenerator {
    private int n;
    private char [] litereAlfabet;

    public RandomStringGenerator(int n, String alfabet) {
        this.n = n;
        this.litereAlfabet = alfabet.toCharArray();
    }

    public String next(){
        Random random = new Random();
        char [] randomChar = new char[n];
        for(int i=0; i<=n-1; i++){
            randomChar[i] = litereAlfabet[random.nextInt(litereAlfabet.length)];
        }
        String finalString = new String(randomChar);
        return finalString;
    }
}
