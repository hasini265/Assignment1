package myproject1;

public class WhipCream extends CakeFlavour {
	
	public WhipCream(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + " + WhipCream";
	}
	public double cost() {
		return 1 + cake.cost(); 
	}

}
