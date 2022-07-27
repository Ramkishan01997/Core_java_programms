package day10;

public class CustomerEncapsulation {

	static int accNo;
	static String accname;
	static int accAge;
	
	
	public static int getAccNo() {
		return accNo;
	}


	public static void setAccNo(int accNo) {
		CustomerEncapsulation.accNo = accNo;
	}


	public static String getAccname() {
		return accname;
	}


	public static void setAccname(String accname) {
		CustomerEncapsulation.accname = accname;
	}


	public static int getAccAge() {
		return accAge;
	}


	public static void setAccAge(int accAge) {
		CustomerEncapsulation.accAge = accAge;
	}
 public void getData() {
	 getAccname();
	 System.out.println(getAccname());
 }

	
	

//	public static void main(String[] args) {
//		
//		setAccname("ram");
//		System.out.println(getAccname());
//		
//		
//		CustomerEncapsulation cen=new CustomerEncapsulation();
//		cen.getData();
//		
//		
//
//	}

 
 // for calling static method from another main class 
}
