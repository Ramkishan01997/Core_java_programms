package day7;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {100,400,200,45,32,3};
    
    
    System.out.println("array before sorting "+Arrays.toString(a));
    Arrays.sort(a);
    
    
    System.out.println("array after sorting  "+Arrays.toString(a));
    
  String names[]= {"faa","abc","bsd","rrlm"};
  
  
  System.out.println("array before sorting "+Arrays.toString(names));
  Arrays.sort(names);
  
  System.out.println("array after sorting "+Arrays.toString(names));
    
    int num=800;
  for(int i=0;i<a.length;i++) {
	  if(a[i]==num) {
		  System.out.println(num+"is present in array");
	  }
  }
	}

}
