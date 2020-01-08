package day4;

//Multilevel inheritance 
public class SubClassInheitanceDemo2 extends SubClassInterianceDemo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClassInheitanceDemo2 S =  new SubClassInheitanceDemo2();
		S.BoradRules();
		S.SchoolRules();
		S.classRules();
			
	}
	
	public void classRules () {
		
		System.out.println("Every class has rules ");
		
	}

}
