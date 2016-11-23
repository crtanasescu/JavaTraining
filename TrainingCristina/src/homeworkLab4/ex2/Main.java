package homeworkLab4.ex2;


import homeworkLab4.ex1.Task;
import homeworkLab4.ex1.Task1;
import homeworkLab4.ex1.Task2;
import homeworkLab4.ex1.Task3;

/**
 * Created by Ciprian on 11/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        Container c1 = new Queue();
        Task t1 = new Task1("Ana are mere");
        c1.push(t1);


        Container c2 = new Queue();
        Task t2 = new Task2();
        Task t3 = new Task3();
        c2.push(t2);
        c2.push(t3);



        c1.transferFrom(c2);
    }
}
