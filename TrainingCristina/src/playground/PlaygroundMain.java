package playground;

/**
 * Created by Ciprian on 9/14/2016.
 */
public class PlaygroundMain {

//    public static final ReferenceType referenceType;
    public PlaygroundMain() {


    }

    public static void main(String[] args) {

    }


    public static void iGetAReference(ReferenceType rt){
        System.out.println("Ana are mere");
        rt = new ReferenceType(5);

        String a = "a";
        String b = "b";
        a = a + b;
        a = new String(a+ b);
    }

    public static void iGetaAPrimitive(int a){
        a=3;
    }



    static class ReferenceType{
        final int number;

        public ReferenceType(int number) {
            this.number = number;
        }
    }

}
