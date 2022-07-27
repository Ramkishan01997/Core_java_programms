package practice2;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		// method 1
		int a = 10;
		int b = 20;
		System.out.println("valueof and b before swapping:" + a + " " + b);

		int c = b;

		a = c;
		b = a;
		System.out.println("valueof and b after swapping:" + a + " " + b);

	}

}
