
public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	
	public Soy (Beverage beverage) {
		// TODO Auto-generated method stub
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15 + beverage.cost();
	}

}
