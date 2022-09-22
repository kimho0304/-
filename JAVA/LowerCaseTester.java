
public class LowerCaseTester {

	public static void main(String[] args) {	
		String testString = "This is a Test";
		String smalltestString = testString.toLowerCase();

		System.out.println(smalltestString);
		
		String bigTestString = smalltestString.toUpperCase();
		System.out.println(bigTestString);
		
	}

}
