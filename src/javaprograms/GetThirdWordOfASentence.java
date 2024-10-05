package javaprograms;

public class GetThirdWordOfASentence {

	public static void main(String[] args) {
	
		String str= "I am NAAZ attending interview";
		
		String[] s= str.split(" ");
	
		System.out.print("Third Word Of the Sentence: "+s[2]);

	}

}
