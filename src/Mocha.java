
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha (Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Mocha";
	}
	
	public double cost(){
		return 0.20+beverage.cost();
	}

}
