package homework2.generator;

/**
 * Created by Ciprian on 9/24/2016.
 */
public class PasswordGenerator {

    private final int MAGIC_NUMBER = 5;
    private final String MAGIC_STRING = "abcdefghijklmnopqrstuvwxyz";
    private String firstName;
    private String lastName;
    private int age;

    public PasswordGenerator(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
    }

    public String getPassword(){
        return  firstPart() + " " + secondPart() + " " + thirdPart();
    }

    private String thirdPart() {
        return String.valueOf(age+lastName.length());

    }

    private String secondPart() {
        RandomStringGenerator randomStringGenerator1 = new RandomStringGenerator(10,MAGIC_STRING);
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator(MAGIC_NUMBER, randomStringGenerator1.next());
        return randomStringGenerator.next();
    }

    private String firstPart() {
        int litereDinFirstName = age%3;
        return firstName.substring(firstName.length() - litereDinFirstName);
    }
}
