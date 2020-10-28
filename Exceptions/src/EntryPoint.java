
public class EntryPoint {

	public static void main(String[] args) {
		
		/* int num1, num2;
		num1=10;
		num2=0;
		
		try {
			int result = num1/num2;
			System.out.println(result);
		}
		
		catch(NumberFormatException ref) {
			
			System.out.println("Can do the conversion");
		}
		
		catch(ArithmeticException ref) {
			System.out.println("You are not allowed to divide anything by zero");
		} */
		
		Accounts salesdept = new Accounts();  //salesdept handles absenties differently than ITdept.
		Accounts ITdept = new Accounts();     //e.g. salesdept doesnt allow over 10 absenties, but ITdept allows it
											  // so we create different exceptions for both
		
		try {
			salesdept.SalarySlip("Ali", 1000, 15);
		}
		catch (AbsentiesException E) {
			System.out.println("Please send me the report");
		}
		
		try {
			ITdept.SalarySlip("Shaf", 2999, 12);
		}
		catch (AbsentiesException E) {
			System.out.println("It's fine in the IT dept.");
		}
	}

}
