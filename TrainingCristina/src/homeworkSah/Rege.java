package homeworkSah;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Rege extends Piesa {

    public Rege(LocatiePeTabla locatiePeTabla) {
        super(locatiePeTabla);
    }

    /*
   pentru ca miscarea unui rege sa fie valida, trebuie ca diferenta dintre indecsii de x si diferenta dintre indecsii de y sa fie maxim 1 pentru a se muta cel mult o patratica
   -- daca miscarea este valida, atunci trebuie apelat muta() care va schimba locatia actuala a piesei cu noua locatie valida
   */
    public boolean valid(LocatiePeTabla locatieNoua, Tabla tabla) {

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
        int dif1 = Math.abs(locatieNoua.x - this.locatiePeTabla.x);
        int dif2 = Math.abs(locatieNoua.y - this.locatiePeTabla.y);
        if(dif1 < 2 && dif2 < 2){
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru rege! Regele se poate misca in fata, spate sau lateral o singura patratica.");
        return false;
    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua) {
        this.locatiePeTabla.x = locatieNoua.x;
        this.locatiePeTabla.y = locatieNoua.y;
        System.out.println("Regelui i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.x + "," + locatiePeTabla.y );
    }

    @Override
    public String toString() {
        return "R{" +
                "(" + locatiePeTabla.x + "," + locatiePeTabla.y + ")" +
                '}';
    }

}
