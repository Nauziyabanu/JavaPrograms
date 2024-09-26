package javaprograms;

public class FrequencyOfEachElementInAnArray {

	public static void main(String[] args) {

		int[] a = { 5, 2, 2, 3, 1, 4, 5 };
		int n=a.length;
		boolean[] isDuplicate=new boolean[n];

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					isDuplicate[i]=true;
					System.out.println(a[i]);
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(!isDuplicate[i])
				System.out.println(a[i]);
			System.out.println(isDuplicate[i]);
		}
	}
}
