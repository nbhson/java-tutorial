package model;

public class Teacher extends Person {
	private float salary;
	private int numberOfSessionsPerWeek;
	
	public Teacher(String name, int age, float height, float salary, int numberOfSessionsPerWeek) {
		super(name, age, height);
		this.salary = salary;
		this.numberOfSessionsPerWeek = numberOfSessionsPerWeek;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getNumberOfSessionsPerWeek() {
		return numberOfSessionsPerWeek;
	}

	public void setNumberOfSessionsPerWeek(int numberOfSessionsPerWeek) {
		this.numberOfSessionsPerWeek = numberOfSessionsPerWeek;
	}
	
	public String fullInfo() {
		return super.fullInfo() + " Salary: " + this.getSalary()+ " Point ladder: " + this.getNumberOfSessionsPerWeek();
	}

}
