package homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Forma {
    String culoare;

    public int getArie(){
        return 0;
    }

    public Forma() {}

    public Forma(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "culoare='" + culoare + '\'' +
                '}';
    }
}
