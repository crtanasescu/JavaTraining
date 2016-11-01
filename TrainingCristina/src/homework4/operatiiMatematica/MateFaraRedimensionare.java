package homework4.operatiiMatematica;

/**
 * Created by crtanasescu on 10/25/2016.
 */
public class MateFaraRedimensionare {

    int[] a;
    int[] b;

    public MateFaraRedimensionare(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    public int[] adunareFaraRedimensionare (int [] a, int [] b){

        int dif = Math.abs(a.length-b.length);
        int tinemMinte = 0;
        int max[] = maxim(a,b);
        int min[] = minim(a,b);
        int[] vectorRezultat = new int[max.length + 1];

        for(int i = min.length-1; i>=0; i--){
            int raspuns = min[i] + max[i+dif] + tinemMinte;
            vectorRezultat[i + dif + 1] = raspuns % 10;
            tinemMinte = raspuns/10;
            if (tinemMinte == 1 && i + dif == 0){
                vectorRezultat[0] = 1;
            }
        }
        for ( int i = dif-1 ; i>= 0 ; i--){
            int raspuns = max[i] + tinemMinte;
            vectorRezultat[i+1] = raspuns % 10;
            tinemMinte = raspuns/10;
        }
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
        int neimprumutam = 0;
        int max[] = maxim(a,b);
        int min[] = minim(a,b);
        int[] vectorRezultat = new int[max.length];
        int j = max.length - 1;

        for(int i = min.length - 1 ; i>=0; i--){
            int raspuns = max[i+dif] - min[i] - neimprumutam;
            if(raspuns >= 0){
                vectorRezultat[j] = raspuns;
                neimprumutam = 0;
                j--;
            }else{
                vectorRezultat[j]= (max[i+dif] + 10) - min[i] - neimprumutam;
                neimprumutam = 1;
                j--;
            }
        }

        for(int i = dif-1; i>=0; i--){
            vectorRezultat[i] = max[i] - neimprumutam;
            neimprumutam = 0;
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
        for (int i = min.length - 1; i >= 0; i--) {
            int[] rezultatIntermediar = new int[max.length +1];
            int lungime = rezultatIntermediar.length - 1;
            int tineMinte = 0;
            for (int j = max.length - 1; j >= 0; j--) {
                int rezultat = (max[j] * min[i] + tineMinte) % 10;
                tineMinte = (max[j] * min[i] + tineMinte) / 10;
                rezultatIntermediar[lungime] = rezultat;
                lungime -= 1;
                if (j == 0) {
                    rezultatIntermediar[lungime] = tineMinte;
                }
            }
            rezultatIntermediar = redimensionareVector(rezultatIntermediar);
            if(min.length == 1){afisare(rezultatIntermediar);}
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
            }
        }
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

    int index = 1;
    public int[] incrementareZero(int [] rezultatIntermediar){
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
        for (int i = 0; i < vectorRezultat.length; i++) {
            System.out.print(vectorRezultat[i] + " " );
        }
        System.out.println();
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
        for (int i = 0; i<= vectorRezultat.length; i++){
            if(vectorRezultat[i] == 0){
                contor +=1;
            }else{
                break;
            }
        }
        int [] vectorNou = new int [vectorRezultat.length - contor];
        if(contor !=0){
            for(int i = 0; i < vectorNou.length; i++){
                vectorNou[i] = vectorRezultat[i+contor];
            }
        }
        return vectorNou;
    }
    
}
