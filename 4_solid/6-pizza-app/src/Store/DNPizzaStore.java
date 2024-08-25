package Store;

import Pizza.Pizza;
import Pizza.DN.DNCheesePizza;
import Pizza.DN.DNGreekPizza;
import Pizza.DN.DNPepperonPizza;
import Pizza.SG.SGCheesePizza;
import Pizza.SG.SGPepperonPizza;

public class DNPizzaStore extends PizzaStore {

	@Override
	protected Pizza CreatePizza(String type) {
		switch (type) {
			case "cheese":
				return new DNCheesePizza();
			case "greek":
				return new DNGreekPizza();
			default:
				return new DNPepperonPizza();
		}
	}

}
