package javaprograms;

public class SumAndAverageOfElementsOfAnArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int n=a.length;
		int sum=0,avg=0;
		
		for(int i:a) {
			sum+=i;
		}
		
		System.out.println("Sum Of Elements Of An Array: "+sum);
		System.out.println(n);
		System.out.print("Average Of Elements Of An Array: "+sum/n);
	}

}
