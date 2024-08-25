package Pizza.Hue;

import Pizza.Pizza;

public class HuePepperonPizza extends Pizza {
	public HuePepperonPizza() {
		name = "Hue The best Pepperon pizza";
		dough = "Hue Thick dough";
		sauce = "Hue Sweet sauce";
		toppings.add("Tomato");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
