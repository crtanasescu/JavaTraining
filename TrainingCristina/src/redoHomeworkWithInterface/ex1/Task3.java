package redoHomeworkWithInterface.ex1;

/**
 * Created by crtanasescu on 1/9/2017.
 */
public class Task3 implements Task{
    int contor = 0;

    public void execute() {
        System.out.println(contor);
        contor++;
    }
}
