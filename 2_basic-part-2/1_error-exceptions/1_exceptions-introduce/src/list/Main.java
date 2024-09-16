package list;

public class Main {
	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		 } catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e.toString());
		 }
		 System.out.println("Out of the block");
	}
}
