package day11;

class Parent {
	String speed = "km/hr";

	void display() {
		System.out.println("welcome" + speed);
	}
}

class Child1 extends Parent {
	void show() {
		System.out.println("child 1");
	}

}

class Child2 extends Parent {
	void display1() {
		System.out.println("child2");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		c1.display();
		c1.show();

		Child2 c2 = new Child2();
		c2.display1();
		c2.display1();

	}

}
