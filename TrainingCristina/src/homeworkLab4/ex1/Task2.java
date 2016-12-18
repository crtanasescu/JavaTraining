package homeworkLab4.ex1;

import java.util.Random;

/**
 * Created by Ciprian on 11/23/2016.
 */
public class Task2 implements Task {
    private int numarGenerat;

    public Task2() {
        Random random = new Random();
        this.numarGenerat = random.nextInt();
    }

    public void execute() {
        System.out.println("Numarul generat random este: " + numarGenerat);
    }
}
