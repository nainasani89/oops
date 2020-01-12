package day4;

public class AbsrtactAndroid extends AbstractDemo1 {

	public static void main(String[] args) {

		AbsrtactAndroid A = new AbsrtactAndroid();
		A.homePage();
		A.profilePage();
	}

	void homePage() {

		System.out.println("This Home page for Android users");

	}

	void profilePage() {

		System.out.println("This is profile page for Andriod Users");

	}

}
