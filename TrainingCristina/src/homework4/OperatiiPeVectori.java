package homework4;

/**
 * Created by ctana on 10.10.2016.
 */
public class OperatiiPeVectori {

    int[] vector;
    int elementeFolositoare;

    public OperatiiPeVectori(int[] vector) {
        this.vector = vector;
        this.elementeFolositoare = vector.length;
    }


    public void printareVector() {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }


    public void eliminareElementCuRedimensionare(int index){
        int [] vectorNou = new int[elementeFolositoare-1];

        for (int i=0; i<index; i++) {
            vectorNou[i] = vector[i];
        }
        for(int j = index; j < elementeFolositoare-1; j++) {
            vectorNou[j] = vector[j+1];
        }
        elementeFolositoare--;
        this.vector = vectorNou;
        printareVector();

    }


    public void eliminareElement(int index){
        for (int j = index; j < vector.length - 1; j++) {
            vector[j] = vector[j+1];
        }
        vector[vector.length-1] = -1;
        elementeFolositoare--;
        printareVector();
    }


    public void adaugareElement(int element, int index) {
        int n = vector.length;
        int[] vectorNou;


        if(elementeFolositoare != n){
             for(int i = vector.length-1; i>= index ; i--){
                 vector[i] = vector[i-1];
             }
            vector[index] = element;
        }else {
            vectorNou = new int[n + 1];
            for (int i = 0; i < index; i++) {
                vectorNou[i] = vector[i];
            }
            int k = vectorNou.length;
            for (int j = vector.length-1; j >= index; j--,k--) {
                vectorNou[k-1] = vector[j];
            }
            vectorNou[index] = element;
            this.vector = vectorNou;
        }

        elementeFolositoare++;
        printareVector();
    }

}