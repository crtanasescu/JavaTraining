package homework4;

/**
 * Created by ctana on 10.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        int [] vector = {10,11,12,13,14,15};
        OperatiiPeVectori operatiiPeVectori = new OperatiiPeVectori(vector);

        operatiiPeVectori.printareVector(vector);
        operatiiPeVectori.eliminareElement1(5);
        operatiiPeVectori.eliminareElement1(4);
        operatiiPeVectori.eliminareElementCuRedimensionare(5);
        operatiiPeVectori.eliminareElementCuRedimensionare(3);
        operatiiPeVectori.eliminareElementCuRedimensionare(1);
        operatiiPeVectori.adaugareElement(100,2);
        operatiiPeVectori.adaugareElement(100,2);
        operatiiPeVectori.eliminareElement1(4);
        operatiiPeVectori.eliminareElement1(0);


    }
}
