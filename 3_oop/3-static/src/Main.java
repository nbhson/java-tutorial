
public class Main {
	
	static String course;
	
	static {
		// Chạy trước hàm main
		System.out.println("Khối static");
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("Sơn", "Nguyễn", 24);
		System.out.println(Person.getPersionInfo());
		
		Person person2 = new Person("Uyên", "Nguyễn", 18);
		System.out.println(Person.getPersionInfo());
		
		Person person3 = new Person("Ngân", "Nguyễn", 21);
		System.out.println(Person.getPersionInfo());
		
		System.out.println(Person.total);
	}
}
