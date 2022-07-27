package day8;

public class Student {

	int id;
	String name;
	char grade;

	Student(int i, String n, char g) {
		id = i;
		name = n;
		grade = g;
	}

	void showDetails() {
		System.out.println(id + " " + name + " " + grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student(2, "Ganesh", 'D');
		stu.showDetails();

	}

}
