package homework3.homeworkLab3.exercise6;

/**
 * Created by crtanasescu on 11/18/2016.
 */
public class CoadaCuMostenire extends Array {
    private Array[] array;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public CoadaCuMostenire(int capacitate){
        array = new Array[capacitate];
    }
    public void enqueue(Array item){
        if((size == array.length)){
            System.out.println("Cannot add. The queue is full");
        }
        array[tail] = item;
        tail = (tail+1) % array.length;
        size++;

    }
    public Array dequeue(){
        if (size == 0) {
            System.out.println("Cannot remove from empty queue");
        }
        Array item = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return item;

    }

    public Array peek() {
        if (size == 0) {
            System.out.println("Cannot peek into empty queue");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
