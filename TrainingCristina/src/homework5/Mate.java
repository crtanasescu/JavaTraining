package homework5;


/**
 * Created by ctana on 12.10.2016.
 */
public class Mate {

    int[] a = new int[10];
    int[] b = new int[10];
    int maxim;

    public Mate(int[] a, int[] b) {
        this.a = a;
        this.b = b;

    }
//
//    public void adunare1(int[] a, int[] b) {
//        int[] bNou;
//        int[] aNou;
//        if (a.length > b.length) {
//            this.maxim =a.length;
//            bNou = new int[a.length];
//            int k = bNou.length - 1;
//            for (int i = b.length - 1; i >= 0; i--) {
//                bNou[k] = b[i];
//                k--;
//            }
//            this.b = bNou;
//        } else {
//            this.maxim=b.length;
//            aNou = new int[b.length];
//            int k = aNou.length - 1;
//            for (int i = a.length - 1; i >= 0; i--) {
//                aNou[k] = a[i];
//                k--;
//            }
//            this.a = aNou;
//        }
//        int tinemMinte = 0;
//        int[] vectorRezultat = new int[maxim];
//        for (int i = maxim-1; i >= 0; i--) {
//            int raspuns = this.a[i] + this.b[i] + tinemMinte;
//            if (raspuns >= 10 && tinemMinte == 0) {
//                vectorRezultat[i] = raspuns % 10;
//                tinemMinte = 1;
//            } else if (raspuns >= 10 && tinemMinte == 1) {
//                vectorRezultat[i] = raspuns % 10;
//            } else if (raspuns < 10 && tinemMinte == 1) {
//                vectorRezultat[i] = raspuns;
//                tinemMinte = 0;
//            } else {
//                vectorRezultat[i] = raspuns;
//            }
//        }
//        for (int i = 0; i < vectorRezultat.length; i++) {
//            System.out.print(vectorRezultat[i]);
//        }
//        System.out.println();
//
//    }




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
        } else  {
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
    public void scadere(int [] a , int[] b){
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
        } else  {
            this.maxim=b.length;
            aNou = new int[b.length];
            int k = aNou.length - 1;
            for (int i = a.length - 1; i >= 0; i--) {
                aNou[k] = a[i];
                k--;
            }
            this.a = aNou;
        }
        int neImprumutam = 0;
        int[] vectorRezultat = new int[maxim];
        for(int i = vectorRezultat.length; i>=0; i++){
            vectorRezultat[i] = Math.abs(a[i] - b[i] - neImprumutam);
            neImprumutam = ;
            }

        }

    }


}


