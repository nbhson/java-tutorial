package Pizza.SG;

import Pizza.Pizza;

public class SGCheesePizza extends Pizza {

	public SGCheesePizza() {
		name = "SG The best cheese pizza";
		dough = "SG Very thin dough";
		sauce = "SG Very spicy sauce";
		toppings.add("Black olives");
		toppings.add("Cheese");
		
		
	}

	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
