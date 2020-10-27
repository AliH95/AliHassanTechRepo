
public class start {

	public static void main(String[] args) {
		
		Exams college = new Exams(200);
		college.physics(80);
		college.chemistry(200);
		college.showResult();
		
		System.out.println("--------------- Trying with school now ---------------------");
		
		Exams school = new Exams();
		school.physics(110);
		school.chemistry(20);
		school.showResult();

	}

}
