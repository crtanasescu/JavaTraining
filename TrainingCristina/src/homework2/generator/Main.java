package homework2.generator;

/**
 * Created by Ciprian on 9/24/2016.
 */
public class Main {
    public static void main(String[] args) {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator(6, "abcd");
//        System.out.println(randomStringGenerator.next());
//        System.out.println(randomStringGenerator.next());
//        System.out.println(randomStringGenerator.next());

        PasswordGenerator passwordGenerator = new PasswordGenerator("Cristina", "Tanasescu", 27);
        System.out.println(passwordGenerator.getPassword());


    }
}
