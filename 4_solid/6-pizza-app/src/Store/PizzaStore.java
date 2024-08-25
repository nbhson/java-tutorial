package Store;

import Pizza.Pizza;

public abstract class PizzaStore {
	public void orderPizza(String type) {
		Pizza pizza = CreatePizza(type);
	
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	
	protected abstract Pizza CreatePizza(String type);
	
}