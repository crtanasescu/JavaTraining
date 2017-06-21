package pkDesignPatterns;



/**
 * Created by crtanasescu on 6/19/2017.
 */
public class Main {
    public static void main(String[] args) {

        byte x = 'A';
        System.out.println(x);



        /* 1. Sa fac o clasa (MappingLetterToNumber) care sa stocheze maparea dintre o litera a alfabetului si numarul corespunzator cu ajutorul unui
        hashmap de complexitate O(1), care va avea o metoda get care primeste un char si da un numar (fara put). Hashmap ul sa fie creat si sa se populeze automat cu char-urile
        si int-urile corespunzatoare.


        2. Sa creez un Factory Pattern si sa il folosesc pentru a crea 2 functii CRIPTARE si DECRIPTARE. La criptare din char sa dea int : A-1, B-2, C-3 etc. Pentru a tine maparea
        dintre ele sa folosesc hashMap. La decriptare din int sa dea char: 1-A, 2-B... Sa folosesc ArrayList.
        */


        MappingLetterToNumber mappingLetterToNumber = new MappingLetterToNumber();
        System.out.println(mappingLetterToNumber.mapa);
        System.out.println(mappingLetterToNumber.mapa.get('A'));
        System.out.println(mappingLetterToNumber.mapa.get('B'));
        System.out.println(mappingLetterToNumber.mapa.get('C'));
        System.out.println(mappingLetterToNumber.mapa.get('D'));
        System.out.println(mappingLetterToNumber.mapa.get('X'));
        System.out.println(mappingLetterToNumber.mapa.get('Y'));
        System.out.println(mappingLetterToNumber.mapa.get('Z'));




        System.out.println();
        System.out.println();
        FactoryPattern factoryPattern = new FactoryPattern();
        System.out.println(factoryPattern.criptare('a'));

        System.out.println(factoryPattern.decriptare(27));




    }
}
