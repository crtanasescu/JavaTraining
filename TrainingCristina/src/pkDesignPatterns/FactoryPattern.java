package pkDesignPatterns;

/**
 * Created by crtanasescu on 6/19/2017.
 */
public class FactoryPattern {

    MappingLetterToNumber mappingLetterToNumber;
    MappingNumberToLetter mappingNumberToLetter;

    public FactoryPattern() {
         mappingLetterToNumber = new MappingLetterToNumber();
        mappingNumberToLetter = new MappingNumberToLetter();
    }


    public int criptare(char c){
        if (c >= 'A' && c <= 'Z') {
            return mappingLetterToNumber.mapa.get(c);
        }else{
            return 0;
        }
    }

    public char decriptare (int c){
        if(c>=1 && c<=26) {
            return mappingNumberToLetter.lista.get(c - 1);
        }else{
            return 'x';
        }
    }


}
