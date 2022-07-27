package day5;

public class JumpingStatements {

	public static void main(String[] args) {
		
		for( int x=1;x<=10;x++) {
			if(x==4) {
				break;
			}
			System.out.println(x);
		}

		
		for (int y=0;y<=10;y++) {
			if(y==5) {
				continue;
			}
			System.out.println(y);	
		}
		
		
		for(int i=0; i<7;i++) {
			if(i==4) {
				break;
			}
			System.out.println("hello Ram");
		}
	}

}
