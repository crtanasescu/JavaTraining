package pJUnitSiExceptii.ex1gradinaZoo;

import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Tina on 4/24/2017.
 */
public class Test {
    private Zoo zoo;

    @Before
    public void setUp(){
        zoo = new Zoo();
    }

    @org.junit.Test
    public void testAddAnimal(){
        Animal animalDeAdaugat = new Animal("cal salbatic", 6);
        zoo.addAnimal(animalDeAdaugat);

        Assert.assertEquals(zoo.getAnimal(0),animalDeAdaugat);
    }

    @org.junit.Test
    public void testRemoveAnimal(){
        zoo.addAnimal(new Animal("maimuta", 7));
        zoo.removeAnimal(zoo.getAnimal(0));

        Assert.assertTrue(zoo.size() == 0);
    }

    @org.junit.Test
    public void testAreAnimalsInZoo(){
        zoo.addAnimal(new Animal("lebada", 1));
        if(!zoo.areAnimals()){
            fail("Nu exista animale in zoo");
        }
    }

    @org.junit.Test
    public void testGetAnimals(){
        zoo.addAnimal(new Animal("urs", 5));
        zoo.addAnimal(new Animal("lup", 6));

        //??????? asta trebuie sa cada dar nu sunt sigura cum se foloseste mai exact assertFalse
        Assert.assertFalse("Nu sunt animale" , zoo.areAnimals());
    }

}
