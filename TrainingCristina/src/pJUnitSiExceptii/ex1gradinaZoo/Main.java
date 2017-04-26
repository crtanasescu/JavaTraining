package pJUnitSiExceptii.ex1gradinaZoo;

/**
 * Created by Tina on 4/24/2017.
 */
public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Animal("girafa", 3));
        zoo.addAnimal(new Animal("zebra", 1));
        zoo.addAnimal(new Animal("leu", 2));
        zoo.getAnimals();

        zoo.removeAnimal(new Animal("girafa", 3));
        zoo.getAnimals();

//        System.out.println(zoo.areAnimals());
//        System.out.println(zoo.size());
//
//        zoo.removeAnimal(zoo.getAnimal(1));
//        zoo.removeAnimal(zoo.getAnimal(0));
//        zoo.getAnimals();
//        System.out.println( zoo.areAnimals());
//
//        System.out.println(zoo.size());


    }
}
