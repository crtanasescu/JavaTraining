package homework3;

/**
 * Created by KiKI on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        TrecereInAscii trecereInAscii = new TrecereInAscii("Ana are mere, Maria are pere si Marian e baiat");
        int [] sirFinalDeAscii = trecereInAscii.transformare();
        for (int i = 0; i<sirFinalDeAscii.length;i++ ){
        System.out.print(sirFinalDeAscii[i]+ " "); }
       ChestieFinalaTreiBucati chestieFinalaTreiBucati = new ChestieFinalaTreiBucati();
        System.out.println(" ");
        System.out.println(chestieFinalaTreiBucati.transformareInSirDeCifre());
        System.out.println(chestieFinalaTreiBucati.primaBucata());
        System.out.println(chestieFinalaTreiBucati.aDouaBucata());
        System.out.println(chestieFinalaTreiBucati.aTreiaBucata());
        System.out.println(chestieFinalaTreiBucati.chestieFinala());

    }

}
