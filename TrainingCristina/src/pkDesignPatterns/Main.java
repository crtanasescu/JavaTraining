package pkDesignPatterns;

/**
 * Created by crtanasescu on 6/19/2017.
 */
public class Main {
    public static void main(String[] args) {
        MappingLetterToNumber mappingLetterToNumber = new MappingLetterToNumber();
        System.out.println(mappingLetterToNumber.mapa);
        System.out.println(mappingLetterToNumber.mapa.get('A'));
        System.out.println(mappingLetterToNumber.mapa.get('B'));
        System.out.println(mappingLetterToNumber.mapa.get('C'));
        System.out.println(mappingLetterToNumber.mapa.get('D'));
        System.out.println(mappingLetterToNumber.mapa.get('X'));
        System.out.println(mappingLetterToNumber.mapa.get('Y'));
        System.out.println(mappingLetterToNumber.mapa.get('Z'));

    }
}
