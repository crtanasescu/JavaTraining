package homeworkSah;

import homework3.homeworkLab3.exercise6.Array;

import java.util.ArrayList;
import java.util.Arrays;

import static homeworkSah.EnumPiese.*;

/**
 * Created by crtanasescu on 1/10/2017.
 */
public class Tabla {
    Piesa[][] tabla;

    //creare piese cu ajutorul Factory si initializarea Locatiei interne a pieselor pe tabla
    Factory factory = new FactoryClass();
    Piesa pion1 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 0));
    Piesa pion2 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 1));
    Piesa pion3 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 2));
    Piesa pion4 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 3));
    Piesa pion5 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 4));
    Piesa pion6 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 5));
    Piesa pion7 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 6));
    Piesa pion8 = factory.creeazaPiesa(PION, new LocatiePeTabla(6, 7));

    Piesa tura1 = factory.creeazaPiesa(TURA, new LocatiePeTabla(7, 0));
    Piesa tura2 = factory.creeazaPiesa(TURA, new LocatiePeTabla(7, 7));

    Piesa cal1 = factory.creeazaPiesa(CAL, new LocatiePeTabla(7, 1));
    Piesa cal2 = factory.creeazaPiesa(CAL, new LocatiePeTabla(7, 6));

    Piesa nebun1 = factory.creeazaPiesa(NEBUN, new LocatiePeTabla(7, 2));
    Piesa nebun2 = factory.creeazaPiesa(NEBUN, new LocatiePeTabla(7, 5));

    Piesa rege = factory.creeazaPiesa(REGE, new LocatiePeTabla(7, 3));
    Piesa regina = factory.creeazaPiesa(REGINA, new LocatiePeTabla(7, 4));


    public Tabla() {
       this.tabla = new Piesa[8][8];

        //punerea efectiva pe tabla a pieselor
        tabla[6][0] = pion1;
        tabla[6][1] = pion2;
        tabla[6][2] = pion3;
        tabla[6][3] = pion4;
        tabla[6][4] = pion5;
        tabla[6][5] = pion6;
        tabla[6][6] = pion7;
        tabla[6][7] = pion8;

        tabla[7][0] = tura1;
        tabla[7][7] = tura2;

        tabla[7][1] = cal1;
        tabla[7][6] = cal2;

        tabla[7][2] = nebun1;
        tabla[7][5] = nebun2;

        tabla[7][3] = rege;
        tabla[7][4] = regina;
    }

    public void mutaPeTabla(LocatiePeTabla locatieActuala , LocatiePeTabla locatieViitoare){
        tabla[locatieViitoare.x][locatieViitoare.y] =  tabla[locatieActuala.x][locatieActuala.y];
        System.out.print("Mutat pe tabla la pozitia: " + locatieViitoare.x + "," + locatieViitoare.y + "  ||||  " );

        tabla[locatieActuala.x][locatieActuala.y] = null;
    }

    public boolean locLiber(LocatiePeTabla locDeVerificat){
        return tabla[locDeVerificat.x][locDeVerificat.y] == null;
    }

  public void afisareTabla() {
     System.out.println();
     System.out.println();
     //afisare tabla :
     for (int i = 0; i <= 7; i++) {
         for (int j = 0; j <= 7; j++) {
             if (tabla[i][j] == null) {
                 System.out.print("L{(" + i + "," + j + ")}" + "  |  ");
             } else {
                 System.out.print(tabla[i][j] + "  |  ");
             }
         }
         System.out.println();
     }
     System.out.println();
     System.out.println();

 }

 public Piesa[][] getTabla(){
     return tabla;
 }


}
