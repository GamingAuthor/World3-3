package abstract_classes.cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double tax = 0.0;
		tax = (population*(2*growthRate));
		return tax;
	}

}
