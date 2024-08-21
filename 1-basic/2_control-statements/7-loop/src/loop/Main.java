package loop;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		byte i = 0;
		while(i < 10) {
			System.out.println("i: " + i++);
		}
		
		byte j = 0;
		do {
			System.out.println("j: " + j++);
		} while (j < 10);
		
		byte z = 0;
		for (int k = 0; k < 10; k++) {
			System.out.println("z: " + z++);
		}
		
		List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        
        for (String string : list) {
			System.out.println(string);
		}
	}
}
