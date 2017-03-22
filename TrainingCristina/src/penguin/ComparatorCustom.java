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
            if(o1.getMatingPartners().size() > 0 && !o1.getMatingPartners().contains(null)
                    && o2.getMatingPartners().size() > 0 && !o2.getMatingPartners().contains(null)){
                int averageForO1;
                double sumO1 = 0.00;
                int averageForO2;
                double sumO2 = 0.00;
                List<Penguin> partnersForO1 = o1.getMatingPartners();
                List<Penguin> partnersForO2 = o2.getMatingPartners();

                for(Penguin p : partnersForO1){
                        sumO1 = sumO1 + p.getAge();
                }


                for(Penguin p1 : partnersForO2){
                        sumO2 = sumO2 + p1.getAge();
                }

                averageForO1 = (int) (sumO1 / o1.getNumberOfMatingPartners());
                averageForO2 = (int) (sumO2 / o2.getNumberOfMatingPartners());

                if(averageForO1 == averageForO2){
                   return o1.getName().compareTo(o2.getName());
                }else if(averageForO1 < averageForO2){
                    return -1;
                }else if(averageForO1 > averageForO2){
                    return 1;
                }
            }else if(o1.getMatingPartners().contains(null) && o2.getMatingPartners().contains(null)){
                return 0;
            }

        }else if(o1.getNumberOfMatingPartners() < o2.getNumberOfMatingPartners()){
            return -1;
        }else if(o1.getNumberOfMatingPartners() > o2.getNumberOfMatingPartners()){
            return 1;
        }
        return 0;
    }

}
