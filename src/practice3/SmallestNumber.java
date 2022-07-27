package practice3;

public class SmallestNumber {

	public static void main(String[] args) {
		// find smallest of three number using if ..else statement

		int a = 4;
		int b = 7;
		int c = 8;

		if (a < b && a < c) {
			System.out.println(" a is smallest number: " + a);
		} else if (b < a && b < c) {
			System.out.println(" b is smallest number : " + b);
		} else {
			System.out.println(" c is smallest number  " + c);
		}
		// smallest of two number

		int x = 34;
		int y = 56;
		String numValue = (x < y) ? "x is smaller than y" : "y is smaller thean x";
		System.out.println(numValue);

	}

}
