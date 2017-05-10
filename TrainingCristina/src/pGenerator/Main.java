package pGenerator;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Tina on 4/4/2017.
 */
public class Main {
    public static void main(String[] args) {
        GeneratorDeStringuri generatorDeStringuri = new GeneratorDeStringuri();


        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Introduceti de la tastatura litera dupa care doriti sortarea TreeSet-ului: ");
            char c = scan.next().charAt(0);
            if(c < 'a' || c > 'd') {
                System.out.println("Aceasta optiune de sortare nu exista!");
                return;
            }

            Set<String> ts = new TreeSet<String>(new ComparatorPeTreeSet(c));

            if(ts != null) {
                for (int i = 0; i < 20; i++) {
                    ts.add(generatorDeStringuri.genereazaString());
                }
                System.out.println("Stringurile generate si sortate in TreeSet dupa numarul de aparitii ale literei " + c + " sunt: \n" + ts);
            }
        }

       // SortareStringuriDupaNumarulDeAparitiiAlUneiCifre ssdndaauc = new SortareStringuriDupaNumarulDeAparitiiAlUneiCifre();

    }
}
