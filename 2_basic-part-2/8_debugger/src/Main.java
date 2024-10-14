

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Main {
   public static void main(String[] args) throws IOException {
	   Student student = new Student(1, "GP Coder");
       String hello = sayHello(student);
       System.out.println(hello);

   }
   
   public static String sayHello(Student student) {
       return "Hello " + student.getName();
   }

   public static void checkStudent(Integer id) {
       if (id != null) {
           System.out.printf("Valid");
       } else {
           System.out.printf("Invalid");
       }
   }

}

class Student {
	private int age;
	private String name;
	
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	protected String getName() {
		return this.name+ " " + this.age;
	}
}