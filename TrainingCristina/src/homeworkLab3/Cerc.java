package homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Cerc extends Forma {
    float raza;

    public Cerc(){}
    public Cerc (float raza){
        this.raza = raza;
    }

    public double getArie(float raza){
        return 3.14 * raza * raza ;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "culoare=" + culoare +
                ", arie" + getArie(raza) +
                '}';
    }
}
