package javaprograms;

public class RemoveDuplicateElementsFromListWithoutCollections {
	
	public static final String UNDERLINE = "\u001B[4m";
    public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String BLUE = "\u001B[34m";

	public static void main(String args[]) {

		int a[] = { -1, 0, 1, 2, 3, 4, 2, 5, 0, -1 };
		int n = a.length;

		System.out.println(BLUE+UNDERLINE+"Duplicate Elements:"+RESET);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}

		boolean[] isDuplicate = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					isDuplicate[j] = true;
				}
			}
		}
		
		
		System.out.println(BLUE+UNDERLINE+"Actual List:"+RESET );
		for(int i:a)
			System.out.println(i);

		
		System.out.println(BLUE+UNDERLINE+"Unique nums :"+RESET);

		for (int i = 0; i < n; i++) {
			if (!isDuplicate[i]) {
				System.out.println(GREEN+a[i]);
			}
		}

		System.out.println(BLUE+UNDERLINE+"List of duplicate values :"+RESET);
		for (int i = 0; i < n; i++) {
			if (isDuplicate[i]) {
				System.out.println(RED+a[i]);
			}
		}
	}
}
