package interviewProgramms;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int number = 371, orgNum, rminder, result = 0;

		orgNum = number;
		while (orgNum != 0) {

			rminder = orgNum % 10;
			result += Math.pow(rminder, 3);
			orgNum /= 10;

		}
		System.out.println(orgNum);
		if (result == number) {
			System.out.println("number is armstrong");
		} else {
			System.out.println(" number is not");
		}
	}

}
