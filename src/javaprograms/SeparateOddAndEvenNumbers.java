package javaprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateOddAndEvenNumbers {

	public static void main(String[] args) {

		int[] numbers= {0,1,2,4,5,8,9,6,16,15,13,12,23};
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number of elemnts: \n");
//		int length = scanner.nextInt();
//		int[] numbers = new int[length];
//
//		System.out.println("Enter the list of elements to Separate as Odd And EvenNumbers: \n");
//
//		for (int i = 0; i <= length-1; i++) {
//			numbers[i] = scanner.nextInt();
//		}
//		
//		System.out.println("Entered list of numbers: ");
//		
//		for (int i = 0; i <= length-1; i++) {
//			System.out.println(numbers[i]);
//		}
//		
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

		for (int n : numbers) {

			if (n % 2 == 0) {
				evenNumbers.add(n);
			}

			else
				oddNumbers.add(n);
		}

		System.out.println("Even numbers from the given list is: " + evenNumbers);
		System.out.println("Odd numbers from the given list is: " + oddNumbers);
		
//		EvenOddArrayArrangement
		ArrayList<Integer> evenOddArrayArrangement =new ArrayList<Integer>(evenNumbers);
		evenOddArrayArrangement.addAll(oddNumbers);
		
		System.out.println("EvenOddArrayArrangement of numbers from the given list is: " + evenOddArrayArrangement);
	}

}
