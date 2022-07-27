package day13;

public class WrapperClass {

	public static void main(String[] args) {
		
	/*	
		byte b=10;
		int i=12;
		short s=21;
		long l=13;
		float f=12F;
		double d=23D;
		char c='A';
		Boolean bool=true;
		
		//converting primitives into objects
		byte byteobj=b;
		int intobj=i;
		short shortobj=s;
		long longobj=l;
		float floatobj=f;
		double douobj=d;
		Character charobj = c;
		Boolean boolobj = bool;
		
		System.out.println(byteobj);
		System.out.println(intobj);
		System.out.println(shortobj);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		
*/
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;
		
		//converting primitives into objects  : Autoboxing
		
		Byte byteobj=b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj = b2;
		
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Integer object: " + intobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Double object: " + doubleobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);
		
		//converting objects to primitives : Unboxing
		
		byte bytevalue=byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;
		
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);
		
		
		String name="1233";
		double dbl=Double.parseDouble(name);
		System.out.println(dbl);
		System.out.println(name);
		
		
		String status="gbjhbj";
		boolean stat=Boolean.parseBoolean(status);
		System.out.println(stat);
		try {
			
			int num=Integer.parseInt(name);
			System.out.println(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
