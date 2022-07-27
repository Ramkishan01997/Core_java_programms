package day7;

public class ReverseAString {

	public static void main(String[] args) {

		String name = "ramkishan";

		String rev = "";
		char a[] = name.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);

		String b = "trewq";
		String num = "";
		for (int j = b.length() - 1; j >= 0; j--) {
			num = num + b.charAt(j);

		}
		System.out.println(num);

		// using Stringbuffre

		StringBuffer sb = new StringBuffer(b);
		System.out.println("using string buffer " + sb.reverse());
	}

}
