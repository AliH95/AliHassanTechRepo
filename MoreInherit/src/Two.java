
public class Two extends One {
	
	public Two() {
		super(2); //forces to call 2nd constructor of One, instead of 1st constructor. 
		// Can only be used within constructors. MUST be the first instruction
		System.out.println("Welcome to 1st constructor of Two");
		
	}

}
