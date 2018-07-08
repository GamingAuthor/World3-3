package abstract_classes.farm;

public class Chicken extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Chicken: BAWK!");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Chicken: *bobs head up and down while walking towards other animals.*");
	}

}
