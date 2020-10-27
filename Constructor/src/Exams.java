
public class Exams {
	
	private int phy, che, total;
	private int max_physics_marks, max_chemistry_marks;
	private float percentage;
	
	public Exams() {
		max_physics_marks=100;
		max_chemistry_marks=100;  //constructor for SCHOOL objects
	}
	
	public Exams (int marks) {
		max_physics_marks=marks;
		max_chemistry_marks=marks; // constructor for COLLEGE objects
	}
	
	public void physics (int p) {
		
		if (p>=0 && p<=max_physics_marks) {
			phy=p;
			System.out.println("Physics mark: "+phy); //use phy, recommended approach because we use that variable elsewhere
		}
		else {
			System.out.println("Invalid physics marks");
		}
	}
	
	public void chemistry (int c) {
		
		if (c>=0 && c<=max_chemistry_marks) {
			che=c;
			System.out.println("Chemistry mark: "+che); //use che, recommended approach because we use that variable elsewhere
		}
		else {
			System.out.println("Invalid chemistry marks");
		}
	}
	
	public void showResult() {
		
		total=phy+che;
		percentage=(float)total*100/(max_physics_marks+max_chemistry_marks);
		System.out.println("Total grades: "+total);
		System.out.println("Total percentage: "+percentage);
	}

}
