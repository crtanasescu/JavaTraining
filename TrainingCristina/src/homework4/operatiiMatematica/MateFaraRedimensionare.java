package homework4.operatiiMatematica;

/**
 * Created by crtanasescu on 10/25/2016.
 */
public class MateFaraRedimensionare {

    public MateFaraRedimensionare() { }

    public int[] adunareFaraRedimensionare (int [] a, int [] b){

        int dif = Math.abs(a.length-b.length);
        int tinemMinte = 0;
        int max[] = maxim(a,b);
        int min[] = minim(a,b);
        int[] vectorRezultat = new int[max.length + 1];

        //parcurgere vector mic
        for(int i = min.length-1; i>=0; i--){
            int raspuns = min[i] + max[i+dif] + tinemMinte;
            vectorRezultat[i + dif + 1] = raspuns % 10;
            tinemMinte = raspuns/10;
        }

        //pargurgere diferenta din vector mare
        for ( int i = dif-1 ; i>= 0 ; i--){
            int raspuns = max[i] + tinemMinte;
            vectorRezultat[i+1] = raspuns % 10;
            tinemMinte = raspuns/10;
        }

        //in cazul in care avem un 1 tinut minte
        if (tinemMinte == 1){
            vectorRezultat[0] = 1;
            afisare(vectorRezultat);
        }else{
            afisare(redimensionareVector(vectorRezultat));
        }
        return vectorRezultat;
    }

    public void scadereFaraRedimensionare(int[] a, int[] b){
        int dif = Math.abs(a.length-b.length);
        int neImprumutam = 0;
        int max[] = maxim(a,b);
        int min[] = minim(a,b);
        int[] vectorRezultat = new int[max.length];
        int j = max.length - 1;

        //parcurgere vector mic --parte comuna
        for(int i = min.length - 1 ; i>=0; i--, j--){
            int raspuns = max[i+dif] - min[i] - neImprumutam;
            if(raspuns >= 0){
                vectorRezultat[j] = raspuns;
                neImprumutam = 0;
            }else{
                vectorRezultat[j]= (max[i+dif] + 10) - min[i] - neImprumutam;
                neImprumutam = 1;
            }
        }

        //parcurgere diferenta vector mare--parte necomuna
        for(int i = dif-1; i>=0; i--){
            vectorRezultat[i] = max[i] - neImprumutam;
            neImprumutam = 0;
        }

        //redimensionare in cazul in care prima cifra a rezultatului este 0
        if (vectorRezultat[0] == 0){
            afisare(redimensionareMulteSpatiiVector(vectorRezultat));
        }else {
            afisare(vectorRezultat);
        }
    }

    public void inmultireFaraRedimensionare(int[] a, int[] b) {
        int acumulator[] = null;
        int max[] = maxim(a,b);
        int min[] = minim(a,b);
        int[] rezultatIntermediar = null;

        //parcurgere vector mic si inmultire pe rand cu toate cifrele vectorului mare--stocheaza raspunsul intr-un rezultatIntermediar
        for (int i = min.length - 1; i >= 0; i--) {
            rezultatIntermediar = new int[max.length +1];
            int lungime = rezultatIntermediar.length - 1;
            int tineMinte = 0;
            for (int j = max.length - 1; j >= 0; j--) {
                int rezultat = (max[j] * min[i] + tineMinte) % 10;
                tineMinte = (max[j] * min[i] + tineMinte) / 10;
                rezultatIntermediar[lungime] = rezultat;
                lungime -= 1;
                if (j == 0) {
                    rezultatIntermediar[0] = tineMinte;
                }
            }
            rezultatIntermediar = redimensionareVector(rezultatIntermediar);
            //acumulator este cel care prima data scrie rezultatulIntermediar iar in urmatoarele iteratii face adunare la noile rezultate intermediare(cu 0 adaugat)
            if(acumulator == null){
                acumulator  = new int[a.length + b.length];
                int lungimeAcumulator = acumulator.length -1;
                for(int z=rezultatIntermediar.length-1; z>=0; z--){
                    acumulator[lungimeAcumulator] = rezultatIntermediar[z];
                    lungimeAcumulator--;
                }
                acumulator = redimensionareMulteSpatiiVector(acumulator);
            }else{
                int[] rezultatIntermediarNou = incrementareZero(rezultatIntermediar);
                acumulator = adunareFaraRedimensionare(acumulator,rezultatIntermediarNou);
                acumulator = redimensionareMulteSpatiiVector(acumulator);
                return;
            }
        }
        afisare(rezultatIntermediar);
    }

