package homework3;

/**
 * Created by KiKI on 28.09.2016.
 */
public class ChestieFinalaTreiBucati {
    String propozitie;
    TrecereInAscii trecereInAscii = new TrecereInAscii("Ana are mere, Maria are pere si Marian e baiat");
    int [] sirFinalDeAscii = trecereInAscii.transformare();
    String string = "";



    public char[] transformareInSirDeCifre(){
        for (int i = 0; i<sirFinalDeAscii.length;i++ ){
            string = string.concat(String.valueOf(sirFinalDeAscii[i]));
        }
        return string.toCharArray();
    }

    public char[] primaBucata(){
        char[] sirDeCifre = transformareInSirDeCifre();
        char[] finalOne = new char[sirDeCifre.length/2];
        for (int i = 0; i< sirDeCifre.length; i++ ){
            if(i%3 == 0){
                finalOne[i/3] = sirDeCifre[i];
            }
        }
       return finalOne;
    }

    public char[] aDouaBucata(){
        char[] sirDeCifre2 = transformareInSirDeCifre();
        char[] semifinalTwo = new char[sirDeCifre2.length];
        char [] finalTwo = new char[sirDeCifre2.length];
        for (int i = 0; i< sirDeCifre2.length; i++ ){
            if(i%3 == 1)
                semifinalTwo[i/3] = sirDeCifre2[i];

        }
        int j=0;
        for(int i = 0; i<semifinalTwo.length;i++ )
            if(semifinalTwo[i]%2==1){
                finalTwo[j] = semifinalTwo[i];
                j++;
            }
        return finalTwo;

    }
    public char[] aTreiaBucata(){
        char[] sirDeCifre3 = transformareInSirDeCifre();
        int[] semifinal3 = new int[sirDeCifre3.length];
        char [] final3 = new char[sirDeCifre3.length];
        int j=0;
        for (int i =0; i< sirDeCifre3.length; i++){
            if(i%3 == 2)
            {
                semifinal3[j] = sirDeCifre3[i] + 65;
                j++;
            }
        }
        for (int i=0; i< semifinal3.length; i++){
            final3[i]=(char)semifinal3[i];
        }
        return final3;
    }
    public String chestieFinala(){
        return primaBucata() + " " + aDouaBucata() + " " + aTreiaBucata();

    }

}
