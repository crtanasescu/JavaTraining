package pGenerator;

import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by Tina on 4/4/2017.
 */
public class SortareStringuriDupaNumarulDeAparitiiAlUneiCifre {


    public void sorteaza(TreeSet<String> ts, char c) {
        switch (c) {
            case 'a':


        }

    }

    public int[] numaraLiterele(TreeSet<String> ts, char c) {
        int[] vectorNumarLitereDeUnAnumitFel = new int[20];
        int aux =0;
        for (String s : ts) {
            char[] charVector = s.toCharArray();
            int contor = 0;
            for (char litera : charVector) {
                if (litera == c) {
                    contor ++;
                }
            }
            vectorNumarLitereDeUnAnumitFel[aux++] = contor;
        }
        return vectorNumarLitereDeUnAnumitFel;
    }

    public void afiseaza(int[] a){
        System.out.print( "[ " );
        for(int i=0; i<a.length; i++){
            System.out.print( a[i] + " ");
        }
        System.out.println("]");
    }

}
