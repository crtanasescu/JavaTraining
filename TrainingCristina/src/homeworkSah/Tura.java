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
            if (locatieNoua.x == this.locatiePeTabla.x && locatieNoua.y == this.locatiePeTabla.y) {
                System.out.println("Te aflii deja pe locul : " + this.locatiePeTabla.x + "," + this.locatiePeTabla.y);
                return false;
            }
            System.out.println("Locul (" + locatieNoua.x + "," + locatieNoua.y + ") este ocupat");
            return false;
        }

        //mutare pe orizontala
        if(locatieNoua.x == this.locatiePeTabla.x && traiectorieLiberaTura(this.locatiePeTabla,locatieNoua,tabla)) {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }

        //mutare pe verticala
        if(locatieNoua.y == this.locatiePeTabla.y&& traiectorieLiberaTura(this.locatiePeTabla,locatieNoua,tabla)) {
            tabla.mutaPeTabla(this.locatiePeTabla, locatieNoua);
            muta(locatieNoua);
            return true;
        }

        //mutarea nu este valida
        System.out.println("Mutare imposibila pentru Tura! Tura se poate misca doar pe orizontala sau pe verticala.");
        return false;
    }

    //muta() schimba locatia actuala a piesei cu noua locatie valida
    public void muta(LocatiePeTabla locatieNoua) {
        this.locatiePeTabla.x = locatieNoua.x;
        this.locatiePeTabla.y = locatieNoua.y;
        System.out.println("Turei i-a fost schimbata pozitia interna. Noua pozitie: " + locatiePeTabla.x + "," + locatiePeTabla.y );
    }


    public boolean traiectorieLiberaTura(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua, Tabla tabla){
        Piesa[][] tablaCurenta = tabla.getTabla();
        int rezultat = directie(locatieActuala,locatieNoua);
        boolean ok = true;
        switch (rezultat){
            case 1: //"inainte";
                    for(int i = locatieActuala.x; i < locatieNoua.x; i-- ){
                        Piesa deTestat = tablaCurenta[i][locatieNoua.y];
                        tabla.locLiber(deTestat.locatiePeTabla);
                        if(deTestat != null){
                            ok = false;
                        }
                    }
                   return ok;

            case 2: //"inapoi";


            case 3: //"stanga";


            case 4: //" dreapta";


        }

        return false;
    }


    public int directie(LocatiePeTabla locatieActuala, LocatiePeTabla locatieNoua) {
        if (locatieActuala.x - locatieNoua.x >= 0) {
            return 1;//"inainte";
        } else if (locatieActuala.x - locatieNoua.x < 0) {
            return 2; //"inapoi
        } else if (locatieActuala.y - locatieNoua.y >= 0) {
            return 3; //stanga
        }else{
            return 4;//"dreapta";
        }
    }

    @Override
    public String toString() {
        return "T{" +
                "(" + locatiePeTabla.x + "," + locatiePeTabla.y + ")" +
                '}';
    }

}
