package day6;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//Multidimensional array
		
		int a[][]=new int [2][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=45;
		a[1][1]=50;
		
		
		System.out.println(a[1][0]);
		
		for(int x[]:a) {
			for (int z:x) {
				System.out.println(z);
			}
		}
		
		
		// two dimwnsiona array
		int b[][]= {{3,4},{5,6},{45,67},{9,0}};
		for(int y[]:b) {
			for(int w:y) {
				System.out.println("values inside the array is     "+w);
			}
		}
		
		
		

	}

}
