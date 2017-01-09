package redoHomeworkWithInterface.ex1;

/**
 * Created by crtanasescu on 1/9/2017.
 */
public class Task1 implements Task{

    String mesaj;

    public Task1(String mesaj) {
        this.mesaj = mesaj;
    }

    public void execute() {
        System.out.println(mesaj);
    }
}
