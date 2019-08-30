package myproject1;

public class Sprinkles extends CakeFlavour {
	
	public Sprinkles(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + " + Sprinkles";
	}
	public double cost() {
		return 1 + cake.cost(); 
	}

}