    public void impartireFaraRedimensionare(int[] a, int[] b) {
        int[] max = maxim(a, b);
        int[] min = minim(a, b);

        //valori initiale
        int deimpartit = transformareVectorInNumar(max, min.length);
        int impartitor = transformareVectorInNumar(min, min.length);

        //daca avem un impartitor de doua cifre iar numarul format din primele doua cifre ale deimpartitului este mai mic decat impartitorul trebuie sa formeze numar cu primele
        //3 cifre ale deimpartitului pentru a-l imparti la impartitor
        boolean ok = false;
        if (deimpartit < impartitor) {
            deimpartit = transformareVectorInNumar(max, min.length + 1);
            ok = true;
        }
        int cat = deimpartit / impartitor;
        int rest = deimpartit % impartitor;
        int dupaVirgula = 0;
        int i = min.length;
        if (ok == true) {
            i = min.length + 1;
        }

        //iterare de la sfarsitul deimpartitului initial format in functie de lungimea impartitorului, pana la sfarsitul deimpartitului
        for (; i < max.length; i++) {
            deimpartit = primireNumarPlusOPozitieVectorSiScoatereNumar(rest, max, i);
            cat = cat * 10 + deimpartit / impartitor;
            rest = deimpartit % impartitor;
        }


        int variabilaPentruCazInCareDupaVirgulaAvem0 = 1;
        while (dupaVirgula < 1000 && rest != 0) {
            if (rest != 0) {
                deimpartit = coborareZero(rest);
                dupaVirgula = dupaVirgula * 10 + deimpartit / impartitor;
                rest = deimpartit % impartitor;
            }
            if (dupaVirgula == 0) {
                variabilaPentruCazInCareDupaVirgulaAvem0 = 0;
            }
        }
        if (variabilaPentruCazInCareDupaVirgulaAvem0 == 0) {
            System.out.println("Rezultatul impartirii este: " + cat + "," + variabilaPentruCazInCareDupaVirgulaAvem0 + dupaVirgula);
        } else {
            System.out.println("Rezultatul impartirii este: " + cat + "," + dupaVirgula);
        }
    }

    public int transformareVectorInNumar(int [] a, int pozitie){
        int  numarRezultat = 0;
        for( int i = 0; i<pozitie; i++){
            numarRezultat = numarRezultat * 10 + a[i];
        }
        return numarRezultat;
    }

    public int primireNumarPlusOPozitieVectorSiScoatereNumar(int numar, int[] vector, int pozitie){
       return numar * 10 + vector[pozitie];
    }

    public int coborareZero(int numar){
        return numar * 10;
    }


    public int[] incrementareZero(int [] rezultatIntermediar){
        int index = 1;
        int [] rezultatIntermediarNou = new int[rezultatIntermediar.length + index] ;
        int k=0;
        for(int s=0; s<=rezultatIntermediar.length-1;s++){
            rezultatIntermediarNou[k]= rezultatIntermediar[s];
            k++;
        }
        index ++;
        return rezultatIntermediarNou;
    }

    public int[] maxim (int [] a, int [] b){
        if (a.length > b.length){
            return  a;
        }else if(b.length>a.length){
            return  b;
        }else{
            return verificaPrimaCifraMaiMare(a,b);
        }
    }

    public int[] minim (int [] a, int [] b){
        if (a.length > b.length){
            return  b;
        }else if (a.length < b.length){
            return  a;
        }else{
            return verificaPrimaCifraMaiMica(a,b);
        }
    }

    public int[] verificaPrimaCifraMaiMica(int[] a, int[] b) {
        if (a[0]> b[0]){
            return b;
        }else if(a[0]<b[0]){
            return a;
        }else if(a[1]> b[1]) {
            return b;
        }else{
            return a;
        }
    }

    public int[] verificaPrimaCifraMaiMare(int[] a, int[] b) {
            if (a[0]> b[0]){
                return a;
            }else if(a[0]<b[0]){
                return b;
            }else if(a[1]> b[1]) {
                return a;
            }else{
                return b;
            }
    }

    public void afisare(int [] vectorRezultat){
        System.out.print("[");
        for (int i = 0; i < vectorRezultat.length; i++) {
            System.out.print(vectorRezultat[i] + " " );
        }
        System.out.println("]");
    }

    public int[] redimensionareVector(int [] vectorRezultat){
        int [] vectorNou = new int [vectorRezultat.length-1];
        if(vectorRezultat[0] == 0) {
            for (int i = 0; i < vectorNou.length; i++) {
                vectorNou[i] = vectorRezultat[i + 1];
            }
            return vectorNou;
        }else{
            return vectorRezultat;
        }
    }

    public int[] redimensionareMulteSpatiiVector(int[] vectorRezultat){
        int contor =0;
        for (int i = 0; i< vectorRezultat.length; i++){
            if(vectorRezultat[i] == 0){
                contor +=1;
            }else{
                break;
            }
        }
        int [] vectorNou = new int [vectorRezultat.length - contor];
        for(int i = 0; i < vectorNou.length; i++){
            vectorNou[i] = vectorRezultat[i+contor];
        }
        return vectorNou;
    }
}
