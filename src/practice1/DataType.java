package practice1;

import java.util.Scanner;

public class DataType {

	public static void main(String[] args) {
		  
				//simple programme to calculate Rate of interest by accepting input from user
	
				Scanner scan=new Scanner(System.in);
			
				System.out.println("Calculate raue of interesr");
				System.out.println("Enter the value of Principle:");
				int principle=scan.nextInt();
				System.out.println("Enter the value of Rate of Intersr R:");
				int Rate=scan.nextInt();
				System.out.println("Enter the time priod T:");
				int Time=scan.nextInt();
				
				int Interest=((principle*Rate*Time)/100);
				System.out.println("Your Intrest for"+"principle:"+principle+"\nrate : "+Rate+"\nyears:"+Time+"\nis equal to: "+((principle*Rate*Time)/100));
				
				//programm to add two number by accepting it dynamically fro user
				System.out.println("enter value of a:");
				int a=scan.nextInt();
				System.out.println("enter value of b:");
				int b=scan.nextInt();
				System.out.println("sum of and b is:"+(a+b));
				System.out.println("enter your Name Here:");
				String name=scan.next();
				System.out.println("your name is :"+name);
				
				
	}

}
