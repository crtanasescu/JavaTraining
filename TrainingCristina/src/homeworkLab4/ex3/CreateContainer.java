package homeworkLab4.ex3;

import homeworkLab4.ex2.Container;
import homeworkLab4.ex2.Queue;
import homeworkLab4.ex2.Stack;

/**
 * Created by KiKI on 18.12.2016.
 */
public class CreateContainer {

    public CreateContainer(){}

    public Container createContainerUsingStrategy(Strategy strategy){
        if (strategy == Strategy.FIFO)
            return new Queue();
        if (strategy == Strategy.LIFO)
            return new Stack();
        else
            return null;
    }
}
