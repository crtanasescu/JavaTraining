package pJUnitSiExceptii.ex4calculator;

import java.util.ArrayList;

/**
 * Created by Tina on 4/25/2017.
 */
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(999999999,999999999));
        System.out.println(calculator.divide(6,2));

        ArrayList<Integer> nisteIntregi = new ArrayList<Integer>();
        nisteIntregi.add(2);
        nisteIntregi.add(6);
        nisteIntregi.add(7);
        System.out.println(calculator.average(nisteIntregi));
    }

}