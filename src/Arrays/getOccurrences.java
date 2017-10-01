package Arrays;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class getOccurrences {
	public static void main(String[] args) {
		// int[] a = { 1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1 };
		//
		// Arrays.sort(a);
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		// int[] myCountingArray = new int[numberList.size()];
		numberList.add(10);
		numberList.add(10);
		numberList.add(10);
		numberList.add(9);
		numberList.add(10);
		numberList.add(9);
		numberList.add(9);
		numberList.add(3);
		numberList.add(2);
		numberList.add(1);
		Collections.sort(numberList);
		int nbOccurences = 1;
		int length = numberList.size();
		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				if (numberList.get(i) == numberList.get(i + 1)) {
					nbOccurences++;
				}
			} else {
				System.out.println(numberList.get(i) + " occurs " + nbOccurences + " time(s)"); // end
																								// of
																								// array
			}

			if (i < length - 1 && numberList.get(i) != numberList.get(i + 1)) {
				System.out.println(numberList.get(i) + " occurs " + nbOccurences + " time(s)"); // moving
																								// to
																								// new
																								// element
																								// in
																								// array
				nbOccurences = 1;
			}

		}

	}
}
