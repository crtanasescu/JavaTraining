package homework3.homeworkLab3;

/**
 * Created by KiKI on 06.10.2016.
 */
public class Main {
    public static void main (String [] args){
        Forma forma = new Forma("alb");
        Cerc cerc = new Cerc(2, "galben");
        Triunghi triunghi = new Triunghi(12,2,"gri");
        System.out.println(cerc.toString());
        System.out.println(triunghi.toString());


        Triunghi tr1 = new Triunghi(45,7, "verde");
        Triunghi tr2 = new Triunghi(45,7, "verde");
        System.out.println(tr1.equals(tr2));



        Forma [] vector = new Forma[3];
        vector[0] = new Triunghi(23,5,"alb");
        vector[1] = new Triunghi(23,50,"negru");
        vector[2] = new Cerc(23,"alb");
       for(int i=0; i< vector.length; i++){
           System.out.println(vector[i].toString());
       }


    }
}
