package penguin;

import com.sun.org.apache.xpath.internal.SourceTree;
import homework3.homeworkLab3.exercise6.Array;

import java.util.*;

public class PenguinFun {

	public static void main(String [] args){
		
		//main class for testing your application


		//Load 10 entries using the PenguinHatchery class into an ArrayList. Iterate through the list and print all the elements to the console.
		//First, override the toString() function from the Penguin object. Do the same thing but with a HashSet. What are the differences you observed?
		//pentru ca prima e ArrayList va mentine ordinea de inserare, pe cand la HashSet nu se mentine ordinea de inserare din cauza ca alege hashcode si de acolo se amesteca

		PenguinHatchery penguinHatchery = new PenguinHatchery();
		ArrayList<Penguin> pinguini = new ArrayList<Penguin>();
		HashSet<Penguin> pinguiniSmecheri = new HashSet<Penguin>();
		for(int i = 0; i < 10; i++){
			Penguin pinguin = penguinHatchery.hatchPenguin();
			pinguini.add(pinguin);
			pinguiniSmecheri.add(pinguin);
		}
		System.out.println(pinguini);
		System.out.println();
		System.out.println(pinguiniSmecheri);
		System.out.println();
		System.out.println();
		System.out.println();

		//Order the elements from the ArrayList above. Could you have ordered them inside the HashSet? Order them by race, and then by age. Print the results.
		// Then, for each penguin, write the code to generate a random number(max 3) of mating partners, and fill the list inside the penguin object.
		// Order them again, but this time by the number of mating partners, their average age, and then by the name of the initial penguin.
		// Print the results again, making sure the toString method can show demonstrate the sorting is correct.

		Collections.sort(pinguini);
		System.out.println(pinguini);
		System.out.println();
		System.out.println();

		Collections.sort(pinguini, new ComparatorCustom());
		System.out.println(pinguini);   //nu ne prea putem da seama de sortarea dupa numele pinguinului initial: rar vom avea aceeasi medie de varsta
		System.out.println();
		System.out.println();


		//Insert the generated Penguin objects into a map, and group them by their race.
		// Use the name of the race as the key and whatever collection you find appropriate  as the value.
		// Iterate through the Map and print the penguins grouped by their race

		HashMap<PenguinRace, ArrayList<Penguin>> map = new HashMap<PenguinRace,ArrayList<Penguin>>();

		for ( Penguin p : pinguini){
			PenguinRace rasa = p.getRace();
			ArrayList<Penguin> pinguiniDinAceeasiRasa = map.get(rasa);
			if(pinguiniDinAceeasiRasa == null){
				pinguiniDinAceeasiRasa = new ArrayList<Penguin>();
			}
			pinguiniDinAceeasiRasa.add(p);
			map.put(rasa,pinguiniDinAceeasiRasa);
		}

		Iterator entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry thisEntry = (Map.Entry) entries.next();
			PenguinRace key = (PenguinRace) thisEntry.getKey();
			ArrayList value =  (ArrayList) thisEntry.getValue();
			if(value.size() > 0){
				Collections.sort(value);
			}
		}
		System.out.println(map);
		System.out.println();
		System.out.println();





		//Implement a HashTable data structure that will hold penguin objects as values and their names as keys. Try to write design your own hash function.


		MapaMutantSubAcoperire mapDesignedByMe = new MapaMutantSubAcoperire();
		mapDesignedByMe.puneInMapa(pinguini);
		mapDesignedByMe.afiseaza();


		/*
		Generate a large number of pinguins (> 100.000) and insert them into a HashMap. Time the time it takes to retrieve a random penguin. (Use System.currentTimeMilis)
		Override the hashCode function to return the same value, no matter what information the penguin object is carrying.
		Time the time it takes to retrieve a penguin now. What did you observe? Why?

		Observam ca la inserarea in HashMap initiala pentru a intoarce un pinguin timpul e foarte scurt deoarece ii cauta hashcod ul si duce direct la pozitia unde
		este stocata valoarea respectiva, pe cand daca suprascriem hashcode sa ne dea permanent acelasi raspuns practic hashmap ul nostru se transforma intr o lista deoarece
		toate intrarile sunt salvate la acelasi hashcod deci se formeaza o lista care are toti pinguinii si astfel cautarea printr o lista mare devine mult mai anevoioasa.

		 */

	}
}	
