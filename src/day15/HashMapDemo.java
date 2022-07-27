package day15;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

//		HashMap hm=new HashMap();
		Map hm = new HashMap();
//		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "Ram");
		hm.put(102, "abc");
		hm.put(103,"pqr");
		hm.put(104, "xyz");
		hm.put(101, "yhh");
		hm.put(105, "Ram");
		
		System.out.println(hm.size());
		System.out.println(hm);
		
		System.out.println(hm.get(103));
		
		System.out.println(hm.keySet());
		
		
		for(Object k:hm.keySet()) {
			System.out.println(k+" "+hm.get(k));
		}
		hm.clear();
		System.out.println(hm);
		
		int a[]= {1,2,3,4,2,3,4,5};
		HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			hm1.put(a[i], i);
		}
		System.out.println(hm1.keySet());
		
	}

}
