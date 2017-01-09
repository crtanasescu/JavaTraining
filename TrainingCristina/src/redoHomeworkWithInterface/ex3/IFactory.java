package redoHomeworkWithInterface.ex3;

import redoHomeworkWithInterface.ex2.Container;

/**
 * Created by crtanasescu on 1/9/2017.
 */
public interface IFactory {
    Container createContainer(Strategy strategy);
}
