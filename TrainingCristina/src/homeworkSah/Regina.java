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

        //locul este ocupat
        if(!tabla.locLiber(locatieNoua)) {
            if (locatieNoua.getX() == this.locatiePeTabla.getX() && locatieNoua.getY() == this.locatiePeTabla.getY()) {
                System.out.println("Te aflii deja pe locul : " + this.locatiePeTabla.getX() + "," + this.locatiePeTabla.getY());
                return false;
            }
            System.out.println("Locul (" + locatieNoua.getX() + "," + locatieNoua.getY() + ") este ocupat");
            return false;
        }

        //mutare pe diagonala
        int diferentaX = Math.abs(locatieNoua.getX() - this.locatiePeTabla.getX());
        int diferentaY = Math.abs(locatieNoua.getY() - this.locatiePeTabla.getY());
        if(diferentaX == diferentaY) {
            if(traiectorieLiberaTura(this.locatiePeTabla, locatieNoua, tabla)) {
                return true;
            }else{
                System.out.println("Traiectoria pentru regina este ocupata");
                return false;
            }
        }

        //mutare pe orizontala
        if(locatieNoua.getX() == this.locatiePeTabla.getX()) {
            if(traiectorieLiberaTura(this.locatiePeTabla, locatieNoua, tabla)) {
              return true;
            }else{
               System.out.println("Traiectoria pentru regina este ocupata");
               return false;
            }
        }

        //mutare pe verticala
        if(locatieNoua.getY() == this.locatiePeTabla.getY()) {
            if(traiectorieLiberaTura(this.locatiePeTabla, locatieNoua, tabla)) {
                return true;
            }else{
                System.out.println("Traiectoria pentru regina este ocupata");
                return false;
            }
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru Regina! Regina se poate misca doar pe verticala, orizontala si diagonala.");
        return false;

    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua, Tabla tabla) {
        if(valid(locatieNoua,tabla)) {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            this.locatiePeTabla.setX(locatieNoua.getX());
            this.locatiePeTabla.setY(locatieNoua.getY());
            System.out.println("Reginei i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.getX() + "," + locatiePeTabla.getY());
        }
    }

    public boolean traiectorieLiberaTura(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua, Tabla tabla){
        DirectieRegina  rezultat = directie(locatieActuala,locatieNoua);
        boolean traiectorieLibera = true;
        switch (rezultat){
            case INAINTE:
                for(int i = locatieActuala.getX()-1; i > locatieNoua.getX(); i-- ) {
                    if (tabla.tabla[i][locatieNoua.getY()] != null) {
                        traiectorieLibera = false;
                    }
                }
                return traiectorieLibera;

            case INAPOI:
                for(int i = locatieActuala.getX()+1; i < locatieNoua.getX(); i++ ) {
                    if (tabla.tabla[i][locatieNoua.getY()] != null) {
                        traiectorieLibera = false;
                    }
                }
                return traiectorieLibera;

            case STANGA:
                for(int j = locatieActuala.getY()-1; j > locatieNoua.getY(); j-- ) {
                    if (tabla.tabla[locatieNoua.getX()][j] != null) {
                        traiectorieLibera = false;
                    }
                }
                return traiectorieLibera;

            case DREAPTA:
                for(int j = locatieActuala.getY() + 1; j < locatieNoua.getY(); j++ ) {
                    if (tabla.tabla[locatieNoua.getX()][j] != null) {
                        traiectorieLibera = false;
                    }
                }
                return traiectorieLibera;

            case INAINTE_SI_STANGA_PE_DIAGONALA:
                for(int i = locatieActuala.getX()-1, j = locatieActuala.getY() - 1  ; i > locatieNoua.getX() &&  j > locatieNoua.getY(); i-- , j--) {
                        if (tabla.tabla[i][j] != null) {
                            traiectorieLibera = false;
                        }
                }
                return traiectorieLibera;

            case INAINTE_SI_DREAPTA_PE_DIAGONALA:
                for(int i = locatieActuala.getX() - 1,  j = locatieActuala.getY() + 1   ; i > locatieNoua.getX() && j < locatieNoua.getY() ; i-- , j++) {
                        if(tabla.tabla[i][j] != null){
                            traiectorieLibera = false;
                        }
                }
                return traiectorieLibera;

            case INAPOI_SI_STANGA_PE_DIAGONALA:
                for(int i = locatieActuala.getX() + 1, j = locatieActuala.getY() - 1; i< locatieNoua.getX() && j > locatieNoua.getY(); i++, j-- ) {
                        if(tabla.tabla[i][j] != null){
                            traiectorieLibera = false;
                        }
                }
                return traiectorieLibera;

            case INAPOI_SI_DREAPTA_PE_DIAGONALA:
                for(int i = locatieActuala.getX() + 1, j = locatieActuala.getY() + 1; i< locatieNoua.getX() && j < locatieNoua.getY(); i++, j++) {
                        if(tabla.tabla[i][j] != null){
                            traiectorieLibera = false;
                        }
                }
                return traiectorieLibera;

            default:
                return false;
        }
    }

    public DirectieRegina directie(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua) {
        if (locatieActuala.getX() == locatieNoua.getX()) {
            return  mutareStangaSauDreapta(locatieActuala, locatieNoua);
        }else if(locatieActuala.getY() == locatieNoua.getY()){
            return  mutareInainteSauInapoi(locatieActuala, locatieNoua);
        }else if(locatieActuala.getX() - locatieNoua.getX() > 0) {
            return mutareFataStangaSauDreapta(locatieActuala, locatieNoua);
        }else{
            return mutareSpateStangaSauDreapta(locatieActuala, locatieNoua);
        }
    }

    public DirectieRegina mutareStangaSauDreapta(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if (locatieActuala.getY() - locatieNoua.getY() > 0) {
            return DirectieRegina.STANGA;
        }else{
            return DirectieRegina.DREAPTA;
        }
    }

    public DirectieRegina  mutareInainteSauInapoi(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if(locatieActuala.getX() - locatieNoua.getX() > 0){
            return DirectieRegina.INAINTE;
        }else{
            return DirectieRegina.INAPOI;
        }
    }

    public DirectieRegina mutareFataStangaSauDreapta(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua) {
        if (locatieActuala.getY() - locatieNoua.getY() >= 0) {
            return DirectieRegina.INAINTE_SI_STANGA_PE_DIAGONALA;
        } else {
            return DirectieRegina.INAINTE_SI_DREAPTA_PE_DIAGONALA;
        }
    }

    public DirectieRegina mutareSpateStangaSauDreapta(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if(locatieActuala.getY() - locatieNoua.getY() >= 0) {
            return DirectieRegina.INAPOI_SI_STANGA_PE_DIAGONALA;
        }else{
            return DirectieRegina.INAPOI_SI_DREAPTA_PE_DIAGONALA;
        }
    }


    @Override
    public String toString() {
        return "Q{" +
                "(" + locatiePeTabla.getX() + "," + locatiePeTabla.getY() + ")" +
                '}';
    }

}
