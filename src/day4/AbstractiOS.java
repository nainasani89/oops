package day4;

public class AbstractiOS extends AbstractDemo1 {

	public static void main(String[] args) {
		AbstractiOS iOS = new AbstractiOS();
		iOS.homePage();
		iOS.profilePage();
	}


	void homePage() {
		System.out.println("This is Home Page for iOS user");
		
	}


	void profilePage() {
		System.out.println("This is Profile Page for iOS user");
	}

}
