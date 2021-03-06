package pJUnitSiExceptii.ex1gradinaZoo;

/**
 * Created by Tina on 4/24/2017.
 */
public class Animal {
     private String nume;
     private int varsta;

    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Animal an = (Animal) o;
        if((this.nume).equals(an.nume) && this.varsta == an.varsta){
            return true;
        }else{
            return false;
        }
    }

}
