package Pizza.DN;

import Pizza.Pizza;

public class DNPepperonPizza extends Pizza {
	public DNPepperonPizza() {
		name = "DN The best Pepperon pizza";
		dough = "DN Thick dough";
		sauce = "DN Sweet sauce";
		toppings.add("Tomato");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing: " + name);
	}
}
