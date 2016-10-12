package homework3;

/**
 * Created by KiKI on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        TrecereInAscii trecereInAscii = new TrecereInAscii("Ana are mere, Maria are pere si Marian e baiat");

        // trecerea propozitiei noastre in codurile ascii corespunzatoare fiecarui caracter + afisare
        int[] sirFinalDeAscii = trecereInAscii.transformare();
        for (int i = 0; i < sirFinalDeAscii.length; i++) {
            System.out.print(sirFinalDeAscii[i] + " ");
        }

        ChestieFinalaTreiBucati chestieFinalaTreiBucati = new ChestieFinalaTreiBucati();
        System.out.println();

        //transformarea vectorului de numere in vector de cifre pentru a putea lua cifrele de pe anumite pozitii + afisare
        char[] sirDeCifre = chestieFinalaTreiBucati.transformareInSirDeCifre(sirFinalDeAscii);
        System.out.println(sirDeCifre);

        /*
        prima parte reprezinta cifrele de pe pozitiile i%3 == 0;
        a doua parte reprezinta cifrele de pe pozitiile i%3 == 1 -> dintre acestea sunt luate cele impare
        a treia parte reprezinta cifrele de pe pozitiile i%3 == 2 la care se aduna 65 si se afiseaza caracterul corespondent ascii
        */
        char [] primaParte = chestieFinalaTreiBucati.primaBucata(sirDeCifre);
        System.out.println(primaParte);
        char [] aDouaParte = chestieFinalaTreiBucati.aDouaBucata(sirDeCifre);
        System.out.println(aDouaParte);
        char [] aTreiaParte = chestieFinalaTreiBucati.aTreiaBucata(sirDeCifre);
        System.out.println(aTreiaParte);


        //pt verificare
        char [] a = {'1','2','3'};
        char [] b = {'4','5','6'};
        char [] c = {'7','8','9'};


        //functie finala initiala in care se pun cele 3 parti cap la cap
        String afisareFinala = chestieFinalaTreiBucati.finalFunction( primaParte,aDouaParte,aTreiaParte);
        System.out.println(afisareFinala);


        /*
        functie finala pentru a nu mai folosi cele 3 for-uri ci a avea una in care se primeste: un vector mic(cele 3 parti pe rand), un index(pozitia de la care
         sa se inceapa scrierea in vectorul mare) si vectorul mare final, si returneaza vectorul mare cu vectorul mic copiat de la indexul respectiv
         */
        char [] vectorMare = new char[primaParte.length + aDouaParte.length + aTreiaParte.length];
        String eu1 = chestieFinalaTreiBucati.finalEu(primaParte,0,vectorMare);
        System.out.println(eu1);
        String eu2 = chestieFinalaTreiBucati.finalEu(aDouaParte,primaParte.length,vectorMare);
        System.out.println(eu2);
        String eu3 = chestieFinalaTreiBucati.finalEu(aTreiaParte,primaParte.length + aDouaParte.length,vectorMare);
        System.out.println(eu3);
    }

}
