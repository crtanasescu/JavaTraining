package pGenerator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by crtanasescu on 5/9/2017.
 */
public class ComparatorPeTreeSet implements Comparator<String> {

        private final char literaPentruSortare;

        public ComparatorPeTreeSet(char letterToCount) {
            this.literaPentruSortare = letterToCount;
        }

        public int compare(String o1, String o2) {
            int i = getNumarDeAparitii(o2) - getNumarDeAparitii(o1);
            if( i != 0 ){
                return i;
            }
            else {
                return i+1;
            }
        }


        private int getNumarDeAparitii(String str) {
            int contor = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == literaPentruSortare) {
                    contor++;
                }
            }
            return contor;
        }
    }









