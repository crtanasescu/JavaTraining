package homework1.biblioteca;

/**
 * Created by KiKI on 10.09.2016.
 */
public class Verficari {

    boolean verificareDuplicat(Carte a , Carte b){
       if((a.getTitlu().equals(b.getTitlu())) &&
          (a.getAutor().equals(b.getAutor())) &&
           (a.getEditura().equals(b.getEditura())) &&
           (a.getNrPagini() == b.getNrPagini())) {
           return true;
       }
        return false;
    }
    Carte ceaMaiMareCarte(Carte a, Carte b){
        return (a.getNrPagini() >= b.getNrPagini()) ? a:b;
    }

}
