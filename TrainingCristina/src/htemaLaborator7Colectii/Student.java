package htemaLaborator7Colectii;

/**
 * Created by Ciprian on 2/22/2017.
 */
public class Student implements Comparable{

    private String nume;
    private float medie;

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
    public boolean equals(Object obj) {
        Student s1 = (Student) obj;
        if (this.nume.equals(s1.nume) && this.medie == s1.medie) {
            return true;
        }else{
            return false;
        }
    }

    public boolean equals(Student s){
        return  false;
    }

    @Override
    public int hashCode() {
        int calculHasCode = this.nume.hashCode() + (int)medie ;
        return calculHasCode;
    }


    public int compareTo(Object obj)
    {
        Student s = (Student) obj;
        return this.nume.toLowerCase().compareTo(s.getNume().toLowerCase());
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }
}
