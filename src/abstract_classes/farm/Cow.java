package abstract_classes.farm;

public class Cow extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cow: MOO!");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cow: *wrots for a bit, then lies down.*");
	}

}
