package homeworkTLab7Colectii;

/**
 * Created by crtanasescu on 2/21/2017.
 */
public class StudentMare {
    String nume;
    float medie;

    public StudentMare(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "StudentMare{" +
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

    public boolean equals(StudentMare s){
        return false;
    }

}
