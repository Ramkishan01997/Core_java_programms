package day5;

public class RevreseNumber {

	public static void main(String[] args) {
		int number = 12345;
		int org_number = number;
		int rev = 0;

		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}

		if (org_number == rev) {
			System.out.println(" the number is Palindrome number");
		} else {
			System.out.println(" number is not palindrome");
		}
		System.out.println(" rev number is " + rev);

	}

}
