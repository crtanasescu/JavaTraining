package homework3;

import java.util.Arrays;

/**
 * Created by KiKI on 28.09.2016.
 */
public class ChestieFinalaTreiBucati {

    public char[] transformareInSirDeCifre(int [] sirFinalDeAscii){
        String string="";
        for (int i = 0; i<sirFinalDeAscii.length;i++ ){
            string = string.concat(String.valueOf(sirFinalDeAscii[i]));
        }
        return string.toCharArray();
    }

    public char[] primaBucata(char [] sirDeCifre){
        char[] finalOne = new char[(sirDeCifre.length-1)/3 + 1];
        for (int i = 0; i < sirDeCifre.length; i++ ){
            if(i%3 == 0){
                finalOne[i/3] = sirDeCifre[i];
            }
        }
       return finalOne;
    }

    public char[] aDouaBucata(char [] sirDeCifre){
        char[] semifinalTwo = new char[(sirDeCifre.length-2)/3 + 1];
        char [] finalTwo = new char[semifinalTwo.length];
        for (int i = 0; i< sirDeCifre.length; i++ ){
            if(i%3 == 1)
                semifinalTwo[i/3] = sirDeCifre[i];
        }
        int j=0;
        for(int i = 0; i<semifinalTwo.length;i++ )
            if(semifinalTwo[i]%2==1){
                finalTwo[j] = semifinalTwo[i];
                j++;
            }
        return finalTwo;

    }
    public char[] aTreiaBucata(char [] sirDeCifre){
        int[] semifinal3 = new int[(sirDeCifre.length)/3];
        char [] final3 = new char[semifinal3.length];
        int j=0;
        for (int i =0; i< sirDeCifre.length; i++){
            if(i%3 == 2) {
                semifinal3[j] = Integer.parseInt(sirDeCifre[i] + "")+ 65;
                j++;
            }
        }
        for (int i=0; i< semifinal3.length; i++){
            final3[i]=(char)semifinal3[i];
        }
        return final3;
    }

    public String finalFunction(char[] primaParte, char[] aDouaParte, char[] aTreiaParte ){
        int j=0;
        char [] vectorFinal = new char[primaParte.length + aDouaParte.length + aTreiaParte.length];
        for (int i=0; i<primaParte.length; i++ ){
            vectorFinal[j] = primaParte[i];
            j++;
        }
        for(int i=0; i<aDouaParte.length; i++){
            vectorFinal[j] = aDouaParte[i];
            j++;
        }
        for(int i=0; i<aTreiaParte.length; i++){
            vectorFinal[j] = aTreiaParte[i];
            j++;
        }
        return new String(vectorFinal);


    }



}
