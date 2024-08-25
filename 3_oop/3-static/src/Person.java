
public class Person {
	private String firstName;
	private String lastName;
	
	public static int age;
	public static int total = 0; 
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.total += 1;
	}

	public static String getPersionInfo() {
		return "Your age: " + age;
	}
	
}
