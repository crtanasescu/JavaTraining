package homework4;

/**
 * Created by ctana on 10.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        int [] vector = {10,11,12,13,14,15};
        OperatiiPeVectori operatiiPeVectori = new OperatiiPeVectori(vector);

        operatiiPeVectori.printareVector();
       // operatiiPeVectori.adaugareElement(9,2);
      //  operatiiPeVectori.eliminareElementCuRedimensionare(1);
        operatiiPeVectori.eliminareElement(5);

       // vector = ArrayUtils.removeElement(vector, index);
    }


}
