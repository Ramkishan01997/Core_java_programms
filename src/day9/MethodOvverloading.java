package day9;

public class MethodOvverloading {
	// in method overloading is used to achieve polymorpohism
	// in which we use same method name by passing diffrent parametre
	int x;
	int y;
	double s;

	void addNum() {
		System.out.println(x + y);
	}

	void addNum(int a, int b,String g) {
		x = a;
		y = b;
		System.out.println(x + y);
		System.out.println(g);
	}

	void addNum(int b, double c) {
		s = c;
		y = b;
		System.out.println(s + y);
	}

	void addNum(int a, int b, double c) {
		x = a;
		y = b;
		s = c;
		System.out.println(x + y + s);
	}

	public static void main(String[] args) {

		MethodOvverloading mv = new MethodOvverloading();
		mv.addNum();
		mv.addNum(4, 7);
		mv.addNum(7, 8, 4.5);
		mv.addNum(7, 7.8);
		mv.addNum(7, 2, "ram");

	}

}
