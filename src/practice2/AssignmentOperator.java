package practice2;

public class AssignmentOperator {

	public static void main(String[] args) {
		// assignment operator = ,+= ,-= ,!= ,==
		int a = 10;
		String name = "Ramkishan";
		String sname = "ytfhgvhg";
		System.out.println("value of 1 is:\n" + a);
		a += 5;
		System.out.println("after increamneting value of a is:\n" + a);

		// decremet the value of a by 7

		a -= 7;
		System.out.println("value of a after decrementing by 7 is :\n" + a);

		System.out.println("check name and sname is same or not:\n" + (name == sname));

		// increment and decrement operatorr ++ ,--,

		int x = 2;
		System.out.println("after incrementing value: \n:" + x++);

		System.out.println("after decrementing value of x:\n:" + x--);

		while (x <= 9) {
			System.out.println("incrimenting value of x  :" + x + ":" + x++);

		}
		x++;
		System.out.println(x);

		for (int y = 10; y >= 0; y--) {
			System.out.println("value of y is" + "  " + y);
		}

		// relational or comparison operator == , < ,> <=, >=, !=
		int age = 21;
		int salary = 30000;

		if (age < 18) {
			System.out.println("eligible for vote");
		}
		if (age > 18) {
			System.out.println("not eligible for vote");
		}
		if (age == 21) {
			System.out.println("mature enough");
		}
		if (salary != 31000) {
			System.out.println("your salry is not enough ");
		}
		
		
		int amount=11000;
		
		
		if(amount>=10000) {
			System.out.println("you can withdraw the money");
		}
		
	}

}
