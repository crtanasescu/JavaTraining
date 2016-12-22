package homeworkLab4.ex4si5;

import homeworkLab4.ex1.Task;
import homeworkLab4.ex3.Strategy;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by KiKI on 18.12.2016.
 */
public class PrintTaskRunner extends AbstractTaskRunner{

    public PrintTaskRunner(Strategy strategy){
        super(strategy);
    }

    @Override
    protected void actiuneDupaExecutie(Task task) {
        Date date = new Date();
        System.out.println("Task-ul s-a executat la ora: " + date );
    }
}
