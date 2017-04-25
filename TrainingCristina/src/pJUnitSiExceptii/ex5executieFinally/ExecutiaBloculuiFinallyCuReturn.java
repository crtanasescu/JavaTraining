package pJUnitSiExceptii.ex5executieFinally;

/**
 * Created by Tina on 4/25/2017.
 */
public class ExecutiaBloculuiFinallyCuReturn {

    public int metoda(){
        Integer[] values = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        try{
            for(int i=0; i<10; i++){
               // sum = values[i] + values[i+1];
                sum = sum + values[i];
            }
            return sum;
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }finally{
            System.out.println("Aceasta portiune se executa oricum");
        }
        return 0;
    }

}
