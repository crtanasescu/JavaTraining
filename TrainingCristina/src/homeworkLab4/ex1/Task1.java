package homeworkLab4.ex1;

/**
 * Created by Ciprian on 11/23/2016.
 */
public class Task1 implements Task {
    private String mesaj;

    public Task1(String mesaj) {
        this.mesaj = mesaj;
    }

    public void execute() {
        System.out.println(mesaj);
    }
}
