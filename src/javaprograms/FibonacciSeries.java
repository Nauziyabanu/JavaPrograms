package javaprograms;

public class FibonacciSeries {

	public static int fibonacciSeries(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacciSeries(n - 2) + fibonacciSeries(n - 1);
		}
	}

	public static void printFibonacciSeries(int n) {
		int first = 0, second = 1;

		// Print the first n terms of the Fibonacci series
		System.out.print("Fibonacci Series: " + first);

		if (n > 1) {
			System.out.print(", " + second);
		}

		// Iterate and calculate each Fibonacci number
		for (int i = 3; i <= n; i++) {
			int next = first + second; // Calculate next term
			System.out.print(", " + next);
			first = second; // Shift variables for the next iteration
			second = next;
		}
	}

	public static void main(String[] args) {

		System.out.println(fibonacciSeries(6));
		printFibonacciSeries(7);

	}
}
