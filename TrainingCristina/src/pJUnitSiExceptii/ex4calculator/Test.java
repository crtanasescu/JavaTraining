package pJUnitSiExceptii.ex4calculator;

import org.junit.Assert;
import org.junit.Before;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/**
 * Created by Tina on 4/26/2017.
 */
public class Test {
    Calculator calculator;

    @Before
    public void setUP() {
        calculator = new Calculator();
    }

    @org.junit.Test(expected=BufferUnderflowException.class)
    public void testAddMethodForUnderflow(){
         calculator.add(Integer.MIN_VALUE , -1);
    }

    @org.junit.Test(expected= BufferOverflowException.class)
    public void testAddMethodForOverflow(){
        calculator.add(Integer.MAX_VALUE , 1);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void testDivideMethod(){
       calculator.divide(6,0);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void testAverageMethod(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
       calculator.average(lista);
    }



}
