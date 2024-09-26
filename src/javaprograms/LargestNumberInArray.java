package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 34, 4, 50, 51 };
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) { // To get the smallest number if (a[i] <= min)
				max = a[i];
			}
		}
		System.out.println("LargestNumberInArray: " + max);

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 34, 4, 50, 51));
		int maxList = list.get(0);
		int n = list.size();
		for (int l : list) {
			if (l > maxList) {
				maxList = l;
			}
		}
		System.out.println("LargestNumberInArray List: " + maxList);
		
//		Arrays.sort(list.toArray());
//		System.out.println("LargestNumberInArray List using inbuilt functions: " +list.get(n-1));
		
//		Collections.sort(list);
//		System.out.println("LargestNumberInArray List using inbuilt functions: " +list.get(n-1));
		
//		Collections.sort(list,Collections.reverseOrder());
//		System.out.println("LargestNumberInArray List using inbuilt functions reverseOrder(): " +list.get(0));

		//with Collections.max()
		int largestNumber = Collections.max(list);
		// Print the largest number
		System.out.println("The largest number is: " + largestNumber);
	}
}
