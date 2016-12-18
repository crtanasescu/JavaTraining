package homeworkLab4.ex4si5;

import homeworkLab4.ex1.Task;
import homeworkLab4.ex3.Strategy;

/**
 * Created by KiKI on 18.12.2016.
 */
public class LateTheExecution extends PrintTaskRunner{

    int intarziere;

    public LateTheExecution(Strategy strategy, int intarziere) {
        super(strategy);
        this.intarziere = intarziere;
    }

    @Override
    protected void actiuneDupaExecutie(Task task){
        super.actiuneDupaExecutie(task);
        try {
            Thread.sleep(intarziere); // miliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
