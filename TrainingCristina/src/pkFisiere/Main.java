package pkFisiere;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by crtanasescu on 8/6/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {


//        1. Sa ai un fisier pe local in care sa ai un text. Folosind o functie de citire caracter cu caracter, sa ai o functie care face cript, care sa primeasca un string-nume fisier intrare si un string-nume fisier iesire. Functia va cripta continutul fisierului de intrare si va scrie in fisierul de iesire continutul criptat.
        Criptare criptare = new Criptare();
        criptare.crypt("fisierIntrare", "fisierIesire");


//        2. O functie de decriptare care sa primeasca tot doua stringuri dar sa faca invers.
        Decriptare decriptare = new Decriptare();
        decriptare.decrypt("fisierIesire", "dupaDecriptare");

//        3. As vrea sa gandesti tu functiile si clasele de crypt decrypt cum consideri tu mai frumos designed si sa imi faci un mic eseu/explicatie cu deciziile luate si motivele lor ca sa imbunatatesti designul.
        // Crypt si decript...deoarece folosesc int-uri cu codurile ASCII ale caracterelor m-am gandit sa adaug si sa scad din coduri ca ele sa devina coduri pt alte caractere.
        //TOATE CAMPURILE DIN CLASE SUNT PRIVATE

//        4. As vrea sa generezi un fisier pe disc de 1GB in ce mod vrei tu.

        Path p1 = Paths.get("D:\\1GBfile.txt");

        try (BufferedWriter w = Files.newBufferedWriter(p1)) {
            for (int i = 0; i < 1024*1024*1024; i++) {
                w.append("a");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


//        5. Sa implementezi functionalitate de copiere care copiaza un fisier dintr-o parte in alta, caracter cu caracter
        CharacterStreamsCopyCharacters characterStreamsCopyCharacters = new CharacterStreamsCopyCharacters();
        long time1 = System.currentTimeMillis();
        characterStreamsCopyCharacters.copyCharacterByCharacter("1GBfile", "copycharacter");
        long time2 = System.currentTimeMillis();
        long vitezaDeCopiereCharacter = time2 - time1;
        System.out.println(vitezaDeCopiereCharacter);

//        6. Sa implementezi functionalitate de copiere care copiaza un fisier dintr-o parte in alta folosind buffered character streams
        BufferedCharacterStreamsCopy bufferedCharacterStreamsCopy = new BufferedCharacterStreamsCopy();
        time1 = System.currentTimeMillis();
        bufferedCharacterStreamsCopy.copySteams("1GBfile", "copystream");
        time2 = System.currentTimeMillis();
        long vitezaDeCopiereBuffered = time2-time1;
        System.out.println(vitezaDeCopiereBuffered);

//        7 Sa masori sa sa compari viteza de copiere
        System.out.println("Viteza de copiere cu Character Streams este: " + vitezaDeCopiereCharacter + ". Viteza de copiere buffered este: " +
                                        + vitezaDeCopiereBuffered + ". Diferenta este de: " + Math.abs(vitezaDeCopiereCharacter - vitezaDeCopiereBuffered) + " miliseconds.");


//        8. La fel sa imi scrii cum ai ales sa implementezi functionalitatea asta de la 4 la 7 si de ce ai ales sa faci cum :) (la partea cu copierea)
        // Pai... practic asa era in documentatia pe care mi-ai dat-o si eu te-am crezut pe cuvant..pe tine si pe cei de la Oracle :)).
        // Pot sa iti zic ce am inteles in schimb. Buffered le grupeaza si pe pune pe grupulete(stream-uri) in loc de byte cu byte sau caracter cu caracter(asa cum fac
        // Byte Streams si Character Streams). Deci e normal sa fie mai rapid deoarece face mai putine scrieri in final...nu scrie caracter cu caracter ca primul.




    }
}
