package homework4;

/**
 * Created by ctana on 10.10.2016.
 */
public class OperatiiPeVectori {

    int[] vector = new int[10];


    public OperatiiPeVectori(int[] vector) {
        this.vector = vector;
    }


    public void printareVector() {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

        }
        System.out.println();
    }


    public void eliminareElementCuRedimensionare(int index){
        int n = vector.length;
        int [] vectorNou = new int[n-1];
        for (int i=0; i<n; i++){
            if (i == index){
              int k = i;
                for(int j = i; j <vector.length-1; j++) {
                    vectorNou[k] = vector[j+1];
                    k++;
                }
                break;
            }
            vectorNou[i] = vector[i];
        }
        this.vector = vectorNou;
        printareVector();

    }


    public void eliminareElement(int index){
        int n = vector.length;
        int[] vectorNou = new int[n];
        for (int i = 0; i < vector.length; i++) {
            if (i == index && i!=n-1) {
                for (int j = i + 1; j < vector.length; j++) {
                    vectorNou[j] = vector[j];
                }
                vectorNou[index] = -1;
                break;
            }else if(i==index && i==n-1){
                vectorNou[index] = -1;
                break;
            }
            vectorNou[i] = vector[i];
        }
        this.vector = vectorNou;
        printareVector();
    }


    public void adaugareElement(int element, int index) {
        int n = vector.length;
        int[] vectorNou = new int[n + 1];
        int k = vectorNou.length;
        for (int i = 0; i < n; i++) {
            if (i == index) {
                for (int j = vector.length-1; j >= i; j--) {
                    vectorNou[k-1] = vector[j];
                    k--;
                }
                vectorNou[index] = element;
                break;
            }
            vectorNou[i] = vector[i];
        }
        this.vector = vectorNou;
        printareVector();
    }

}