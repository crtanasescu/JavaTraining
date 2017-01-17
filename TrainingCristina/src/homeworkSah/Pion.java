package homeworkSah;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Pion extends Piesa {
    boolean primaMutare = true;
    public Pion(LocatiePeTabla locatiePeTabla) {
        super(locatiePeTabla);
    }

    /*
  pentru ca miscarea unui pion sa fie valida in fata, trebuie ca coloana-y sa fie aceeasi si linia-x sa fie cu 1 mai mica
  pentru ca miscarea unui pion sa fie valida in spate, trebuie ca coloana-y sa fie aceeasi si linia-x sa fie cu 1 mai mare
   -- daca miscarea este valida, atunci trebuie apelat muta() care va schimba locatia actuala a piesei cu noua locatie valida
    */
    public boolean valid( LocatiePeTabla locatieNoua, Tabla tabla) {

        //locul este ocupat
        if(!tabla.locLiber(locatieNoua)) {
            if (locatieNoua.getX() == this.locatiePeTabla.getX() && locatieNoua.getY() == this.locatiePeTabla.getY()) {
                System.out.println("Te aflii deja pe locul : " + this.locatiePeTabla.getX() + "," + this.locatiePeTabla.getY());
                return false;
            }
            System.out.println("Locul (" + locatieNoua.getX() + "," + locatieNoua.getY() + ") este ocupat");
            return false;
        }

        //mutarea este valida
        if(primaMutare == true &&  locatieNoua.getX() == (this.locatiePeTabla.getX() - 2) && locatieNoua.getY() == this.locatiePeTabla.getY())
        {
            return true;
        }
        if ((locatieNoua.getX() == (this.locatiePeTabla.getX() - 1) && locatieNoua.getY() == this.locatiePeTabla.getY()) ||
                    (locatieNoua.getX() == (this.locatiePeTabla.getX() + 1) && locatieNoua.getY() == this.locatiePeTabla.getY())) {
                return true;
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru pion! Pionul se poate misca in fata sau spate o singura patratica. Doar la prima mutare poate merge doua patratele in fata!");
        return false;

    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua, Tabla tabla) {
        if(valid(locatieNoua,tabla)){
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            this.locatiePeTabla.setX(locatieNoua.getX());
            this.locatiePeTabla.setY(locatieNoua.getY());
            primaMutare = false;
            System.out.println("Pionului i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.getX() + "," + locatiePeTabla.getY() );
        }
    }

    @Override
    public String toString() {
        return "P{" +
                "(" + locatiePeTabla.getX() + "," + locatiePeTabla.getY() + ")" +
                '}';
    }

}
