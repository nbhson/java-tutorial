package model;

public class Teacher extends Person {
	private float salary;
	private int numberOfSessionsPerWeek;
	
	public Teacher(String name, int age, float height, float salary, int numberOfSessionsPerWeek) {
		super(name, age, height);
		this.salary = salary;
		this.numberOfSessionsPerWeek = numberOfSessionsPerWeek;
	}
}
