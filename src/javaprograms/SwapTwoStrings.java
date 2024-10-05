package javaprograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		String s1="Hi";
		String s2="Hello";
		
		s1=s1+s2; //HiHello--7
		
		s2=s1.substring(0,s1.length()-s2.length()); //(0,7-5=2)
		s1=s1.substring(s2.length(),s1.length());
		
		System.out.println("Swaped Strings: ");
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
