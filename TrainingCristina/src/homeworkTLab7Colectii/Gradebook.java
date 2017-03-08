package homeworkTLab7Colectii;

import java.util.*;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class Gradebook extends TreeMap <Float, StudentMare>{
    Map <Float,LinkedList<StudentMare>> gradebook = new TreeMap(Collections.reverseOrder());

    @Override
    public StudentMare put(Float key, StudentMare value) {
        if(key >= 0 && key <= 10) {
            return super.put(key, value);
        }
        return null;
    }
}
