package operator;

public class Main {

	public String firstName;
	public String lastName;

	public Main(String _firstName, String _lastName) {
		firstName = _firstName;
		lastName = _lastName;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public static void main(String[] args) {
		// Primitive
		byte byteValue1 = 2;
		byte byteValue2 = 4;
		short byteResult = (short) (byteValue1 + byteValue2);
		System.out.println("Byte: " + byteResult);

		// Reference
		Main emp1 = new Main("Son", "Nguyen");
		System.out.println(emp1.getFullName());

		emp1.firstName = "Nhu";
		System.out.println(emp1.getFullName());

		Main emp2 = new Main("Nhu", "Nguyen");
		System.out.println(emp2.getFullName());
		System.out.println(emp1 == emp2); // false
	}
}
