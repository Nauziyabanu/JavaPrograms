package javaprograms;

public class DuplicateUniqueString {

	public static void main(String[] args) {

		String s = "s1a21a3s";
		int n = s.length();

		char[] c = new char[n];
		for (int i = 0; i < n; i++) {
			c[i]=s.charAt(i);
		}
		
		System.out.println("Original Elements:");
		for(char ch:c)
			System.out.println(ch);
		
		System.out.println("Duplicate Elements:");
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(c[i]==c[j])
					System.out.println(c[i]);
			}
		}
		
		boolean[] isDuplicate=new boolean[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(c[i]==c[j]) {
					isDuplicate[i]=true;
					break;
				}
			}
		}
		
		System.out.println("Unique Elements:");
		for(int i=0;i<n;i++) {
			if(!isDuplicate[i])
				System.out.println(c[i]);
		}
		
		
		
	}
}
