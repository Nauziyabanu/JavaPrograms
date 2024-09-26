package javaprograms;

public class SumOfAllDigitsOfANumber {

	public static void main(String[] args) {

		int a = 1234;
		int sum = 0;
		int b = a;

		while (a != 0) {

			sum = sum + a % 10;
			System.out.println("sum "+sum);
			a = a / 10;
			System.out.println("a: "+a);
		}

		System.out.println("Sum Of All Digits Of A Number " + b + ": " + sum);
	}
}