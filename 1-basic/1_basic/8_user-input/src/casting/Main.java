package casting;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String first = obj.next();

		System.out.print("Enter the second number: ");
		int second = obj.nextInt();

		String sum = first + second;
		System.out.println("The sum of the two numbers is: " + sum);
	}
}
