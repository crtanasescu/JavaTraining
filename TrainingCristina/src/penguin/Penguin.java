package penguin;

import java.util.Comparator;
import java.util.List;

public class Penguin implements Comparable {
	
	private String name;
	private PenguinRace race;
	private double age;
	private List<Penguin> matingPartners;
	
	public Penguin(String name, PenguinRace race, double age, List<Penguin> matingPartners) {
		this.name = name;
		this.race = race;
		this.age = age;
		this.matingPartners = matingPartners;
	}


	@Override
	public String toString() {
		return " \n " + "Penguin{" +
				"NAME='" + name + '\'' + "," +
				"   race=" + race + "," +
				"   age=" + age + "," +
				"   matingPartners=" + matingPartners +
				'}' ;
	}



	public int compareTo(Object o) {
		Penguin p = (Penguin) o;
		if(this.race.compareTo(p.getRace()) == 0 )
		{
			if(this.age == p.age){
				return 0;
			} else if(this.age < p.age){
				return -1;
			} else if(this.age > p.age){
				return 1;
			}
		}
		return this.race.compareTo(p.getRace());
	}


	public String getName() {
		return name;
	}

	public PenguinRace getRace() {
		return race;
	}

	public double getAge() {
		return age;
	}

	public List<Penguin> getMatingPartners() {
		return matingPartners;
	}

	public void setMatingPartners(List<Penguin> matingPartners) {
		this.matingPartners = matingPartners;
	}

}
