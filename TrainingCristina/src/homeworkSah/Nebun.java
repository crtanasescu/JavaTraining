package homeworkSah;

import homework4.operatiiMatematica.Mate;
import javafx.scene.control.Tab;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Nebun extends Piesa {

    public Nebun(LocatiePeTabla locatiePeTabla) {
        super(locatiePeTabla);
    }

    /*
    pentru ca miscarea unui nebun sa fie valida pe diagonala, trebuie ca diferenta dintre x-ul noii pozitii si x-ul celei actuale sa
    fie egala cu diferenta dintre y-ul noii pozitii si y-cul celei actuale
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

        //mutarea este valida
        int diferentaX = Math.abs(locatieNoua.getX() - this.locatiePeTabla.getX());
        int diferentaY = Math.abs(locatieNoua.getY() - this.locatiePeTabla.getY());
        if(diferentaX == diferentaY) {
            if (traiectorieLiberaNebun(locatiePeTabla, locatieNoua, tabla)) {
                return true;
            } else {
                System.out.println("Traiectoria pentru nebun este ocupata");
            }
        }else {

            //mutarea nu este valida
            System.out.println("Mutare imposibila pentru Nebun! Nebunul se poate misca doar pe diagonala.");
            return false;
        }
        return  false;
    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua, Tabla tabla) {
        if(valid(locatieNoua, tabla)) {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            this.locatiePeTabla.setX(locatieNoua.getX());
            this.locatiePeTabla.setY(locatieNoua.getY());
            System.out.println("Nebunului i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.getX() + "," + locatiePeTabla.getY());
        }
    }

    public boolean traiectorieLiberaNebun(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua, Tabla tabla){
        DirectieNebun rezultat = directie(locatieActuala,locatieNoua);
        boolean traiectorieLibera = true;
        switch (rezultat){
            case INAINTE_SI_STANGA_PE_DIAGONALA:
                for(int i = locatieActuala.getX() - 1,  j = locatieActuala.getY() - 1   ; i > locatieNoua.getX() && j > locatieNoua.getY(); i--, j-- ) {
                        if (tabla.tabla[i][j] != null) {
                            traiectorieLibera = false;
                        }
                }
                return traiectorieLibera;

            case INAINTE_SI_DREAPTA_PE_DIAGONALA:
                for(int i = locatieActuala.getX() - 1 , j = locatieActuala.getY() + 1  ; i > locatieNoua.getX() && j < locatieNoua.getY(); i-- , j++) {
                        if(tabla.tabla[i][j] != null){
                            traiectorieLibera = false;
                        }
                }
               return traiectorieLibera;

            case INAPOI_SI_STANGA_PE_DIAGONALA:
                for(int i = locatieActuala.getX() + 1, j = locatieActuala.getY() - 1; i< locatieNoua.getX() &&  j > locatieNoua.getY(); i++, j-- ) {
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

    public DirectieNebun directie(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if(locatieActuala.getX() - locatieNoua.getX() > 0) {
            return mutareFata(locatieActuala, locatieNoua);
        }else{
            return mutareSpate(locatieActuala, locatieNoua);
        }
    }

    public DirectieNebun mutareFata(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua) {
        if (locatieActuala.getY() - locatieNoua.getY() > 0) {
            return DirectieNebun.INAINTE_SI_STANGA_PE_DIAGONALA;
        } else {
            return DirectieNebun.INAINTE_SI_DREAPTA_PE_DIAGONALA;
        }
    }

    public DirectieNebun mutareSpate(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if(locatieActuala.getY() - locatieNoua.getY() >= 0) {
            return DirectieNebun.INAPOI_SI_STANGA_PE_DIAGONALA;
        }else{
            return DirectieNebun.INAPOI_SI_DREAPTA_PE_DIAGONALA;
        }
    }


    @Override
    public String toString() {
        return "N{" +
                "(" + locatiePeTabla.getX() + "," + locatiePeTabla.getY() + ")" +
                '}';
    }

}
