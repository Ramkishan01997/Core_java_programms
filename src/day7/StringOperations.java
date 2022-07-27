package day7;

public class StringOperations {

	public static void main(String[] args) {
		String a="helloworld ";
		
		System.out.println(a.length());

		
		System.out.println(a.charAt(3));
		System.out.println(a.charAt(4));
		
		
		
		System.out.println(a.contains("ell"));
		System.out.println(a.contains("dhe"));
		System.out.println(a.contains("owor"));
		
		
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
		
		String s1="Welcome";
		String s2="welcome";
		
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//
		String cName="welcome    to java";
		System.out.println("length before trimming: "+cName.trim().length());
		cName=cName.trim();
		System.out.println("length after trimming: "+cName.trim());
		System.out.println(s1.substring(1,3));
		
		
		String email="Ram@test@1997";
		String x[]=email.split("@");
		System.out.println(x[0]);
		cName.replace("welcome", "hello");
		System.out.println(cName);
		
	}

}
