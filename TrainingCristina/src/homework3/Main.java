package homework3;

/**
 * Created by KiKI on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        TrecereInAscii trecereInAscii = new TrecereInAscii("Ana are mere, Maria are pere si Marian e baiat");
        int[] sirFinalDeAscii = trecereInAscii.transformare();
        for (int i = 0; i < sirFinalDeAscii.length; i++) {
            System.out.print(sirFinalDeAscii[i] + " ");
        }
        ChestieFinalaTreiBucati chestieFinalaTreiBucati = new ChestieFinalaTreiBucati();
        System.out.println();
        char[] sirDeCifre = chestieFinalaTreiBucati.transformareInSirDeCifre(sirFinalDeAscii);



        char [] primaParte = chestieFinalaTreiBucati.primaBucata(sirDeCifre);
        System.out.println(primaParte);
        char [] aDouaParte = chestieFinalaTreiBucati.aDouaBucata(sirDeCifre);
        System.out.println(aDouaParte);
        char [] aTreiaParte = chestieFinalaTreiBucati.aTreiaBucata(sirDeCifre);
        System.out.println(aTreiaParte);

        char [] a = {'1','2','3'};
        char [] b = {'4','5','6'};
        char [] c = {'7','8','9'};

       // System.out.println(chestieFinalaTreiBucati.chestieFinala(sirDeCifre));
        String afisareFinala = chestieFinalaTreiBucati.finalFunction( primaParte,aDouaParte,aTreiaParte);
        System.out.println(afisareFinala);
    }

}
