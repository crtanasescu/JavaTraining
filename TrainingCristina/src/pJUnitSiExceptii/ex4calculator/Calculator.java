package pJUnitSiExceptii.ex4calculator;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/**
 * Created by Tina on 4/25/2017.
 */
public class Calculator {

    /*
    Care este alegerea firească: excepţii checked sau unchecked? De ce?
    Exceptiile checked deoarece in urma acestora programul isi poate reveni si utilizatorul poate folosi calculatorul in continuare.
     */

    public int add(int a, int b)  {
        try {
            return a + b;
        }catch (BufferOverflowException e){
            System.out.println("Suma celor doua numere depaseste Integer.MAX_VALUE");
        }catch (BufferUnderflowException e){
            System.out.println("Suma celor doua numere este mai mica decat Integer.MIN_VALUE");
        }
        return 0;
    }


    public int divide(int a, int b){
        return a/b;
    }

    public int average(ArrayList<Integer> a){
        int sum =0, i=0;
       for( i=0; i< a.size(); i++){
           sum = add(sum, a.get(i));
       }
       return divide(sum,a.size());
    }




}
