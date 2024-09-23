package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElementsFromListCollections {

	public static void main(String[] args) {

		ArrayList<Integer> elements = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 1,5));
		HashSet<Integer> duplicateSetElements=new HashSet<Integer>();
		HashSet<Integer> uniqueSetElements = new HashSet<Integer>();
		
		System.out.println(elements);
		
		for(int n:elements) {
			if(!uniqueSetElements.add(n)) {
				duplicateSetElements.add(n);
			}
		}
		
		System.out.println("Duplicate values: "+duplicateSetElements);

		System.out.println("Unique values: "+uniqueSetElements);
		
	}
}
