package homework1.numereComplexe;

/**
 * Created by KiKI on 10.09.2016.
 */
public class NumarComplex {
    private float re;
    private float im;

    public NumarComplex(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return  im + "i + " + re;
    }
}
