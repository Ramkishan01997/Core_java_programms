package day5;

public class EvenAdnOddNumberCount {

	public static void main(String[] args) {
// programm to calculate number of even and odd digits from number
		int a = 1231111456;

		int rev = 0;
		int evenCount = 0;
		int oddCount = 0;

		while (a != 0) {

			a = a / 10;
			rev = a % 10;
			if (rev % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		
		int val=12345;
		int reval=0;
		int ocount=0;
		int ecount=0;
		while (val>0) {
			reval=val%10;
			if(reval%2==0) {
				ecount++;
			}else {
				ocount++;
			}
			val=val/10;
		}
		System.out.println(ocount);
		System.out.println(ecount);

		System.out.println(" number of even digits in given number: " + evenCount);

		System.out.println(" number of odd digits in given number: " + oddCount);

		// calcualte odd digits from number

		int b = 44;
		int odcount = 0;
		int newNum = 0;
		while (b != 0) {

			b = b / 10;
			newNum = b % 10;
			if (newNum % 2 == 0) {
				odcount++;
			}
		}

		System.out.println(" the number of odd digits in given number is  : " + odcount);

	}

}
