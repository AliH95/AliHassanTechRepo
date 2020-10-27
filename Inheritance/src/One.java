
public class One extends Parent {
	
	public void welcome() {
		System.out.println("Welcome to HSBC");
	}
	
	public void multiply (int a, int b) {
		int c=a*b;
		System.out.println("Results="+c);
	}
	
	public void subtraction (int a, int b) {
		int result = a-b;
		System.out.println("Hello, I'm from the subclass. Subtraction result="+result); // THIS FUNCTION OVERRIDES THE SUBTRACTION FUNCTION IN THE PARENT
	}

}	