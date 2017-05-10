package pJUnitSiExceptii.ex4calculator;

import org.junit.Assert;
import org.junit.Before;

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

    @org.junit.Test
    public void testAddMethod(){
        int suma = calculator.add(4,5);

        Assert.assertEquals(suma, 9);
    }

    @org.junit.Test
    public void testDivideMethod(){
        int catul = calculator.divide(6,0);

        Assert.assertEquals(catul, 2);
    }

    @org.junit.Test
    public void testAverageMethod(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(3);
        lista.add(1);
        int media = calculator.average(lista);

        Assert.assertEquals(media, 2);

    }



}
