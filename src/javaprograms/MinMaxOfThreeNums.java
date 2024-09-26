package javaprograms;

public class MinMaxOfThreeNums {

	public static void main(String[] args) {
		
		int a=1,b=2,c=3,temp,min,max;
		
		temp=a>b?a:b;
		max=c>temp?c:temp;
		
		System.out.println("Max OfThreeNums :"+max);
		
		temp=a<b?a:b;
		min=c<temp?c:temp;
		
		System.out.println("Min OfThreeNums :"+min);
		
	}

}
