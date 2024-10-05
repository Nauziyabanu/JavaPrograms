package javaprograms;

public class Palindrome {

	public static void main(String[] args) {

		String s1 = "Mom";
		String s = s1.toLowerCase();
		String reversedString = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reversedString = (reversedString + s.charAt(i)).toLowerCase();
		}

		if (s.endsWith(reversedString)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}
}
