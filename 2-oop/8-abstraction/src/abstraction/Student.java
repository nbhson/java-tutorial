package abstraction;

public class Student extends Person {
	private String academicAbility;
	private float pointLadder;
	
	public Student(String name, int age, float height, String academicAbility, float pointLadder) {
		super(name, age, height);
		this.academicAbility = academicAbility;
		this.pointLadder = pointLadder;
	}

	public long getAgeFromPerson() {
		return this.age;
	}
	
	public String getAcademicAbility() {
		return academicAbility;
	}

	public void setAcademicAbility(String academicAbility) {
		this.academicAbility = academicAbility;
	}

	public float getPointLadder() {
		return pointLadder;
	}

	public void setPointLadder(float pointLadder) {
		this.pointLadder = pointLadder;
	}
	
	// overriding
	public String fullInfo() {
		return super.fullInfo() + " AcademicAbility: " + this.getAcademicAbility()+ " Point ladder: " + this.getPointLadder();
	}

	// bắt buộc phải override lại phương thức ở lớp cha abstract
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
