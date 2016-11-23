package homeworkLab4.ex2;

import homeworkLab4.ex1.Task;

/**
 * Created by Ciprian on 11/23/2016.
 */
public interface Container {

    /**
     * Removes a Task from the Container
     * @return  the removed Task, if the Container is not empty;
     *          null, otherwise
     */
    Task pop();

    /**
     * Inserts a Task in the Container
     * @param task the inserted Task
     */
    void push(Task task);

    /**
     * Returns the number of elements from the Container
     * @return
     */
    int size();

    /**
     * Verifies if the Container is empty or not.
     * @return  true,  if the Container is empty
     *          false, otherwise
     */
    boolean isEmpty();


    /**
     * Transfers all the elements that exist in a Containter in this Container
     * @param container the Container from which we should transfer elements.
     *        After the transfer, container.size() == 0
     */
    void transferFrom(Container container);
}
