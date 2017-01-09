package redoHomeworkWithInterface.ex1;


import java.util.Random;

/**
 * Created by crtanasescu on 1/9/2017.
 */
public class Task2 implements Task {
    double randNumber;

    public Task2() {
        Random random = new Random();
        this.randNumber = random.nextInt();
    }

    public void execute() {
        System.out.println(randNumber);
    }
}
