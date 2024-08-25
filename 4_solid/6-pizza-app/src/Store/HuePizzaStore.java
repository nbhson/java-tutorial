package Store;

import Pizza.Pizza;
import Pizza.Hue.HueCheesePizza;
import Pizza.Hue.HuePepperonPizza;
import Pizza.SG.SGCheesePizza;
import Pizza.SG.SGPepperonPizza;

public class HuePizzaStore extends PizzaStore {

	@Override
	protected Pizza CreatePizza(String type) {
		switch (type) {
			case "cheese":
				return new HueCheesePizza();
			case "greek":
				return new HueCheesePizza();
			default:
				return new HuePepperonPizza();
		}
	}

}
