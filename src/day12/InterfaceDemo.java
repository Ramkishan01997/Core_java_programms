package day12;

//interface Shape{

//	
//	default void display() {// default 
//		System.out.println("hello");
//	}
//	static void show() {
//		System.out.println("welcome");
//		
//	}
//	void hide();// abstract method
//	
//}
//
//public class InterfaceDemo implements Shape {
//	public void isEnabled() {
//		System.out.println("statred");
//	}
//
//	public static void main(String[] args) {
//		
//		
//
//	}

//}

interface Shape {
	int lenght = 10; // final & Static
	int width = 20; // final & static

	void circle(); // abstract

	default void square() // default method
	{
		System.out.println(" this is square.");
	}

	static void rectangle() // static method
	{
		System.out.println(" this is rectangle.");
	}
}

public class InterfaceDemo implements Shape {

	public void circle() {
		System.out.println("this is circle..");
	}

	public static void main(String[] args) {

		InterfaceDemo idobj = new InterfaceDemo();

		idobj.circle();
		idobj.square();

		Shape.rectangle();

//		Shape idobj=new InterfaceDemo();
//		
//		idobj.circle();
//		idobj.square();

	}

}