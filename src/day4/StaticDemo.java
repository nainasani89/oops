package day4;

public class StaticDemo {

	public String StudName;

	int StudNo;

	public static String DeptName1 = "CSE";
	public static String DeptName2 = "EEE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo S = new StaticDemo();
		S.StudentDetails("Naina", 10);
		DeptDetails();

	}

	public void StudentDetails(String StudName, int StudNo) {

		System.out.println("Studentdetails");

	}

	public  static void DeptDetails() {

		System.out.println("Depatment details" +DeptName1);
		
		System.out.println("Depatment details" +DeptName2);

	}

}