package day10;

public class CustomerEncapsulationMain {

	public static void main(String[] args) {
	System.out.println(CustomerEncapsulation.accNo);
	
	CustomerEncapsulation.setAccAge(25);
	CustomerEncapsulation.setAccname("Ramkishan");
	CustomerEncapsulation.setAccNo(125446333);
	
	String name=CustomerEncapsulation.getAccname();
	int age=CustomerEncapsulation.getAccAge();
	int account=CustomerEncapsulation.getAccNo();
	
	
	System.out.println(name);
	System.out.println(age);
	System.out.println(account);
	
	}

}
