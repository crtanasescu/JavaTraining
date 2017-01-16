package homeworkSah;

import homework4.operatiiMatematica.Mate;

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
            if (locatieNoua.x == this.locatiePeTabla.x && locatieNoua.y == this.locatiePeTabla.y) {
                System.out.println("Te aflii deja pe locul : " + this.locatiePeTabla.x + "," + this.locatiePeTabla.y);
                return false;
            }
            System.out.println("Locul (" + locatieNoua.x + "," + locatieNoua.y + ") este ocupat");
            return false;
        }

        //mutarea este valida
        int diferentaX = Math.abs(locatieNoua.x - this.locatiePeTabla.x);
        int diferentaY = Math.abs(locatieNoua.y - this.locatiePeTabla.y);
        if((diferentaX == diferentaY) && (traiectorieLiberaNebun(locatiePeTabla, locatieNoua, tabla) == true)){
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru Nebun! Nebunul se poate misca doar pe diagonala.");
        return false;
    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua) {
        this.locatiePeTabla.x = locatieNoua.x;
        this.locatiePeTabla.y = locatieNoua.y;
        System.out.println("Nebunului i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.x + "," + locatiePeTabla.y );
    }

    @Override
    public String toString() {
        return "N{" +
                "(" + locatiePeTabla.x + "," + locatiePeTabla.y + ")" +
                '}';
    }

    public boolean traiectorieLiberaNebun(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua, Tabla tabla){
        int diferentaX = Math.abs(locatieNoua.x - locatieActuala.x);
        int diferentaY = Math.abs(locatieNoua.y - locatieActuala.y);
//        if(directie(locatieActuala,locatieNoua) == "inainte si stanga") {
//            for (int i = locatieActuala.x ; i <= locatieNoua.x ; i--){
//                for(int j = locatieActuala)
//            }
//
//        }

        Piesa[][] tablaCurenta = tabla.getTabla();
        int rezultat = directie(locatieActuala,locatieNoua);
        boolean ok = true;
        switch (rezultat){
            case 1: //"inainte si stanga";

                for(int i = locatieActuala.x - 1   ; i<= locatieNoua.x + 1; i-- ) {
                    for (int j = locatieActuala.y - 1; j <= locatieNoua.y + 1; j--) {
                       Piesa deTestat = tablaCurenta[i][j];
                        if(deTestat != null){
                            ok = false;
                        }

//                        if (tabla.tabla[i][j] != null) {
//                            ok = false;
//                        }
                    }
                }

                    if (ok == true) {
                        return true;
                    }

            case 2: //"inainte si dreapta";
                for(int i = locatieActuala.x - 1; i<= locatieNoua.x + 1; i-- ) {
                    for (int j = locatieActuala.y + 1; j <= locatieNoua.y - 1; j++) {
                        if(tabla.tabla[i][j] != null){
                            ok = false;
                        }
                    }
                }
                if(ok == true){
                    return true;
                }

            case 3: //"inapoi si stanga";

                for(int i = locatieActuala.x + 1; i<= locatieNoua.x - 1; i++ ) {
                    for (int j = locatieActuala.y - 1; j <= locatieNoua.y + 1; j--) {
                        if(tabla.tabla[i][j] != null){
                            ok = false;
                        }
                    }
                }
                if(ok == true){
                    return true;
                }
            case 4: //"inapoi si dreapta";

                for(int i = locatieActuala.x + 1; i<= locatieNoua.x - 1; i++) {
                    for (int j = locatieActuala.y + 1; j <= locatieNoua.y - 1; j++) {
                        if(tabla.tabla[i][j] != null){
                            ok = false;
                        }
                    }
                }
                if(ok == true){
                    return true;
                }

        }

        return false;
    }

    public int directie(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua){
        if(locatieActuala.x - locatieNoua.x >= 0) {
            if(locatieActuala.y - locatieNoua.y >=0) {
                return 1;//"inainte si stanga";
            }else{
                return 2;//"inainte si dreapta";
            }
        }else{
            if(locatieActuala.y - locatieNoua.y >= 0) {
                return 3;//"inapoi si stanga";
            }else{
                return 4;//"inapoi si dreapta";
            }
        }

    }

}
