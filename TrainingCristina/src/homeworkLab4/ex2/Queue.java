package homeworkLab4.ex2;

import homeworkLab4.ex1.Task;

import java.util.ArrayList;

/**
 * Created by Ciprian on 11/23/2016.
 */
public class Queue implements Container {
    ArrayList<Task> listOfTasks = new ArrayList<Task>();

    public Task pop() {
        if(listOfTasks.isEmpty()){
            return null;
        }
        return listOfTasks.remove(0);
    }

    public void push(Task task) {
        listOfTasks.add(task);
    }

    public int size() {
        return listOfTasks.size();
    }

    public boolean isEmpty() {
        return listOfTasks.isEmpty();
    }

    public void transferFrom(Container container) {
        while(!container.isEmpty()) {
            this.push(container.pop());
        }
    }
}
