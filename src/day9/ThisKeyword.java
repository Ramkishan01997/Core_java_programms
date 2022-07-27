package day9;

public class ThisKeyword {

	int x, y; // instance variable

	void setValue(int x, int y) {// local variable
		// x=x; // for assining such value we need to use this keyword
		// y=y;

		this.x = x;
		this.y = y;
	}

	void display() {

		System.out.println(" sum of two numbers is " + (x + y));
	}

	public static void main(String[] args) {
		ThisKeyword ts = new ThisKeyword();
		ts.setValue(4, 7);
		ts.display();
	}

}
// generally this keyword is used to represent current class