package pkFisiere;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by crtanasescu on 8/22/2017.
 */
public class CharacterStreamsCopyCharacters {

    private FileReader inputStream = null;
    private FileWriter outputStream = null;

    void copyCharacterByCharacter(String in, String out) throws IOException{
            try {
                inputStream = new FileReader("D:\\" + in + ".txt");
                outputStream = new FileWriter("D:\\"+ out + ".txt");

                int c;
                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                }
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
