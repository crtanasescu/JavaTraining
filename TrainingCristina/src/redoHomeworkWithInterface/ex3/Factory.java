package redoHomeworkWithInterface.ex3;

import redoHomeworkWithInterface.ex2.Container;
import redoHomeworkWithInterface.ex2.Queue;
import redoHomeworkWithInterface.ex2.Stack;

/**
 * Created by crtanasescu on 1/9/2017.
 */
public class Factory implements IFactory {
    Container newContainer;
    public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.LIFo){
            return newContainer = new Stack();
        }else if(strategy == Strategy.FIFO){
            return newContainer = new Queue();
        }
        return null;
    }
}
