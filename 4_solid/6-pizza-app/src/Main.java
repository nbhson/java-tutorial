
import Store.HuePizzaStore;
import Store.PizzaStore;
import Store.SGPizzaStore;

public class Main {
	public static void main(String[] args) {
		
		HuePizzaStore huePizzaStore = new HuePizzaStore();
		huePizzaStore.orderPizza("cheese");		
		
		
		SGPizzaStore sgPizzaStore = new SGPizzaStore();
		sgPizzaStore.orderPizza("other");
		
	}
}
