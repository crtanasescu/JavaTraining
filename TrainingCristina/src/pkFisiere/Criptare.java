package pkFisiere;

import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by crtanasescu on 8/22/2017.
 */
public class Criptare {

    private FileReader inputStream = null;
    private FileWriter outputStream = null;

    //       1. Sa ai un fisier pe local in care sa ai un text. Folosind o functie de citire caracter cu caracter,
//    sa ai o functie care face cript, care sa primeasca un string-nume fisier intrare si un string-nume fisier iesire.
//    Functia va cripta continutul fisierului de intrare si va scrie in fisierul de iesire continutul criptat.

    void crypt(String inputFileName, String outputFileName) throws IOException {

        try {
            inputStream = new FileReader("C:\\Users\\crtanasescu\\Desktop\\Date pt tema\\criptare si decriptare\\" + inputFileName + ".txt");
            outputStream = new FileWriter("C:\\Users\\crtanasescu\\Desktop\\Date pt tema\\criptare si decriptare\\" + outputFileName + ".txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                c = c + 1;
                outputStream.write(c);
            }
            System.out.println("Fisierul " + inputFileName + " a fost criptat in " + outputFileName + ".");
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