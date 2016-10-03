package homework3;

/**
 * Created by KiKI on 28.09.2016.
 */
public class ChestieFinalaTreiBucati {
    String propozitie;
    TrecereInAscii trecereInAscii = new TrecereInAscii(propozitie);
    int [] sirFinalDeAscii ;
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
        for (int i = 1; i< sirDeCifre.length; i++ ){
            if(i%3 == 0){
                finalOne[i/3] = sirDeCifre[i];
            }
        }
       return finalOne;
    }

    public char[] aDouaBucata(){
        char[] sirDeCifre = transformareInSirDeCifre();
        char[] semifinalTwo = new char[sirDeCifre.length/2];
        char [] finalTwo = new char[sirDeCifre.length/2];
        for (int i = 1; i< sirDeCifre.length; i++ ){
            if(i%3 == 1){
                semifinalTwo[i] = sirDeCifre[i];
            }
        }
        for(int i = 1; i<semifinalTwo.length;i++ )
            if(sirDeCifre[i]%2==1){
                finalTwo[i/3] = semifinalTwo[i];
            }
        return finalTwo;

    }
    public void aTreiaBucata(){

    }
    public void chestieFinala(){

    }
}
