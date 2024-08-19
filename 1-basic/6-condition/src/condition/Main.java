package condition;

public class Main {
	public static void main(String[] args) {
		int a = 0;
		
		if (a > 5) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
		switch (a) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;

		default:
			System.out.println("Number invalid");
			break;
		}
	}
}
