
public abstract class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	
	public Mocha (Beverage beverage) {
		// TODO Auto-generated method stub
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}
