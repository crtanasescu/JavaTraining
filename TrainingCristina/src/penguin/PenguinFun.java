package penguin;

import homework3.homeworkLab3.exercise6.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PenguinFun {

	public static void main(String [] args){
		
		//main class for testing your application

		PenguinHatchery penguinHatchery = new PenguinHatchery();
		ArrayList<Penguin> pinguini = new ArrayList<Penguin>();
		HashSet<Penguin> pinguiniSmecheri = new HashSet<Penguin>();
		for(int i = 0; i < 9; i++){
			Penguin pinguin = penguinHatchery.hatchPenguin();
			pinguini.add(pinguin);
			pinguiniSmecheri.add(pinguin);
		}
		System.out.println(pinguini);
		System.out.println(pinguiniSmecheri);


	}
}	
