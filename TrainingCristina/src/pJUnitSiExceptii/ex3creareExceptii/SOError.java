package pJUnitSiExceptii.ex3creareExceptii;

/**
 * Created by Tina on 4/26/2017.
 */
public class SOError {

    /*
    --StackOverflowError tine de memoria STACK. Dupa aceasta eroare, programul poate continua :) --
     */

    public static void endless() {
        endless();
    }

    public static void main(String args[]) {
        try {
            endless();
        } catch(StackOverflowError t) {
            // more general: catch(Error t)
            // anything: catch(Throwable t)
            System.out.println("Caught "+t);
            t.printStackTrace();
        }
        System.out.println("After the error...");
    }
}
