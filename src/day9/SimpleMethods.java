package day9;

public class SimpleMethods {

	int x, y;
	String name;

	void addNumber() {// no parameter no return
		System.out.println("sum of two numbers is : " );
	}

	void subtract(int a, int b) {//takes parameter return nothing
		x = a;
		y = b;

		System.out.println(x - y);
	}

	int add() {//no parameter return value
		return (x + y);

	}

	int multiply(int a, int b) {//takes parameter return value
		x = a;
		y = b;
		return (x + y);
	}

	public static void main(String[] args) {
		SimpleMethods sm = new SimpleMethods();
		sm.addNumber();
		sm.subtract(7, 5);
		int res = sm.add();
		int mres = sm.multiply(2, 6);
		System.out.println(res);
		System.out.println(mres);
	}

}
