package day5;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 10) {
			System.out.println(" value of i is :" + i);
			i++;
		}

		// int the all even numer between 1to 15

		int a = 2;
		while (a <= 15) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a++;
		}

		while (a <= 15) {
			System.out.println(" value of a :  " + a);
			a += 2;
		}

		int b = 1;
		while (b <= 10) {
			if (b % 2 != 0) {
				System.out.println(b + " b is odd number");
			}
			b++;
		}

		// Do while Loop

		int c = 1;
		do {
			System.out.println(c);
			c++;
		} while (c <= 10);

		int ix = 0;

		do {
			System.out.println("Hello");
			ix++;
		} while (ix < 10);
	}

}
