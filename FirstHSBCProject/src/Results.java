
public class Results {

	public static void main(String[] args) {
		
		int physics, chemistry, maths, total;
		float percentage;
		physics=70;
		chemistry=68;
		maths=60;
		total=physics+chemistry+maths;
		percentage=(float)total*100/300; //must typecast to avoid temporary variable issues. Otherwise output will be 77.0. Or make percentage into double type
		/*System.out.println("Total marks: ");
		System.out.println(total);
		System.out.println("Percentage: ");
		System.out.println(percentage);*/
		
		//in same line
		
		System.out.println("Total marks: " + total);
		System.out.println("Percentage: " + percentage);
		
		/*if (percentage>=60) {
			System.out.println("You have passed the exam"); // no indentation needed unlike python. we use brackets here.
		}
		
		//if (percentage<60) {
		//	System.out.println("You have failed the exam");
		//}
		
		else { // else must always accompany an if
			System.out.println("You have failed the exam");
		} */
		
		if (percentage>=90) {
			System.out.println("Grade A");
		}
		else {
			if (percentage>=80) {
				System.out.println("Grade B");
			}
			else {
					if (percentage>=70) {
						System.out.println("Grade C");
					
				}
					else {
						System.out.println("Fail");
					}
			}
		}
	}

}
