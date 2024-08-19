package model;

public class Student extends Person {
	private String academicAbility;
	private float pointLadder;
	
	public Student(String name, int age, float height, String academicAbility, float pointLadder) {
		super(name, age, height);
		this.academicAbility = academicAbility;
		this.pointLadder = pointLadder;
	}
}
