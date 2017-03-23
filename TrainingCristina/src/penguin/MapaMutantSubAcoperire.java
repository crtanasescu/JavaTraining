package penguin;


import java.util.ArrayList;


/**
 * Created by crtanasescu on 3/23/2017.
 */
public class MapaMutantSubAcoperire  {
    String numePinguin;
    ArrayList<Object> detaliiPinguin = new ArrayList<Object>();


    public ArrayList<Object> puneInMapa(ArrayList<Penguin> listaDePinguini) {
        for ( Penguin p : listaDePinguini){
            this.numePinguin = p.getName();
            int hashCod = this.hashCode();
            detaliiPinguin.add(numePinguin);
            detaliiPinguin.add(hashCod);
            detaliiPinguin.add(p);
        }
        return detaliiPinguin;

    }

    @Override
    public int hashCode() {
        int calculHashCode = this.numePinguin.hashCode();
        return calculHashCode;
    }



    public void afiseaza() {
        for (int i = 0 ; i< detaliiPinguin.size(); i++){
            System.out.print(detaliiPinguin.get(i));
            System.out.println();
            System.out.println();
        }
    }
}
