import model.Student;
import model.Teacher;

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Sơn Nguyễn", 24, 53, "Good", 8.5f);
		Teacher teacher = new Teacher("Tấn Phương", 32, 65, 25, 3);
		
		System.out.println(student.fullInfo());
		System.out.println(teacher.fullInfo());
	}
}
