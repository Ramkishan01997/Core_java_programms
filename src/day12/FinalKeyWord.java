package day12;

public class FinalKeyWord {
	
	final int x=100;
	
	
	void show() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		FinalKeyWord fc=new FinalKeyWord();
		
		//fc.x=200;// it will not accept because it is final
		System.out.println(" value of x : "+fc.x);

	}

}
