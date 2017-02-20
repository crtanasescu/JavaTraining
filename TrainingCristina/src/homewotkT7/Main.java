package homewotkT7;

import java.util.*;

/**
 * Created by Tina on 2/19/2017.
 */
public class Main {
    public static void main(String[] args) {
//        Set <String> setParametrizat = new HashSet<String>();
//        setParametrizat.add("lala");
//        setParametrizat.add("lili");
//        setParametrizat.add("lala");
//        System.out.println(setParametrizat);
        Set <Student> setParametrizat = new HashSet<Student>();
        setParametrizat.add(new Student("Popescu", 7));
        setParametrizat.add(new Student("Popescu", 7));
        setParametrizat.add(new Student("Popescu", 7));
        System.out.println(setParametrizat);


        for(Student s : setParametrizat){
            System.out.println(s.equals(s));
            System.out.println(((Object)s).equals(s));
        }


    }

}
