package javaprograms;

import java.util.Arrays;
import java.util.Comparator;

public class SortListOfStringInIncreasingOrderOfTheirLength {

	public static void main(String[] args) {

		String[] s= {"abcd", "abc", "a","ab"};
		
		Arrays.sort(s,Comparator.comparing(String::length));
		
		System.out.print(Arrays.toString(s));

	}

}
