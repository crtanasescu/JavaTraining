package homework1.numereComplexe;

public class Main {

    public static void main(String[] args) {

        NumarComplex a = new NumarComplex(7,8);
        NumarComplex b = new NumarComplex(3,5);
        System.out.println("Primul nr complex este: "+ a);
        System.out.println("Al doilea nr complex este: " + b);


        Operatii op = new Operatii();

        NumarComplex res = op.adunare(a,b);
        System.out.println("Suma numerelor este: " + res);
        NumarComplex res2 = op.inmultire(a,b);
        System.out.println("Inmultirea numerelor este:" +res2);

    }
}
