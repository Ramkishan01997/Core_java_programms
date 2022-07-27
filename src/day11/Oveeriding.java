package day11;

class Bank {
	double roi() {
		return 0;
	}
}

class SBI extends Bank {

	double roi() {
		return 10;

	}
}

class ICICI extends Bank {
	double roi() {
		return 9;
	}
}

public class Oveeriding {

	public static void main(String[] args) {

		SBI sbi = new SBI();
		System.out.println(sbi.roi());

		ICICI ic = new ICICI();
		System.out.println(ic.roi());

	}

}
