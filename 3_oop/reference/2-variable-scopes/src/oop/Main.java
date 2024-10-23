package oop;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Sơn Nguyễn", 24, 1.7f);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getHeight());

		Employee emp = new Employee("");
		emp.printEmployee();
	}
}
