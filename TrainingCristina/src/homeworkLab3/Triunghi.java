package homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Triunghi extends Forma {
    float inaltime;
    float baza;

    public Triunghi () {}
    public Triunghi(float inaltime, float baza){
        this.inaltime = inaltime;
        this.baza = baza;
    }

    public float getArie(float inaltime, float baza){
        return baza * inaltime / 2;
    }

    @Override
    public String toString() {
        return "Triunghi{" +
                "culoare=" + culoare +
                ", arie=" + getArie(inaltime,baza) +
                '}';
    }
}
