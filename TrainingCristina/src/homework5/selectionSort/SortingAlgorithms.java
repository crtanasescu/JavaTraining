package homework5.selectionSort;

/**
 * Created by KiKI on 07.11.2016.
 */
public class SortingAlgorithms {
    public int[] selectionSort(int[] vector) {
        for( int j = 0; j< vector.length; j++ ) {
            int min= vector[j];
            int contor = j ;
            for (int i = j+1; i < vector.length; i++) {
                if (vector[i] < min) {
                    min = vector[i];
                    contor = i;
                }
            }
            int aux = vector[j];
            vector[j] = min;
            vector[contor] = aux;

        }
        return vector;
    }

    public void afisare(int[] vectorDeAfisat){
        for(int i=0; i<vectorDeAfisat.length; i++){
            System.out.print(vectorDeAfisat[i] + " ");
        }
    }
}
