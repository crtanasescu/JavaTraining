package homeworkLab4.ex3;

import homeworkLab4.ex2.Container;
/**
 * Created by KiKI on 18.12.2016.
 */
public interface IFactory {
    /**
     * Creates a Container which implements the strategy given as a parameter.
     * @param strategy The required Strategy.
     * @return a Container which respects the strategy given as a parameter.
     */
     Container createContainer(Strategy strategy);
}
