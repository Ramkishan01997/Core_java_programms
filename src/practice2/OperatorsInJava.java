package practice2;

public class OperatorsInJava {

	public static void main(String[] args) {
		int a = 10, b = 30;
		int c = 4;

		// Airthimatic operator
		// Airtthmatic operators is used to perform diffrent mathematical operation on
		// numbers
		// following are arithmatic operato "+" , "-" ."*" ,"?" ,"%"

		System.out.println("+ operator for adding numbers" + (a + b));

		System.out.println("+ sum of three  numbers" + (a + b + c));

		System.out.println("subtraction - operator :" + (b - a));
		
		
		System.out.println("multiplication of two numbers"+(a*b));
		
		System.out.println("divison of two number is "+(b/a));
		System.out.println("remider of two number :"+ ""+(b%a));
		
		// caluculate whther given number is odd or even
		for (int i=0;i<10;i++) {
		if(i%2==0) {
			System.out.println(i+" is even number");
		}else {
			System.out.println(i+" is odd number");
		}
		}
	}

}
