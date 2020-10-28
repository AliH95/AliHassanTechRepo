
public class Convert {

	public static void main(String[] args) {
		
		String num1, num2;
		float result;
		
		num1="tree";
		num2="0";
		
		try {
			result = Integer.parseInt(num1)/Integer.parseInt(num2); //convert string to integer. or parseFloat
			System.out.println("Result is: "+result);
		}
		
		catch(NumberFormatException ref) { // THE ORDER OF CATCH BLOCKS MATTER. If we put words, it will take this exception
			System.out.println("Only digits can be used in operations");
		}
		catch(ArithmeticException ref) { // THE ORDER OF CATCH BLOCKS MATTER
			System.out.println("Can't divide anything by zero");
		}
		catch (Exception ref) {   //General exception, uses the overall parent class. Put this LAST. If you put it first it will not compile.
			System.out.println("Something went wrong");
		}
	}

}
