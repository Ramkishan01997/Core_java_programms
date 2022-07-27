package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// **********start
		int a[] = new int[4];

		a[0] = 3;
		a[1] = 6;
		a[2] = 7;
		a[3] = 90;

		System.out.println(a[2]);
		System.out.println("length of array a   " + a.length);
		// second way
		for (int y : a) {
			System.out.println("values from array a  " + y);
		}
		// *** End

		// *************start
		int b[] = { 2, 6, 7, 9 };

		System.out.println("length of array b   " + b.length);
		// one way of printing all value from array
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		//// ** End

		// ************start
		// string type array

		String names[] = { "ram", "ganesh", "shyam", "vidya" };

		System.out.println("first value from array is " + names[0]);

		for (String s : names) {
			System.out.println(s);
		}

		/// *** end

		/// *******start

		Object ids[] = { "ramkishan", 89, 9.0, 'A', true };
		for (Object s : ids) {
			System.out.println(s);
		}
		/// ** end
	}

}
