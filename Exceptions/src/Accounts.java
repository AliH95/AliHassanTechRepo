
public class Accounts {
	
	public void SalarySlip (String name, int salary, int absenties) throws AbsentiesException {  //mention that this function could throw an exception
		float tax, netsalary;
		
		if (absenties > 10) {
			
			AbsentiesException ref = new AbsentiesException();
			throw ref;  //throw the ref variable of type AbsentiesException to be handled
		}
		else {
			
		tax=(float) salary*25/100;
		netsalary=salary-tax;
		System.out.println(name);
		System.out.println(salary);
		System.out.println(tax);
		System.out.println(netsalary);
		
		}
	}

}
