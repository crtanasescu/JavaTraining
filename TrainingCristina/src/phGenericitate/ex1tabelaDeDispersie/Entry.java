package phGenericitate.ex1tabelaDeDispersie;

import penguin.Penguin;

/**
 * Created by Ciprian on 3/23/2017.
 */
public class Entry <K,V> {
    K K;
    V V;

    public Entry(K cheie, V valoare) {
        this.K = cheie;
        this.V = valoare;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "cheie=" + K +
                ", valoare='" + V + '\'' +
                '}';
    }

}
