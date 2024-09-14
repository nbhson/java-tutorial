package list;

public class Main {
	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			try {
			   int b = 0;
			   
			   int c = 1/b;
			} catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println("Child - Exception thrown: " + e);
			}
			System.out.println("Access element three :" + a[3]);
		 }
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Parent - Exception thrown: " + e);
		 }
	}
}
