package homework3.homeworkLab3.exercise6;

/**
 * Created by crtanasescu on 11/18/2016.
 */
public class CoadaCuAgregare {
    private Array array = null;
    private int capacitate;
    private int indexElement = 0;


    public CoadaCuAgregare(int capacitate) {
        this.array = new Array(capacitate);
        this.capacitate = capacitate;
    }

    public int enqueue(int number){
        if(!(indexElement < capacitate)){
            return Array.ERROR;
        }
       return  array.set(indexElement++, number);
    }

    public int dequeue(){
        if(indexElement == 0){
            return Array.ERROR;
        }
        indexElement--;
        return array.get(0);
    }


}
