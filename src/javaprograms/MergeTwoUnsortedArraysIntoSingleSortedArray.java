package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoUnsortedArraysIntoSingleSortedArray {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4 };
		int b[] = { 2, 5, 4 };

		Set<Integer> set = new TreeSet<Integer>();

		for (int a1 : a) {
			set.add(a1);
		}

		for (int b1 : b) {
			set.add(b1);
		}

		System.out.println("Single Sorted Array:"+set);
	}
}
