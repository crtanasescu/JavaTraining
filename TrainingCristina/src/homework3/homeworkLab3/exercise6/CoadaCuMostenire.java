package homework3.homeworkLab3.exercise6;

/**
 * Created by crtanasescu on 11/18/2016.
 */
public class CoadaCuMostenire extends Array {

    private int capacitate;
    private int indexCurent = 0;

    public CoadaCuMostenire(int capacitate){
        super(capacitate);
        this.capacitate = capacitate;
    }

    public int enqueuee(int item){
        if(!(indexCurent < capacitate)){
            return ERROR;
        }
        return set(indexCurent++,item);
    }

    public int dequeuee(){
        if(indexCurent == 0){
            return ERROR;
        }
        indexCurent--;
        return get(0);
    }

    public int peek(){
        if(indexCurent == 0){
            return ERROR;
        }
        return get(0);
    }

    public boolean isEmpty(){
        return indexCurent == 0;
    }

    public int size(){
        return indexCurent;
    }

}
