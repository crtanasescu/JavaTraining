package homework5.insertionSort;

/**
 * Created by Ciprian on 11/2/2016.
 */
public class SortingAlgorithms {

    public int[] insertionSort(int[] vector){
        for(int i = 1; i<vector.length; i++){
            int aux = vector[i];
            if(vector[i-1] < aux){
                continue;
            }else {
                int j = i - 1;
                for (; j >= 0; j--) {
                    if(vector[j] > aux) {
                        vector[j + 1] = vector[j];
                    }else{
                        break;
                    }
                }
                vector[j+1] = aux;
            }

        }


        return vector;
    }

    public void afisare(int[] vectorDeAfisat){
        for(int i=0; i<vectorDeAfisat.length; i++){
            System.out.print(vectorDeAfisat[i] + " ");
        }
    }

}
