package phGenericitate.ex1tabelaDeDispersie;

import penguin.Penguin;

/**
 * Created by Ciprian on 3/23/2017.
 */
public class Entry <K,V> {
    K k;
    V v;

    public Entry(K cheie, V valoare) {
        this.k = cheie;
        this.v = valoare;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "cheie=" + k +
                ", valoare='" + v + '\'' +
                '}';
    }

}
