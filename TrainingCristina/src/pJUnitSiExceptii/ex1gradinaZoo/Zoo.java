package pJUnitSiExceptii.ex1gradinaZoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tina on 4/24/2017.
 */
public class Zoo {
    List<Animal> animale ;

    public Zoo() {
        animale = new ArrayList<Animal>();
    }

    public void addAnimal(Animal a){
        animale.add(a);
    }

    public void removeAnimal (Animal a){
        animale.remove(a);
    }

    public boolean areAnimals(){
        if(animale.size() == 0){
            return false;
        }
        return true;
    }

    public List<Animal> getAnimals(){
        if(!areAnimals()){
            System.out.println("Nu exista niciun animal momentan.");
            return null;
        }else {
            System.out.println("Gradina zoologica cuprinde urmatoarele animale: ");
            System.out.println(animale);
            return this.animale;
        }
    }

    public Animal getAnimal(int pozitieInZoo){
        return animale.get(pozitieInZoo);
    }

    public int size(){
        return animale.size();
    }

    public boolean containsAnimal(Animal a){
        return animale.contains(a);
    }

}
