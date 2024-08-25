package Pizza.Hue;

import Pizza.Pizza;

public class HueCheesePizza extends Pizza {

	public HueCheesePizza() {
		name = "Hue The best cheese pizza";
		dough = "Hue Very thin dough";
		sauce = "Hue Very spicy sauce";
		toppings.add("Black olives");
		toppings.add("Cheese");
		
		
	}

	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
