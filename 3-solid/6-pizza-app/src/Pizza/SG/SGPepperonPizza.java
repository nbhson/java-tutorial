package Pizza.SG;

import Pizza.Pizza;

public class SGPepperonPizza extends Pizza {
	public SGPepperonPizza() {
		name = "SG The best Pepperon pizza";
		dough = "SG Thick dough";
		sauce = "SG Sweet sauce";
		toppings.add("Tomato");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
