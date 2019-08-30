package myproject1;

public class WonderCakes {
	
	public static void main(String args[]) {
		Cake cake = new Chocolate();
		cake = new WhipCream(cake); 
		System.out.println(" Total Cost = " + cake.getDescription()
				+ " = $" + cake.cost());
		
		Cake cake2 = new Vanilla();
		System.out.println(" Total Cost = " + cake2.getDescription() 
				+ " = $" + cake2.cost());
		
		Cake cake3 = new Pineapple();
		cake3 = new Sprinkles(cake3);
		cake3 = new WhipCream(cake3);
		System.out.println(" Total Cost = " + cake3.getDescription()
				+ " = $" + cake3.cost());
		
		Cake cake4 = new Vanilla();
		cake4 = new Sprinkles(cake4);
		cake4 = new Fruits(cake4);
		cake4 = new WhipCream(cake4);
		System.out.println(" Total Cost = " + cake4.getDescription()
				+ " = $" + cake4.cost());
		
		Cake cake5 = new Pineapple();
		cake5 = new Sprinkles(cake5);
		cake5 = new Sprinkles(cake5);
		cake5 = new Fruits(cake5);
		cake5 = new Fruits(cake5);
		cake5 = new WhipCream(cake5);
		System.out.println(" Total Cost = " + cake5.getDescription()
		+ " = $" + cake5.cost());
		
	}

}
