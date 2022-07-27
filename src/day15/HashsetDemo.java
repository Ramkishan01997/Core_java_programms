package day15;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {

//		Set hs=new HashSet();
		HashSet hs = new HashSet();
//		HashSet<Integer> hs=new HashSet();
		hs.add(100);
		hs.add(10.2);
		hs.add("ranm");
		hs.add(null);
		hs.add(100);
		hs.add(null);
		
		System.out.println(hs.size());
		System.out.println(hs);
		hs.remove(10.2);
		
		//hs.getClass() // we can not retrieve specific value
		
		for( Object x:hs) {
			System.out.println(x);
		}
		
	}

}
