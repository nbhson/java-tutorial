package casting;

class Vehicle {}

public class Main extends Vehicle  {
	public static void main(String[] args) {
		Vehicle a = new Main();
		boolean result1 =  a instanceof Main;
		boolean result2 =  a instanceof Vehicle;
		System.out.println( result1 );
		System.out.println( result2 );
	}
}
