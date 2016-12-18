package homeworkLab4.ex4si5;

import homeworkLab4.ex1.Task;
import homeworkLab4.ex3.Strategy;

/**
 * Created by KiKI on 18.12.2016.
 */
public class CountTaskRunner extends AbstractTaskRunner {

    int contorLocal = 0;

    public CountTaskRunner(Strategy strategy){
        super(strategy);
    }

    @Override
    protected void actiuneDupaExecutie(Task task) {
        contorLocal++;
    }
}
