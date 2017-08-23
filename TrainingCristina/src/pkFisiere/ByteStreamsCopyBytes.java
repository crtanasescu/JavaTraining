package pkFisiere;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by crtanasescu on 8/22/2017.
 */
public class ByteStreamsCopyBytes {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\crtanasescu\\Desktop\\Date pt tema\\BYTE STREAMS\\xanadu.txt");
            out = new FileOutputStream("C:\\Users\\crtanasescu\\Desktop\\Date pt tema\\BYTE STREAMS\\outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
