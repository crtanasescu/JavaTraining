package homeworkSah;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Regina extends Piesa {

    public Regina(LocatiePeTabla locatiePeTabla) {
        super(locatiePeTabla);
    }

    /*
   - pentru ca miscarea unei regine sa fie valida pe diagonala trebuie ca diferenta dintre x-ul noii pozitii si x-ul celei actuale sa
    fie egala cu diferenta dintre y-ul noii pozitii si y-cul celei actuale si sa fie egale cu 1
   - pentru ca miscarea unei regine sa fie valida pe verticala sau pe orizontala  trebuie ca , fie x-ul sa ramana acelasi in noua locatie, fie y-ul sa ramana acelasi in noua locatie
   -- daca miscarea este valida, atunci trebuie apelat muta() care va schimba locatia actuala a piesei cu noua locatie valida
    */
    public boolean valid(LocatiePeTabla locatieNoua, Tabla tabla) {

        Piesa[][] tablaCurenta = tabla.getTabla();

        //locul este ocupat
        if(!tabla.locLiber(locatieNoua)) {
            if (locatieNoua.x == this.locatiePeTabla.x && locatieNoua.y == this.locatiePeTabla.y) {
                System.out.println("Te aflii deja pe locul : " + this.locatiePeTabla.x + "," + this.locatiePeTabla.y);
                return false;
            }
            System.out.println("Locul (" + locatieNoua.x + "," + locatieNoua.y + ") este ocupat");
            return false;
        }

        //mutare pe diagonala
        int diferentaX = Math.abs(locatieNoua.x - this.locatiePeTabla.x);
        int diferentaY = Math.abs(locatieNoua.y - this.locatiePeTabla.y);
        if(diferentaX == diferentaY) {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }
        //mutare pe orizontala
        if(locatieNoua.x == this.locatiePeTabla.x) {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }
        //mutare pe verticala
        if(locatieNoua.y == this.locatiePeTabla.y) {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru Regina! Regina se poate misca doar pe verticala, orizontala si diagonala.");
        return false;

    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua) {
        this.locatiePeTabla.x = locatieNoua.x;
        this.locatiePeTabla.y = locatieNoua.y;
        System.out.println("Reginei i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.x + "," + locatiePeTabla.y );
    }


    public int directie(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if(locatieActuala.x - locatieNoua.x >= 0) {
            if(locatieActuala.y - locatieNoua.y >=0) {
                return 1;//"inainte si stanga";
            }else{
                return 2;//"inainte si dreapta";
            }
        }else if(locatieActuala.x - locatieNoua.x < 0){
            if(locatieActuala.y - locatieNoua.y >= 0) {
                return 3;//"inapoi si stanga";
            }else{
                return 4;//"inapoi si dreapta";
            }
        }else if (locatieActuala.x - locatieNoua.x >= 0) {
            return 5;//"inainte";
        } else if (locatieActuala.x - locatieNoua.x < 0) {
            return 6; //"inapoi
        } else if (locatieActuala.y - locatieNoua.y >= 0) {
            return 7; //stanga
        }else{
            return 8;//"dreapta";
        }


    }

    @Override
    public String toString() {
        return "Q{" +
                "(" + locatiePeTabla.x + "," + locatiePeTabla.y + ")" +
                '}';
    }

}
