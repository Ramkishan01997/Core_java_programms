package day5;

public class ForLoop {

	public static void main(String[] args) {

		for (int a = 0; a < 10; a++) {
			System.out.println(" value of a is  :  " + a);
		}

		// reverse the number fromn 10-1
		for (int b = 10; b > 0; b--) {
			System.out.println("value of b is : " + b);

		}

		// print even number from 1-8

		for (int c = 1; c <= 8; c++) {
			if (c % 2 == 0) {
				System.out.println(c + " is even number");
			}
		}

		for (int d = 2; d <= 8; d += 2) {
			System.out.println(d + "  is even number");
		}

		for (int num = 5; num <= 50; num += 5) {
			System.out.println(num + "  is divisible by 5");
		}

	}

}
