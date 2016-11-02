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

        for(int i = dif-1; i>=0; i--){
            vectorRezultat[i] = max[i] - neImprumutam;
            neImprumutam = 0;
        }
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

    public void impartireFaraRedimensionare(int[] a, int[] b){
        int max[] = maxim(a,b);
        int min[] = minim(a,b);
        int lungimePentruFormareNumar = min.length;
        int deimpartit = 0;
        for(int i=0; i<lungimePentruFormareNumar-1; i++){
             deimpartit = max[i]*10 + max[i+1];
        }
        int impartitor = 0;
        for(int j=0; j<lungimePentruFormareNumar-1; j++){
            impartitor = min[j]*10 + min[j+1];
        }
        int rest = 0;
        int cat = (deimpartit / impartitor) - rest;
        //int noulDeimpartit = (deimpartit-impartitor)*10 ;
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
