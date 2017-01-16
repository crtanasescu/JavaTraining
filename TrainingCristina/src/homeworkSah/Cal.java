package homeworkSah;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Cal extends  Piesa {

    public Cal(LocatiePeTabla locatiePeTabla) {
        super(locatiePeTabla);
    }

    /*
  pentru ca miscarea unui cal sa fie valida cu doua patratele pe o linie si apoi unul perpendicular , trebuie ca o diferenta dintre indecsi sa fie 1 si cealalta sa fie 2
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
        if ((dif1 == 2 && dif2 == 1) || (dif1 == 1 && dif2 == 2)){
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru cal! Calul se poate misca doar doua patratele pe o linie si unul perpendicular: in L.");
        return false;
    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua) {
        this.locatiePeTabla.x = locatieNoua.x;
        this.locatiePeTabla.y = locatieNoua.y;
        System.out.println("Calului i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.x + "," + locatiePeTabla.y );
    }

    @Override
    public String toString() {
        return "C{" +
                "(" + locatiePeTabla.x + "," + locatiePeTabla.y + ")" +
                '}';
    }
}
