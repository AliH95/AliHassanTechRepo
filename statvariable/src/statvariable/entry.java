package statvariable;

public class entry {
	
	int A; //global A

	public static void main(String[] args) {
		
		Account HSBC = new Account();
		Account NetWest = new Account();
		
		HSBC.SetDollar(100);
		HSBC.amount(2);
		NetWest.SetDollar(200); //if you set the dollar value in NetWest, it will reflect in HSBC too because it's static
		HSBC.amount(2); //HSBC used the new dollar value that was set through NetWest object
		
		//----------- Global vs Local variable --------------
		
		entry B = new entry();
		B.What(); //prints local variable (PRIORITY to local)
		B.Go(); // prints global variable
		B.What();
		
	}
	
	public void What() {
		int A=10; //local A
		this.A=30; //using "this" to change value of the global variable, inside the function
		System.out.println(A);
	}
	
	public void Go() {
		System.out.println(A);
	}

}
