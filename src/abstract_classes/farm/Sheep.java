package abstract_classes.farm;

public class Sheep extends Animal{

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Sheep: BAAAAA");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Sheep: *starts to walk, but immediately stops to eat grass.*");
	}

}
