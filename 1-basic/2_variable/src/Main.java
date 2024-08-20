
public class Main {

	// salary  variable is a private static variable
	private static double price;

	// DEPARTMENT is a constant
	public static final String DEPARTMENT = "Development ";

	// this instance variable is visible for any child class.
	public String name;

	// salary  variable is visible in Employee class only.
	private double salary;
 
	// The name variable is assigned in the constructor.
	public Main (String empName) {
	   name = empName;
	}
 
	// The salary variable is assigned a value.
	public void setSalary(double empSal) {
	   salary = empSal;
	}
 
	// This method prints the employee details.
	public void printEmp() {
	   System.out.println("name  : " + name );
	   System.out.println("salary :" + salary);
	}
	
	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	 }

	public static void main(String[] args) {
		// Number		
		int numberVar = 10;
		double doubleVar = 1000000000;
		long longVar = 1000000000;
		float floatVar = 10.5f;
		
		// Plan text		
		char charVar = '5';
		String stringVar = "Sơn Nguyễn";
		
		// Logic type
		boolean booleanVar = true;
		
		System.out.println(numberVar);
		System.out.println(doubleVar);
		System.out.println(longVar);
		System.out.println(floatVar);
		
		System.out.println(charVar);
		System.out.println(stringVar);
		
		System.out.println(booleanVar);

		// Local variables
		Main main = new Main("Son");
		main.pupAge();

		// Instance Variables 
		Main empOne = new Main("Ransika");
		empOne.setSalary(1000);
		empOne.printEmp();

		price = 1000;
      	System.out.println(Main.DEPARTMENT + "average salary:" + Main.price);
	}
}
