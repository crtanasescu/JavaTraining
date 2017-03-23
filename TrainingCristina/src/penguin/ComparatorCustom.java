package penguin;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Tina on 3/13/2017.
 */
class ComparatorCustom implements Comparator<Penguin>{
    public int compare(Penguin o1, Penguin o2) {
        if(o1.getNumberOfMatingPartners() == o2.getNumberOfMatingPartners()){
            int averageForO1 = averageAgeOfMatingPartners(o1);
            int averageForO2 = averageAgeOfMatingPartners(o2);

                if(averageForO1 == averageForO2){
                   return o1.getName().compareTo(o2.getName());
                }else if(averageForO1 < averageForO2){
                    return -1;
                }else if(averageForO1 > averageForO2){
                    return 1;
                }

        }else if(o1.getNumberOfMatingPartners() < o2.getNumberOfMatingPartners()){
            return -1;
        }else if(o1.getNumberOfMatingPartners() > o2.getNumberOfMatingPartners()){
            return 1;
        }
        return 0;
    }


    public int averageAgeOfMatingPartners(Penguin p){
        double sum = 0.00;
        List<Penguin> partnersForO1 = p.getMatingPartners();
        for(Penguin pi : partnersForO1){
            sum += pi.getAge();
        }
      return (int) (sum / p.getNumberOfMatingPartners());
    }

}
