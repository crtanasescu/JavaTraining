package homework3.homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Main {
    public static void main (String [] args){
        Forma forma = new Forma("alb");
        Cerc cerc = new Cerc(2);
        Triunghi triunghi = new Triunghi(12,2);
        System.out.println(cerc.toString());
        System.out.println(triunghi.toString());
    }
}
