
package homework4;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by ctana on 10.10.2016.
 */
public class OperatiiPeVectori {

    int [] vector = new int[10];
    public OperatiiPeVectori( int []  vector ) {
       this.vector = vector;
    }


    public void  printareVector(){
       for(int i = 0; i < vector.length ; i++) {
           System.out.print(vector[i] + " ");

       }
        System.out.println();
    }

    public void eliminareElementCuRedimensionare(int index){
        int n = vector.length;
        for(int i=0; i<n; i++){
            if ((i==index) && (i != n-1)){
                for(int j = i-1; j<n-1; j++ ) {
                    vector[j] = vector[j + 1];
                }
                n--;
            }
            //System.out.print(vector[i] + " ");
        }
        printareVector();
    }

    public void eliminareElement(int index){
        for(int i=0; i<vector.length; i++){
            if(i == index){
                for(int j=i; j<vector.length-1; j++){
                    vector[j] = vector[j+1];
                }
            }else if(i == vector.length-1){

                vector = ArrayUtils.removeElement(vector, index);
            }
        }
        printareVector();
    }

    public void adaugareElement( int element, int index){
        int n= vector.length;
        for ( int j = n; j>=index; j--){
            vector[j] = vector[j-1];
        }
        vector[index] = element;
        n++;
        printareVector();
    }



}
