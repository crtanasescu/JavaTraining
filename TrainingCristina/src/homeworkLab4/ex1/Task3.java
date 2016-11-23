package homeworkLab4.ex1;

/**
 * Created by Ciprian on 11/23/2016.
 */
public class Task3 implements Task {
    private int globalContor = 0;

    public void execute() {
        System.out.println(globalContor);
        globalContor++;
    }
}
