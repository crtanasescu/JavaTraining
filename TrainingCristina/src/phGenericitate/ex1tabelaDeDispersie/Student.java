package phGenericitate.ex1tabelaDeDispersie;

/**
 * Created by crtanasescu on 5/24/2017.
 */
public class Student {
    String nume;
    int nota;

    public Student(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;

        if (nota != student.nota) return false;
        return nume != null ? nume.equals(student.nume) : student.nume == null;

    }

    @Override
    public int hashCode() {
        int result = nume != null ? nume.hashCode() : 0;
        result = 31 * result + nota;
        return result;
    }
}
