package homework3.homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Cerc extends Forma {
    float raza;

   // public Cerc(){}
    public Cerc (float raza, String culoare ){
        super(culoare);
        this.raza = raza;
    }

    @Override
    public float getArie(){
        return 3.14f * raza * raza ;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                super.toString() +
                ", arie: " + getArie() +
                '}';
    }
}
