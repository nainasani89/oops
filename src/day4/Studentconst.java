package day4;

public class Studentconst {

	Studentconst() {

		System.out.println("Default constructor " + "Student Details");

	}

	Studentconst(String name) {

		System.out.println("Name of student is " + name);
	}

	Studentconst(String name, int age, String grade) {
		System.out.println("Name = " + name + " and " + "Age = " + age);
		System.out.println("Garde of student " +grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentconst s = new Studentconst();
		Studentconst s1 = new Studentconst("Naina");
		Studentconst s2 = new Studentconst("TestName",28, "B");
		

	}

}
