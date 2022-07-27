package day8;

public class Employee {

	int eid;
	String ename;
	int eage;

	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(eage);
	}

	void setData(int id, String name, int age) {
		eid = id;
		ename = name;
		eage = age;
	}

	void show() {
		System.out.println(eid + " " + ename + " " + eage);
	}

//	public static void main(String[] args) {
//
//		Employee emp = new Employee();
//
//		emp.eid = 1;
//		emp.ename = "ramkishan";
//		emp.eage = 23;
//
//		emp.display();
//		emp.setData(2, "kishan", 53);
//		emp.show();
//	}

}
