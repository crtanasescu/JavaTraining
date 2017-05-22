package pJUnitSiExceptii.ex4calculator;

import java.util.ArrayList;

/**
 * Created by Tina on 4/25/2017.
 */
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(calculator.add(2,5));
        //System.out.println(calculator.add(Integer.MIN_VALUE , -1));
        //System.out.println(calculator.add(Integer.MAX_VALUE - 1, 5));
        //System.out.println(calculator.divide(6,0));

        ArrayList<Integer> nisteIntregi = new ArrayList<Integer>();
        nisteIntregi.add(2);
        nisteIntregi.add(6);
        nisteIntregi.add(7);
        System.out.println(nisteIntregi);
        System.out.println(calculator.average(nisteIntregi));
    }

}
