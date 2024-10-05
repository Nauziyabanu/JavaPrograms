package javaprograms;

public class StringCharacterCount {

	public static void main(String[] args) {
		
		String s="Hi am Naaz";
		
		int n=s.length();
		int count=0;
		
		for(int i=0;i<n;i++) {
			
			if(s.charAt(i)!=' ') {
				count++;
			}
		}

		
		System.out.println("The no. of charatcters in the String:"+count);
	}

}
