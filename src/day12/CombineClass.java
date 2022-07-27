package day12;

public class CombineClass extends XYZ implements ABC, DEF {
	public void abc() {
		System.out.println("abc");
	}

	public void def() {
		System.out.println("def");
	}

	public static void main(String[] args) {
		CombineClass c = new CombineClass();
		c.def();
		c.show();
		c.abc();

	}

}
