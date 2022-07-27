package practice3;

public class LargestOfTwoNumber {

	public static void main(String[] args) {

		int a = 23;
		int b = 20;

		if (a > b) {
			System.out.println(" a is largest number");
		} else {
			System.out.println("b is largest number");
		}

		String number = (a > b) ? "a is largest numner" : " bis largest number";
		System.out.println(number);

	}

}
