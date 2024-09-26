package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 34, 4, 50, 51));
		Collections.sort(list, Collections.reverseOrder());
		int SecondLargestNumber = list.get(1);
		System.out.println("The Second largest number is: " + SecondLargestNumber);

		int a[] = { 1, 2, 34, 4, 50, 51 };
		int n = a.length;
		Arrays.sort(a);
		System.out.println("The Second largest number is: " + a[n - 2]);

		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest && largest != secondLargest) {
				secondLargest = a[i];
			}
		}

		System.out.println("The largest number is: " + largest);
		System.out.println("The Second largest number is: " + secondLargest);
	}
}
