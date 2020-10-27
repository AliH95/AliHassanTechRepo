
abstract public class Bank {  //put abstract class because we have abstract functions inside
	
	abstract public void openAccount();
	abstract public void showbalance();  //this means use this method but override it
	
	public void AccountClose() {
		
	}
	
	final public void Welcome() {  //final means you have to use this, cannot override
		System.out.println("Welcome");
	}

}
