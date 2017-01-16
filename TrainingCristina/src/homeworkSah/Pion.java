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
            if (locatieNoua.x == this.locatiePeTabla.x && locatieNoua.y == this.locatiePeTabla.y) {
                System.out.println("Te aflii deja pe locul : " + this.locatiePeTabla.x + "," + this.locatiePeTabla.y);
                return false;
            }
            System.out.println("Locul (" + locatieNoua.x + "," + locatieNoua.y + ") este ocupat");
            return false;
        }

        //mutarea este valida
        if(primaMutare == true &&  locatieNoua.x == (this.locatiePeTabla.x - 2) && locatieNoua.y == this.locatiePeTabla.y)
        {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            primaMutare = false;
            return true;
        }
        if ((locatieNoua.x == (this.locatiePeTabla.x - 1) && locatieNoua.y == this.locatiePeTabla.y) ||
                    (locatieNoua.x == (this.locatiePeTabla.x + 1) && locatieNoua.y == this.locatiePeTabla.y)) {
                tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
                muta(locatieNoua);
                primaMutare = false;
                return true;
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru pion! Pionul se poate misca in fata sau spate o singura patratica.");
        return false;

    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua) {
        this.locatiePeTabla.x = locatieNoua.x;
        this.locatiePeTabla.y = locatieNoua.y;
        System.out.println("Pionului i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.x + "," + locatiePeTabla.y );
    }

    @Override
    public String toString() {
        return "P{" +
                "(" + locatiePeTabla.x + "," + locatiePeTabla.y + ")" +
                '}';
    }

}
