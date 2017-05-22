package pJUnitSiExceptii.ex4calculator;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Created by Tina on 4/25/2017.
 */
public class Calculator<T> {

    public int add(int a, int b) {
//        if( a/2 + b/2 <= Integer.MAX_VALUE/2) {
//            throw new BufferOverflowException();
//        }else if( Math.abs(a/2 + b/2) <= Math.abs(Integer.MIN_VALUE)) {
//            throw new BufferUnderflowException();
//        }

        long result = ((long)a) + b;
        if(result > Integer.MAX_VALUE) {
            throw new BufferOverflowException();
        }else if(result < Integer.MIN_VALUE){
            throw new BufferUnderflowException();
        }

        return (int) result;
    }

    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("/ by 0");
        }
        return a/b;
    }

    public int average(ArrayList<Integer> a){
        int sum = 0;
       for( int i=0; i< a.size(); i++){
           sum = add(sum, a.get(i));
       }
       if(a.size() == 0){
           throw new ArithmeticException("/ by 0");
       }
       return divide(sum,a.size());
    }




}
