package pGenerator;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Tina on 4/4/2017.
 */
public class Main {
    public static void main(String[] args) {
        GeneratorDeStringuri generatorDeStringuri = new GeneratorDeStringuri();
        //System.out.println(generatorDeStringuri.genereazaString());


        TreeSet<String> ts = new TreeSet<String>();
        for(int i=0; i<20; i++){
            ts.add(generatorDeStringuri.genereazaString());
        }
        System.out.println("Stringurile generate si puse in TreeSet sunt: \n" + ts);

        SortareStringuriDupaNumarulDeAparitiiAlUneiCifre ssdndaauc = new SortareStringuriDupaNumarulDeAparitiiAlUneiCifre();


        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Introduceti de la tastatura litera dupa care doriti sortarea: ");
            char c = scan.next().charAt(0);
            ssdndaauc.sorteaza(ts, c);
        }

    }
}
