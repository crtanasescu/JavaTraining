package homework5;

/**
 * Created by ctana on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        int [] a = {1,0,7,2};
        int [] b = {7,9,3,0,9};
        Mate mate = new Mate(a,b);
        mate.adunare(a,b);
    }
}
