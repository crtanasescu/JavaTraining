package phGenericitate.ex2interfataSumabil;

/**
 * Created by Tina on 4/26/2017.
 */
public class MyMatrix implements Sumabil {
    int[][] matrice = new int[4][4];

    public MyMatrix(int[][] matrice) {
        this.matrice = matrice;
    }

    public void addValue(Sumabil value) {

    }
}
