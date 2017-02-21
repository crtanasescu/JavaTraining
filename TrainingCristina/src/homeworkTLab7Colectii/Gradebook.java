package homeworkTLab7Colectii;

import java.util.*;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class Gradebook extends TreeMap <Float,Student>{
    Map <Float,LinkedList<Student>> gradebook = new TreeMap(Collections.reverseOrder());

    @Override
    public Student put(Float key, Student value) {
        if(key >= 0 && key <= 10) {
            return super.put(key, value);
        }
        return null;
    }
}
