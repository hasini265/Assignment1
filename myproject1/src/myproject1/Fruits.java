package myproject1;

public class Fruits extends CakeFlavour {
	Cake cake;
	
	public Fruits(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + " + Fruits";
	}
	public double cost() {
		return 1 + cake.cost();
	}

}
