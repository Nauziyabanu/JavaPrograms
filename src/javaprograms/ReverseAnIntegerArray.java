package javaprograms;

public class ReverseAnIntegerArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		System.out.println("Reversed Array:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
		String s="abc";
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Reversed String:" +sb.reverse());
	}
}
