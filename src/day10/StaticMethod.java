package day10;

public class StaticMethod {
	
	static int id;
	static String city;
	static int pin;
	
	
	static void method1() {
		System.out.println(" welcome to static method demo");
	}
	// non static
	int age;
	
	void m2() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
	
		
		
		
		// static variables as well as methods can be directly accesed through main method withing creating its object
		
		id=7;
		city="pune";
		pin=411006;
		
		System.out.println(id+ " "+city+ " "+ pin);
		method1();
		
		StaticMethod m=new StaticMethod();
		m.age=90;
		System.out.println(m.age);
		m.m2();
	}

}
