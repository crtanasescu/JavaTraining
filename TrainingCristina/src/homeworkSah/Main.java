package homeworkSah;

import javafx.scene.control.Tab;

import javax.sound.midi.Soundbank;

import static homeworkSah.EnumPiese.*;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class Main {
    public static void main(String[] args) {

        Tabla tabla3 = new Tabla();
        tabla3.afisareTabla();
        //tabla3.pion1.muta(new LocatiePeTabla(-1,-1), tabla3);
        //tabla3.tura1.muta(new LocatiePeTabla(-1,-1), tabla3);
        //tabla3.cal1.muta(new LocatiePeTabla(-1,-1), tabla3);
       // tabla3.nebun1.muta(new LocatiePeTabla(-1,-1), tabla3);
       // tabla3.rege.muta(new LocatiePeTabla(-1,-1), tabla3);
       // tabla3.regina.muta(new LocatiePeTabla(-1,-1), tabla3);


        //PION:
        //1.locul este ocupat de pionul actual
        System.out.println("1.locul este ocupat de pionul actual=>");
        tabla3.pion1.muta(new LocatiePeTabla(6,0), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(6,1), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(6,2), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(6,3), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(6,4), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(6,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(6,6), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(6,7), tabla3);
        System.out.println();

        //2.locul este ocupat de alta piesa
        System.out.println("2.locul este ocupat de alta piesa =>");
        tabla3.pion1.muta(new LocatiePeTabla(7,0), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(7,1), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(7,2), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(7,3), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(7,4), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(7,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(7,6), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(7,7), tabla3);
        System.out.println();

        //3.mutarea nu e valida pt pion
        System.out.println("3.mutarea nu e valida pt pion=>");
        tabla3.pion1.muta(new LocatiePeTabla(3,0), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(3,1), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(5,3), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(1,4), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(5,5), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(2,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(3,6), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(1,1), tabla3);
        System.out.println();

        //4.mutare valida-miscare doua patratele in fata
        System.out.println("4.mutare valida-miscare doua patratele in fata=>");
        tabla3.pion1.muta(new LocatiePeTabla(4,0), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(4,1), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(4,2), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(4,3), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(4,4), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(4,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(4,6), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(4,7), tabla3);
        tabla3.afisareTabla();
        System.out.println();

        //5.mutare valida miscare doar o patratica in fata
        System.out.println("5.mutare valida miscare doar o patratica in fata=>");
        tabla3.pion1.muta(new LocatiePeTabla(3,0), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(3,1), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(3,2), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(3,3), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(3,4), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(3,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(3,6), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(3,7), tabla3);
        tabla3.afisareTabla();
        System.out.println();

        //6.mutare valida miscare un patratel spate
        System.out.println("6.mutare valida miscare un patratel spate =>");
        tabla3.pion1.muta(new LocatiePeTabla(4,0), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(4,1), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(4,2), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(4,3), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(4,4), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(4,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(4,6), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(4,7), tabla3);
        tabla3.afisareTabla();
        System.out.println();

        //7.miscare 2 patratele in spate-imposibil
        System.out.println("7.miscare 2 patratele in spate-imposibil=>");
        tabla3.pion1.muta(new LocatiePeTabla(6,0), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(6,1), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(6,2), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(6,3), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(6,4), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(6,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(6,6), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(6,7), tabla3);
        System.out.println();

        //8.miscare diagonala dreapta fata-imposibil
        System.out.println("8.miscare diagonala dreapta fata-imposibil=>");
        tabla3.pion1.muta(new LocatiePeTabla(3,1), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(3,2), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(3,3), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(3,4), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(3,5), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(3,6), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(3,7), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(3,0), tabla3);
        System.out.println();

        //9.miscare diagonala stanga fata-imposibil
        System.out.println("9.miscare diagonala stanga fata-imposibil=>");
        tabla3.pion1.muta(new LocatiePeTabla(3,7), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(3,0), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(3,1), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(3,2), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(3,3), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(3,4), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(3,5), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(3,6), tabla3);
        System.out.println();

        //10.miscare diagonala dreapta spate-imposibil
        System.out.println("10.miscare diagonala dreapta spate-imposibil=>");
        tabla3.pion1.muta(new LocatiePeTabla(5,1), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(5,2), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(5,3), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(5,4), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(5,5), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(5,6), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(5,7), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(5,0), tabla3);
        System.out.println();

        //11.miscare diagonala stanga spate-imposibil
        System.out.println("11.miscare diagonala stanga spate-imposibil=>");
        tabla3.pion1.muta(new LocatiePeTabla(5,7), tabla3);
        tabla3.pion2.muta(new LocatiePeTabla(5,0), tabla3);
        tabla3.pion3.muta(new LocatiePeTabla(5,1), tabla3);
        tabla3.pion4.muta(new LocatiePeTabla(5,2), tabla3);
        tabla3.pion5.muta(new LocatiePeTabla(5,3), tabla3);
        tabla3.pion6.muta(new LocatiePeTabla(5,4), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(5,5), tabla3);
        tabla3.pion8.muta(new LocatiePeTabla(5,6), tabla3);
        System.out.println();

        //afisare tabla finala dupa lucrul cu pioni
        System.out.println("afisare tabla finala dupa lucrul cu pioni:");
        tabla3.afisareTabla();
        System.out.println();



        //TURA:
        //1.locul este ocupat de aceasta tura
        System.out.println("1.locul este ocupat de aceasta tura=>");
        tabla3.tura1.muta(new LocatiePeTabla(7,0), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(7,7), tabla3);
        System.out.println();

        //2.Locul este ocupat de alta piesa
        System.out.println("2.Locul este ocupat de alta piesa=>");
        tabla3.tura1.muta(new LocatiePeTabla(4,0), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(4,7), tabla3);
        System.out.println();

        //3.Mutarea nu e valida pentru tura
        System.out.println("3.Mutarea nu e valida pentru tura=>");
        tabla3.tura1.muta(new LocatiePeTabla(3,4), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(5,6), tabla3);
        System.out.println();

        //4.Mutare fata
        System.out.println("4.Mutare fata=>");
        tabla3.tura1.muta(new LocatiePeTabla(5,0), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(5,7), tabla3);
        System.out.println();

        //5.mutare spate
        System.out.println("5.mutare spate=>");
        tabla3.tura1.muta(new LocatiePeTabla(6,0), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(6,7), tabla3);
        System.out.println();

        //6.mutare dreapta
        System.out.println("6.mutare dreapta=>");
        tabla3.tura1.muta(new LocatiePeTabla(6,1), tabla3);
        System.out.println();

        //7.mutare stanga
        System.out.println("7.mutare stanga=>");
        tabla3.tura2.muta(new LocatiePeTabla(6,4), tabla3);
        tabla3.afisareTabla();
        System.out.println();


        //8.traiectoria fata ocupata
        System.out.println("10.traiectoria fata ocupata=>");
        tabla3.tura1.muta(new LocatiePeTabla(3,1), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(3,4), tabla3);
        System.out.println();

        //9.traiectoria spate ocupata
        System.out.println("11.traiectoria spate ocupata=>");
        tabla3.pion1.muta(new LocatiePeTabla(3,0), tabla3);
        tabla3.tura1.muta(new LocatiePeTabla(6,0), tabla3);
        tabla3.tura1.muta(new LocatiePeTabla(4,0), tabla3);
        tabla3.cal1.muta(new LocatiePeTabla(5,0), tabla3);
        tabla3.tura1.muta(new LocatiePeTabla(6,0), tabla3);
        System.out.println();

        //10.traiectorie stanga ocupata
        System.out.println("8.traiectorie stanga ocupata=>");
        tabla3.rege.muta(new LocatiePeTabla(6,3), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(6,2), tabla3);
        System.out.println();

        //11.traiectoria dreapta ocupata
        System.out.println("9.traiectoria dreapta ocupata=>");
        tabla3.pion4.muta(new LocatiePeTabla(5,3),tabla3);
        tabla3.tura1.muta(new LocatiePeTabla(4,3), tabla3);
        System.out.println();

        //afisare tabla dupa lucrul cu ture
        System.out.println("afisare tabla dupa lucrul cu ture:");
        tabla3.afisareTabla();
        System.out.println();



        //REGINA:
        //1.locul este ocupat de actuala piesa-se afla pe acest loc
        System.out.println("1.locul este ocupat de actuala piesa-se afla pe acest loc=>");
        tabla3.regina.muta( new LocatiePeTabla(7,4), tabla3);
        System.out.println();

        //2.locul este ocupat de alta piesa
        System.out.println("2.locul este ocupat de alta piesa=>");
        tabla3.regina.muta( new LocatiePeTabla(6,4), tabla3);
        System.out.println();

        //3.mutarea nu este valida pentru regina
        System.out.println("3.mutarea nu este valida pentru regina=>");
        tabla3.regina.muta( new LocatiePeTabla(5,5), tabla3);
        System.out.println();

        //4.mutare diagonala dreapta fata
        System.out.println("4.mutare diagonala dreapta fata=>");
        tabla3.regina.muta( new LocatiePeTabla(5,6), tabla3);
        System.out.println();

        //5.mutare diagonala stanga fata
        System.out.println("5.mutare diagonala stanga fata=>");
        tabla3.pion6.muta( new LocatiePeTabla(3,5), tabla3);
        tabla3.regina.muta( new LocatiePeTabla(2,3), tabla3);
        System.out.println();

        //6.mutare diagonala stanga spate
        System.out.println("6.mutare diagonala stanga spate=>");
        tabla3.regina.muta(new LocatiePeTabla(3,2), tabla3);
        System.out.println();

        //7.mutare diagonala dreapta spate
        System.out.println("7.mutare diagonala dreapta spate=>");
        tabla3.regina.muta(new LocatiePeTabla(5,4), tabla3);
        System.out.println();

        //8.mutare spate
        System.out.println("8.mutare spate=>");
        tabla3.tura2.muta(new LocatiePeTabla(6,7), tabla3);
        tabla3.regina.muta(new LocatiePeTabla(6,4), tabla3);
        System.out.println();

        //9.mutare fata
        System.out.println("9.mutare fata=>");
        tabla3.pion5.muta(new LocatiePeTabla(3,4), tabla3);
        tabla3.regina.muta(new LocatiePeTabla(4,4), tabla3);
        System.out.println();

        //10.mutare stanga
        System.out.println("10.mutare stanga");
        tabla3.regina.muta(new LocatiePeTabla(4,3), tabla3);
        System.out.println();

        //11.mutare dreapta
        System.out.println("11.mutare dreapta");
        tabla3.regina.muta(new LocatiePeTabla(4,4), tabla3);
        System.out.println();

        //12.traiectorie ocupata mutare fata
        System.out.println("12.traiectorie ocupata mutare fata=>");
        tabla3.regina.muta(new LocatiePeTabla(2,4), tabla3);
        System.out.println();

        //13.traiectorie ocupata mutare spate
        System.out.println("13.traiectorie ocupata mutare spate=>");
        tabla3.rege.muta(new LocatiePeTabla(6,4), tabla3);
        tabla3.regina.muta(new LocatiePeTabla(7,4), tabla3);
        System.out.println();

        //14.traiectorie ocupata mutare stanga
        System.out.println("14.traiectorie ocupata mutare stanga=>");
        tabla3.pion2.muta(new LocatiePeTabla(3,1), tabla3);
        tabla3.regina.muta(new LocatiePeTabla(4,1), tabla3);
        System.out.println();

        //15.traiectorie ocupata mutare dreapta
        System.out.println("15.traiectorie ocupata mutare dreapta=>");
        tabla3.pion8.muta(new LocatiePeTabla(3,7), tabla3);
        tabla3.regina.muta(new LocatiePeTabla(4,7), tabla3);
        System.out.println();

        //16. treaiectorie ocupata mutare fata dreapta
        System.out.println("16. treaiectorie ocupata mutare fata dreapta");
        tabla3.regina.muta(new LocatiePeTabla(2,6), tabla3);
        System.out.println();

        //17. treaiectorie ocupata mutare spate stanga
        System.out.println("16. treaiectorie ocupata mutare spate stanga");
        tabla3.regina.muta(new LocatiePeTabla(6,2), tabla3);
        System.out.println();

        //afisare tabla dupa mutarile reginei
        System.out.println("afisare tabla dupa mutarile reginei");
        tabla3.afisareTabla();


        //REGE:
        //1.loc ocupat de el:
        System.out.println("1.loc ocupat de el=>");
        tabla3.rege.muta(new LocatiePeTabla(6,4), tabla3);
        System.out.println();

        //2.loc ocupat de alta piesa:
        System.out.println("2.loc ocupat de alta piesa:=>");
        tabla3.rege.muta(new LocatiePeTabla(5,3), tabla3);
        System.out.println();

        //3.mutare invalida pt rege-2 patratele:
        System.out.println("3.mutare invalida pt rege-2 patratele::=>");
        tabla3.rege.muta(new LocatiePeTabla(6,6), tabla3);
        System.out.println();

        //4.mutare fata o patratica
        System.out.println("4.mutare fata o patratica=>");
        tabla3.rege.muta(new LocatiePeTabla(5,4), tabla3);
        System.out.println();

        //5.mutare spate o patratica
        System.out.println("4.mutare spate o patratica=>");
        tabla3.rege.muta(new LocatiePeTabla(6,4), tabla3);
        System.out.println();

        //6.mutare stanga o patratica
        System.out.println("4.mutare stanga o patratica=>");
        tabla3.rege.muta(new LocatiePeTabla(6,3), tabla3);
        System.out.println();

        //7.mutare dreapta o patratica
        System.out.println("4.mutare dreapta o patratica=>");
        tabla3.rege.muta(new LocatiePeTabla(6,4), tabla3);
        System.out.println();

        //8.mutare diagonala fata dreapta
        System.out.println("8.mutare diagonala fata dreapta=>");
        tabla3.rege.muta(new LocatiePeTabla(5,5), tabla3);
        System.out.println();

        //9.mutare diagonala spate dreapta
        System.out.println("9.mutare diagonala spate dreapta=>");
        tabla3.rege.muta(new LocatiePeTabla(6,6), tabla3);
        System.out.println();

        //10.mutare diagonala fata stanga
        System.out.println("10.mutare diagonala fata stanga=>");
        tabla3.rege.muta(new LocatiePeTabla(5,5), tabla3);
        System.out.println();

        //11.mutare diagonala spate stanga
        System.out.println("/11.mutare diagonala spate stanga=>");
        tabla3.rege.muta(new LocatiePeTabla(6,4), tabla3);
        System.out.println();



        //NEBUN:
        //1.loc ocupat de el
        System.out.println("1.loc ocupat de el=>");
        tabla3.nebun2.muta(new LocatiePeTabla(7,5), tabla3);
        tabla3.nebun1.muta(new LocatiePeTabla(7,2), tabla3);
        System.out.println();

        //2.loc ocupat de alta piesa
        System.out.println("2.loc ocupat de alta piesa=>");
        tabla3.nebun2.muta(new LocatiePeTabla(6,4), tabla3);
        tabla3.nebun1.muta(new LocatiePeTabla(5,0), tabla3);
        System.out.println();

        //3.mutare invalida pentru nebun
        System.out.println("3.mutare invalida pentru nebun=>");
        tabla3.nebun2.muta(new LocatiePeTabla(7,4), tabla3);
        tabla3.nebun1.muta(new LocatiePeTabla(5,2), tabla3);
        System.out.println();

        //4.mutare fata dreapta
        System.out.println("4.mutare fata dreapta=>");
        tabla3.nebun1.muta(new LocatiePeTabla(2,7), tabla3);
        tabla3.nebun2.muta(new LocatiePeTabla(5,7), tabla3);
        System.out.println();

        //5.mutare fata stanga
        System.out.println("5.mutare fata stanga=>");
        tabla3.nebun1.muta(new LocatiePeTabla(0,5), tabla3);
        tabla3.pion7.muta(new LocatiePeTabla(3,6), tabla3);
        tabla3.nebun2.muta(new LocatiePeTabla(4,6), tabla3);
        System.out.println();

        //6.mutare spate stanga
        System.out.println("/6.mutare spate stanga");
        tabla3.nebun1.muta(new LocatiePeTabla(3,2), tabla3);
        tabla3.nebun2.muta(new LocatiePeTabla(5,5), tabla3);
        System.out.println();

        //7.mutare spate dreapta
        System.out.println("7.mutare spate dreapta=>");
        tabla3.nebun1.muta(new LocatiePeTabla(4,3), tabla3);
        tabla3.nebun2.muta(new LocatiePeTabla(6,6), tabla3);
        System.out.println();

        //8.traiectorie ocupata fata dreapta
        System.out.println("8.traiectorie ocupata fata dreapta=>");
        tabla3.nebun1.muta(new LocatiePeTabla(2,5), tabla3);
        System.out.println();

        //9.traiectorie ocupata fata stanga
        System.out.println("9.traiectorie ocupata fata stanga=>");
        tabla3.pion3.muta(new LocatiePeTabla(3,2), tabla3);
        tabla3.nebun1.muta(new LocatiePeTabla(2,1), tabla3);
        System.out.println();

        //10.traiectorie ocupata spate stanga
        System.out.println("10.traiectorie ocupata spate stanga=>");
        tabla3.cal1.muta(new LocatiePeTabla(7,1), tabla3);
        tabla3.tura1.muta(new LocatiePeTabla(5,0), tabla3);
        tabla3.tura1.muta(new LocatiePeTabla(5,2), tabla3);
        tabla3.nebun1.muta(new LocatiePeTabla(7,0), tabla3);
        System.out.println();

        //11.traiectorie ocupata spate dreapta
        System.out.println("11.traiectorie ocupata spate dreapta=>");
        tabla3.rege.muta(new LocatiePeTabla(5,4), tabla3);
        tabla3.nebun1.muta(new LocatiePeTabla(6,5), tabla3);
        System.out.println();



        //CAL:
        //1.loc ocupat de piesa curenta
        System.out.println("1.loc ocupat de piesa curenta=>");
        tabla3.cal1.muta(new LocatiePeTabla(7,1), tabla3);
        tabla3.cal2.muta(new LocatiePeTabla(7,6), tabla3);
        System.out.println();

        //2.loc ocupat de alta piesa
        System.out.println("2.loc ocupat de alta piesa");
        tabla3.cal1.muta(new LocatiePeTabla(5,2), tabla3);
        tabla3.tura2.muta(new LocatiePeTabla(5,7), tabla3);
        tabla3.cal2.muta(new LocatiePeTabla(5,7), tabla3);
        System.out.println();

        //3.mutare valida
        System.out.println("3.mutare valida ");
        tabla3.cal2.muta(new LocatiePeTabla(5,5), tabla3);
        tabla3.cal2.muta(new LocatiePeTabla(4,7), tabla3);
        tabla3.cal1.muta(new LocatiePeTabla(6,3), tabla3);
        tabla3.cal1.muta(new LocatiePeTabla(7,5), tabla3);
        System.out.println();

        //4.mutare invalida pt cal
        System.out.println("4.mutare invalida pt cal");
        tabla3.cal1.muta(new LocatiePeTabla(6,5), tabla3);
        tabla3.cal2.muta(new LocatiePeTabla(6,7), tabla3);
        System.out.println();


        System.out.println("tabla finala dupa toate mutarile");
        tabla3.afisareTabla();

    }
}
