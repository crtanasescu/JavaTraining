package homework1.biblioteca;

/**
 * Created by KiKI on 10.09.2016.
 */
public class Carte {
    private String titlu;
    private String autor;
    private String editura;
    private int nrPagini ;

    public Carte() {}

    public Carte(String titlu, String autor, String editura, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.editura = editura;
        this.nrPagini = nrPagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu.toUpperCase() + '\'' +
                ", autor='" + autor + '\'' +
                ", editura='" + editura.toLowerCase() + '\'' +
                ", nrPagini=" + nrPagini +
                '}';
    }
}
