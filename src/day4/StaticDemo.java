package day4;

public class StaticDemo {

	

	int StudNo;
	public static  String StudName = "Naina";
	public static String DeptName1 = "CSE";
	public static String DeptName2 = "EEE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo S = new StaticDemo();
		S.StudentDetails(10);
		DeptDetails();

	}

	public void StudentDetails(int StudNo) {

		String StudName ="Praveen";
		System.out.println("naina details" +StudName);
		
		System.out.println("Studentdetails "+ this.StudName);

	}

	public  static void DeptDetails() {

		System.out.println("Depatment details" +DeptName1);
		
		System.out.println("Depatment details" +DeptName2);

	}

}