package day5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int b=234752554;
 int count=0;
 int rev=0;
 while(b!=0) {
	 b=b/10;
	 rev=b%10;
	 System.out.println(rev%2);
	 if(rev%2!=0) {
	 ++count;}
 }System.out.println(count);
 
 
 
 
 //calucated digit in number
 
 int number=8745649;
 int nCount=0;
 
 while(number!=0) {
	 number=number/10;
	 nCount++;
 }
 System.out.println(" the digits present in is eqaul to : \n"+nCount);
 
 
 
 
	}

}
