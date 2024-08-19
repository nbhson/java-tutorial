package Pizza.Hue;

import Pizza.Pizza;

public class HueGreekPizza extends Pizza {
	public HueGreekPizza() {
		name = "Hue A good greek pizza";
		dough = "Hue Thin dough";
		sauce = "Hue Chilli sauce";
		toppings.add("Tomato");
		toppings.add("Potato");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
