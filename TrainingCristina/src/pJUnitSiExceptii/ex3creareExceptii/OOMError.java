package pJUnitSiExceptii.ex3creareExceptii;

import java.util.Map;
import java.util.Random;

/**
 * Created by Tina on 4/26/2017.
 */
public class OOMError {

    public static void main(String[] args) {

        /*
        --OutOfMemoryError nu poate aloca memoria ceruta de program si e related cu memoria HEAP--
        in acest exemplu iteram de 4 ori si initializam un array de int-uri
        foarte mari de fiecare data. Marimea vectorului pe care programul incearca
        sa il initializeze creste la fiecare iterare pana cand la ultimul pas ajunge
        la Integer.MAX_VALUE = 2^31
        */

        /*
        Inainte sa ajunga la OutOfMemoryError: Requested array exceeds VM limit(ultimele
        doua incercari), programul trece mai intai prin OOMError: Java heap space. Se intampla deoarece
        primitivele int pe care incearca sa le faca loc necesita 8G de memorie.

        VM limit apare doar pt Integer.MAX_INT-1 si Integer_MAX_INT.
         */

        for (int i = 3; i >= 0; i--) {
            try {
                int[] arr = new int[Integer.MAX_VALUE - i];
                System.out.format("Successfully initialized an array with %,d elements.\n", Integer.MAX_VALUE - i);
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }

}
