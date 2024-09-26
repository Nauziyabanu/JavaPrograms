package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeMaxMinNumbers {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 6, 8, 9, 0 };

		Arrays.sort(a);

		List<Integer> list1 = new ArrayList<Integer>();
		
		for(int al:a)
			list1.add(al);
		int n=list1.size();
		
		List<Integer> minlist = new ArrayList<Integer>(list1.subList(0, 3));
		List<Integer> maxlist = new ArrayList<Integer>(list1.subList(n-3, n));
		
		System.out.println("Three Min Numbers: "+minlist);
		System.out.println("Three Max Numbers: "+maxlist);
	}

}
