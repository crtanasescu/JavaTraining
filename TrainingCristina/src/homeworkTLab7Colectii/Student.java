package homeworkTLab7Colectii;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class Student {
    String nume;
    float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }

    public boolean equals(Student s){
        return false;
    }

}
