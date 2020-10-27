
public class Start {

	public static void main(String[] args) {
		
		One ref;
		ref = new One();
		ref.welcome();
		ref.message(); // this method is from Parent class, not One class
		
		ref.subtraction(9,2);

	}

}
