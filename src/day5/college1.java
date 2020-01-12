package day5;

public class college1 implements InterfaceDemo1 {

	
	public static void main(String[] args) {
		college1 c = new college1();
		 c.academicMarks(20);
		 c.culturalMarks(45);
		 c.sportsMarks(10);
		 c.totalMarks(10, 20, 45);
	
	}

	
	public int sportsMarks( int value1) {
		
	  int marks1 = value1;
		
		System.out.println( "marks in sports is" +marks1 );
		return marks1;
		
	}

	
	public int culturalMarks( int value2) {
		 int marks2 = value2;
		System.out.println("marks in cultural"+marks2);
		
		return marks2;
	}

	
	public int academicMarks( int value3) {
		int marks3 = value3;
		System.out.println("marks in academics" +marks3);
		
		return marks3;
	}

	
	public int totalMarks(int sMarks, int cMarks, int aMarks ) {
		return aMarks;
	
		// total of academicMarks + CulturalMarks + SportsMarks should be returned
		
	
	}
}
