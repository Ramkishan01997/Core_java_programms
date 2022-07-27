package practice1;

public class TypesofVariableDataType {

	public static void main(String[] args) {

		// variable is ueed to store information
		// variable must be declared useing datatype

		int a, b, c;
		a = 10;
		b = 40;
		a = 100;
		c = a + b;

		System.out.println("sum of a and b is:" + c);

		// string
		String name = "Ramkishan";
		System.out.println("you entered the name" + name);
		System.out.println(name + " " + c);
		// long we need to write l at end
		long y = 4587223366666666666l;
		long z = 848848466l;
		long x = y + z;
		System.out.println("value of long :" + x);

		// double
		double k = 10.6;
		float m = 25.3f;
		double j = k + m;// addde double and float value by using double

		System.out.println(j);
		String value = "45511";
		int newVal = Integer.parseInt(value);
		System.out.println("converted sting to int" + newVal);

		int number = 45151;
		String newNumber = String.valueOf(number);// converted integre to string
		System.out.println(newNumber);
	}

}
