package day4;

public class OverridingDemo {

	public static void main(String[] args) {
		
		Car C ;
		
		C = new Car();
	    int value1 = C.basicPrice();
		System.out.println("Value of model 1 is " + value1 );
		
		C = new CarModel1();
	    int value2 = C.basicPrice();
		System.out.println("Value of model 1 is " + value2 );
		
		C = new CarModel2();
	    int value3 = C.basicPrice();
		System.out.println("Value of model 1 is " + value3 );

	}

}
