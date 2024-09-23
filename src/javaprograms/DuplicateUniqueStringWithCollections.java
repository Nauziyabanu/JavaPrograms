package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUniqueStringWithCollections {

	public static void main(String[] args) {

		String s = "s1a21a3s";
		int n = s.length();

		char[] c = new char[n];
		for (int i = 0; i < n; i++)
			c[i] = s.charAt(i);

		Set<Character> uniqueCharacters = new HashSet<Character>();

		Set<Character> duplicateCharacters = new HashSet<Character>();
		
		String uniqueString="";
		String duplicateString="";

		for (char ch : c) {
			if (!uniqueCharacters.add(ch)) {
				duplicateCharacters.add(ch);
				duplicateString=duplicateString+ch;
			}
		}

		for (char ch : c)
			uniqueCharacters.add(ch);

		System.out.println("Unique Characters: " + uniqueCharacters);

		System.out.println("Repeated Characters: " +(char)34+duplicateString+(char)34);
		System.out.println("Repeated Characters: " +'"'+duplicateString+'"');

	}

}
