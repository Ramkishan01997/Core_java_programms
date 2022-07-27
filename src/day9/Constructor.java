package day9;

public class Constructor {

	int x;
	int y;
	String name;

//	Constructor(){//default constructor
//		System.out.println(" welcome ....");
//	}
	Constructor(int a, int b, String s) {
		x = a;
		y = b;
		name = s;
	}

	void showValue() {// parameterized constructor
		System.out.println(x + " " + y + " " + name);
	}

	public static void main(String[] args) {
//		Constructor cs=new Constructor();
		Constructor cs1 = new Constructor(2, 5, "ram");
		cs1.showValue();
	}

}
