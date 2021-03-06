package homeworkSah;

/**
 * Created by crtanasescu on 1/9/2017.
 */
public class FactoryClass implements Factory {

    public Piesa creeazaPiesa(EnumPiese enumPiese, LocatiePeTabla locatiePeTabla) {
        switch(enumPiese){
            case PION : return new Pion(locatiePeTabla);
            case TURA : return new Tura(locatiePeTabla);
            case NEBUN :  return new Nebun(locatiePeTabla);
            case CAL : return new Cal(locatiePeTabla);
            case REGE : return new Rege(locatiePeTabla);
            case REGINA : return new Regina(locatiePeTabla);
        }
        return null;

//        if(enumPiese == EnumPiese.PION){
//            return new Pion(locatiePeTabla);
//        }else if(enumPiese == EnumPiese.TURA){
//            return new Tura(locatiePeTabla);
//        }else if(enumPiese == EnumPiese.NEBUN){
//            return new Nebun(locatiePeTabla);
//        }else if(enumPiese == EnumPiese.CAL){
//            return new Cal(locatiePeTabla);
//        }else if(enumPiese == EnumPiese.REGE){
//            return new Rege(locatiePeTabla);
//        }else if(enumPiese == EnumPiese.REGINA){
//            return new Regina(locatiePeTabla);
//        }else{
//            return null;
//        }
    }
}
