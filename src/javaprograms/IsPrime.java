package javaprograms;

public class IsPrime {

	public static void main(String[] args) {

		int n = 17;

		boolean isPrime = true;

		if (n <= 1)
			isPrime = false;
		else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					isPrime = false;
			}
		}

		if (isPrime)
			System.out.println(n + " is a Prime Number");

		else
			System.out.println(n + " is not a Prime Number");

	}

}
