package day11;

class A {
	void show() {
		System.out.println("welcome to class A");
	}
}

class B extends A {

	void show1() {
		System.out.println(" welcome to B");
	}

}

class C extends B {
	void show3() {
		System.out.println("welcome to c");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C a = new C();
       a.show();
       a.show1();
       a.show3();
	}

}
