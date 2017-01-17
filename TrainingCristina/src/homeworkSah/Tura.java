package homeworkSah;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Tura extends Piesa {

    public Tura(LocatiePeTabla locatiePeTabla) {
        super(locatiePeTabla);
    }

    /*
    pentru ca miscarea unei ture sa fie valida pe verticala sau pe orizontala, trebuie ca , fie x-ul sa ramana acelasi in noua locatie, fie y-ul sa ramana acelasi in noua locatie
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

        //mutare pe orizontala
        if(locatieNoua.getX() == this.locatiePeTabla.getX()) {
            if(traiectorieLiberaTura(this.locatiePeTabla, locatieNoua, tabla)) {
                return true;
            }else{
                System.out.println("Traiectoria pentru tura este ocupata.");
                return false;
            }
        }

        //mutare pe verticala
        if(locatieNoua.getY() == this.locatiePeTabla.getY()) {
            if(traiectorieLiberaTura(this.locatiePeTabla, locatieNoua, tabla)) {
                return true;
            }else{
                System.out.println("Traiectoria pentru tura este ocupata.");
                return false;
            }
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru Tura! Tura se poate misca doar pe orizontala sau pe verticala.");
        return false;
    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua, Tabla tabla) {
        if(valid(locatieNoua, tabla)){
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            this.locatiePeTabla.setX(locatieNoua.getX());
            this.locatiePeTabla.setY(locatieNoua.getY());
            System.out.println("Turei i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.getX() + "," + locatiePeTabla.getY() );
        }
    }


    public boolean traiectorieLiberaTura(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua, Tabla tabla){
        DirectieTura  rezultat = directie(locatieActuala,locatieNoua);
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
            default:
                return false;
        }
    }


    public DirectieTura directie(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua) {
        if (locatieActuala.getX() == locatieNoua.getX()) {
            return mutareStangaSauDreapta(locatieActuala, locatieNoua);
        }else if (locatieActuala.getY() == locatieNoua.getY()) {
            return mutareInainteSauInapoi(locatieActuala, locatieNoua);
        }else{
            return null;
        }
    }

    public DirectieTura mutareStangaSauDreapta(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if (locatieActuala.getY() - locatieNoua.getY() > 0) {
            return DirectieTura.STANGA;
        }else{
            return DirectieTura.DREAPTA;
        }
    }

    public DirectieTura  mutareInainteSauInapoi(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if(locatieActuala.getX() - locatieNoua.getX() > 0){
            return DirectieTura.INAINTE;
        }else{
            return DirectieTura.INAPOI;
        }
    }


    @Override
    public String toString() {
        return "T{" +
                "(" + locatiePeTabla.getX() + "," + locatiePeTabla.getY() + ")" +
                '}';
    }

}
