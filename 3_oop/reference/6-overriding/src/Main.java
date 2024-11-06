
public class Main {
	public static void main(String[] args) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object

		a.move(); // runs the method in Animal class
		b.move(); // runs the method in Dog class
		b.getPersonInfo(10);
		// b.bark(); // error
	}

}

class Animal {
	public final void saySomething() {
		System.out.println("Say some thing");
	}
	public static void getPersonInfo(int age) {
		System.out.println( "Animal age: " + age);
	}
	protected void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {
	public void move() {
		// super.move();
		System.out.println("Dogs can walk and run");
	}

	public void bark() {
		System.out.println("Dogs can bark");
	}

	// Final không thể ghi đè
	// public void saySomething() {
	// 	System.out.println("Hi");
	// }

	// static không thể ghi đè, sẽ gọi phương thức lớp cha
	// public static void getPersonInfo(int age) {
	// 	System.out.println( "Dog age: " + age);
	// }
}

class Final extends Dog {
	public void move() {
		super.move(); // question - can call move() on Animal class?
		System.out.println("Final can move");
	}
}
