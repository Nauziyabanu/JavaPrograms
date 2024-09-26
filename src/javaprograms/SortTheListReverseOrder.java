package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheListReverseOrder {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 4, 2, 3, 5));
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		int[] a= {1, 4, 2, 3, 5};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
