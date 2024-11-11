
public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Sơn";
		person.age = 24;
		
		System.out.println(person.getInfo());
		
	}
}

class Person {
	String name;
	int age;
	
	String getInfo() {
		return "Name: " + this.getName() + " Age: " + this.getAge();
	}
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
}
