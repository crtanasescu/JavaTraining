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
        System.out.println(generatorDeStringuri.genereazaString());


        TreeSet<String> ts = new TreeSet<String>();
        for(int i=0; i<20; i++){
            ts.add(generatorDeStringuri.genereazaString());
        }
        System.out.println(ts);

        SortareStringuriDupaNumarulDeAparitiiAlUneiCifre ssdndaauc = new SortareStringuriDupaNumarulDeAparitiiAlUneiCifre();

        ssdndaauc.afiseaza(ssdndaauc.numaraLiterele(ts,'a'));
        ssdndaauc.afiseaza(ssdndaauc.numaraLiterele(ts,'b'));
        ssdndaauc.afiseaza(ssdndaauc.numaraLiterele(ts,'c'));
        ssdndaauc.afiseaza(ssdndaauc.numaraLiterele(ts,'d'));

        ssdndaauc.sorteaza(ts,'a');


        Scanner scan = new Scanner(System.in);
        System.out.println(" Introduceti de la tastatura litera dupa care doriti sortarea: ");
        char c = scan.next().charAt(0);
        System.out.println(c);

    }
}
