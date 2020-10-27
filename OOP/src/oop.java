
public class oop {

	public static void main(String[] args) {
		
		First ref;
		ref=new First();
		
		// creating an object of class First
		
		ref.A=89; // A "member of" ref
		ref.B=100;
		ref.C=ref.A+ref.B;
		System.out.println("The result is: "+ ref.C);
		
		ref.welcome();
		ref.message(); //calling the methods
	}

}
