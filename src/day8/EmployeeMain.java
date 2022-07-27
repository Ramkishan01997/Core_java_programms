package day8;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 1;
		emp.ename = "ganesh";
		emp.eage = 53;
		emp.display();
		//

		emp.setData(5, "gur", 100);
		emp.show();
	}

}
