package abstract_classes.farm;

import java.util.ArrayList;

public class Farm{
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Animal chick = new Chicken();
		Animal cow = new Cow();
		Animal sheep = new Sheep();
		Animal pig = new Pig();
		farm.add(chick);
		farm.add(cow);
		farm.add(pig);
		farm.add(sheep);
		for(Animal a : farm) {
			a.makeNoise();
			a.walk();
		}
	}
}
