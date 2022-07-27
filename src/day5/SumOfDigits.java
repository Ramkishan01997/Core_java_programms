package day5;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 234151235;

		int sum = 0;

		while (num != 0) {

//			num=num%10;
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
