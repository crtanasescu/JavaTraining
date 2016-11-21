package homework3.homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Cerc extends Forma {
    private float raza;

    public float getRaza() {
        return raza;
    }

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

    public void printDimensiuniCerc(){
        System.out.println( "raza: " + raza);
    }
}
