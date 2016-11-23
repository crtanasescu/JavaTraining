package homework3.homeworkLab3.exercise6;

/**
 * Created by Ciprian on 11/23/2016.
 */
public class Main {
    public static void main(String[] args) {

        CoadaCuMostenire coadaCuMostenire = new CoadaCuMostenire(10);
        System.out.println(coadaCuMostenire.enqueuee(102));
       // coadaCuMostenire.set(0,11);
        System.out.println(coadaCuMostenire.dequeuee());
        System.out.println(coadaCuMostenire.dequeuee());
        System.out.println(coadaCuMostenire.enqueuee(101390));
        System.out.println(coadaCuMostenire.isEmpty());
        System.out.println(coadaCuMostenire.size());
        coadaCuMostenire.toString();
        System.out.println(coadaCuMostenire.peek());


        CoadaCuAgregare coadaCuAgregare = new CoadaCuAgregare(10);
        System.out.println(coadaCuAgregare.enqueue(1023));
        System.out.println(coadaCuAgregare.dequeue());
        System.out.println(coadaCuAgregare.dequeue());


    }
}
