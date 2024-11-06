
public class Main {
	public static void main(String[] args) {
		int result = add(1, 2); // returns 3;
		System.out.println(result);

		result = add(1, 2, 3); // returns 6;
		System.out.println(result);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	// public static double add(int a, int b) {
	// 	return a + b;
	// }

	public static int add(int a, int b, int c) {
		return a + b + c;
	}
}
