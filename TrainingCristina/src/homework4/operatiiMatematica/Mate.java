package homework4.operatiiMatematica;


import java.util.ArrayList;

/**
 * Created by ctana on 12.10.2016.
 */
public class Mate {

    int[] a;
    int[] b;
    int maxim;

    public Mate(int[] a, int[] b) {
        this.a = a;
        this.b = b;

    }

    public void adunare(int[] a, int[] b) {
        int[] bNou;
        int[] aNou;
        if (a.length > b.length) {
            this.maxim =a.length;
            bNou = new int[a.length];
            int k = bNou.length - 1;
            for (int i = b.length - 1; i >= 0; i--) {
                bNou[k] = b[i];
                k--;
            }
            this.b = bNou;
        } else {
            this.maxim=b.length;
            aNou = new int[b.length];
            int k = aNou.length - 1;
            for (int i = a.length - 1; i >= 0; i--) {
                aNou[k] = a[i];
                k--;
            }
            this.a = aNou;
        }
        int tinemMinte = 0;

        int[] vectorRezultat = new int[maxim + 1];
        int j = maxim-1;
        for (int i = vectorRezultat.length-1; i >= 0; i--) {
            if(j>=0) {
                int raspuns = this.a[j] + this.b[j] + tinemMinte;
                vectorRezultat[i] = raspuns % 10;
                tinemMinte = raspuns / 10;
                j--;
            }else{
                vectorRezultat[i] = tinemMinte;
            }
        }
        for (int i = 0; i < vectorRezultat.length; i++) {
            System.out.print(vectorRezultat[i] + " " );
        }
        System.out.println();

    }



