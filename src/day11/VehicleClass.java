package day11;

public class VehicleClass {
	
	String color="red";
	void speed() {
		System.out.println("100 ");
	}
	

}
 class Bus extends VehicleClass{
	
//	 void show() {
//	 color="black0";
//	System.out.println(color);
//	 }
//	 void speed() {
//			System.out.println("hello");
//		}
	 
	 
	 //for getting immediate parent
	 void speed() {
		 super.speed();
		 System.out.println("welcome");
	 }
	
	 void color() {
		 System.out.println(super.color);
	 }
	 
	 
}
