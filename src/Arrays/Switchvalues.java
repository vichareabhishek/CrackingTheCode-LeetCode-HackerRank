package Arrays;

public class Switchvalues {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 1, 2, 3 };
		for (int number : arr1)
			System.out.print(number + " ");
		System.out.println();
		for (int number1 : arr2)
			System.out.print(number1 + " ");
		switchValves(arr1, arr2);
		System.out.println();
		System.out.println("SWitch: ");
		for (int number : arr1)
			System.out.print(number + " ");
		System.out.println();
		for (int number1 : arr2)
			System.out.print(number1 + " ");

	}

	public static void switchValves(int[] a, int[] b) {

		int[] temp = a;
		a = b;
		b = temp;

	}

}
