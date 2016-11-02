package homework5.insertionSort;

/**
 * Created by Ciprian on 11/2/2016.
 */
public class Main {
    public static void main(String[] args) {
        SortingAlgorithms sa = new SortingAlgorithms();
        int [] vectorDeSortat = {6,5,3,1,2,7,8,4};
        //int[] vectorDeSortat = {7,6,8,2};
        int[] vectorDeAfisat = sa.insertionSort(vectorDeSortat);
        sa.afisare(vectorDeAfisat);
    }

}
