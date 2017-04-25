package pJUnitSiExceptii.ex1gradinaZoo;

import java.util.ArrayList;

/**
 * Created by Tina on 4/24/2017.
 */
public class Zoo {
    ArrayList<Animal> animale ;

    public Zoo() {
        animale = new ArrayList<Animal>();
    }

    public void addAnimal(Animal a){
        animale.add(a);
    }

    public void removeAnimal (Animal a){
        for(int i = 0; i< animale.size(); i++) {
            if (animale.get(i).equals(a)) {
                animale.remove(i);
            }
        }
    }

    public boolean areAnimals(){
        if(animale.size() == 0){
            return false;
        }
        return true;
    }

    public void getAnimals(){
        if(!areAnimals()){
            System.out.println("Nu exista niciun animal momentan.");
        }else {
            System.out.println("Gradina zoologica cuprinde urmatoarele animale: ");
            for (int i = 0; i < animale.size(); i++) {
                System.out.println(animale.get(i));
            }
        }
    }

    public Animal getAnimal(int pozitieInZoo){
        return animale.get(pozitieInZoo);
    }

    public int size(){
        return animale.size();
    }

}
