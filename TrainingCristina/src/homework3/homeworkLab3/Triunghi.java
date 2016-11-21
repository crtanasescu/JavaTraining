package homework3.homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Triunghi extends Forma {
    private float inaltime;
    private float baza;

    public float getInaltime() {
        return inaltime;
    }

    public float getBaza() {
        return baza;
    }

    // public Triunghi () {}
    public Triunghi(float inaltime, float baza, String culoare){
        super(culoare);
        this.inaltime = inaltime;
        this.baza = baza;
    }

    @Override
    public float getArie(){
        return baza * inaltime / 2;
    }

    @Override
    public String toString() {
        return "Triunghi{" +
                super.toString() +
                ", arie: " + getArie() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Triunghi)){
            return false;
        }
        Triunghi t =  (Triunghi) o;
        if(this.baza == t.baza && this.inaltime == t.inaltime && this.culoare.equals(t.culoare)){
            return true;
        }
        return false;
    }

    public void printDimensiuniTriunghi(){
        System.out.println( "inaltime: " + inaltime +
                " baza: "  + baza );

    }


}
