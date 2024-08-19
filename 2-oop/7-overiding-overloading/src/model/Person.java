package model;
public class Person {
	private String name;
	protected long age;
	protected float height;

	public Person(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public long getAge() {
		return age;
	}
	
	// overloading setAge
	public void setAge(byte age) {
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(long age) {
		this.age = age;
	}
	
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// thêm final để chống ghi đè
	public String fullInfo() {
		return "Name: " + this.getName() + " Age: " + this.getAge() + " Height: " + this.getHeight();
	}
	
}
