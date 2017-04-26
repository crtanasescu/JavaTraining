package pJUnitSiExceptii.ex2geometry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;

/**
 * Created by Tina on 4/24/2017.
 */
public class GeometricFormsTest {

    private static GeometricForms form1;
    private static GeometricForms form2;
    private static GeometricForms form3;

    @BeforeClass
    public static void setUp(){
         form1 = new GeometricForms("TRIANGLE");
         form2 = new GeometricForms("CIRCLE");
         form3 = new GeometricForms("RECTANGLE");
    }

    @Test
    public void testIsTriangle(){
      Assert.assertTrue(form1.isTriangle());
    }

    @Test
    public void testIsCircle(){
        Assert.assertTrue(form2.isCircle());
    }

    @Test
    public void testIsRectangle(){
        Assert.assertTrue(form3.isRectangle());
    }
}
