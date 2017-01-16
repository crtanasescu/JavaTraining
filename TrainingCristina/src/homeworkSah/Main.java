package homeworkSah;

import javafx.scene.control.Tab;

import static homeworkSah.EnumPiese.*;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Main {
    public static void main(String[] args) {
//        Tabla tabla = new Tabla();
//        tabla.afisareTabla();
//
////Pion:
//        System.out.println(tabla.pion1);
//        tabla.pion1.valid(new LocatiePeTabla(6,0), tabla);//este deja pe 6,0
//        tabla.pion1.valid(new LocatiePeTabla(5,0), tabla);//mutat o pozitie in fata *5,0
//        tabla.pion1.valid(new LocatiePeTabla(5,0), tabla);//se afla deja aici *5,0
//        tabla.pion1.valid(new LocatiePeTabla(7,0), tabla);//incercare de mutare in locul turei => locul este ocupat *5,0
//        tabla.pion1.valid(new LocatiePeTabla(4,0), tabla);//mutare o pozitie in fata *4,0
//        tabla.pion1.valid(new LocatiePeTabla(3,0), tabla);//mutare o pozitie in fata *3.0
//        tabla.pion2.valid(new LocatiePeTabla(5,1), tabla);//mutare o pozitie in fata pion2  *5,1
//        tabla.afisareTabla();
//
////Cal:
//        tabla.cal1.valid(new LocatiePeTabla(5,2), tabla);
//        tabla.cal1.valid(new LocatiePeTabla(3,3), tabla);
//        tabla.cal1.valid(new LocatiePeTabla(3,2), tabla); //imposibil de mutat
//        tabla.cal1.valid(new LocatiePeTabla(5,2), tabla);
//        tabla.afisareTabla();
//
////Nebun:
//        tabla.nebun2.valid(new LocatiePeTabla(4,2), tabla);
//        tabla.nebun1.valid(new LocatiePeTabla(5,0), tabla);
//        tabla.nebun1.valid(new LocatiePeTabla(3,2), tabla);
//        tabla.nebun1.valid(new LocatiePeTabla(4,2), tabla); //imposibil de mutat
//        tabla.afisareTabla();
//
////Tura:
//        tabla.tura1.valid(new LocatiePeTabla(7,2), tabla);
//        tabla.tura1.valid(new LocatiePeTabla(7,1), tabla);
//        tabla.afisareTabla();
////Rege:
//        tabla.rege.valid(new LocatiePeTabla(7,2), tabla);
//        tabla.afisareTabla();
////Regina:
//        tabla.regina.valid(new LocatiePeTabla(4,7), tabla);
//        tabla.afisareTabla();
//
//        tabla.nebun2.valid(new LocatiePeTabla(4,2), tabla);
//        tabla.afisareTabla();
//
//



        Tabla tabla2 = new Tabla();
        System.out.println(tabla2);
        tabla2.pion1.valid(new LocatiePeTabla(5,0), tabla2);
        tabla2.afisareTabla();
        tabla2.tura1.valid(new LocatiePeTabla(6,0), tabla2);
        tabla2.afisareTabla();
        tabla2.tura1.valid(new LocatiePeTabla(5,0), tabla2);
        tabla2.tura1.valid(new LocatiePeTabla(4,0), tabla2);
        tabla2.afisareTabla();


//        Tabla tabla3 = new Tabla();
//        tabla3.afisareTabla();
//        tabla3.pion1.valid(new LocatiePeTabla(4,0), tabla3);
//        tabla3.pion1.valid(new LocatiePeTabla(3,0), tabla3);
//        tabla3.pion2.valid(new LocatiePeTabla(5,1), tabla3);
//        tabla3.pion2.valid(new LocatiePeTabla(3,1), tabla3);

    }
}
