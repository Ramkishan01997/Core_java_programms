package practice2;

public class LogicalOperator {

	public static void main(String[] args) {
		//and && ,|| , ! 
		int age=20;
		int salary=30000;
		String company="accenture";
		int yealypackage=10;
		int a=10;
		int b=20;
		int c=9;
		if((a>9) && (b>10)) {
		System.out.println("check whether ais less than b or not  :");
		}
		
		if((a == b)) {
			System.out.println("a is not equal to b");
			}
		
		if(age>=20 && salary>=30000) {
			System.out.println(" you can ,marry now ");
		}
		
		
		if(age==25 && salary>=30000) {
			System.out.println("you can change the job now");
		}
		
		if(age==25 || salary>=30000) {
			System.out.println("you can change the job now");
		}
		

		if(yealypackage==10 || company=="accenture") {
			System.out.println(" you can accept the offer ");
		}
	}

}
