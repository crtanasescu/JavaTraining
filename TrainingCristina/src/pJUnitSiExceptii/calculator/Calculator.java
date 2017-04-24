package pJUnitSiExceptii.calculator;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/**
 * Created by Tina on 4/25/2017.
 */
public class Calculator {

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
        int sum =0;
       for(int i=0; i<a.size(); i++){
           add(sum, a.get(i));
       }
       return divide(sum,a.size());
    }




}
