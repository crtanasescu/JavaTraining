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
            if(o1.getMatingPartners().size() > 0 && o1.getMatingPartners().size() > 0 ){
                int averageForO1;
                double sumO1 = 0.00;
                int averageForO2;
                double sumO2 = 0.00;
                List<Penguin> partnersForO1 = o1.getMatingPartners();
                List<Penguin> partnersForO2 = o2.getMatingPartners();

                System.out.println(partnersForO1);
                System.out.println(partnersForO2);
                for(Penguin p : partnersForO1){
                    if(p.getNumberOfMatingPartners() == 0)
                    {
                        System.out.println("Pinguinul nu are parteneri.");
                    }else {
                        sumO1 = sumO1 + p.getAge();
                    }
                }
                averageForO1 = (int) (sumO1 / o1.getNumberOfMatingPartners());
                for(Penguin p1 : partnersForO2){
                    if(p1.getNumberOfMatingPartners() == 0)
                    {
                        System.out.println("Pinguinul nu are parteneri.");
                    }else {
                        sumO2 = sumO2 + p1.getAge();
                    }
                }
                averageForO2 = (int) (sumO2 / o2.getNumberOfMatingPartners());
                if(averageForO1 == averageForO2){
                    return 0;
                }else if(averageForO1 < averageForO2){
                    return -1;
                }else if(averageForO1 > averageForO2){
                    return 1;
                }
            }

        }else if(o1.getNumberOfMatingPartners() < o2.getNumberOfMatingPartners()){
            return -1;
        }else if(o1.getNumberOfMatingPartners() > o2.getNumberOfMatingPartners()){
            return 1;
        }
        return 0;
    }

}
