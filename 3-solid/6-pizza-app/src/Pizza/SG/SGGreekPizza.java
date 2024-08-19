package Pizza.SG;

import Pizza.Pizza;

public class SGGreekPizza extends Pizza {
	public SGGreekPizza() {
		name = "SG A good greek pizza";
		dough = "SG Thin dough";
		sauce = "SG Chilli sauce";
		toppings.add("Tomato");
		toppings.add("Potato");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
