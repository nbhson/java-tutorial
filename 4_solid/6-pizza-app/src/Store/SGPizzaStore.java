package Store;

import Pizza.Pizza;
import Pizza.SG.SGCheesePizza;
import Pizza.SG.SGPepperonPizza;

public class SGPizzaStore extends PizzaStore {

	@Override
	protected Pizza CreatePizza(String type) {
		switch (type) {
			case "cheese":
				return new SGCheesePizza();
			case "greek":
				return new SGCheesePizza();
			default:
				return new SGPepperonPizza();
		}
	}
}
