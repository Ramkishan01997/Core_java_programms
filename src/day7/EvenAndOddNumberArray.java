package day7;

public class EvenAndOddNumberArray {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.println(" even numbers in string is : "+even);
		System.out.println(" odd number in string : "+odd);
		
		
		
		
		int number[]= {13,24,33,57,89};
	
		int eNum=0;
		int onum=0;
		
		for( int s:number) {
			if(s%2==0) {
				eNum++;
			}else {
				onum++;
			}
		}
		
		System.out.println(" even numbers in array is :"+eNum);
		System.out.println(" odd numbers in array is : "+onum);
	}

}
