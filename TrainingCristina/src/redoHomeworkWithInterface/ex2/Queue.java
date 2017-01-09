package redoHomeworkWithInterface.ex2;

import redoHomeworkWithInterface.ex1.Task;

import java.util.ArrayList;

/**
 * Created by crtanasescu on 1/9/2017.
 */
public class Queue implements Container {
    ArrayList<Task> listOfTasks = new ArrayList<Task>();
    public Task pop() {
        if(listOfTasks.isEmpty()){
            return null;
        }else{
            return listOfTasks.remove(0);
        }
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
        while(!container.isEmpty()){
            this.push(container.pop());
        }
    }
}