    public void scadere(int [] a , int[] b) {
    int[] bNou;
    int[] aNou;
        int maiMareLaEgalitate=0 ;
    if(a.length == b.length){
            if (a[0] > b[0]){
                maiMareLaEgalitate = 1;
            }else if(a[0] < b[0]){
                maiMareLaEgalitate =2;
            }
        } //?????????????????????????????????


    if( (a.length > b.length) || maiMareLaEgalitate==1){
        this.maxim = a.length;
        bNou = new int[a.length];
        int k = bNou.length - 1;
        for (int i = b.length - 1; i >= 0; i--) {
            bNou[k] = b[i];
            k--;
        }
        this.b = bNou;

        int neImprumutam = 0;
        int[] vectorRezultat = new int[maxim];
        for (int j = vectorRezultat.length - 1; j >= 0; j--) {
            if((this.a[j]>=this.b[j]+1) && neImprumutam ==0) {
                int rezultat = this.a[j] - this.b[j] - neImprumutam;
                vectorRezultat[j] = rezultat;
            }else if((this.a[j]>=this.b[j]+1) && neImprumutam == 1){
                int rezultat = this.a[j] - this.b[j] - neImprumutam;
                vectorRezultat[j] = rezultat;
                neImprumutam = 0;
            }else if((this.a[j]<this.b[j]+1) && neImprumutam == 1) {
                int rezultat = (this.a[j]+10) - this.b[j] - neImprumutam;
                vectorRezultat[j] = rezultat;
                neImprumutam = 1;
            }else if((this.a[j] == this.b[j]) && neImprumutam ==0) {
                vectorRezultat[j] = 0;

            }else{
                    int rezultat = (this.a[j]+10) - this.b[j] - neImprumutam;
                    vectorRezultat[j] = rezultat;
                    neImprumutam = 1;
                }
            }


        for (int i = 0; i <= vectorRezultat.length - 1; i++) {
            System.out.print(vectorRezultat[i] + " ");
        }
        System.out.println();


    } else if ((a.length < b.length) || maiMareLaEgalitate==2){
        this.maxim = b.length;
        aNou = new int[b.length];
        int k = aNou.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            aNou[k] = a[i];
            k--;
        }
        this.a = aNou;

        int neImprumutam = 0;
        int[] vectorRezultat = new int[maxim];
        for (int j = vectorRezultat.length - 1; j >= 0; j--) {
            if((this.b[j]>=this.a[j]+1) && neImprumutam ==0) {
                int rezultat = this.b[j] - this.a[j] - neImprumutam;
                vectorRezultat[j] = rezultat;
            }else if((this.b[j]>=this.a[j]+1) && neImprumutam == 1){
                int rezultat = this.b[j] - this.a[j] - neImprumutam;
                vectorRezultat[j] = rezultat;
                neImprumutam = 0;
            }else if((this.b[j]<this.a[j]+1) && neImprumutam == 1) {
                int rezultat = (this.b[j]+10) - this.a[j] - neImprumutam;
                vectorRezultat[j] = rezultat;
                neImprumutam = 1;
            } else if((this.a[j] == this.b[j]) && neImprumutam ==0) {
                vectorRezultat[j] = 0;
            }else{
                int rezultat = (this.b[j]+10) - this.a[j] - neImprumutam;
                vectorRezultat[j] = rezultat;
                neImprumutam = 1;
            }

        }
        for (int i = 0; i <= vectorRezultat.length - 1; i++) {
            System.out.print(vectorRezultat[i] + " ");
        }
        System.out.println();

    }
}


    public String inmultire(int[] a, int[] b) {
        ArrayList<String> partialList = new ArrayList<String>();
        for ( int i = b.length-1; i>=0; i-- ){
            int[] vectorAux = new int[b.length + a.length];
            int lungime = vectorAux.length-1;
            int tineMinte =0;
            for(int j =a.length-1; j>=0; j--){
                int produs = (b[i] * a[j] + tineMinte) %10;
                tineMinte = (b[i] * a[j] + tineMinte) /10;
                vectorAux[lungime]  = produs;
                lungime -= 1;
                if(j==0){
                    vectorAux[lungime] = tineMinte;
                }
            }
           //
            System.out.println(transformareInSirDeCifre(vectorAux));
           String  numarDeRetinut = transformareInSirDeCifre(vectorAux);
           partialList.add(numarDeRetinut);

        }

        for(int i =0; i<partialList.size(); i++){       //adauga 0 incremental
            partialList.set(i, partialList.get(i) + (Long.toString( (long)java.lang.Math.pow(10.0,(double)i))).substring(1)   );
            System.out.println(partialList);
        }

        for(int i=0; i<partialList.size(); i++) {      //itereaza prin elementele String ale listei care trebuie transformate pe rand in vectori de int
            char[] alabala = partialList.get(i).toCharArray();   //transformare in vector de char
            int[] sir = new int[alabala.length];
            for (int ala = 0; ala < alabala.length; ala++) {
                sir[ala] = Character.getNumericValue(alabala[ala]);    //transformare in vector de int
            }

        }





        int  carry=0, sum=0;
        String result = new String("");



         /* getting the size of the largest partial product(last) */
        int largestPartial = partialList.get(partialList.size()-1).length();

        /* prefixing zeroes */
        int zeroes;
        for(int i=0 ; i<partialList.size() ; i++) {
            zeroes =  largestPartial - partialList.get(i).length();

            if(zeroes >= 1)
                partialList.set(i, (Long.toString( (long)java.lang.Math.pow(10.0,(double)zeroes))).substring(1) + partialList.get(i)   );
        }

        /* to compute the result */
        carry = 0;
        for(int i=largestPartial-1 ; i>=0 ; i--) {

            sum = 0;
            for(int j=0 ; j<partialList.size() ; j++)
                sum = sum + Integer.parseInt(new Character(partialList.get(j).charAt(i)).toString());

            sum = sum + carry;
            carry = sum/10;
            result = Integer.toString(sum%10) + result;
        }

        if(carry != 0) {
            result = Integer.toString(carry) + result;
        }
        return result;
    }





           // adunare(sir[i],sir[i+1] );








    public String transformareInSirDeCifre(int [] vector){
        String string="";
        for (int i = 0; i<vector.length;i++ ){
            string = string.concat(String.valueOf(vector[i]));
        }
        return string;
    }

}


