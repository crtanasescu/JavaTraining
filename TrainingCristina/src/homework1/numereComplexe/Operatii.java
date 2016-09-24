package homework1.numereComplexe;

/**
 * Created by KiKI on 10.09.2016.
 */
public class Operatii {
    NumarComplex adunare(NumarComplex a, NumarComplex b) {
        float realPart = a.getRe() + b.getRe();
        float imaginaryPart = a.getIm() + b.getIm();

        return new NumarComplex(realPart, imaginaryPart);
    }

    NumarComplex inmultire(NumarComplex a, NumarComplex b) {
        float realPart = (a.getRe() * b.getRe()) - (a.getIm() * b.getIm());
        float imaginaryPart = (a.getIm() * b.getRe()) + (a.getRe() * b.getIm());

        return new NumarComplex(realPart,imaginaryPart);
    }
}