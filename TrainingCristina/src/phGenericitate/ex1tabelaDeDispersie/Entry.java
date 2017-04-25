package phGenericitate.ex1tabelaDeDispersie;

import penguin.Penguin;

/**
 * Created by Ciprian on 3/23/2017.
 */
public class Entry {
    int cheie;
    String valoare;

    public Entry(int cheie, String valoare) {
        this.cheie = cheie;
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "cheie=" + cheie +
                ", valoare='" + valoare + '\'' +
                '}';
    }
}
