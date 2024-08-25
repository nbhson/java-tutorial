package loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// for example
		int [] numbers = {10, 20, 30, 40, 50};
		for(int index = 0; index < numbers.length; index++) {
			System.out.println("value of item : " + numbers[index] );
		}
		// for-each example
		List<String> list = new ArrayList<String>();
		List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        
        for (String string : list) {
			System.out.println(string);
		}

		for (String string : names) {
			System.out.println(string);
		}
	}
}
