
public class Main {
	public static void main(String[] args) {
		int[] schoolYear = {2012, 2013, 2014};
		
		Person person = new Person("Sơn Nguyễn", 24);
		person.setSchoolYear(schoolYear);
		System.out.println(person.getSchoolYear()[0]); // 2012
		
		schoolYear[0] = 2011;
		System.out.println(person.getSchoolYear()[0]); // 2012
	}
}

class Person {
	private String name;
	private int age;
	private int[] schoolYear;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(int[] schoolYear) {
		this.schoolYear = schoolYear.clone();
	}
}
