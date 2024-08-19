package Pizza.DN;

import Pizza.Pizza;

public class DNGreekPizza extends Pizza {
	public DNGreekPizza() {
		name = "DN A good greek pizza";
		dough = "DN Thin dough";
		sauce = "DN Chilli sauce";
		toppings.add("Tomato");
		toppings.add("Potato");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
