package homeworkLab4.ex4si5;

import homeworkLab4.ex1.Task;
import homeworkLab4.ex2.Container;
import homeworkLab4.ex3.Factory;
import homeworkLab4.ex3.IFactory;
import homeworkLab4.ex3.Strategy;


/**
 * Created by KiKI on 18.12.2016.
 */
public abstract class AbstractTaskRunner {

    public Container container;

    public AbstractTaskRunner(Strategy strategy){
        IFactory factory = new Factory();
        this.container = factory.createContainer(strategy);
    }

    public void addTask(Task task){
        container.push(task);
    }

    public void executeAll(){
        for(int i = 0; i< container.size(); i++) {
            Task t = container.pop();
            t.execute();
            actiuneDupaExecutie(t);
        }
    }

    protected abstract void actiuneDupaExecutie(Task task);

}
