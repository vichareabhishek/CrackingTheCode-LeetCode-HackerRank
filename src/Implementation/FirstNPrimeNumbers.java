package Implementation;

public class FirstNPrimeNumbers {

	public static void main(String args[]) {

		System.out.println(countPrimes(100));

	}

	public static int countPrimes(int n) {
		if (n < 1) {
			return 0;
		}
		boolean[] notprime = new boolean[n];

		notprime[0] = true;
		notprime[1] = true;

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (!notprime[i]) {
				for (int j = 2; j * i < n; j++) {
					notprime[i * j] = true;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < notprime.length; i++) {
			if (!notprime[i]) {
				System.out.println(i);
				count++;
			}
		}
		return count;

	}
}
