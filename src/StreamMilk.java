
public class StreamMilk extends CondimentDecorator {

	Beverage beverage;
	
	
	public StreamMilk (Beverage beverage) {
		// TODO Auto-generated method stub
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", StreamMilk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}

}
