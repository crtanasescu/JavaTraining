package homeworkLab4.ex4si5;

import homeworkLab4.ex1.Task;
import homeworkLab4.ex2.Container;
import homeworkLab4.ex3.Factory;
import homeworkLab4.ex3.IFactory;
import homeworkLab4.ex3.Strategy;

import java.awt.*;

/**
 * Created by KiKI on 18.12.2016.
 */
public class RedoTaskRunner extends AbstractTaskRunner {
    Container containerInvers;

    public RedoTaskRunner(Strategy strategy){
        super(strategy);
        IFactory fact = new Factory();
        this.containerInvers = fact.createContainer(Strategy.LIFO);
    }

    @Override
    protected void actiuneDupaExecutie(Task task) {
        containerInvers.push(task);
    }

    public void reExecute(){
        for(int i = 0; i < containerInvers.size(); i++) {
            containerInvers.pop().execute();
        }

    }
}
