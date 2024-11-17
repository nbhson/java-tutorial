package casting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Getting Current Date and Time
		Date date = new Date();
		System.out.println(date.toString());

		// Date Formatting Using SimpleDateFormat
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(dNow));

		// Parsing Strings into Dates
		SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd");
		String input = args.length == 0 ? "2024-11-11" : args[0];
		System.out.print(input + " Parses as ");
		Date t;
		try {
			t = ft2.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft2);
		}

		// Sleeping for a While
		try {
			System.out.println(new Date() + "\n");
			Thread.sleep(3000);
			System.out.println(new Date() + "\n");
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}

		// Measuring Elapsed Time
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(5000);
			long end = System.currentTimeMillis();

			long diff = end - start;
			System.out.println("Difference is : " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}

	}
}
