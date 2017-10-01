
package Algorithms;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.*;

public class TimeFormat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time");
		String time = scan.nextLine();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
		LocalTime localTime = LocalTime.parse(time, dateTimeFormatter);

		if (time.equals("12:00:00AM")) {

			System.out.println("00:00:00");
		} else {
			System.out.println(localTime);
		}
	}
}
