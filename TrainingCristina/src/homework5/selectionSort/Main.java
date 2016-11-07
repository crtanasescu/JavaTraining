package homework5.selectionSort;

/**
 * Created by KiKI on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        SortingAlgorithms sa = new SortingAlgorithms();
        //int [] vectorDeSortat = {6,5,3,1,2,7,8,4};
        //int[] vectorDeSortat = {7,6,8,2};
        int [] vectorDeSortat = {8,5,2,6,9,3,1,4,0,7};
        int[] vectorDeAfisat = sa.selectionSort(vectorDeSortat);
        sa.afisare(vectorDeAfisat);
    }
}
