package pkDesignPatterns;



/**
 * Created by crtanasescu on 6/19/2017.
 */
public class Main {
    public static void main(String[] args) {

        byte x = 'A';
        System.out.println(x);

        MappingLetterToNumber mappingLetterToNumber = new MappingLetterToNumber();
        System.out.println(mappingLetterToNumber.mapa);
        System.out.println(mappingLetterToNumber.mapa.get('A'));
        System.out.println(mappingLetterToNumber.mapa.get('B'));
        System.out.println(mappingLetterToNumber.mapa.get('C'));
        System.out.println(mappingLetterToNumber.mapa.get('D'));
        System.out.println(mappingLetterToNumber.mapa.get('X'));
        System.out.println(mappingLetterToNumber.mapa.get('Y'));
        System.out.println(mappingLetterToNumber.mapa.get('Z'));


        MappingNumberToLetter mappingNumberToLetter = new MappingNumberToLetter();

        System.out.println();
        System.out.println();
        FactoryPattern factoryPattern = new FactoryPattern();
        System.out.println(factoryPattern.criptare('a'));

        System.out.println(factoryPattern.decriptare(27));




    }
}
