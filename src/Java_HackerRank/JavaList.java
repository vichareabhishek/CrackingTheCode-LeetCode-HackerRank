package Java_HackerRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(i, scan.nextInt());
		}

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			String s = scan.next();
			if (s.equals("Insert")) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				list.add(x, y);
			} else if (s.equals("Delete")) {
				int x = scan.nextInt();
				list.remove(x);
			}
		}

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Integer it = (Integer) itr.next();
			System.out.println(it + " ");

			for (int i : list) {
				System.out.println(list + " ");
			}
		}
	}

}
