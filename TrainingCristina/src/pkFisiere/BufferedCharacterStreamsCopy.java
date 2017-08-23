package pkFisiere;

import java.io.*;

/**
 * Created by crtanasescu on 8/23/2017.
 */
public class BufferedCharacterStreamsCopy {

    private BufferedReader inputStream = null;
    private BufferedWriter outputStream = null;

    void copySteams(String in, String out) throws IOException {
        try {
            inputStream = new BufferedReader(new FileReader("D:\\" + in + ".txt"));
            outputStream = new BufferedWriter(new FileWriter("D:\\" + out + ".txt"));

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
