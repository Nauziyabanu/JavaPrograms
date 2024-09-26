package javaprograms;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 0, 1, 3, 5 };
		int[] c = new int[3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[i]=a[i];
				}
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
