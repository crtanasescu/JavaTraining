package pJUnitSiExceptii.ex4calculator;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/**
 * Created by Tina on 4/25/2017.
 */
public abstract class Calculator<T> {

    public abstract T addGeneric(T a, T b);

    /*
    Care este alegerea firească: excepţii checked sau unchecked? De ce?
    Exceptiile checked deoarece in urma acestora programul isi poate reveni si utilizatorul poate folosi calculatorul in continuare.
     */

    public int add(int a, int b) {
        if( a/2 + b/2 <= Integer.MAX_VALUE/2) {
            throw new BufferOverflowException();
        }else if( Math.abs(a/2 + b/2) <= Math.abs(Integer.MIN_VALUE)) {
            throw new BufferUnderflowException();
        }

        return a + b;
    }



    public int divide(int a, int b){
        return a/b;
    }

    public int average(ArrayList<Integer> a){
        int sum =0, i;
       for( i=0; i< a.size(); i++){
           sum = add(sum, a.get(i));
       }
       return divide(sum,a.size());
    }




}
