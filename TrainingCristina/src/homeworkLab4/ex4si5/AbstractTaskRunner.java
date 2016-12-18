package homeworkLab4.ex4si5;

import homeworkLab4.ex1.Task;
import homeworkLab4.ex2.Container;
import homeworkLab4.ex3.CreateContainer;
import homeworkLab4.ex3.Strategy;

/**
 * Created by KiKI on 18.12.2016.
 */
public abstract class AbstractTaskRunner {

    public Container container;


    public AbstractTaskRunner(Strategy strategy){
        this.container = newContainer.createContainerUsingStrategy
    }

    public void addTask(Task task){
        container.push(task);
    }

    public void executeAll(){

    }

    protected abstract void actiuneDupaExecutie(Task task);

}
