package javaprograms;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagramMethod(String s1, String s2) {

		boolean isAnagram = false;

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if( (c2.length==c1.length)&&(Arrays.equals(c1,c2)))
			isAnagram = true;
		
		return isAnagram;

	}

	public static void main(String[] args) {

		String s1 = "cat";
		String s2 = "Taac";
		if (isAnagramMethod(s1.toLowerCase(), s2.toLowerCase())){
			System.out.print("Both String are Anagram");
		}
		else
			System.out.print("Not Anagram");

	}
}
