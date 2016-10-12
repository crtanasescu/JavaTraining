package homework4;

/**
 * Created by ctana on 10.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        //clasa primeste in constructor un vector de numere pe care il foloseste ulterior pt diferite operatii
        int [] vector = {10,11,12,13,14,15};
        OperatiiPeVectori operatiiPeVectori = new OperatiiPeVectori(vector);



        /*
        -vectorul va trebui sa se suprascrie cu cel rezultat dupa fiecare modificare
        -printareVector printeaza vectorul curent
        -eliminareElement ia indexul elementului pe care vrem sa il eliminam(inlocuim cu -1) fara sa se modifice dimensiunea vectorului
        -eliminareElementCuRedimensionare- sterge elementul de la indexul dat modificand si dimensiunea vectorului
        -adaugareElement- adauga elementul dat pe pozitia data, redimensionandu se vectorul
         */
        operatiiPeVectori.printareVector();
        operatiiPeVectori.eliminareElement(3);
        operatiiPeVectori.eliminareElement(4);
        operatiiPeVectori.eliminareElement(5);
        operatiiPeVectori.eliminareElementCuRedimensionare(5);
        operatiiPeVectori.eliminareElementCuRedimensionare(3);
        operatiiPeVectori.eliminareElementCuRedimensionare(1);
        operatiiPeVectori.adaugareElement(100,2);
        operatiiPeVectori.adaugareElement(101,2);
        operatiiPeVectori.adaugareElement(102,0);
        operatiiPeVectori.eliminareElement(4);
        operatiiPeVectori.eliminareElement(0);
        operatiiPeVectori.eliminareElementCuRedimensionare(5);
        operatiiPeVectori.printareVector();


    }
}
