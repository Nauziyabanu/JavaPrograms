package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String s1 = "Hi NAAZ ROOHIE";
		String[] str = s1.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		String reversedStr="";

		for (String s : str) {
			list.add(s);
		}

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		for (String s : str) {
			
			StringBuffer reversedString=new StringBuffer(s).reverse();
		
			reversedStr+=reversedString+" ";
		}
		
		System.out.println(reversedStr);
	}
}
