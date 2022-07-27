package practice3;

public class LoopControlinJava {

	public static void main(String[] args) {

		// if statement

		int age = 20; /// 1
		String month = "Feb";
		if (age > 18) {
			System.out.println(" you are eligible for vote");
		} else {
			System.out.println("you are not elible for vote");
		}
		if (month == "march") {// 2
			System.out.println(" current month is march");
		} else {
			System.out.println(" current month is not march");
		}

		if (age > 18 && age < 60) {
			System.out.println(" you are young");
		}

		// print the day in week based on day value using if else statement

		int day = 3;
		if (day == 0) {
			System.out.println("day in a week is :  Sunday");
		} else if (day == 1) {
			System.out.println("day in week is : monday ");
		} else if (day == 2) {
			System.out.println("Day in week is tuesday");
		} else if (day == 3) {
			System.out.println("day in week is wednesday");
		} else if (day == 4) {
			System.out.println("day in week is thursday");
		} else if (day == 5) {
			System.out.println("day in week is friday");
		} else {
			System.out.println("day in weeek is saturday");
		}

		// write a program to print even and odd number

		int x = 7;
		if (x % 2 == 0) {
			System.out.println(" x is even number");
		} else {
			System.out.println(" x is odd number");
		}

		String number = (x % 2 == 0) ? " x is even number" : "x is odd number";
		System.out.println(number);

		// 8378807921
	}

}
