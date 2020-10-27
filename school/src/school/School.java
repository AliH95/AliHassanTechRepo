package school;

public class School {

	public static void main(String[] args) {
		
		/* Exam shafeeq = new Exam(); //another syntax for creating an object
		Exam james = new Exam();
		
		shafeeq.studentname="Shafeeq";
		shafeeq.phy=90;
		shafeeq.che=80;
		shafeeq.showResults();
		
		System.out.println("----------------------");
		
		james.studentname="James";
		james.phy=30;
		james.che=70;
		james.showResults();
		
		//Maths class stuff
		
		Maths Ali = new Maths();
		Ali.addition(5,7);
		Ali.message("Ali"); */
		
		Exam student1 = new Exam();
		student1 = new Exam();
		student1.studentname="Charmaine";
		student1.physics(-10); //calling public method, this is fine because the method is public, but the variables are private
		//student1.showResults();

	}
	
		
}
