package day7;

public class DeclaringString {

	public static void main(String[] args) {
		String name="Ramkishan";
		
		System.out.println("length of string : "+name.length());
		
		
		
		String lName="          Suryawanshi";
		// concating the string
		System.out.println(name.concat(lName).trim());
		
		System.out.println(lName);
		System.out.println(lName.trim());
		
		//
		String s1="hello";
		String s2="hello";
		if(s1==s2) {
			System.out.println(" s1 and s2 are equals");
		}else {
			System.out.println(" s1 and s2 are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println(" both are equal");
		}

	}

}
