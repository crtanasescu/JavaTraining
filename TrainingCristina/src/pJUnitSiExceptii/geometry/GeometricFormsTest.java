package pJUnitSiExceptii.geometry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tina on 4/24/2017.
 */
public class GeometricFormsTest {

    GeometricForms form1;
    GeometricForms form2;
    GeometricForms form3;

    @Before
    public void setUp(){
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
