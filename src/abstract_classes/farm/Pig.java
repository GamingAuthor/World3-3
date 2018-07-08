package abstract_classes.farm;

public class Pig extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Pig: OINK!");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Pig: *walks then dives headfirst into a puddle of mud.*");
		
	}
}
