package Pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();
	

	// chuẩn bị
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Toassing dough..."); // thêm bột
		System.out.println("Adding sauce... "); // thêm sốt
		System.out.println("Adding toppings:"); // thêm topping
		if (toppings != null) {
			for (String topping : toppings) {
				System.out.println(topping);
			}	
		}
	}
	
	// nướng
	public void bake() {
		System.out.println("Baking: " + name + " in 30 minutes");
	}
	
	// cắt
	public void cut() {
		System.out.println("Cutting: " + name);
	}
	
	// đóng hộp
	public abstract void box();
	
}