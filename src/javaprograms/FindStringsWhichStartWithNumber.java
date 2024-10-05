package javaprograms;

public class FindStringsWhichStartWithNumber {

	public static void main(String[] args) {

		String s1 = "1str str 2str strs";
		String[] str = s1.split(" ");

		for (String s : str) {
			if (Character.isDigit(s.charAt(0))) {
				System.out.println("String  Start With Number: "+s);
				System.out.println("Replace with char: "+s.replace(s.charAt(0), 's'));
			}
		}
	}
}
