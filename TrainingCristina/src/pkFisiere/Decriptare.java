package pkFisiere;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by crtanasescu on 8/23/2017.
 */
public class Decriptare {

    private FileReader inputStream = null;
    private FileWriter outputStream = null;

    //        2. O functie de decriptare care sa primeasca tot doua stringuri dar sa faca invers.
    void decrypt(String inputFileName, String outputFileName) throws IOException {

        try {
            inputStream = new FileReader("C:\\Users\\crtanasescu\\Desktop\\Date pt tema\\criptare si decriptare\\" + inputFileName + ".txt");
            outputStream = new FileWriter("C:\\Users\\crtanasescu\\Desktop\\Date pt tema\\criptare si decriptare\\" + outputFileName + ".txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                c = c - 1;
                outputStream.write(c);
            }
            System.out.println("Fisierul " + inputFileName + " a fost decriptat in " + outputFileName + ".");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
