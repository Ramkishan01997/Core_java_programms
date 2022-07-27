package day9;

public class ConstructorOverLoading {

	int x;
	int y;
	int z;

	String name;

//	ConstructorOverLoading(){
//		System.out.println(" welcome....");
//	}

//	ConstructorOverLoading(int a,int b,String s){
//		x=a;
//		y=b;
//		name=s;
//		
//	}
//	ConstructorOverLoading(int a,int b,int c){
//		x=a;
//		y=b;
//		z=c;
////		System.out.println(x);
//	}
//	
	ConstructorOverLoading(int c, String s) {
		z = c;
		name = s;
	}

	void show() {
		System.out.println(" values of x : " + x + "    y: " + y + " z : " + z + " name : " + name);
	}

	public static void main(String[] args) {
//		ConstructorOverLoading cs=new ConstructorOverLoading();
		// ConstructorOverLoading cs=new ConstructorOverLoading(4,8,"Ramkishan");
//		ConstructorOverLoading cs=new ConstructorOverLoading(4,6,8);
		ConstructorOverLoading cs = new ConstructorOverLoading(7, "Ramkishan");
		cs.show();

	}

}
