package temaLaborator7Colectii;

import homework3.homeworkLab3.exercise6.Array;

import java.util.*;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class Gradebook extends TreeMap <Integer, ArrayList<Student>>{


    public Gradebook() {
        for(int key = 0; key <= 10; key++) {
            this.put(key, null);
        }

        ArrayList<Integer> keys = new ArrayList<Integer>(this.keySet());
        Collections.sort(keys, new ComparatorPentruMedii());
        System.out.println(keys);

    }

    @Override
    public ArrayList<Student> put(Integer key, ArrayList <Student> value) {
        if (key >= 0 && key <= 10) {
            return super.put(key, value);
        } else {
            return null;
        }
    }


    public void add(Student stud) {
        Integer roundGrade = Math.round(stud.getMedie());
        if (this.containsKey(roundGrade)) {
            ArrayList<Student> studentsList = this.get(roundGrade);

            if (studentsList == null) {
                studentsList = new ArrayList<Student>();
            }

            studentsList.add(stud);
            this.put(roundGrade, studentsList);
        }
    }





}




