package day7;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int a[]= {2,5,7,8,9,100};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(" sum of all array element is "+sum);

	}

}
