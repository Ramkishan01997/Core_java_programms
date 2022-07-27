package day5;

import java.util.HashMap;

public class UniqueArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,2,3,4,5};
		HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			hm1.put(a[i], i);
		}
		System.out.println(hm1.keySet());
		
	}

}
