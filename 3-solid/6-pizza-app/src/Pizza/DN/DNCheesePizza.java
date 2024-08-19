package Pizza.DN;

import Pizza.Pizza;

public class DNCheesePizza extends Pizza {

	public DNCheesePizza() {
		name = "DN The best cheese pizza";
		dough = "DN Very thin dough";
		sauce = "DN Very spicy sauce";
		toppings.add("Black olives");
		toppings.add("Cheese");
		
		
	}

	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
