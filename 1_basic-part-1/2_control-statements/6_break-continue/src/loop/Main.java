package loop;

public class Main {
	public static void main(String[] args) {
		// Using break with while loop
		int x = 10;
		while (x < 20) {
			if (x == 15) {
				break;
			}
			System.out.println("value of x : " + x);
			x++;
		}

		// Using break with for loop
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == 30) {
				break;
			}
			System.out.println("value of item : " + numbers[index]);
		}

		// Using break with an infinite loop
		int y = 10;
		while (true) {
			System.out.println("value of y : " + y);
			y++;
			if (y == 15) {
				break;
			}
		}

		// Using continue with while loop
		int u = 10;
		while (u < 20) {
			u++;
			if (u == 15) {
				continue;
			}
			System.out.println("value of u : " + x);
		}

		// Using continue with for loop
		int [] numbers_one = {10, 20, 30, 40, 50};

      	for(int index = 0; index < numbers_one.length; index++) {
			if(numbers_one[index] == 30){
				continue;
			}
			System.out.println("value of item : " + numbers_one[index]);         
		}
	}
}
